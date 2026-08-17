import java.lang.*;
import java.util.*;

class Ttest {
    public static void main(String args[]){
        A a = new A();
        a.iterSet();

        B b = new B();
        b.iterSet();

        C c = new C();
        c.iterSet();
        
        // try altering the order and see
        a.start();
        c.start();
        b.start();

        // output exited C than B then A. also started C then A then B
        // start is random and exiting of thread also is random that means
    }
}

class A extends Thread {

    int iter;

    public void iterSet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter iter A thread : ");
        iter = sc.nextInt();
    }

    public void run(){
        for (int i = 0 ;i<=iter ; i++){
            System.out.println("Thread A : "+i);
        }
            System.out.println("Exited A \n");

    }
}


class B extends Thread {

    int iter;

    public void iterSet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter iter B thread : ");
        iter = sc.nextInt();
    }

    public void run(){
        for (int i = 0 ;i<=iter ; i++){
            System.out.println("Thread B : "+i);
        }
            System.out.println("Exited B \n");

    }
}

class C extends Thread {

    int iter;

    public void iterSet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter iter C thread : ");
        iter = sc.nextInt();
    }

    public void run(){
        for (int i = 0 ;i<=iter ; i++){
            System.out.println("Thread C : "+i);
        }
            System.out.println("Exited C \n");

    }
}