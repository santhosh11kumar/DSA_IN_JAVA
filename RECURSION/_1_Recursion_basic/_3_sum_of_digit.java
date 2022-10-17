
import java.util.Scanner;

public class Practice_1_3_sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your desired number ");
        int num = sc.nextInt();
        System.out.println(sum_(num,0));
    }
    static int sum_(int num,int sum)
    {
        if(num==0)
        {
            return sum;
        }
        return sum_(num/10,sum+num%10);
    }
}
