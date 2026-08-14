java.util.*;

class primeCheck {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number : ");
        int num = sc.nextInt();

        System.out.println(isPrime(num));
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