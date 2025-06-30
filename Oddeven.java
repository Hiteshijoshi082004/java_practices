import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        if(num1%2==0){
            System.out.println("It is Even number "+num1);
        }
        else{
            System.out.println("Odd Number"+num1);
        }
    }
}
