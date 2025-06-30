import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one:");
        int num1 = sc.nextInt();
        System.out.println("Enter number second:");
        int num2 = sc.nextInt();
        System.out.println("Sum of two numbers is:" +(num1+num2));
    }
}
