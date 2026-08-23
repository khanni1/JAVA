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
        // System.out.println("Enter degree of polynomial : ");
        // int deg = sc.nextInt();

        polynomial p1 = new polynomial(3);
        polynomial p2 = new polynomial(2);



        p1.insert();
        p1.toString(true);

        p2.insert();
        p2.toString(true);

     polynomial  temp =  p1.addPoly(p2);
     polynomial  temp2 =  p1.subPoly(p2);
     polynomial  temp3 =  p1.mulPoly(p2);

     System.out.println('\n');

     p1.toString(true);

     System.out.println('\n');

    p2.toString(true);

     System.out.println('\n');

    temp3.toString(false);



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
            System.out.println("\nenter x^"+i+"= ");
           Double x = sc.nextDouble();
            p.add(x);
        }

        return p;
    }

     public ArrayList<Double> insert(Double ini){

        Scanner sc = new Scanner(System.in);


        // initialise all coeff with ini

        for(int i=0 ; i<= degree ; i++){
            p.add(ini);
        }

        return p;
    }


    public void toString(boolean nozero){

        if(!nozero){

        for(int i=degree ; i>=0 ; i--){
            System.out.print(p.get(i)+"x^"+i);
            if(i > 0){
                System.out.print(" + ");
            }

        }
        }
        else{
            for(int i=degree ; i>=0 ; i--){
            if(p.get(i) == 0.0){
                continue;
            }
            if(i < degree){
                System.out.print(" + ");
            }
            System.out.print(p.get(i)+"x^"+i);

        }
        }
    }

    public polynomial addPoly(polynomial p2){

        int mdeg = 0;

        if(degree > p2.degree){
            mdeg = degree;
        }
        else {
            mdeg = p2.degree;
        }

        polynomial temp = new polynomial(mdeg);

        for(int i=0 ; i<=mdeg ; i++){

            Double coeff = 0.0;

            if(i > p2.degree){
            coeff = p.get(i);

            }
            else if (i > degree ){
            coeff = p2.p.get(i);
                
            }
            else{
                coeff = p.get(i) + p2.p.get(i);
            }

            temp.p.add(coeff);
        }

        return temp;
    }

    public polynomial subPoly(polynomial p2){

        int mdeg = 0;

        if(degree > p2.degree){
            mdeg = degree;
        }
        else {
            mdeg = p2.degree;
        }

        polynomial temp = new polynomial(mdeg);

        for(int i=0 ; i<=mdeg ; i++){

            Double coeff = 0.0;

            if(i > p2.degree){
            coeff = p.get(i);

            }
            else if (i > degree ){
            coeff = p2.p.get(i);
                
            }
            else{
                coeff = p.get(i) - p2.p.get(i);
            }

            temp.p.add(coeff);
        }

        return temp;
    }

    public polynomial mulPoly(polynomial px){
        int mdeg = degree + px.degree;

        polynomial temp = new polynomial(mdeg);

        temp.insert(0.0); // ini all with 0

        Double coeff;
        int index,i,j;


        for(i=0 ; i<= degree ; i++){
            for(j=0 ; j<=px.degree ; j++ ){
                coeff = p.get(i) * px.p.get(j) ;// mul the coefficients
                index = i+j ;//add the powers the powers are represted by index of polynomial

                // add already exsisting coeff on that index

               coeff =  temp.p.get(index) + coeff;
                temp.p.set(index,coeff);
            }
        }
    return temp;
    }



    
}