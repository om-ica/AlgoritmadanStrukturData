    package Pekan7.merge;

    public class mergeSortMain15 {
        public static void main(String[] args) {
            int[] data = {10, 40, 30, 50, 70, 20, 100, 90};
            System.out.println("Sorting dengan merge sort");
            mergeSorting15 mSort = new mergeSorting15();
            System.out.println("Data awal");
            mSort.printArray(data);
            mSort.mergeSort(data);
            System.out.println("Setelah diurutkan");
            mSort.printArray(data);
        }
    }
