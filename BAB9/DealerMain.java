/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB9.MADUN;

/**
 *
 * @author Rafsan
 */
import BAB8.MADUN.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DealerMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Selamat Datang Di Dealer Mobil");
            System.out.println("Pilih Tipe Mobil : \n1.Sport\n2.Listrik");
            System.out.print("Pilihan : ");
            int pilihan = input.nextInt();
            input.nextLine();
            System.out.println("========================================");
            if (pilihan == 1) {
                System.out.println("Dealer Mobil Sport");
                System.out.print("Masukkan Merk Mobil : ");
                String merk = input.nextLine();
                System.out.print("Masukkan Warna Mobil : ");
                String warna = input.nextLine();
                System.out.print("Masukkan Jumlah Mobil : ");
                int jumlah = input.nextInt();
                System.out.print("Masukkan Kecepatan Mobil : ");
                int kecepatan = input.nextInt();
                System.out.print("Masukkan Harga Mobil : ");
                int harga = input.nextInt();
                MobilSport sport = new MobilSport(merk);
                sport.setWarna(warna);
                sport.setHarga(harga);
                sport.setJumlah(jumlah);
                System.out.println("========================================");
                System.out.println(sport.slogan());
                System.out.println("Keterangan : \nMerk Mobil" + sport.getMerk()
                        + "\nWarna Mobil : " + sport.getWarna() + "\nJumlah Mobil : " + jumlah + "\n Harga Mobil : " + harga
                        + "\nTotal Pembayaran : " + sport.totalPembayaran() + "\nInformasi : " + sport.BahanBakar(kecepatan));
            } else if (pilihan == 2) {
                System.out.println("Dealer Mobil Listrik");
                System.out.print("Masukkan Merk Mobil : ");
                String merk = input.nextLine();
                System.out.print("Masukkan Warna Mobil : ");
                String warna = input.nextLine();
                System.out.print("Masukkan Jumlah Mobil : ");
                int jumlah = input.nextInt();
                System.out.print("Masukkan Harga Mobil : ");
                int harga = input.nextInt();
                System.out.print("Masukkan Kapasitas Baterai Mobil : ");
                int baterai = input.nextInt();
                MobilListrik listrik = new MobilListrik(merk);
                listrik.setWarna(warna);
                listrik.setHarga(harga);
                listrik.setJumlah(jumlah);
                System.out.println("========================================");
                System.out.println(listrik.slogan());
                System.out.println("Keterangan : \nMerk Mobil" + listrik.getMerk()
                        + "\nWarna Mobil : " + listrik.getWarna() + "\nJumlah Mobil : " + jumlah + "\n Harga Mobil : " + harga
                        + "\nTotal Pembayaran : " + listrik.totalPembayaran() + "\nInformasi : " + listrik.JarakTempuh(baterai));
            }
        } catch (InputMismatchException e) {
            System.err.println("ERROR: Input tidak valid. Harap masukkan angka yang sesuai.");
        } catch (Exception e) {
            System.err.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
