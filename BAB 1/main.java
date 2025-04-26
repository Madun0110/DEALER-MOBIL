/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author WINDOWS 11
 */
public class main {
    public static void main(String[] args) {
        // Membuat objek mobil pertama dengan konstruktor default
        Mobil mobil1 = new Mobil (4, "Toyota", "Merah", 2020,350);
        System.out.println("Informasi Mobil 1:");
        mobil1.tampilkanInfo();
        System.out.println("===========");

        // Membuat objek mobil kedua dengan konstruktor yang menerima roda
        Mobil mobil2 = new Mobil(4,"Honda","Biru",2021,250);  // Contoh mobil dengan roda lebih banyak
        System.out.println("Informasi Mobil 2 (Roda 6):");
        mobil2.tampilkanInfo();
        System.out.println("===========");

        // Membuat objek mobil ketiga dengan atribut lengkap
        Mobil mobil3 = new Mobil(4, "Toyota", "Biru", 2022, 450);
        System.out.println("Informasi Mobil 3 (Toyota):");
        mobil3.tampilkanInfo();
        System.out.println("===========");
    }
}
