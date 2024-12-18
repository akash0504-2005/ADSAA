import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] A = new int[n];
        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        
        System.out.println("Enter element to search:");
        int key = sc.nextInt();
        int x = linearSearch(A, key);
        
        if (x != -1)
            System.out.println("Element found at location " + x);
        else
            System.out.println("Element not found");
    }
    
    public static int linearSearch(int[] A, int key) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == key)
                return i; 
        }
        return -1; 
    }
}



//output
Enter size of array:
5
Enter 5 numbers:
10 20 30 40 50
Enter element to search:
30
Element found at location 2
