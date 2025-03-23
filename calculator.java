import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int result;
    int operation = sc.nextInt();
    switch(operation){
            case 1:
            result = num1+num2;
            System.out.println("addition result:"+result);
            break;
            case 2:
            result = num1-num2;
            System.out.println("Subtarction result:"+result);
            break;
            case 3:
            result = num1*num2;
            System.out.println("Multiplication result:"+result);
            break;
            case 5:
            result = num1/num2;
            System.out.println("Division result:"+result);
            break;
            case 6:
            result = num1%num2;
            System.out.println("Modulo result:"+result);
            break;
            default: System.out.println("wrong calculation");
            break;

    }
}
}
