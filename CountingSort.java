package ie.atu.sw;

import java.util.Arrays;

public class CountingSort implements Sort {

      //This implementation of the sort() does the counting sort.
      //The procedure is as follows:

      //Determines the range of key
      //Initializes a temporary array count[] of size range to store the occurrence of
      //each unique element.
      //Initializes an array, output[], of size numbers.length ( the size of the original
      //array) to store the sorted output.
      //Counts the occurrence of each unique element and stores the values in count[]
      //The count[] is then modified in such a way that the indices of the elements
      //store sum of previous counts.
      //Stores the sorted elements in output[] in reverse order and decreasing count
      //by 1 each time to ensure stability.
      //Copies output[] to original numbers[].

      //Time complexity: For initializing and iteration of the second for loops
      //(for counting) it takes some constant, say k, time.
      //The other for loops iterates n, the length of the input array each time.
      //Thus O(k) + O(n)--> O(k + n).
      //The behavior is same in all three cases.

     //Space Complexity: It requires k and n spaces
     //for storing the elements of the arrays
    //Therefore, O(n + k) is the space complexity.


    public void sort(int[] numbers) {

        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();
        int range = max - min + 1;

        int count[] = new int[range];
        int output[] = new int[numbers.length];

        for (int number : numbers)
            count[number - min]++;

        for (int i = 1; i < count.length; i++)
            count[i] += count[i - 1];

        for (int i = numbers.length - 1; i >= 0; i--) {

            output[count[numbers[i] - min] - 1] = numbers[i];
            count[numbers[i] - min]--;
        }

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = output[i];

    }

}

