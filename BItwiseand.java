import java.util.Scanner;

public class BItwiseand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcase Bitwise And");
        System.out.println("Enter first no");
        int first = input.nextInt();
        System.out.println("Second no ");
        int sec = input.nextInt();

        int result = first & sec;
        System.out.println(result);
    }
}
