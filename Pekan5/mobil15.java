package Pekan5;

public class mobil15 {
    public String merk;
    public String tipe;
    public double tahun;
    public double topAccel;
    public double topPow;
    
    public mobil15(String merk, String tipe, int tahun, double topAccel, double topPow) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAccel = topAccel;
        this.topPow = topPow;
    }

    void tampilInformasi() {
        System.out.println("Merk: " + merk);
        System.out.println("Tipe: " + tipe);
        System.out.println("Tahun: " + tahun);
        System.out.println("Top Acceleration: " + topAccel);
        System.out.println("Top Hourse Power: " + topPow);
    }

    public static mobil15 tertinggi(mobil15[] mbl) {
        mobil15 mblTertinggi = mbl[0];
        for (int i = 0; i < mbl.length; i++) {
            if (mbl[i].topAccel > mblTertinggi.topAccel) {
                mblTertinggi = mbl[i];
            }
        }
        return mblTertinggi;
    }

    public static mobil15 terndah(mobil15[] mbl) {
        mobil15 mblterendah = mbl[0];
        for (int i = 0; i < mbl.length; i++) {
            if (mbl[i].topAccel < mblterendah.topAccel) {
                mblterendah = mbl[i];
            }
        }
        return mblterendah;
    }

    public static double hitungRerata(double[] tp) {
        double totalhw = 0;
        for (double hw : tp) {
            totalhw += hw;
        }
        return totalhw/tp.length;
    }
    
}
