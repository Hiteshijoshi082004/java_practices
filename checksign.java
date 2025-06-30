import java.util.Scanner;

public class checksign {
    public static void main(String[] args) {
        System.out.println("please enter number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num>0){
            System.out.println("Number is positive "+num);
        }
        else if (num<0) {
            System.out.println("NUmber is negative" +num);
        }
        else{
            System.out.println("Zero");
        }
    }
}
