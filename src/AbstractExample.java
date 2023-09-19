abstract class Super
{
    public Super()
    {
        System.out.println("Super Constructor");
    }
    public void meth1()
    {
        System.out.println("Meth1 of Super");
    }
    public abstract void meth2();
}
// Concrete class
class Sub extends Super
{
    public void meth2()
    {
        System.out.println("Sub meth2");
    }
}

public class AbstractExample {
    public static void main(String[] args) {

        Sub s = new Sub();
        s.meth1();
        s.meth2();

    }
}
