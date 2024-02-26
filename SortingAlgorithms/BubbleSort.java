package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] sorted = bubbleSort(arr, arr.length);
        
        System.out.println("Sorted Array using BubbleSort: ");
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] bubbleSort(int[] arr, int n) {
        int i, j, temp;
        boolean swapped;

        for(i = 0; i < n - 1; i++) {
            swapped = false;
            for(j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    //swap arr[j] and arr[j + 1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false) {
                break;
            }
        }
        return arr;
    }

}
