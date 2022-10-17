
import java.util.Scanner;

public class Practice_1_5_Decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your desired number ");
        int num = sc.nextInt();
        System.out.println(Decimal_to_binary(num));
    }
    static int Decimal_to_binary(int n)
    {
        if(n == 0)
        {
            return n;
        }
        int present_val = n%2;  // that call stack val
        return  Decimal_to_binary(n/2)* (int)Math.pow(10,1) + present_val   ;



    }
}
