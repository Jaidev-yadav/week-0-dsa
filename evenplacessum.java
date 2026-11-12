public class evenplacessum {
public static void main(String[] args) {
        int n = 123456;
        int sum = 0;
        int count = 1;

        while (n > 0) {
            int digit = n % 10;

            if (count % 2 == 0) {
                sum = sum + digit;
            }

            n = n / 10;
            count++;
        }

        System.out.println("Sum of Even Places = " + sum);
    }
}   