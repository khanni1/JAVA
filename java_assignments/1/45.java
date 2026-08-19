// prime factors

import java.util.*;

class PrimeMain{
    public static void main(String args[]){

        Vector<Integer> temp = new Vector();
        
       Vector v1 = primeFactor(24,temp);

       for(int i=0 ; i<v1.size() ; i++){
        System.out.println(v1.get(i));
       }
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

    static Vector<Integer> primeFactor(int n,Vector<Integer> t){

        // Vector<Integer> t = new Vector();

        if(isPrime(n)){
            t.add(n);
            return t;
        }

        for (int i=2 ; i< n ;i++){
            if(n%i == 0){
                // its divisible
               int quo = (int)(n/i);


                
                    primeFactor(i,t);
                
                    primeFactor(quo,t);
                    
                    return t; // end here will mostly
                
                

            }

        }

        return t;  // just in case end here 






    }
}