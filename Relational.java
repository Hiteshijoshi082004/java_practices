import java.util.Scanner;

public class Relational {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your age:");
    int age = sc.nextInt();
    if(age>=18){
        System.out.println("you are eligible to drive");
    }
    else{
        System.out.println("beta cycle chalao ");
    }
 }   
}
