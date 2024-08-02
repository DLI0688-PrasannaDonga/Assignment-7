import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try{
        System.out.println("Enter num1");
        int n1= sc.nextInt();
        System.out.println("Enter num2");
        int n2= sc.nextInt();
        float div;
            div=n1/n2;
            System.out.println(div);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException occurs");

        }
        catch (InputMismatchException e){
            System.out.println("InputMismatchException occurs");
        }
    }
}
