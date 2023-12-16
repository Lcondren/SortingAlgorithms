package ie.atu.sw;

public class InsertionSort implements Sort {

    //The insertion Sort splits the array into sorted and unsorted positions
    // It will 'insert' the correct element in the unsorted array into the sorted array
    //if the current element is bigger than the element to the right of it, it will swap these 2 and insert them into the sorted array
    //Time complexity: In the best case scenario it will be n, but for both average and worse case scenario it will be n^2
    //Space Complexity: Since it will only need 1 space for extra memory the space complexity is 0(1)

// Code taken from https://www.geeksforgeeks.org/insertion-sort/

    public void sort(int[] numbers) {

        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i]; //The key is assigned the element in index i
            int j = i - 1; //Declare an int variable to access indexes to the left of index i
			/*
			Check elements in indexes before the key index
			Move all elements > key right one position*/
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key; //The key is assigned its new index
        }


    }
}
