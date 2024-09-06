class Pro 
{
    public static void main(String args[]) throws ClassNotFoundException
    {
        Second s = new Second();
        s.m1();
        s.m2();
    }
}
abstract class First
{
    public void m1()
    {
        System.out.println("Parent-m1");
    }
    public abstract void m2();
}
class Second extends First
{
    public void m2()
    {
        System.out.println("Child-m2");
    }
}
if (ch == 0) {
    System.out.println("first choice");
}
