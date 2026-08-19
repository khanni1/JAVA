/*
47. Number Frequency 
Definiton: A program to count the frequency of each digit in a given number. 
Explanaton: The program counts how many Ɵmes each digit appears in the number
 */

import java.util.*;

class frequency{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.print("enter a integer : ");

        int num = s.nextInt();

        int[] ans = freqCount(num);

        for(int i=0 ; i<ans.length ; i++){
            if(ans[i] != 0 ){
            System.out.println(i+" repeated : "+ans[i]+" times");

            }
        }

    }

    public static int[] freqCount(int num) {
        int[] arr = new int[10]; // auto ini with zeros

        Vector<Integer> v = seperateDigits(num);

        for (int i : v){
            arr[i]++;
        } 

        return arr;
        
    }

    static Vector<Integer> seperateDigits(int num){
        Vector<Integer> v1 = new Vector();

        if (num == 0) 
        { v1.add(0); 
        return v1; }

        int rem;

        num = Math.abs(num);

        while(num > 0){
            rem = num % 10;
            num = num / 10;
            v1.add(0,rem); // adds from front
            
        }

        return v1;


    }

}

