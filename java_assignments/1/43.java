import java.util.*;

class PerfectCube{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer to determine : ");

        int num = sc.nextInt();

        if(Math.cbrt(num) % 1 == 0){
            System.out.println("its a perfect cube");
        }
        else{
            System.out.println("its a not perfect cube");

        }


    }


}