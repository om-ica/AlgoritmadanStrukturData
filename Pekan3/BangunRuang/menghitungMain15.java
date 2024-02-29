package Pekan3.BangunRuang;

import java.util.Scanner;

public class menghitungMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                kerucut15 kc = new kerucut15();
                System.out.println("Masukkan jari-jari\t: ");
                kc.jari = sc.nextDouble();
                System.out.println("Masukkan sisi miring: ");
                kc.sisiMiring = sc.nextDouble();

            }
            
        }

    }
}
