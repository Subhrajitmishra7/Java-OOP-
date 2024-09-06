
import java.io.*;

public class divisor {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter an integer: ");
        int num = Integer.parseInt(reader.readLine());
        int divisor = 1;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                divisor = i;
                break;
            }
        }

        if (divisor == 1) {
            System.out.println("The number is a prime number.");
        } else {
            System.out.println("The first divisor of " + num + " is " + divisor + ".");
        }
    }
}