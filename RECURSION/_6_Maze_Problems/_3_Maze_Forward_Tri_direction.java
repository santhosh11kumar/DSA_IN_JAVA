package Recurssion_easy_practice._6Maze_Problems;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Scanner;
public class Practice_6_3_Maze_Forward_Tri_direction {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row for destination ");
        int Target_Position_row = sc.nextInt();

        System.out.println("Enter the col for destination ");
        int Target_Position_col = sc.nextInt();

        System.out.println("Enter the starting index of row in the maze");
        int Starting_Position_row = sc.nextInt();

        System.out.println("Enter the starting index of col in the maze");
        int Starting_Position_col = sc.nextInt();

        System.out.print("All the possible permutation in maze are ");
        System.out.println(Tridirection(Target_Position_row,Target_Position_col,Starting_Position_row,Starting_Position_col,""));
    }
    static ArrayList<String> Tridirection(int Target_row,int Target_col,int Starting_row,int Starting_col,String ans)
    {
        if(Starting_row == Target_row && Starting_col == Target_col)
        {
            ArrayList<String> Present_call_ans = new ArrayList<>();
            Present_call_ans.add(ans);
            return Present_call_ans;
        }

        ArrayList<String> Left_recursive = new ArrayList<>();
        ArrayList<String> Middle_recursive = new ArrayList<>();
        ArrayList<String> Right_recursive = new ArrayList<>();


        if(Starting_row < Target_row && Starting_col < Target_col) // diagonal one can only traverse until their index is less than the target element index
        {
            Left_recursive.addAll(Tridirection(Target_row,Target_col,Starting_row + 1, Starting_col+1,ans + "-DG"));
        }
        if(Starting_row < Target_row)
        {
            Middle_recursive.addAll(Tridirection(Target_row,Target_col,Starting_row + 1, Starting_col,ans + "-VE"));
        }

        if(Starting_col< Target_col)
        {
            Right_recursive.addAll(Tridirection(Target_row,Target_col,Starting_row , Starting_col+1,ans + "-HZ"));
        }

        Left_recursive.addAll(Middle_recursive);
        Left_recursive.addAll(Right_recursive);

        return Left_recursive;
    }

}
