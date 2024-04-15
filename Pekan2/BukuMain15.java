package Pekan2;

public class BukuMain15 {
    public static void main(String[] args) {
        Buku15 bk1 = new Buku15();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.hitungHargaTotal(5);
        bk1.hitungDiskon();
        bk1.hitungHargaBayar();
        bk1.tampilInformasi();

        Buku15 bk2 = new Buku15("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.judul = "haya";
        bk2.tampilInformasi();
        bk2.terjual(11);
        bk2.hitungHargaTotal(11);
        bk2.hitungDiskon();
        bk2.hitungHargaBayar();

        Buku15 bukuIrsa = new Buku15("Untuk Negeriku", "Mohammad Hatta", 808, 5, 199000);
        bukuIrsa.tampilInformasi();
        bukuIrsa.terjual(2);
        bukuIrsa.hitungHargaTotal(2);
        bukuIrsa.hitungDiskon();
        bukuIrsa.hitungHargaBayar();
        
    }
}
