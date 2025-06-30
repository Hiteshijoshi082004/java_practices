import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter ur age :");
        int age = sc.nextInt();
        System.out.println("Are u a female? (true/false)");
        boolean isFemale = sc.nextBoolean();
        if(age<5){
            System.out.println("Your got 75% discount");
        }
        else if (isFemale) {
            System.out.println("You got 50 % discount");
        }
        else if( age>60 && !isFemale){
            System.out.println("You got 25% discount");
        }
        else{
            System.out.println("No Discount");
        }
    }
}
