package Tugas2;
public class MakananextendsHidangan {
    @Override
    public String disantap() {
        return this.getNamaHidangan() + " dimakan";
    }

    public String getNamaHidangan(String namaHidangan) {
        return namaHidangan;
    }
}


