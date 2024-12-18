import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        
        
        if (n <= 0) {
            System.out.println("Array size should be greater than zero.");
            sc.close();
            return;
        }
        
        int[] A = new int[n];
        
        System.out.println("Enter " + n + " numbers (sorted in ascending order):");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        
      
        Arrays.sort(A);
        
        System.out.println("Enter element to search:");
        int key = sc.nextInt();
        
        int x = binarySearch(A, key);
        
        if (x != -1) {
            System.out.println("Element found at location " + x);
        } else {
            System.out.println("Element not found");
        }
        
        
        sc.close();
    }
    
    
    public static int binarySearch(int[] A, int key) {
        int low = 0;
        int high = A.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
          
            if (A[mid] == key) {
                return mid; 
            }
            
            
            if (A[mid] > key) {
                high = mid - 1;
            }
            
            else {
                low = mid + 1;
            }
        }
        
        
        return -1;
    }
}


//output
Enter size of array:
5
Enter 5 numbers (sorted in ascending order):
10 20 30 40 50
Enter element to search:
30
Element found at location 2

