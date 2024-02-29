package Pekan3;

public class segitigaMain15 {
    public static void main(String[] args) {
        segitiga15[] sg = new segitiga15[4];

        sg[0] = new segitiga15(10, 4);
        sg[1] = new segitiga15(20, 10);
        sg[2] = new segitiga15(15, 6);
        sg[3] = new segitiga15(25, 10);
        
        for (int i = 0; i < sg.length; i++) {
            System.out.println("\nLuas segitiga ke-" + (i+1) + "\t: " + sg[i].hitungLuas());
            System.out.println("Keliling segitiga ke-" + (i+1) + "\t: " + sg[i].hitungKeliling());
        }
    }
}
