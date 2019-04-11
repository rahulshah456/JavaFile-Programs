class A
{
    A()
    {
        System.out.println("Constructor in A");
    }
}
class B extends A
{
    B()
    {
        System.out.println("Default Constructor in B");
    }
    B(int a)
    {
        this();
        System.out.println("Parameterized Constructor in B");
    }
}
class C extends B
{
    C(int b)
    {
        //Using Super keyword to call super class’s constructor
        super(10);
        System.out.println("Default Constructor in C");
    }
}
class Super
{
    public static void main(String[] args)
    {
        new C(20);
    }
}