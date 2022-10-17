
import java.util.Scanner;
import java.util.ArrayList;

public class Practice_5_2_Roll_A_Dice {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the desired input for die ");
        int Target = sc.nextInt();
        System.out.print("All the possible permutation of the die values are ");
        System.out.println(Allpermutation(Target,""));

    }
    static ArrayList<String> Allpermutation(int Target, String ans)
    {
        if(Target == 0)
        {
            ArrayList<String> Present_call_ans = new ArrayList<>();
            Present_call_ans.add(ans);
            return Present_call_ans;
        }

        ArrayList<String> Present_recursive = new ArrayList<>();


        for(int Possible_value =1;Possible_value<=Target && Possible_value <= 6;Possible_value++)
        {

            Present_recursive.addAll(Allpermutation(Target -Possible_value ,ans+""+Possible_value));
        }

        return Present_recursive;


    }
}
