import java.util.Scanner;
class NegativeNumberException extends Exception{
    public NegativeNumberException(String str){
        super(str);
    }
}


public class CustomUncheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
           int n= sc.nextInt();
           if(n>0){
               System.out.println("Positive number");
           }
           else {
               throw new NegativeNumberException("Nagative number please enter positive number");
           }

        }catch(NegativeNumberException e){
            System.out.println(e.getMessage());


        }
    }
}