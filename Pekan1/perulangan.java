import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM\t: ");
        double NIM = sc.nextDouble();

        double n = NIM % 100;
        System.out.print("n\t\t: " + n + "\n");
        System.out.println("=================");

        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(" * ");
            } else if (i == 6 || i == 10) {
                System.out.print(" * ");
            } else {
                System.out.print(i + " ");
            }
        }
       sc.close(); 
    }
}
