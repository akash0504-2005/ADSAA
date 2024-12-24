import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1; 
            while (j >= 0 && arr[j] > key)  {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        long startTime = System.nanoTime();
        insertionSort(arr);
        long endTime = System.nanoTime();
        System.out.println("Sorted array: " + Arrays.toString(arr)); 
        long duration = endTime - startTime;
        System.out.println("Insertion Sort Time: " + duration + " nanoseconds");

        scanner.close();
    }
}

//output
Enter the number of elements: 6
Enter the elements:
12 11 13 5 6
Original array: [12, 11, 13, 5, 6]
Sorted array: [5, 6, 11, 12, 13]
Insertion Sort Time: 500000 nanoseconds


