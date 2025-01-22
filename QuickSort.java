import java.util.Scanner;

public class QuickSort {
    public static int partition(int[] a, int low, int high) {
        int pivot = a[low];
        int i = low + 1;
        int j = high;
        while (i <= j) {
            while (i <= high && a[i] <= pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(a, i, j);
            }
        }
        swap(a, j, low);
        return j;
    }

    public static void QuickSort(int[] a, int low, int high) {
        if (low < high) {
            int j = partition(a, low, high);
            QuickSort(a, low, j - 1); 
            QuickSort(a, j + 1, high); 
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        QuickSort(a, 0, a.length - 1);
        System.out.println("Sorted array:");
        for (int num : a) {
            System.out.print(num + " ");  // Print elements on the same line
        }
        sc.close();
    }
}


//output
enter the number of elements:4
enter the array elements:
24
45
6
12
sorted array 6 12 24 45
