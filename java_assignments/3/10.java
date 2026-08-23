/*
10. Polynomial Operations 
 Create a Polynomial class that represents a polynomial equation (e.g., 3x2+2x+53x^2 + 2x + 5). 
 Use an ArrayList to store coefficients. 
 Implement methods to add, subtract, and multiply two polynomials. 
 Override toString() to display them in algebraic form. 
 In main(), take two polynomials and perform all operations. */

// we will use ArrayList

import java.util.*;

class main_poly{
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter degree of ploynomial : ");
        int deg = sc.nextInt();

        polynomial p1 = new polynomial(deg);

        p1.insert();
        p1.displayPoly();


    }



}


class polynomial{

    ArrayList<Double> p = new ArrayList<Double>();

    int degree;

    polynomial(int deg) {
        degree = deg;
    }

    public ArrayList<Double> insert(){

        Scanner sc = new Scanner(System.in);


        // degree = deg;

        for(int i=0 ; i<= degree ; i++){
            System.out.println("enter x^"+i+"= ");
           Double x = sc.nextDouble();
            p.add(x);
        }

        return p;
    }

    public void displayPoly(){
        for(int i=degree ; i>=0 ; i--){
            System.out.print(p.get(i)+"x^"+i);
            if(i > 0){
                System.out.print(" + ");
            }

        }
    }

    
}