/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7.MADUN;

public abstract class DealerMobil {

    private String merk, warna;
    int jumlah, roda, harga;

    abstract public String slogan();

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
