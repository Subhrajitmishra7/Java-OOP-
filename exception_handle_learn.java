public class exception_handle_learn {
    public static void main(String args[])
    {
        int i=0;
        int arr[] = new int[5];
        try
        {
            int  j=10/i;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero. " + e);
        }
        System.out.println();
        try
        {
            int k = arr[5];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Cannot access elements out of reach. "+e);
        }
    }
}
