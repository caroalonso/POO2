package RefactoringEjercicio3SegundaParte;

import java.util.Arrays;

public class CharRing extends Ring {
    private char[] source;

    public CharRing(String srcString) {
        super();
        source = new char[srcString.length()];
        srcString.getChars(PRIMER_INDICE, srcString.length(), source, PRIMER_INDICE);
    }

    public char next() {
        return source[indexNext(source.length)];
    }

    public char[] getSource() {
        return Arrays.copyOf(source, source.length);
    }

}

