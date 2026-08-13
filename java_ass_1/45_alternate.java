/*If you wanted to write this in a pure functional style—where
 the method does not rely on modifying a shared reference passed 
 into it, but instead creates, merges, 
and returns new lists—you would drop the Vector<Integer>
 t parameter completely. */

import java.util.*;

class PrimeMain {
    public static void main(String args[]) {
        // We no longer need to pass an empty "temp" vector
        Vector<Integer> v1 = primeFactor(100);

        for (int i = 0; i < v1.size(); i++) {
            System.out.println(v1.get(i));
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        int end = (int) Math.sqrt(n);
        for (int i = 2; i <= end; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Notice we only pass 'n' now. No accumulator vector 't' is passed.
    static Vector<Integer> primeFactor(int n) {
        Vector<Integer> result = new Vector<>();

        // Base case: Create a list, add the prime, and return it.
        if (isPrime(n)) {
            result.add(n);
            return result;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                int quo = n / i;

                // 1. Get independent lists from the recursive calls
                Vector<Integer> leftFactors = primeFactor(i);
                Vector<Integer> rightFactors = primeFactor(quo);

                // 2. MERGE them into our local 'result' list using addAll()
                result.addAll(leftFactors);
                result.addAll(rightFactors);

                // 3. Return the merged list
                return result;
            }
        }

        return result;
    }
}