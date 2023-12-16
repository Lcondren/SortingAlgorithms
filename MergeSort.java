package ie.atu.sw;

 //Code taken from https://www.baeldung.com/java-merge-sort
public class MergeSort implements Sort {

     // The implementation of sort method.
     // This algorithm is a divide and conquer method for a list of n length.
     // This is split into sub-lists(left array and right array)
     // MergeSort breaks the arrays down until we are left with individual items
     //Time complexity: O(n log n ) in best, worst, and average cases; since
     // O(log n) comparisons for all n sub-arrays and O(1) time to find the middle index
     // for all n sub-arrays.
     // Space complexity: O(n), since 1 space each for n sub-arrays.


     public void sort(int[] numbers) {

         mergeSort(numbers, numbers.length - 1);
     }


     private void mergeSort(int[] a, int n) { // n = a.length

         if (n < 2) {
             return;//Base case
         }

         int m = n / 2;
         int[] l = new int[m];
         int[] r = new int[n - m];

         for (int i = 0; i < m; i++) {
             l[i] = a[i];
         }

         for (int i = m; i < n; i++) {
             r[i - m] = a[i];
         }

         mergeSort(l, m);
         mergeSort(r, n - m);

         merge(a, l, r, m, n - m);
     }

     private void merge(int[] a, int[] l, int[] r, int left, int right) {


         int i = 0, j = 0, k = 0;
         while (i < left && j < right) {
             if (l[i] <= r[j]) {
                 a[k++] = l[i++];

             } else {
                 a[k++] = r[j++];
             }


         }
         while (i < left) {
             a[k++] = l[i++];
         }
         while (j < right) {
             a[k++] = r[j++];
         }

     }
 }




