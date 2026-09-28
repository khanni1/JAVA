import java.lang.*;
import java.util.*;
import java.io.*;

class Counter {
    public static int count = 0;
}

class A extends Thread{
    public void run(){
// threads task here
for (int i=0 ; i<10 ; i++){
System.out.println("A ###");

}
    }
}

class B implements Runnable {
    synchronized public void run(){
        // threads task here
for (int i=0 ; i<10 ; i++){
System.out.println("B $$$  "+Counter.count);

    Counter.count++;
    // System.out.println();
}
    }

}

class C implements Runnable{
     synchronized public void run(){
        // threads task here
for (int i=0 ; i<10 ; i++){
System.out.println("C ***  "+Counter.count);
    Counter.count++;

}

    }


}

class RunThread {
    public static void main(String args[]){
        A a = new A();
        B br = new B();
        C cr = new C();

        Thread b = new Thread(br);
        Thread c = new Thread(cr);

        // b.setPriority(9);

        // a.start();
        b.start();
        c.start();


    }
}