package PatronesEjercicio15;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;

//ADAPTEE
public class FeistelCipher {

    private final String key;
    private final int rounds = 4;

    public FeistelCipher(String keyStr) {
        this.key = keyStr;
    }

    // =========================
    // CIFRADO DE BLOQUE
    // =========================

    private byte[] feistelBlock(byte[] block) {

        int left =
                ((block[0] & 0xFF) << 24) |
                        ((block[1] & 0xFF) << 16) |
                        ((block[2] & 0xFF) << 8)  |
                        (block[3] & 0xFF);

        int right =
                ((block[4] & 0xFF) << 24) |
                        ((block[5] & 0xFF) << 16) |
                        ((block[6] & 0xFF) << 8)  |
                        (block[7] & 0xFF);

        int keySum = key.chars().sum();

        for (int i = 0; i < rounds; i++) {

            int temp = left;

            left = right;

            right = temp ^ (right + keySum);
        }

        int temp = left;
        left = right;
        right = temp;

        return intsToBytes(left, right);
    }

    // =========================
    // DESCIFRADO DE BLOQUE
    // =========================

    private byte[] feistelBlockDecode(byte[] block) {

        int left =
                ((block[0] & 0xFF) << 24) |
                        ((block[1] & 0xFF) << 16) |
                        ((block[2] & 0xFF) << 8)  |
                        (block[3] & 0xFF);

        int right =
                ((block[4] & 0xFF) << 24) |
                        ((block[5] & 0xFF) << 16) |
                        ((block[6] & 0xFF) << 8)  |
                        (block[7] & 0xFF);

        int temp = left;
        left = right;
        right = temp;

        int keySum = key.chars().sum();

        for (int i = rounds - 1; i >= 0; i--) {

            int temp2 = right;

            right = left;

            left = temp2 ^ (left + keySum);
        }

        return intsToBytes(left, right);
    }

    // =========================
    // AUXILIAR
    // =========================

    private byte[] intsToBytes(int left, int right) {

        byte[] result = new byte[8];

        result[0] = (byte) (left >>> 24);
        result[1] = (byte) (left >>> 16);
        result[2] = (byte) (left >>> 8);
        result[3] = (byte) left;

        result[4] = (byte) (right >>> 24);
        result[5] = (byte) (right >>> 16);
        result[6] = (byte) (right >>> 8);
        result[7] = (byte) right;

        return result;
    }

    // =========================
    // ENCODE
    // =========================

    public String encode(String message) {

        byte[] bytes = message.getBytes(StandardCharsets.UTF_8);

        int paddedLength = ((bytes.length + 7) / 8) * 8;

        byte[] padded = Arrays.copyOf(bytes, paddedLength);

        byte[] result = new byte[paddedLength];

        // IV aleatorio
        SecureRandom random = new SecureRandom();

        byte[] iv = new byte[8];
        random.nextBytes(iv);

        byte[] currentIV = Arrays.copyOf(iv, 8);

        for (int i = 0; i < paddedLength; i += 8) {

            byte[] block = Arrays.copyOfRange(padded, i, i + 8);

            // XOR CBC
            for (int j = 0; j < 8; j++) {
                block[j] ^= currentIV[j];
            }

            byte[] encodedBlock = feistelBlock(block);

            System.arraycopy(encodedBlock, 0, result, i, 8);

            currentIV = encodedBlock;
        }

        // Guardamos IV + resultado
        byte[] finalResult = new byte[8 + result.length];

        System.arraycopy(iv, 0, finalResult, 0, 8);
        System.arraycopy(result, 0, finalResult, 8, result.length);

        return Base64.getEncoder().encodeToString(finalResult);
    }

    // =========================
    // DECODE
    // =========================

    public String decode(String message) {

        byte[] allBytes = Base64.getDecoder().decode(message);

        // Recuperar IV
        byte[] iv = Arrays.copyOfRange(allBytes, 0, 8);

        // Recuperar datos cifrados
        byte[] encrypted = Arrays.copyOfRange(allBytes, 8, allBytes.length);

        byte[] result = new byte[encrypted.length];

        byte[] currentIV = Arrays.copyOf(iv, 8);

        for (int i = 0; i < encrypted.length; i += 8) {

            byte[] block = Arrays.copyOfRange(encrypted, i, i + 8);

            byte[] decodedBlock = feistelBlockDecode(block);

            // XOR CBC
            for (int j = 0; j < 8; j++) {
                decodedBlock[j] ^= currentIV[j];
            }

            System.arraycopy(decodedBlock, 0, result, i, 8);

            currentIV = block;
        }

        return new String(result, StandardCharsets.UTF_8)
                .replaceAll("\u0000+$", "");
    }
}