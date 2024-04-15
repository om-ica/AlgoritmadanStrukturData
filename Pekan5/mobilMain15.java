package Pekan5;

public class mobilMain15 {
    public static void main(String[] args) {
        mobil15[] mbl = new mobil15[8];

        mbl[0] = new mobil15("BMW", "M2 Coupe", 2016, 6816, 728);
        mbl[1] = new mobil15("Ford", "Fiesta", 2014, 3921, 575);
        mbl[2] = new mobil15("Nissan", "370z", 2009, 4360, 657);
        mbl[3] = new mobil15("Subaru", "BRZ", 2014, 4058, 609);
        mbl[4] = new mobil15("Subaru", "Impreza WRX STI", 2013, 6255, 703);
        mbl[5] = new mobil15("Toyota", "AE86 Trueno", 1986, 3700, 553);
        mbl[6] = new mobil15("Toyota", "86/GT86", 2014, 4180, 609);
        mbl[7] = new mobil15("Volkswagen", "Golf GTI", 2014, 4180, 631);

        double[] tp = new double[mbl.length];
        for (int i = 0; i < mbl.length; i++) {
            tp[i] += mbl[i].topPow;
        }

        mobil15 mobilTertinggi = mobil15.tertinggi(mbl);
        mobil15 mobilTerendah = mobil15.terndah(mbl);
        double rerata = mobil15.hitungRerata(tp);
        

        System.out.println("===========================================");
        System.out.println("Mobil dengan Akselerasi Tertinggi.");
        mobilTertinggi.tampilInformasi();
        System.out.println("===========================================\n");

        System.out.println("===========================================");
        System.out.println("Mobil dengan akselerasi terendah.");
        mobilTerendah.tampilInformasi();
        System.out.println("===========================================\n");

        System.out.println("===========================================");
        System.out.println("Rerata Top Horse Power dari Semua Mobil");
        System.out.println(rerata);
        System.out.println("===========================================");
    }
}
