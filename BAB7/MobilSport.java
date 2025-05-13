/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7.MADUN;

public class MobilSport extends DealerMobil {

    private int topSpeed;

    public MobilSport(String merk) {
        super(merk);
    }
    
    @Override
    public String slogan() {
        return "DEALER MOBIL SPORT BINTANG 5";
    }

    public String BahanBakar(int topSpeed) {
        if (topSpeed >= 400) {
            return "Mobil dengan kecepatan lebih dari 400Km/jam membutuhkan bahan bakar sekitar 1-2Km/Liter\n";
        } else if (topSpeed >= 350) {
            return "Mobil dengan kecepatan 350-400Km/jam membutuhkan bahan bakar sekitar 1.5-2.5Km/Liter\n";
        } else if (topSpeed >= 300) {
            return "Mobil dengan kecepatan 300-350Km/jam membutuhkan bahan bakar sekitar 2-3Km/Liter\n";
        } else {
            return "Mobil dengan kecepatan dibawah 300/jam membutuhkan bahan bakar sekitar 5-10Km/Liter\n";
        }
    }

    public int getTopSpeed() {
        return this.topSpeed;
    }

    public void setTopSpeed(int speed) {
        this.topSpeed = speed;
    }

}
