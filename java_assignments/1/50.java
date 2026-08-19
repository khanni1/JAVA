/*
50. Floyd's Triangle 
DefiniƟon: A program to print Floyd's Triangle. 
ExplanaƟon: Floyd's Triangle displays consecuƟve natural numbers in a triangular paƩern. 
*/ 

import java.util.Scanner;

class Floyd_triangle {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the rows for Floyd's Triangle : ");

        int n = s.nextInt();

        int num = 1;

        for(int i=0 ; i<n ; i++){

            for(int space = 0; space < n-1-i ; space++){
                System.out.print(" ");
            }

            for(int j=0 ; j<=i ; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}