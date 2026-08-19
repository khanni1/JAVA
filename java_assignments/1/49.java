// 49. Pascal Triangle 
// DefiniƟon: A program to print Pascal's Triangle. 
// ExplanaƟon: Pascal's Triangle is generated using combinatons or the sum of adjacent elements 
// from the previous row. 

import java.util.Scanner;

class Pascal_triangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); // take no. of rows input

        System.out.println("Enter the number of rows ");

        int n = sc.nextInt();

        int num =1;

        for(int i =0 ; i<n ; i++){


            for (int space = 0 ; space < n-1-i ; space++){
                // System.out.print("*");
                System.out.print(" "); // spaces
            }

            num =1;
            for(int j = 0 ; j<=i ; j++){
                System.out.print(num+" ");
                num = num*(i-j)/(j+1);
            }
            System.out.println();
        }


    }
}