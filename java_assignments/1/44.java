// A program to calculate the sum of all prime numbers within a given range

import java.util.*;


class PrimeSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter start : ");
        int start = sc.nextInt();

        System.out.println("enter stop : ");
        int stop = sc.nextInt();

        int i;
        int sum = 0;

        for(i = start ; i <= stop ; i++  ){
            if(isPrime(i)){
        System.out.println(i);
            sum = sum + i;
            }


        }

        System.out.println(sum);
    }

     static boolean isPrime(int n){
        if (n <= 1) return false; // 0 and 1 not primes

       int end = (int)Math.sqrt(n);

        int i = 0;

        for(i=2 ; i<= end ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}