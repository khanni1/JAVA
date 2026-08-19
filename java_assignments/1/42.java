import java.util.*;

class PerfectSquare{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer to determine : ");

        int num = sc.nextInt();

        if(Math.sqrt(num) % 1 == 0){
            System.out.println("its a perfect square");
        }
        else{
            System.out.println("its a not perfect square");

        }


    }


}