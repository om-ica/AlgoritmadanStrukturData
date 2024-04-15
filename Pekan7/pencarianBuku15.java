package Pekan7;

public class pencarianBuku15 {
    buku15[] listBk = new buku15[5];
    int idx;

    
    void tambah(buku15 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!!");
        }
    }
    
    void sorting() {
        for (int i = 0; i < listBk.length-1; i++) {
            for (int j = 0; j < listBk.length-1; j++) {
                if (listBk[j].judulBuku.compareToIgnoreCase(listBk[j+1].judulBuku) > 0) {
                    buku15 temp = listBk[j];
                    listBk[j] = listBk[j+1];
                    listBk[j+1] = temp;
                }
            }
        }
    }

    void tampil() {
        for (buku15 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int findSeqSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public buku15 findBuku(String cari) {
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equals(cari)) {
               return listBk[i];
            }
        }
        return null;
    }

    public int findBinarySearch(String cari, int left, int right) {
        int mid = 0;
        if (right >= left) {
            mid = (left + right) /2;
            if (cari.equals(listBk[mid].kodeBuku)) {
                return mid;
            } else if (Integer.parseInt(listBk[mid].kodeBuku) > Integer.parseInt(cari)) {
                return findBinarySearch(cari, mid + 1, right);
            } else {
                return findBinarySearch(cari, left, mid - 1);
            }
        }
        return -1;
    }

    public int seqSearchJudBuk(String cariJudul) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.equals(cariJudul)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int BinarySearchJudBuk(String cariJudul, int left, int right) {
        int mid = 0;
        if (right >= left) {
            mid = (left + right) /2;
            int comparasion = cariJudul.compareTo(listBk[mid].judulBuku);
            if (comparasion == 0) {
                return mid;
            } else if (comparasion < 0) {
                return BinarySearchJudBuk(cariJudul, left, mid - 1);
            } else {
                return BinarySearchJudBuk(cariJudul, mid + 1, right);
            }
        }
        return -1;
    }

    public void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

    public void tampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t: " + x);
            System.out.println("Judul\t\t: " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t: " + listBk[pos].pengarang);
            System.out.println("Stock\t\t: " + listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
}
