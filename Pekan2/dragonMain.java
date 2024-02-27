package Pekan2;

public class dragonMain {
    public static void main(String[] args) {
        dragon dg1 = new dragon(1, 11, 10, 10);
    
       dg1.printPosition();
       dg1.moveRight();
       dg1.printPosition();
       dg1.moveLeft();
       dg1.printPosition();
       dg1.moveUp();
       dg1.printPosition();
       dg1.moveDown();
       dg1.printPosition();
    }
}