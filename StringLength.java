import java.io.*;

public class StringLength {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        String inputString = br.readLine();
        int stringLength = inputString.length();
        System.out.println("The length of the input string is " + stringLength + ".");
    }
}