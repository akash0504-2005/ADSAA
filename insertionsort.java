import java.util.Scanner;

public class InsertionSort {
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
            System.out.println(A[i] + " ");
    }

    static void selectionSort(int[] A) {
        int n = A.length;
        for (int i = 0; i < n ; i++) {
           
            int z = A[i];
            int j=i-1;
              while(j>=0&&A[j]>z){
              		A[j+1]=A[j];
              		j--;
              		}
              		 A[j+1]=z;
         }     		 
    } 
} 
