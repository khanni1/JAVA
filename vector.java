import java.util.*;

class MainVector{
    public static void main(String args[]){
        Vector v1 = new Vector();
        v1.add("hello");
        v1.add(1);
        v1.add(1.23);
        v1.add("world");

        for (int i =0 ; i<v1.size() ; i++){
            System.out.print(v1.get(i)+" ");
            System.out.print(v1.get(i).getClass().getName()+" , "); // getting datatype for objects
            // System.out.print(v1.get(i).getClass()+" , ");
        }
        
    }


}