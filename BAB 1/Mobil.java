/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author WINDOWS 11
 */
public class Mobil {
 // Kelas Mobil untuk menggambarkan objek mobil
    int roda;
    String merk;
    String warna;
    int tahun;
    double harga;

    // Konstruktor pertama
    Mobil() {
        this.roda = 4;  // Default roda mobil adalah 4
    }
    // Konstruktor kedua
    Mobil(int roda) {
        this.roda = roda;
    }
    // Konstruktor ketiga
    Mobil(int roda, String merk, String warna, int tahun, double harga) {
        this.roda = roda;
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
        this.harga = harga;
    }
    // Method untuk menampilkan informasi mobil
    void tampilkanInfo() {
        System.out.println("Merk Mobil: " + merk);
        System.out.println("Warna Mobil: " + warna);
        System.out.println("Tahun Pembuatan: " + tahun);
        System.out.println("Harga Mobil: Rp " + harga);
        System.out.println("Jumlah Roda: " + roda);
    }
}


   

