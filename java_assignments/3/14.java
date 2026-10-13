// 14. Complex Number Calculator 
//  Create a ComplexNumber class with real and imaginary parts. 
//  Implement methods for addition, subtraction, multiplication, and division of complex numbers. 
//  Override toString() for proper display (e.g., 3 + 4i). 
//  Demonstrate in main() with multiple operations. 

class Complex_main{
    public static void main(String args[]){
        Complex c1 = new Complex(1.0,1.0);
        Complex c2 = new Complex(1.0,0.0);
        Complex c3 = new Complex(3.0,2.0);
        Complex c4 = new Complex(1.0,-1.0);

        System.out.println(c1.add(c2).toString());
        System.out.println(c1.sub(c2).toString());
        System.out.println(c1.mul(c3).toString());
        System.out.println(c3.div(c4).toString());
        
    }


}

class Complex{
    Double real;
    Double img;

    Complex(Double r,Double i){
        real = r;
        img = i;

    }

    Complex add(Complex c1){
        Complex c = new Complex(0.0,0.0);
        // ini

        c.real = c1.real + this.real;
        c.img = c1.img + this.img;

        return c;

    }

      Complex sub(Complex c1){
        Complex c = new Complex(0.0,0.0);
        // ini

        c.real = c1.real - this.real;
        c.img = c1.img - this.img;

        return c;

    }

    Complex mul(Complex c){
        Complex co = new Complex(0.0,0.0);

        co.real = (real * c.real) - (img * c.img);
        co.img = (real * c.img) + (img * c.real);

        return co;
    }

    Complex div(Complex c){
        // this is dividend or numerator and c is dividend or denominator
        Complex co_numer = new Complex(0.0,0.0);

        Double deno = 1.0;

        co_numer.real = (real * c.real) + (img * c.img) ;
        co_numer.img = (img * c.real) - (real * c.img);

        deno = c.real*c.real + c.img*c.img;

        co_numer.real = co_numer.real/deno;
        co_numer.img = co_numer.img/deno;

        return co_numer;
    }

    // @Override
   public String toString(){
        return real + " + " + img + "i";
    }
}