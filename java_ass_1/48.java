/*
48. Decimal to Words 
Definiton: A program to display a given number in words. 
Explanaton: The program converts each digit of the number into its corresponding word.
 */

// 1235 => one two three five

import java.util.Scanner;
import java.util.Vector;

class Decimal_Words {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Integer :")

        int n = s.nextInt();

        Vector<String> vec = seperateDigits(n);

        for (String i : vec) {
        System.out.print(i + " ");
    }
    }

    static Vector<String> seperateDigits(int num){
        Vector<String> v1 = new Vector();

        // String s = Integer.toString(num);

        int rem;

        int copy = num;
        num = Math.abs(num);

        while(num > 0){
            rem = num % 10;
            num = num / 10;
            v1.add(0,digitToWord(rem)); // adds from front
            
        }

        if(copy < 0){
            v1.add(0,digitToWord(10)); // negative or minus sign mappped

        }

        return v1;


    }

    static String digitToWord(int x){
        String[] map = {
            "Zero", "One", "Two", "Three", "Four", 
            "Five", "Six", "Seven", "Eight", "Nine","Negative"
        };

        

        return (map[x]);
    }
}