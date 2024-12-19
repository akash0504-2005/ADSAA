import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] A = new int[n];
        
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        

        long startTime = System.nanoTime();
        bubbleSort(A);
        long endTime = System.nanoTime();
        System.out.println("Sorted array:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("\nTime taken: " + (endTime - startTime) + " nanoseconds");
    }

    
    static void bubbleSort(int[] A) {
        int n = A.length;
        
        
        for (int i = 0; i < n - 1; i++) {
            
            for (int j = 0; j < n - i - 1; j++) {
                
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }
}
