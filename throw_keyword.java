public class throw_keyword
{
    public static void checkNum(int num)
    {
        if(num<1)
        {
            throw new ArithmeticException("Number is negative");
        }
        else
        {
            System.out.println(num*num);
        }
    }
    public static void main(String args[])
    {
        throw_keyword obj = new throw_keyword();
        obj.checkNum(-3);
        System.out.println("Rest of the code");
    }
}