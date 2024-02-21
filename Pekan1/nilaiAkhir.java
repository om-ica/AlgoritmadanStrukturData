

import java.util.Scanner;

public class nilaiAkhir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilaiTugas=0, nilaiKuis=0, nilaiUTS=0, nilaiUAS=0;
        
        System.out.println("Program menghitung nilai akhir");
        System.out.println("=====================");
        
        
        System.out.print("Nilai tugas\t: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Nilai kuis\t: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Nilai UTS\t: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Nilai UAS\t: ");
        nilaiUAS = sc.nextDouble();

        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUTS < 0 || nilaiUTS > 100 
            || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("=====================");
            System.out.println("=====================");
            System.out.println("Nilai tidak valid");
            sc.close();
            return;
        }
        System.out.println("=====================");
        System.out.println("=====================");


        double akhir = (nilaiTugas*0.2) + (nilaiKuis*0.2) + (nilaiUTS*0.3) + (nilaiUAS*0.3);
        System.out.println("Nilai akhir\t: " + akhir);

        if (akhir <= 39) {
            System.out.println("nilai huruF\t: E");
        } else if (akhir > 39 && akhir <= 50 ) {
            System.out.println("nilai huruf\t: D");
        } else if (akhir > 50 && akhir <= 60) {
            System.out.println("nilai huruf\t: C");
        } else if (akhir > 60 && akhir <= 65) {
            System.out.println("nilai huruf\t: C+");
        } else if (akhir > 65 && akhir <=73) {
            System.out.println("nilai huruf\t: B");
        } else if (akhir > 73 && akhir <=80 ) {
            System.out.println("nilai huruf\t: B+");
        } else if (akhir > 80 && akhir <= 100) {
            System.out.println("nilai huruf\t: A");
        }

        System.out.println("=====================");
        System.out.println("=====================");

        if (akhir <= 60) {
            System.out.println("ANDA TIDAK LULUS");
        } else {
            System.out.println("SELAMAT ANDA LULUS");
        }
        
      sc.close();  
    }
}
