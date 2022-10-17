package Recurssion_easy_practice._6Maze_Problems;

import java.io.CharArrayWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Practice_6_1_Basic_Maze {
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
        System.out.println(Allpossibleways(Target_Position_row,Target_Position_col,Starting_Position_row,Starting_Position_col));
    }
    static int Allpossibleways(int Target_Position_row,int Target_Position_col, int row, int col)
    {
        if(row == Target_Position_row || col == Target_Position_col)
        {
            return 1;

        }
        int count = 0;

        count = count +Allpossibleways(Target_Position_row,Target_Position_col,row+1,col);
        count = count +Allpossibleways(Target_Position_row,Target_Position_col,row,col+1);

        return count;

    }
}
