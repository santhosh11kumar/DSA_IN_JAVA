import java.util.Scanner;


public class Practice_4_1_Remove_char {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string ");
        String str1 = sc.nextLine();
        String str1_copy = str1;


        System.out.println("Now enter which char do you want to remove");
        char ch = sc.next().charAt(0);

        String str2 = Remove_char_Approach1(str1,ch,0,"");
        System.out.println("The string without '"+ ch + "' will be : " + str2);



        String str2_copy = Remove_char_Approach2(str1_copy,ch,0);
        System.out.println("The string without '"+ ch + "' will be : " + str2_copy);
    }
    static String Remove_char_Approach1(String s,char c,int index,String s2)
    {
        if(index == s.length())
        {
            return s2;
        }
        if((s.charAt(index)) == c)
        {
            return Remove_char_Approach1(s,c,index+1,s2); // skipping the value
        }

        return  Remove_char_Approach1(s,c,index+1,s2 + s.charAt(index));//adding the char

    }
    static String Remove_char_Approach2(String s,char c,int index)
    {


        if(index == s.length())
        {

            return "";
        }
        if((s.charAt(index)) == c)
        {
            return  Remove_char_Approach2(s,c,index+1);
        }
        else
        {
            return   s.charAt(index) + Remove_char_Approach2(s,c,index+1)  ;
        }

    }





}
