
import java.util.Scanner;

public class menghitung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");
        System.out.print("Rumus yang ingin anda hitung: ");
        
        int piihan = sc.nextInt();
        System.out.println("==============================");

        switch (piihan) {
            case 1:
                hitungKecepatan(sc);
                break;
            case 2:
                hitungJarak(sc);
                break;
            case 3: 
                hitungWaktu(sc);
                break;
            default:
                System.out.println("Pilihan tidak tersedia.");
                break;
        }
    }

    private static void hitungKecepatan(Scanner sc) {
        System.out.println("\nMencari Kecepatan");
        System.out.print("Jarak (km)\t: " );
        double jarak = sc.nextDouble();
        System.out.print("waktu (jam)\t: ");
        double waktu = sc.nextDouble();

        double Kecepatan = jarak / waktu;

        System.out.println("Kecepatan\t: " + Kecepatan + " km/jam");
    }

    private static void hitungJarak(Scanner sc) {
        System.out.println("\nMencari Jarak");
        System.out.print("Kecepatan (km/jam)\t: ");
        double Kecepatan = sc.nextDouble();
        System.out.print("waktu (jam)\t\t: ");
        double waktu = sc.nextDouble();

        double jarak = Kecepatan * waktu;

        System.out.println("Jarak\t\t\t: " + jarak + " km");
    }

    private static void hitungWaktu(Scanner sc) {
        System.out.println("\nMencari Waktu");
        System.out.print("Kecepatan (km/jam)\t: ");
        double Kecepatan = sc.nextDouble();
        System.out.print("Jarak (km)\t\t: ");
        double jarak = sc.nextDouble();

        double waktu = jarak / Kecepatan;

        System.out.println("Waktu\t\t\t: " + waktu + " jam");
    }
}
