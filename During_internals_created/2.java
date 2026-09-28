import java.io.*;
import java.lang.*;
import java.util.*;


// file reading and writing bytes 



class exec{
    public static void main(String args[]) throws IOException{
        FileInputStream fis = new FileInputStream("test.txt");
        FileOutputStream fos = new FileOutputStream("test2.txt",true);

        int data;

        while((data = fis.read()) != -1){
            fos.write(data);
        }

        fos.close();
        fis.close();
    }
}


/*
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("test.txt");

        String str = "Hello Java";

        fos.write(str.getBytes());

        fos.close();
    }
}
 */


/*

FileInputStream fis = new FileInputStream("test.txt");
FileOutputStream fos = new FileOutputStream("test2.txt");

byte[] buffer = new byte[1024];
int n;

while ((n = fis.read(buffer)) != -1) {
    fos.write(buffer, 0, n);
}

fis.close();
fos.close();
 */