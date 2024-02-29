package Pekan3.BangunRuang;

public class bola15 {
    public double jari;

    public bola15(double r) {
        this.jari = r;
    }

    double hitungLuasPermukaanBola () {
        return 4 * Math.PI * jari * jari;
    }

    double hitungVolumeBola () {
        return 4 * Math.PI * jari * jari * jari / 3;
    }
}
