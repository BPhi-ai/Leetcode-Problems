package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64,25,12,22,11};
        int[] sorted = sort(arr);
        
        System.out.println("Sorted Array using SelectionSort: ");
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] sort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {

            //find minimum value of unsorted array
            int min = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            //replace first value with minimum value.
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
