package Pekan8;

public class Gudang15 {
    Barang15[] tumpukan;
    int size;
    int top;

    public Gudang15(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang15[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size -  1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang15 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang15 ambilBarang() {
        if (!cekKosong()) {
            Barang15 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang15 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang15 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public void tampilTop() {
        if (!cekKosong()) {
            System.out.println("Barang teratas adalah " + tumpukan[top].nama);
        } else {
            System.out.println("Barang kosong!");
        }
    }

    public void tampilTerbawah() {
        if (!cekKosong()) {
            System.out.println("Barang terbawah adalah " + tumpukan[0].nama);
        } else {
            System.out.println("Barang kosong");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi15 stack = new StackKonversi15();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
    
    public void cariKode(int cari) {
        for (int i = 0; i < tumpukan.length; i++) {
            if (tumpukan[i].kode == cari) {
                System.out.printf("Kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            } 
        }
    }

    public void cariNama(String cariNama) {
        for (int i = 0; i < tumpukan.length; i++) {
            if (tumpukan[i].nama.equalsIgnoreCase(cariNama)) {
                System.out.printf("Kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        }
    }
}
