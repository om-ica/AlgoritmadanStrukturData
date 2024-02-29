package Pekan3;

public class hewanMain15 {
    public static void main(String[] args) {
        hewan15 hw = new hewan15("Ayam");
        System.out.println("Hewannya adalah " + hw.getHewan());

        hewan15 hw1 = new hewan15("Sapi", 10);
        System.out.println("Hewannya adalah " + hw1.getHewan() + "dengan jumlah sebanyak " + hw1.getJumlah());
    }
}
