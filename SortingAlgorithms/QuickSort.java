package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] sorted = quickSort(arr, 0, arr.length - 1);
        
        System.out.println("Sorted Array using QuickSort: ");
        System.out.println(Arrays.toString(sorted));
    }

     // A utility function to swap two elements
     public static void swap(int[] arr, int i, int j)
     {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
     }
  
     // This function takes last element as pivot,
     // places the pivot element at its correct position
     // in sorted array, and places all smaller to left
     // of pivot and all greater elements to right of pivot
     public static int partition(int[] arr, int low, int high)
     {
         // Choosing the pivot
         int pivot = arr[high];
  
         // Index of smaller element and indicates
         // the right position of pivot found so far
         int i = (low - 1);
  
         for (int j = low; j <= high - 1; j++) {
  
             // If current element is smaller than the pivot
             if (arr[j] < pivot) {
  
                 // Increment index of smaller element
                 i++;
                 swap(arr, i, j);
             }
         }
         swap(arr, i + 1, high);
         return (i + 1);
     }
  
     // The main function that implements QuickSort
     // arr[] --> Array to be sorted,
     // low --> Starting index,
     // high --> Ending index
     public static int[] quickSort(int[] arr, int low, int high)
     {
         if (low < high) {
  
             // pi is partitioning index, arr[p]
             // is now at right place
             int pi = partition(arr, low, high);
  
             // Separately sort elements before
             // partition and after partition
             quickSort(arr, low, pi - 1);
             quickSort(arr, pi + 1, high);
         }
         return arr;
     }
}
