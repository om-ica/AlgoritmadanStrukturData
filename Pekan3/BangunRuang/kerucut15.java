package Pekan3.BangunRuang;

public class kerucut15 {
    public double jari;
    public double sisiMiring;
    private double tinggiKerucut;

    public kerucut15(double r, double sm) {
        this.jari = r;
        this.sisiMiring = sm;
    }

    double hitungLuasPermukaanKerucut() {
        return (Math.PI * jari * jari) + (Math.PI * jari * sisiMiring);
    }

    double hitungVolumeKerucut() {
        tinggiKerucut = Math.sqrt((sisiMiring*sisiMiring) - (jari*jari));

        return Math.PI * jari * jari * tinggiKerucut / 3;
    }
}
