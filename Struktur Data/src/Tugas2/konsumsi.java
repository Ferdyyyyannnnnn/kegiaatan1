package Tugas2;
import java.util.ArrayList;
public class konsumsi {
public static <Konsumsi, Makanan, Minuman> void main(String[] args) {
        ArrayList<Konsumsi> ListKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> Lunch = new Konsumsi<>();

        Makanan roti = new Makanan();
        roti.setNamaHidangan("Roti Tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("Susu Sapi");
        breakfast.setKonsumsi(roti, susu);
        ListKonsumsi.add(breakfast);

        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("Nasi Putih");
        Minuman air = new Minuman();
        air.setNamaHidangan("Air Putih");

        Lunch.setKonsumsi(nasi, air);
        ListKonsumsi.add(Lunch);


        System.out.println("Menu Konsumsi: ");
        for (Konsumsi<Makanan, Minuman> konsumsi : ListKonsumsi){
        Makanan makanan = konsumsi.getM();
        Minuman minuman = konsumsi.getI();

        System.out.println(makanan.disantap());
        System.out.println(minuman.disantap());
        }


        }
        }