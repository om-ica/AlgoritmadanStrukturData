package Pekan3;

import java.lang.Math;

public class segitiga15 {
    public int alas;
    public int tinggi;

    public segitiga15(int a, int t) {
        this.alas = a;
        this.tinggi = t;
    }

    double hitungLuas() {
        return alas*tinggi/2;
    }

    double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas*alas + tinggi*tinggi);

        return alas + tinggi + sisiMiring;
    }
    
}
