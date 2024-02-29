package Pekan3.BangunRuang;

public class limas15 {
    public double panjangSisiAlas;
    public double tinggiLimas;
    public double tinggiSisiMiring;
    public double luasSisiLimas;

    public limas15(double psa, double tl) {
        this.panjangSisiAlas = psa;
        this.tinggiLimas = tl;
    }

    double hitungLuasPermukaanLimas() {
        tinggiSisiMiring = Math.sqrt(((panjangSisiAlas/2) * (panjangSisiAlas/2)) + (tinggiLimas*tinggiLimas));
        luasSisiLimas = panjangSisiAlas * tinggiSisiMiring / 2;
        
        return luasSisiLimas*5;
    }

    double hitungVolumeLimas() {
        return (panjangSisiAlas*panjangSisiAlas) * tinggiLimas / 3;
    }

}
