public class throws_keyword {
    static void checkAge(int age) throws ArithmeticException {
    if (age < 18) {
        throw new ArithmeticException("Access denied");
    }
    else {
        System.out.println("Access granted");
    }
    }

    public static void main(String[] args) {
      checkAge(22); // Set age to 15 (which is below 18...)
    }
}

