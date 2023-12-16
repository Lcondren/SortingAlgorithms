package ie.atu.sw;

public class SelectionSort implements Sort {


     //This implementation of the sort() keeps two sub-arrays of the array of numbers;
     //sub_array1 which is initially empty keeps all the sorted elements of numbers from left to right;
     //sub_array2 which is initially the numbers itself keeps the elements to be sorted.
     //The local variable minimumIndex stores the index of the current smallest element in sub_array2;
     //initially it is index 0, it replaces with the index value of the smallest element
     //in each comparison (when result is true) for each traversing of the sub_array2.
     //The local variable temp is used to swap elements after comparison
     //The element at the minimumIndex is added to the end of sub_array1
     //When sorting completed sub_array1 contains the sorted elements of the numbers array;
     //sub_array2 will be empty at the end of sorting.
     //Time complexity: O(n2) in all cases. Since there are (n-1) + (n-2)+ ... + 2 + 1 = (n-1) * n/2 comparisons
     //and n-1 swaps per comparison.
     //Space complexity: O(1), it only requires to store two local variables.

    // Code adapted from https://www.geeksforgeeks.org/selection-sort/

    public void sort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {

            int minimumIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[j] < numbers[minimumIndex]) {
                    minimumIndex = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[minimumIndex];
            numbers[minimumIndex] = temp;
        }
    }

}
