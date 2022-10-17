
import java.util.ArrayList;
import java.util.Scanner;

// sub


public class Practice_4_4_Subsets_iteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string ");
        String str1 = sc.nextLine();

        System.out.println("Using non returning");

        System.out.println(Subset_String_Approach1(str1,""));

    }
    static ArrayList<String> Subset_String_Approach1(String str1, String ans)
    {
        if(str1.isEmpty())  // this will exit when present caller gets it one permutation
        {
            ArrayList<String> Present_call_value_individual = new ArrayList<String>();
            Present_call_value_individual.add(ans);
            return Present_call_value_individual;
        }
        // this list is made at every single level but the value will pass to its previous call.
        ArrayList<String> Present_call_val_whole = new ArrayList<String>();

        char Present_starting_val_of_str1 = str1.charAt(0);

        for(int i = 0;i<=ans.length();i++)
        {
            String Place_holder_1 = ans.substring(0,i);
            String Place_holder_2 = ans.substring(i,ans.length());
            Present_call_val_whole.addAll(Subset_String_Approach1((str1.substring(1,str1.length())),(Place_holder_1 + Present_starting_val_of_str1 + Place_holder_2)));
        }
        // the total permutation that we have got from the below calls get return at this point
        return Present_call_val_whole;

    }


}
