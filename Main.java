package ie.atu.sw;

public class Main {


    public static void main(String[] args) {

        int[] sizes = {100, 250, 500, 1000, 1750, 2500, 5000, 7500, 8500, 10000};

        int numberOfRuns = 10;

        Sort sort = new BubbleSort();

        Util util = new Util();

        System.out.print("Algorithm|Size:\t");

        util.printArray(sizes);

        System.out.println();

        System.out.print("Bubble Sort\t");

        print(sizes, numberOfRuns, sort);

        sort = new SelectionSort();

        System.out.print("Selection Sort\t");

        print(sizes, numberOfRuns, sort);

        sort = new MergeSort();

        System.out.print("Merge Sort\t");

        print(sizes, numberOfRuns, sort);

        sort = new InsertionSort();

        System.out.print("Insertion Sort\t");

        print(sizes, numberOfRuns, sort);

        sort = new CountingSort();

        System.out.print("Counting Sort\t");

        print(sizes, numberOfRuns, sort);

    }

  

    private static void print(int[] sizes, int runs, Sort sort) {

        Util util = new Util();
        util.test(sizes, runs, sort);
        System.out.println();

    }
}
