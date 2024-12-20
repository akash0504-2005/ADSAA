import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {


    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
        selectionSort(arr);
        long endTime = System.nanoTime();
        System.out.println("Sorted array: " + Arrays.toString(arr));
        long duration = endTime - startTime;
        System.out.println("Selection Sort Time: " + duration + " nanoseconds");

        scanner.close();
    }
}

//output
Enter the number of elements: 4
Enter the elements:
25 11 22 64
Original array: [25, 11, 22, 64]
Sorted array: [11, 22, 25, 64]
Selection Sort Time: 600000 nanoseconds

