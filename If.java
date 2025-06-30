public class If {
    public static void main(String[] args) {
        boolean isMale = false;
        String name = "Bob";
        if(isMale){
            System.out.println("Mr." +name  );
        }
        else{
            System.out.println("Ms." +name);
        }

        boolean isSeniorCitizen = false;
        boolean isAnAdult = false;
        if(isSeniorCitizen){
            System.out.println("Hello Senior Citizen");
        }
        else{
            if(isAnAdult){
                System.out.println("Hello Adult" );
            }
            else{
                System.out.println("hello child");
            }
        }
    }
}
