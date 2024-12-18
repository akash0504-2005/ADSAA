import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
            A[i] = sc.nextInt();

        selectionSort(A);

        System.out.println("Sorted array:");
        for (int i = 0; i < A.length; i++) 
            System.out.print(A[i] + " ");
    }

    static void selectionSort(int[] A) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = A[minIndex];
            A[minIndex] = A[i];
            A[i] = temp;
        }
    } 
} 
