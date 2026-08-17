import java.lang.*;
import java.util.*;

// newer versions need Thread.m1() not just m1 directly

class Ttest2 {
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
            
            if(i == 4){
                Thread.yield();
            }
            System.out.println("A : "+i);

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

            if(i == 9){
                try{

                Thread.sleep(1000); // sleep has to be in try catch else error
                } catch (Exception e){

                }
            }

            System.out.println("B : "+i);
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
            System.out.println("C : "+i);
        }
            System.out.println("Exited C \n");

    }
}