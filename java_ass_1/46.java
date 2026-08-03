/*
46. HCF and LCM of Three Numbers 
DefiniƟon: A program to calculate the HCF and LCM of three given numbers. 
ExplanaƟon: The program extends the HCF and LCM calculaƟon to three integers.
 */

// gcd or hcf(a,b,c) == hcf(hcf(a,b),c) == hcf(a,hcf(b,c))

import java.util.*;

class HcfLcm{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = s.nextInt();
        
        System.out.print("Enter b : ");
        int b = s.nextInt();
        
        System.out.print("Enter c : ");
        int c = s.nextInt();

        System.out.print("HCF : ");
        System.out.println(hcf(hcf(a,b),c));

        System.out.print("LCM : ");
        System.out.println(lcm(lcm(a,b),c));




    }

    public static int hcf(int a,int b){

        int temp;

        if(a<b){
            temp = a; // so a is always bigger
            a = b;
            b = temp;
        }

        while(b != 0) {
            temp = b;
            b = a%b;
            a = temp;   
        
        }

        return a;
    }

    public static int lcm(int a,int b){
        return (a*b)/hcf(a,b);
    }
}