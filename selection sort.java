import java.util.*;
public class Selection {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

       
        for (int i = 0; i < n - 1; i++) {
            
            int minIndex = i;

          
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;  
                }
            }

            
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

  
    public static void main(String[] args) {
        int[] arr = {60,23,56,78,19};

        System.out.println("Original Array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}

OUTPUT:
       Original Array:
       60 23 56 78 19 
       Sorted Array:
       19 23 56 60 78 
