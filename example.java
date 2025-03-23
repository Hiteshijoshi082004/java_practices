import java.util.Scanner;
public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // example1
        int var = sc.nextInt();
        if(var>0){
            System.out.println("positive number");
        }
        else{
            System.out.println("negative number");
        }
        // example 2
        int monthno = sc.nextInt();
        if(monthno==1){
            System.out.println("jan");
        }
        else if (monthno==2) {
            System.out.println("feb");
        }
        else if (monthno==3){
            System.out.println("march");
        }
        else if (monthno==4){
            System.out.println("april");
        }
        else if (monthno==5){
            System.out.println("may");
        }
        else if (monthno==6){
            System.out.println("june");
        }
        else if (monthno==7){
            System.out.println("july");
        }
        else if (monthno==8){
            System.out.println("august");
        }
        else if (monthno==9){
            System.out.println("september");
        }
        else if (monthno==10){
            System.out.println("october");
        }
        else if (monthno==11){
            System.out.println("novemeber");
        }
        else if (monthno==12){
            System.out.println("decemeber");
        }
        else{
            System.out.println("invalid number");
        }

        // example 3

        int sci = sc.nextInt();
        int maths = sc.nextInt();
        int social = sc.nextInt();
        int total =  sci+maths+social;
        int percentage = (total)*100/300;
        System.out.println("percentage is:"+percentage);

        if(percentage>91 && percentage<100){
            System.out.println("A+");
        }
        else if(percentage>81 && percentage<90){
            System.out.println("A");
        }
        else if(percentage>71 && percentage<80){
            System.out.println("B+");
        }
        else if(percentage>61 && percentage<70){
            System.out.println("B");
        }
        else if(percentage>51 && percentage<60){
            System.out.println("C");
        }
        else{
            System.out.println("fail in exam");
        }
        

    }
}
