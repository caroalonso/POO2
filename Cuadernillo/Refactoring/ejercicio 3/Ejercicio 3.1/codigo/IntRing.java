package RefactoringEjercicio3PrimeraParte;

import java.util.Arrays;

public class IntRing {
    private int[] source;
    private int idx;

    public IntRing(int[] src) {
        source = src;
        idx=0;
    }

    public int next() {
        if(idx >= source.length)
            idx=0;
        return source[idx++];
    }

    public int getIdx(){
        return this.idx;
    }

    public int[] getSource() {
        return Arrays.copyOf(source,source.length);
    }
}
