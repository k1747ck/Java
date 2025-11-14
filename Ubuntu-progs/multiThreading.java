import java.util.Scanner;

public class multiThreading {
    static class A extends Thread{
        String Name;
        int Age;
        Scanner sc = new Scanner(System.in);
        public void run(){
            System.out.println("Enter the Name:");
            Name = sc.nextLine();
            System.out.println("Enter the Age:");
            Age = sc.nextInt();
            
            System.out.println("My Name is " + Name +" and my Age is "+ Age);
            
        }
    }
    static class B extends Thread{
        public void run(){
            for(int i = 1; i<=10; i++){
                System.out.println("Thread in B"+i);
            }
        }
    }

    static class C extends Thread{
        public void run(){

            for(int n = 1; n <=10; n++){
                System.out.println("Thread in C"+ n);
            }
        }
    }
    public static void main(String[] args) {
       A a1 = new A();
       B b1 = new B();
       C c1 = new C();

       a1.start();
       b1.start();
       c1.start();
    }
}
