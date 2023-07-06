class A extends Thread {
    public void run()
    {
        try {
            for(int i=0;i<10;i+=2){
                System.out.println("Even Number" +i);
            }
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
class B extends Thread {
    public void run()
    {
        try {
            for(int i=1;i<10;i+=2){
                System.out.println("Odd Number "+i);
            }
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
public class Main {
    public static void main(String[] args)
    {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();
    }
}



