package Pekan3.ArrayBalok;

public class BalokMain15 {
    public static void main(String[] args) {
        Balok15[] blArray = new Balok15[3];

        blArray[0] = new Balok15(100, 30, 12);
        blArray[1] = new Balok15(120, 40, 15);
        blArray[2] = new Balok15(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke-" + i + ": " + blArray[i].hitungVolume());
        }
    }
}
