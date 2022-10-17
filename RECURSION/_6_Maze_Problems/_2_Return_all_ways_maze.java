package Recurssion_easy_practice._6Maze_Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice_6_2_Return_All_Ways_Maze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row for destination ");
        int Target_Position_row = sc.nextInt();

        System.out.println("Enter the col for destination ");
        int Target_Position_col = sc.nextInt();

        System.out.println("Enter the starting index of row in the maze");
        int Starting_Position_row = sc.nextInt();

        System.out.println("Enter the starting index of col in the maze");
        int Starting_Position_col = sc.nextInt();

        System.out.println(Allpossibleways(Target_Position_row,Target_Position_col,Starting_Position_row,Starting_Position_col,""));

    }
    static ArrayList<String> Allpossibleways(int Target_Position_row, int Target_Position_col, int row, int col, String ans)
    {
        if(row == Target_Position_row && col == Target_Position_col)
        {

            ArrayList<String> Present_call_ans = new ArrayList<>();
            Present_call_ans.add(ans);
            return Present_call_ans;

        }

        ArrayList<String> Left = new ArrayList<>();
        ArrayList<String> Right = new ArrayList<>();

        if(row<Target_Position_row)  // when we run out of length then there is no reason to call this functioin
        {
            Left.addAll(Allpossibleways(Target_Position_row,Target_Position_col,row+1,col,ans+"R"));

        }
        if(col<Target_Position_col)
        {
            Right.addAll(Allpossibleways(Target_Position_row,Target_Position_col,row,col+1,ans+"D"));

        }
        Left.addAll(Right);

        return Left;

    }

}
