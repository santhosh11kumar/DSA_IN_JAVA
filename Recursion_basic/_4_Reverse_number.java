
import java.util.Scanner;

public class Practice_1_4_reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your desired number ");
        int num = sc.nextInt();
        int len = (((int)Math.log10(num)+1));
        System.out.println(reverse(num,0));
        System.out.println(palindrome(num,len));
    }
    static int reverse(int num,int prev)
    {

        if(num == 0)
        {
            return prev;
        }
        prev = (num%10) + (prev*10);
        return reverse(num/10,prev);


    }

    static int palindrome(int num,int len)
    {

        int size= (((int)Math.log10(num)));
        System.out.println(size + "size");
        int start=num/((int)Math.pow(10,size));
        int flag = 1;

        if(num % 10 == num)
        {
            return 1;
        }

        int ans = (helper(start,num%10,1));
        if(ans == 0)
        {
            System.out.println("came here");
            return 0;
        }

        System.out.println("num : " + num +  "  " + len);

        return palindrome(num/10,len);

    }
    static int helper(int start,int num,int flag)
    {

        if(start != num)
        {
            flag = 0;

        }
        System.out.println(start + "  " +num + "   flag : " + flag);
        return flag;
    }
}




