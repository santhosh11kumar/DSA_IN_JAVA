package Recurssion_easy_practice._6Maze_Problems;


import java.util.Scanner;
import java.util.ArrayList;

public class Practice_6_4_Tridirection_maze_with_obstacles {
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

        System.out.println("Enter the obstacle index in row");
        int Obstacle_Row = sc.nextInt();

        System.out.println("Enter the obstacle index in col");
        int Obstacle_col = sc.nextInt();




        System.out.print("All the possible permutation in maze are ");
        System.out.println(Tridirection_obstacel_Maze(Target_Position_row,Target_Position_col,Starting_Position_row,Starting_Position_col,Obstacle_Row,Obstacle_col,""));

    }


    static ArrayList<String> Tridirection_obstacel_Maze(int Target_row,int Target_col,int Starting_row,int Starting_col,int obstacle_row,int obstacle_col,String ans)
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

        if(Starting_row == obstacle_row && Starting_col == obstacle_col) // when the present call is a obstacle then it's better to delete that way as it is going through that
        {
            ArrayList<String> Present_call_ans = new ArrayList<>();
            Present_call_ans.add(""); // by passing empty the
            return Present_call_ans;
        }
        if(Starting_row < Target_row && Starting_col < Target_col) // diagonal one can only traverse until their index is less than the target element index
        {
            Left_recursive.addAll(Tridirection_obstacel_Maze(Target_row,Target_col,Starting_row + 1, Starting_col+1,obstacle_row,obstacle_col,ans + "-DG"));
        }
        if(Starting_row < Target_row)
        {
            Middle_recursive.addAll(Tridirection_obstacel_Maze(Target_row,Target_col,Starting_row + 1, Starting_col,obstacle_row,obstacle_col,ans + "-VE"));
        }

        if(Starting_col< Target_col)
        {
            Right_recursive.addAll(Tridirection_obstacel_Maze(Target_row, Target_col, Starting_row, Starting_col + 1, obstacle_row, obstacle_col, ans + "-HZ"));
        }

        Left_recursive.addAll(Middle_recursive);
        Left_recursive.addAll(Right_recursive);

        return Left_recursive;
    }
}
