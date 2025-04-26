/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab2.Konstruktor;

/**
 *
 * @author WINDOWS 11
 */
public class Data_Matkul {
    // Atribut
    private String kode_mk;
    private String nama_mk;
    private String dosen_pengampu;
    private int jml_sks;

    // Konstruktor
    public Data_Matkul(String kd, String mk, String dsn, int jmlsks) {
        this.kode_mk = kd;
        this.nama_mk = mk;
        this.dosen_pengampu = dsn;
        this.jml_sks = jmlsks;
    }
    // Getter dan Setter untuk kode_mk
    public String getKode_mk() {
        return kode_mk;
    }
    // Getter dan Setter untuk nama_mk
    public String getNama_mk() {
        return nama_mk;
    }
    // Getter dan Setter untuk dosen_pengampu
    public String getDosen_pengampu() {
        return dosen_pengampu;
    }
    // Getter dan Setter untuk jml_sks
    public int getJml_sks() {
        return jml_sks;
    }
}
