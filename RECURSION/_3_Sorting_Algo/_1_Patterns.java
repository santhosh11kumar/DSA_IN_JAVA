
import java.util.Scanner;

public class Practice_3_1_patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Butterfly size");
        int n = sc.nextInt();
        matrix(num);
        System.out.println("");
        _triangle_(num);
        Inverse_triangle_(num);
        leftside_right_angle_traingle(num);
        rightside_right_angle_traingle(num);
        System.out.println("");
        absoulte_triangle(num);
        butterfly(n);


    }
    static void matrix(int n)
    {
        matrix_helper_(n,0,n);
    }
    static void matrix_helper_(int row,int col,int n)
    {
        if(row==0)
        {
            return;
        }
        if(col<n)
        {
            System.out.print(" * ");
            matrix_helper_(row,col+1,n);
        }
        else
        {
            System.out.println(" ");
            matrix_helper_(row-1,0,n);
        }
    }
    static void _triangle_(int n)
    {
        triangle_helper_(0,0,n);
    }
    static void triangle_helper_(int i ,int j,int n)
    {

        if(j == n) // it is to terminate at the end of the whole program
        {
            return;
        }
        if(i<=j)
        {
            System.out.print(" * ");
            triangle_helper_(i+1, j,n);

        }
        else
        {
            System.out.println(" ");
            triangle_helper_(0,j+1,n);

        }

    }
    static void Inverse_triangle_(int n)
    {
        Inverse_triangle_helper(0,0,n);
    }
    static void Inverse_triangle_helper(int i ,int j,int n)
    {

        if(j == n) // it is to terminate at the end of the whole program
        {
            return;
        }
        if(i<n-j)
        {
            System.out.print(" * ");

            Inverse_triangle_helper(i+1, j,n);
        }
        else
        {
            System.out.println("  ");
            Inverse_triangle_helper(0,j+1,n);
        }

    }
    static void leftside_right_angle_traingle(int n)
    {
        helper_leftside_right_angle_traingle(n,0,n);
    }
    static void helper_leftside_right_angle_traingle(int row,int col,int n)
    {
        if(row==0)
        {
            return;
        }
        if(col<n)
        {
            if(col<row-1)
            {
                System.out.print("   ");
            }
            else
            {
                System.out.print(" * ");

            }
            helper_leftside_right_angle_traingle(row,col+1,n);
        }
        else
        {
            System.out.println("");
            helper_leftside_right_angle_traingle(row-1,0,n);
        }

    }
    static void rightside_right_angle_traingle(int n)
    {
        helper_rightside_right_angle_traingle(n,0,n);
    }
    static void helper_rightside_right_angle_traingle(int row,int col, int n )
    {
        if(row==0)
        {
            return;
        }
        if(col<n)
        {
            if (col < (n - row))
            {
                System.out.print("   ");
            }
            else
            {
                System.out.print(" * ");
            }
            helper_rightside_right_angle_traingle(row,col+1,n);
        }
        else
        {
            System.out.println("");
            helper_rightside_right_angle_traingle(row-1,0,n);
        }
    }
    static void absoulte_triangle(int num)
    {
        helper_absoulte_triangle(num,0,num);
    }
    static void helper_absoulte_triangle(int row,int col,int n)
    {
        if(row==0)
        {
            return;
        }
        if(col<(n*2)-1)
        {
            if((col < (row - 1)) || ((n + (n - row) -1 )< col))
            {
                System.out.print("   ");
            }
            else
            {
                System.out.print(" * ");
            }
            helper_absoulte_triangle(row,col+1,n);
        }
        else
        {
            System.out.println("");
            helper_absoulte_triangle(row-1,0,n);
        }
    }
    static void butterfly(int n)
    {
        helper_butterfly(n-1,0,n);
    }
    static void helper_butterfly(int row, int col, int n)
    {
        if(row==0)
        {
            return;
        }

        if(col<n)
        {
            if((n-row-1)<(n)/2)
            {
                if(((n- row -1)<col) && ( col < (row) ) )
                {
                    System.out.print("   ");
                }
                else
                {
                    System.out.print(" "+col + " ");
                }
            }
            else
            {
                if((col < (row)))
                {
                    System.out.print(" "+col + " ");
                }
                else if(((n - row -1 ) < col ))
                {
                    System.out.print(" "+col + " ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            helper_butterfly(row,col+1,n);
        }
        else
        {
            System.out.println("");
            helper_butterfly(row-1,0,n);
        }
    }



}
