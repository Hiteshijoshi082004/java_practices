import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to swapping ");
        System.out.println( "Enter value of A:");
        int a = sc.nextInt();
        System.out.println( "Enter value of B:");
        int b = sc.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("Swapping Done");
        System.out.println("Value of A:"+a);
        System.out.println("Value of B:"+b);
    }
}