// 14. Complex Number Calculator 
//  Create a ComplexNumber class with real and imaginary parts. 
//  Implement methods for addition, subtraction, multiplication, and division of complex numbers. 
//  Override toString() for proper display (e.g., 3 + 4i). 
//  Demonstrate in main() with multiple operations. 

class Complex_main{
    public static void main(String args[]){

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
        Complex c = new Complex(0,0);
        // ini

        c.real = c1.real + this.real;
        c.img = c1.img + this.img;

    }
}