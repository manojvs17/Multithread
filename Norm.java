class A{
    public void display1()
    {
        for(int i=0;i<10;i+=2)
            System.out.println("Even Number " +i);
            Thread.sleep(1000);
    }
}

class B{
    public void display2()
    {
        for(int i=1;i<10;i+=2)
            System.out.println("Odd Number "+i);
    }
}

public class Norm {
    public static void main(String[] args)
    {
        A obj1 = new A();
        B obj2 = new B();
        obj1.display1();
        obj2.display2();
    }
}
