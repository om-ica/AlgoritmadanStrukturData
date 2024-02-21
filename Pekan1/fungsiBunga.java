
public class fungsiBunga {
    private static final double hargaAglonema= 75000;
    private static final double hargaKeladi= 50000;
    private static final double hargaAlocasia= 60000;
    private static final double hargaMawar= 10000;

    public static void main(String[] args) {
        String[] cabangBunga = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4", 
        "Aglonema", "Keladi", "Alocasia", "Mawar"};

        int[][] stockBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        System.out.println("Pendapatan setiap cabang apabila semua bunga habis terjual: ");
        pendapatanPerCabang(cabangBunga, stockBunga);
        System.out.println("\nStock setiap jenis bunga pada cabang RoyalGarden: ");
        stockSetiapJenisBunga(cabangBunga, stockBunga);
        System.out.println("\nJumlah stock setelah pengurangan karena bunga mati: ");
        int[] stockDikurangi = {-1, -2, 0, -5};
        penguranganBunga(cabangBunga, stockBunga, stockDikurangi);
    }

    private static void pendapatanPerCabang(String[] cabangBunga, int[][] stockBunga) {
        double[] harga = {0, 0, 0, 0, hargaAglonema, hargaKeladi, hargaAlocasia, hargaMawar};

        for (int i = 0; i < 4; i++) {
            double pendapatan = 0;
            for (int j = 4; j < cabangBunga.length; j++) {
                pendapatan += harga[j] * stockBunga[i][j-4];
            }
            System.out.printf("%s\t: %.2f%n", cabangBunga[i], pendapatan);
        }
    }

    private static void stockSetiapJenisBunga(String[] cabangBunga, int[][] stockBunga) {
        for (int i = 4; i < cabangBunga.length; i++) {
            int jumlahStock = 0;
            for (int[] totalBunga : stockBunga) {
                jumlahStock += totalBunga[i-4];
            }
            System.out.printf("%s: %d%n", cabangBunga[i], jumlahStock);
        }
    }

    private static void penguranganBunga(String[] cabangBunga, int[][] stockBunga, int[] stockDikurangi) {
        for (int i = 0; i < cabangBunga.length - 4; i++) {
            for (int j = 0; j < stockBunga.length; j++) {
                stockBunga[j][i] += stockDikurangi[i];
            }
        }
        stockSetiapJenisBunga(cabangBunga, stockBunga);
    }
}