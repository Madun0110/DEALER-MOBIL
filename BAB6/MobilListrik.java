/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6;

/**
 *
 * @author WINDOWS 11
 */
    public class MobilListrik extends DealerMobil {
    private int kapasitasBaterai;

    public MobilListrik(String merk) {
        super(merk);
    }

    @Override
    public String slogan() {
        return "DEALER MOBIL LISTRIK PALING LARIS";
    }

    public String JarakTempuh(int baterai) {
        if (baterai >= 80) {
            return "Mobil Listrik dengan Kapasitas Baterai 80-100 kWh Bisa Menempuh Sekitar 450-700Km\n";
        } else if (baterai >= 60) {
            return "Mobil Listrik dengan Kapasitas Baterai 60-80 kWh Bisa Menempuh Sekitar 300-450Km\n";
        } else if (baterai >= 40) {
            return "Mobil Listrik dengan Kapasitas Baterai 40-60 kWh Bisa Menempuh Sekitar 200-300Km\n";
        } else if (baterai >= 20) {
            return "Mobil Listrik dengan Kapasitas Baterai 20-40 kWh Bisa Menempuh Sekitar 100-200Km\n";
        } else {
            return "Mobil Listrik dengan Kapasitas Baterai dibawah 20 kWh Bisa Menempuh Sekitar 10-100Km\n";
        }
    }

    public int getKapasitasBaterai() {
        return this.kapasitasBaterai;
    }

    public void setKapasitasBaterai(int baterai) {
        this.kapasitasBaterai = baterai;
    }
}

