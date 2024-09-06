import java.io.*;

public class percentage {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double totalMarks = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = Double.parseDouble(reader.readLine());
            totalMarks += marks;
        }

        double percentage = (totalMarks / 500) * 100;
        System.out.printf("The percentage is %.2f%%.", percentage);
    }
}