import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        int n= sc.nextInt();

            float div=100/n;
            System.out.println(div);
        }catch (ArithmeticException e){
            System.out.println("Exception Occur");
        }

    }
}