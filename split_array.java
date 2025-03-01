import java.util.Scanner;

public class SeparateOddEven {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
       
        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
       
        // Create an array of size n
        int[] arr = new int[n];
       
        // Read the array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
       
        // Print odd numbers
        System.out.println("Odd numbers in the array:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
       
        // Print even numbers
        System.out.println("\nEven numbers in the array:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
       
        // Close the scanner object to prevent resource leak
        scanner.close();
    }
}


