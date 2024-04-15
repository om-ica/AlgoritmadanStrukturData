package pekan4kuis;

public class handyTalkie {
    String merk;
    int jumlah;
    int durasi;
    double diskon;
    double hargaPerhari;
    double hargaPerHt;

    public handyTalkie(String mrk, int jml, int drs) {
        this.merk = mrk;
        this.jumlah = jml;
        this.durasi = drs;
    }
    
    public double hitungHarga() {
        if (merk.equalsIgnoreCase("Motorola")) {
           hargaPerHt = 50000f;
        } else if (merk.equalsIgnoreCase("Baofeng")) {
            hargaPerHt = 20000f;
        } else if (merk.equalsIgnoreCase("Icom")) {
            hargaPerHt = 100000f;
        }

        return (jumlah * hargaPerHt) * durasi ;    
    }

    public double hargaDiskon() {
        if (jumlah > 5) {
            diskon = 0.10;
        } else if (jumlah > 10) {
            diskon = 0.25;
        }

        return hitungHarga() * diskon;
    }

    public double hargatotal() {
        return hitungHarga() - hargaDiskon();
    }

    void tampilInformasi() {
        System.out.println("Merk(Motorola/Baofeng/Icom)\t: " + merk);
        System.out.println("Jumlah barang\t\t\t: " + jumlah);
        System.out.println("Lama penyewaan(Hari)\t\t: " + durasi);
        System.out.println("Harga\t\t\t\t: " + hitungHarga());
        System.out.println("Harga diskon\t\t\t: " + hargaDiskon());
        System.out.println("Harga total\t\t\t: " + hargatotal());
    }
}


