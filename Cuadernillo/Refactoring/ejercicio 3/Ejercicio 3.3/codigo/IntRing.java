package RefactoringEjercicio3SegundaParte;

import java.util.Arrays;

public class IntRing extends Ring {
    private int[] source;

    public IntRing(int[] src) {
        super();
        source = src;

    }

    public int next() {
        return source[indexNext(source.length)];
    }

    public int[] getSource() {
        return Arrays.copyOf(source, source.length);
    }

}
