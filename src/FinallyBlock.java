import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n= sc.nextInt();
            int div=100/n;
            System.out.println(div);
        }
        catch (ArithmeticException e){
            System.out.println("Inavalid input");
        }
        finally {
            System.out.println("the division operation is complete");
        }
    }

}
