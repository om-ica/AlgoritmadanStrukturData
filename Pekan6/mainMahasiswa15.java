package Pekan6;

public class mainMahasiswa15 {
    public static void main(String[] args) {
        daftarMahasiswaBerprestasi15 list = new daftarMahasiswaBerprestasi15();
        mahasiswa15 m1 = new mahasiswa15("Nusa", 2017, 25, 3);
        mahasiswa15 m2 = new mahasiswa15("Rara", 2012, 19, 4);
        mahasiswa15 m3 = new mahasiswa15("Dompu", 2018, 19, 3.5);
        mahasiswa15 m4 = new mahasiswa15("Abdul", 2017, 23, 2);
        mahasiswa15 m5 = new mahasiswa15("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk = ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk = ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah insertion asc berdasarkan ipk = ");
        list.insertionSort();
        list.tampil();
    }
}
