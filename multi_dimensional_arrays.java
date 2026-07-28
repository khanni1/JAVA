import java.util.ArrayList;

class MainClass1 {
    public static void main(String args[]){
        // normal 2d array

        int sales[][] = new int[5][];

        sales[0] =  new int[31];
        sales[1]= new int[12];
        sales[2]= new int[28];
        sales[3]= new int[15];
        sales[4]= new int[5];

        // allocated row 0,1,2 of Sales mutlidimenaional array

        System.out.println(sales.length);
        System.out.println(sales[0].length);
        System.out.println(sales[1].length);

        // System.out.println(sales[3].length);

        /* Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "<local1>[3]" is null
        at MainClass.main(multi_dimensional_arrays.java:18) */

        System.out.println();

        printArray2D_Iterative(sales);
    }

    public static void printArray2D(int[][] arr){
        for(int[] row: arr){
            for(int i:row){
                System.out.print(i+"| ");
            }
            System.out.println();
        }
    }

    public static void printArray2D_Iterative(int[][] arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j]+"| ");
            }
            System.out.println();

        }
    }


}