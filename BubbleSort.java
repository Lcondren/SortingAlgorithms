package ie.atu.sw;

public class BubbleSort implements Sort {

    /*
     * Code taken from COMP08033 Computational Thinking with Algorithms,
     * Patrick Mannion GMIT – Sorting Algorithms Part 2
     */


     // This compares the elements of numbers by going from first to last
     // Compares number[0] and number[1] and swap their position if number[0] > number[1]
     // compare number[1] and number[2], will swap their position if number[1] > number[2]
     // if number[2] > number[1], number is sorted and will move on to compare number[2] and number[3]
     // Bubble Sort will keep comparing until no more swaps are necessary
     // After these steps the largest element is at last index.

     // The Bubble Sort is quite inefficient
     // as it takes a long time for the array of numbers unsorted to become sorted.
     // Time complexity: O(n2) in average and worst cases. (Worse Case is when the
     // array is reversely sorted). But if the array is already sorted (best case) it
     // needs n-1 comparisons (approximately n). Thus O(n) is the time complexity in
     // best case.

     // Space Complexity: This requires one temp variable for a swap
     // No matter how many swaps it will only swap one at a time therefore Space Complexity is O(1).

      public void sort(int[] numbers) {

        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i]; //The key is assigned the element in index 1
            int j = i -1;

            while(j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j -1;
            }
            numbers[j + 1] = key;
        }
      }
}

