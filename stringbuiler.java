import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
       
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
       
        StringBuilder evenNumbers = new StringBuilder();
        StringBuilder oddNumbers = new StringBuilder();
       
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenNumbers.append(arr[i]).append(" ");
            } else {
                oddNumbers.append(arr[i]).append(" ");
            }
        }
       
        System.out.println(evenNumbers.toString().trim() + " " + oddNumbers.toString().trim());
    }
}
