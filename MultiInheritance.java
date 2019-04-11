interface first
{
    public abstract void m1();
    void m2();
}
interface second
{
    void m3();
}
class Test
{
    public void m4()
    {
        System.out.println("m4 in Test");
    }
    public void m5()
    {
        System.out.println("m5 in Test");
    }
}
class Check extends Test implements first,second
{
    public void m1()
    {
        System.out.println("m1 in Check");
    }
    public void m2()
    {
        System.out.println("m2 in Check");
    }
    public void m3()
    {
        System.out.println("m3 in Check");
    }
}
class MultiInheritance
{
    public static void main(String[] args)
    {
        Check C1 = new Check();
        C1.m1();
        C1.m2();
        C1.m3();
        C1.m4();
        C1.m5();
    }
}
