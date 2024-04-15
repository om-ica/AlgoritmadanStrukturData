package Pekan6.latihan;

public class hotelService15 {
    hotel15[] hotel = new hotel15[5];
    int index;
    
    void tambah(hotel15 h) {
        if (index < hotel.length) {
            hotel[index] = h;
            index++;
        }
    }

    void tampilAll() {
        for (hotel15 ht : hotel) {
            ht.tampil();
            System.out.println("=============================================");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < hotel.length-1; i++) {
            for (int j = 1; j < hotel.length-i; j++) {
                if (hotel[j].harga < hotel[j-1].harga) {
                    hotel15 temp = hotel[j];
                    hotel[j] = hotel[j-1];
                    hotel[j-1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < hotel.length; i++) {
            int idMin = i;
            for (int j = i+1; j < hotel.length; j++) {
                if (hotel[j].harga > hotel[idMin].harga) {
                    idMin = j;
                }
            }
            hotel15 temp = hotel[idMin];
            hotel[idMin] = hotel[i];
            hotel[i] = temp;
        }
    }
}
