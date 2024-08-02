import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        super(str);

    }
}

public class CustomCheckedException {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            if(age<18){
                throw new InvalidAgeException("Invalid broo");

            }
            else{
                System.out.println("You got it broo");
            }
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
