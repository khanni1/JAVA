import java.io.*;
import java.lang.*;
import java.util.*;

// file io objects serilization

class Emp implements Serializable {
    int id;
    String name;

    Emp(int id,String name){
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println("name : "+name);
        System.out.println("id : "+id);
    }
}


class exec{

    public static void main(String args[]) throws IOException, ClassNotFoundException{
   ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.ser"));
   ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.ser"));

   Emp e1 = new Emp(101,"khanjan");
   Emp e2 = new Emp(102,"Ramanujan");

   oos.writeObject(e1);
   oos.writeObject(e2);

   oos.close();

   Emp ee1 = (Emp) ois.readObject();
   Emp ee2 = (Emp) ois.readObject();

   ee1.display();
   ee2.display();

   ois.close();



}}