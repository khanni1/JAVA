
// Q-2 : Write a Java program using the Object-Oriented Programming (OOP) approach to compute the sum of the 
// following series: S=1/1+1/2+1/3+⋯+1/n    S1 = 1/1 + 1/2 +1/22 + ..... 1/2n

class S{
     

    Double generateSeries(int n){
        Double summ = 0.0;

        for (int i=1 ; i<= n ; i++){
            summ = summ + 1.0/i ; 
        }

        return summ;
    }
}


class S1{

    Double generateSeries(int n){
        Double summ = 0.0;

        Double deno = 1.0;

        for (int i=0 ; i<= n ; i++){
            deno = Math.pow(2.0,i);
            summ = summ + 1.0/deno ; 
        }

        return summ;
    }
}

class q2_main {
    public static void main(String args[]){
        S1 s1 = new S1();
        S s = new S();

        System.out.println(s1.generateSeries(3));
        System.out.println(s.generateSeries(3));
    }
}