/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6;

/**
 *
 * @author WINDOWS 11
 */
    public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil Listrik
        MobilListrik listrik = new MobilListrik("Tesla");
        listrik.setWarna("Putih");
        listrik.jumlah = 2;
        listrik.harga = 800_000_000;
        listrik.setKapasitasBaterai(85);

        // Membuat objek Mobil Sport
        MobilSport sport = new MobilSport("Ferrari");
        sport.setWarna("Merah");
        sport.jumlah = 1;
        sport.harga = 30000;
        sport.setTopSpeed(390);

        // Output Mobil Listrik
        System.out.println("==== Mobil Listrik ====");
        System.out.println("Merk       : " + listrik.getMerk());
        System.out.println("Warna      : " + listrik.getWarna());
        System.out.println("Jumlah     : " + listrik.jumlah);
        System.out.println("Harga/unit : Rp" + listrik.harga);
        System.out.println("Total Bayar: Rp" + listrik.totalPembayaran());
        System.out.println("Slogan     : " + listrik.slogan());
        System.out.println("Jarak Tempuh: " + listrik.JarakTempuh(listrik.getKapasitasBaterai()));

        // Output Mobil Sport
        System.out.println("\n==== Mobil Sport ====");
        System.out.println("Merk       : " + sport.getMerk());
        System.out.println("Warna      : " + sport.getWarna());
        System.out.println("Jumlah     : " + sport.jumlah);
        System.out.println("Harga/unit : Rp" + sport.harga);
        System.out.println("Total Bayar: Rp" + sport.totalPembayaran());
        System.out.println("Slogan     : " + sport.slogan());
        System.out.println("Efisiensi Bahan Bakar: " + sport.BahanBakar(sport.getTopSpeed()));
    }
}
