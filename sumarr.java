import java.util.Scanner;
public class sumarr {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of elements u want to add");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Sum of Array Elements = " + sum);
    }
}