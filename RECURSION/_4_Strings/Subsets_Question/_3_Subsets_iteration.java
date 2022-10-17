
import java.util.Scanner;
import java.util.ArrayList;

public class Practice_4_3_Subsets_of_string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string ");
        String str1 = sc.nextLine();

        System.out.println("Using non returning");
        Subset_String_Approach1(str1,"",0);

        System.out.println("Using a returning function");
        System.out.println(subset_String_Approach2(str1,"",0));
    }
    static void Subset_String_Approach1(String s, String ans,int index)
    {
        if(index == s.length() )
        {
            System.out.println(ans);
            return;
        }
        Subset_String_Approach1(s,ans + s.charAt(index),index+1);  // adding the present index character
        Subset_String_Approach1(s,ans,index+1);  // not adding the present index character

    }
    static ArrayList<String> subset_String_Approach2(String str, String Ans, int index )
    {
        if(index == str.length())
        {
            ArrayList<String> Present_List = new ArrayList<String>();
            Present_List.add(Ans);
            return Present_List;
        }
        ArrayList<String> Left = subset_String_Approach2(str,Ans,index+1);
        ArrayList<String> Right = subset_String_Approach2(str,Ans + str.charAt(index), index +1);
        Left.addAll(Right);
        return Left;
    }
}
