import java.util.Scanner;

public class platNomer {

    private static final char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
    private static final String[][] KOTA = {
        {"Banten"},
        {"Jakarta"},
        {"Bandung"},
        {"Cirebon"},
        {"Bogor"},
        {"Pekalongan"},
        {"Semarang"},
        {"Surabaya"},
        {"Malang"},
        {"Tegal"}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kode plat nomor\t: ");
        char kodePlat = sc.next().charAt(0);

        
        int indexKota = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodePlat) {
                indexKota = i;
                break;
            }
        }


        if (indexKota >= 0) {
            System.out.println("Nama kota\t\t\t: " + KOTA[indexKota][0]);
        } else {
            System.out.println("Kode plat nomor tidak valid!");
        }

        sc.close();
    }
}