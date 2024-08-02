import java.util.Scanner;

public class ExceptionHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter number");
            int n=sc.nextInt();
            String str= null;

            if(n>0) {
                float div = 100 / n;
                System.out.println(div);
            }else{
                throw new ArithmeticException("Invalid");
            }

            System.out.println(str.length());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
    }
}
