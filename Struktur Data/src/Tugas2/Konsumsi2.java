package Tugas2;

public class Konsumsi2<M, I> {
    private M m;
    private I i;

    public M getM() {
        return m;
    }

    public I getI() {
        return i;
    }

    public void setKonsumsi(M makan, I minum) {
        this.m = makan;
        this.i = minum;
    }
}