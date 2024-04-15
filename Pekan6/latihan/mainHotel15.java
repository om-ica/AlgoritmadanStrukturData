package Pekan6.latihan;

public class mainHotel15 {
    public static void main(String[] args) {
        hotelService15 htl = new hotelService15();
        hotel15 h1 = new hotel15("Amanjiwo", "Magelang", 6000, (byte) 5);
        hotel15 h2 = new hotel15("Ibis", "Malang", 350, (byte) 2);
        hotel15 h3 = new hotel15("Mandarin Oriental Hotel", "Jakarta", 2000, (byte) 4);
        hotel15 h4 = new hotel15("Ascent", "Malang", 450, (byte) 3);
        hotel15 h5 = new hotel15("Padma Resort Ubud", "Gianyar", 6200, (byte) 5);

        htl.tambah(h1);
        htl.tambah(h2);
        htl.tambah(h3);
        htl.tambah(h4);
        htl.tambah(h5);

        System.out.println("=============================================");
        System.out.println("Daftar Hotel");
        htl.tampilAll();

        System.out.println("\n=============================================");
        System.out.println("Hotel dengan harga terendah ke tertinggi");
        htl.bubbleSort();
        htl.tampilAll();

        System.out.println("\n=============================================");
        System.out.println("Hotel dengan rating tertinggi ke terendah");
        htl.selectionSort();
        htl.tampilAll();
    }
}
