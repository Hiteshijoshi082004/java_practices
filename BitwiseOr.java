import java.util.Scanner;

public class BitwiseOr {
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("bitwise or ");
    System.out.println("first no :");
    int first  = in.nextInt();
    System.out.println("second no :");
    int sec  = in.nextInt();
    int result = first| sec;
    System.out.println(result);
 }   
}
