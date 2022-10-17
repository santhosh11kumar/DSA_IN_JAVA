package Recurssion_easy_practice._6Maze_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice_6_5_Tridirection_Maze_with_multi_obstacle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the row  ");
        int Length_row = sc.nextInt();

        System.out.println("Enter the length of the col ");
        int Length_col = sc.nextInt();

        boolean [][] maze = new boolean[Length_row][Length_col];
        for (int row = 0;row<Length_row;row++)
        {
            for (int col = 0;col<Length_col;col++)
            {
                System.out.println("Enter the value of maze at index " + row +","+ col+ " is ");
                maze[row][col]=sc.nextBoolean();
            }
        }
        System.out.println(Arrays.deepToString(maze));
        System.out.println(Multi_Obstacle("",maze,0,0));

    }
    static ArrayList<String> Multi_Obstacle(String ans , boolean[][] maze, int row,int col)
    {
        if(row == maze.length && col == maze[0].length) // till end of the maze
        {
            ArrayList<String> Present_recursive = new ArrayList<>();
            Present_recursive.add(ans);
            return Present_recursive;
        }
        if(maze[row][col] == false ) // when any of the point is an obstacle just return empty
        {
            ArrayList<String> Present_but_obstacle = new ArrayList<>();
            Present_but_obstacle.add("");
            return Present_but_obstacle;
        }

        ArrayList<String> Left_recursive = new ArrayList<>();
        ArrayList<String> Middle_recursive = new ArrayList<>();
        ArrayList<String> Right_recursive = new ArrayList<>();

        if(row< maze.length-1 && col < maze[0].length-1)
        {
            Left_recursive.addAll(Multi_Obstacle(ans+"-DG",maze,row+1,col+1));
        }
        if(row< maze.length-1)
        {
            Middle_recursive.addAll(Multi_Obstacle(ans + "-VE",maze,row+1,col));
        }
        if(col< maze.length-1)
        {
            Right_recursive.addAll(Multi_Obstacle(ans + "-HZ" ,maze,row,col+1));
        }
        Left_recursive.addAll(Middle_recursive);
        Left_recursive.addAll(Right_recursive);

        return Left_recursive;
    }
}
