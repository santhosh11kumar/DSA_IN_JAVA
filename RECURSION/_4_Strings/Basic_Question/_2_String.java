
import java.util.Scanner;

// # tried my best but some test cases failing
// when ever it find and remove the string the last char of delete string is removing in future calls also

public class Practice_4_2_Remove_string {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str1 = sc.nextLine();


        System.out.println("Now enter the string which you want to remove");
        String Delete = sc.nextLine();

        String Ans = Remove_String(str1, 0, Delete, 0,1);
        System.out.println("The string without '"+ Delete + "' will be : " + Ans);

    }
    static String Remove_String(String s,int index_main,String Del,int index_Del,int flag )
    {
        if(index_main == s.length())
        {
            return "";
        }
        if(s.charAt(index_main) == Del.charAt(index_Del) && flag == 1 )
        {
            if (index_Del<Del.length()-1)
            {
                index_Del++;

            }
            else if(index_Del==Del.length()-1)
            {
                return Remove_String(s,index_main+1,Del,index_Del,flag);
            }
            return Remove_String(s,index_main+1,Del,index_Del,flag);
        }
        else if((index_main >0) && (index_Del >0) && (index_Del < Del.length()-1) && (s.charAt(index_main) != Del.charAt(index_Del)) && (s.charAt(index_main-1) == Del.charAt(index_Del-1)))
        {

            return Remove_String(s,index_main-1,Del,0,0);
        }

        else
        {
            return s.charAt(index_main) + Remove_String(s,index_main+1,Del,index_Del,1);
        }

    }

    public static class Practice_4_3_Subsets_of_string {
    }
}
