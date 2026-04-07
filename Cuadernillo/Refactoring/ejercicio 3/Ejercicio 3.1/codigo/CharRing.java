package RefactoringEjercicio3PrimeraParte;

import java.util.Arrays;

public class CharRing {
    private char[] source;
    private int idx;

    public CharRing(String srcString) {
        source = new char[srcString.length()];
        srcString.getChars(0, srcString.length(), source, 0);
        idx = 0;
    }

    public char next() {
        if (idx >= source.length)
            idx = 0;
        return source[idx++];
    }

    public int getIdx(){
        return this.idx;
    }

    public char[] getSource() {
        return Arrays.copyOf(source,source.length);
    }
}
