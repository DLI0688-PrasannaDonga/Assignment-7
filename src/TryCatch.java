import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        try{
            float div=100/n;
            System.out.println(div);
        }catch (ArithmeticException e){
            System.out.println("Exception Occur");
        }

    }
}