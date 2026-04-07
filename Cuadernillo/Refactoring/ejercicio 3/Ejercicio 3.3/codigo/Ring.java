package RefactoringEjercicio3SegundaParte;

public abstract class Ring {
    protected int idx;
    protected static final int PRIMER_INDICE = 0;

    public Ring() {
        idx = PRIMER_INDICE;
    }

    protected int getIdx() {
        return this.idx;
    }

    protected int indexNext(int length) {
        if (idx >= length)
            idx = PRIMER_INDICE;
        return idx++;
    }
}

