import java.io.*;
import java.lang.*;
import java.util.*;


// file reading and writing characters 



class exec{
    public static void main(String args[]) throws IOException{
        FileReader fr = new FileReader("test.txt");

        BufferedReader bfr = new BufferedReader(fr);

        String line;
        while((line = bfr.readLine()) != null){
            System.out.println(line);
        }

        bfr.close();

        FileWriter fw = new FileWriter("test2.txt",true); // for append true

        BufferedWriter bfw = new BufferedWriter(fw);

        Scanner sc = new Scanner(System.in);

        System.out.println("INput here : ");
        String str = sc.nextLine();

        bfw.write(str);
        bfw.newLine();
        bfw.close();
        sc.close();
    }
}