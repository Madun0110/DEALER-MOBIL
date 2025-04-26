/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4.MADUN.PRAKTIKUM;

/**
 *
 * @author Rafsan
 */
public class DealerMobil {

    private String merk, warna;
    int jumlah, roda, harga;

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
