import java.io.*;

public class count {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter an integer: ");
        int num = Integer.parseInt(reader.readLine());
        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }

        System.out.println("The number of digits in the input number is " + count + ".");
    }
}