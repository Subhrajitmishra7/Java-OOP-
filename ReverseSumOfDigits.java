import java.io.*;

public class ReverseSumOfDigits {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter an integer: ");
        int num = Integer.parseInt(reader.readLine());
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        int reversedSum = 0;
        int n =sum;
        while (sum != 0) {
            reversedSum = (reversedSum * 10) + (sum % 10);
            sum /= 10;
        }

        System.out.println("The sum of digits of the input number is " + n + ".");
        System.out.println("The reverse of the sum is " + reversedSum + ".");
    }
}