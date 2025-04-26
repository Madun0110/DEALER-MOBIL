/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5.MADUN;

/**
 *
 * @author Rafsan
 */
public class DealerMobil {

    private String merk, warna;
    int jumlah, roda, harga;

    public String slogan() {
        return "DEALER MOBIL PALING MURAH";
    }

    public DealerMobil(String merk) {
        this.merk = merk;
    }

    public DealerMobil(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }

    int totalPembayaran() {
        return (harga * jumlah);
    }

    public String getMerk() {
        return this.merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

}
