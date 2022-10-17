
import java.util.Arrays;
import java.util.Scanner;

public class Practice_3_2_bubble_sort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int Array_len = sc.nextInt();
        int[] Arr = new int[Array_len];
        System.out.println("Enter the elements of the array");
        for(int i = 0;i<Array_len;i++)
        {
            Arr[i] = sc.nextInt();
        }
        bubble_sort(Arr);
        System.out.println(Arrays.toString(Arr));
    }


    static void bubble_sort(int[] arr)
    {
        helper(arr,0,arr.length-1);
    }
    static void helper(int[] arr, int s , int e)
    {
        if(e==0)
        {
            return;
        }
        if(s<e)
        {
            if(arr[s]>arr[s+1])
            {
                arr[s] = arr[s] ^ arr[s+1];
                arr[s+1] = arr[s] ^ arr[s+1];
                arr[s] = arr[s] ^ arr[s+1];
            }
            helper(arr,s+1,e);
        }
        else
        {
            helper(arr,0,e-1);
        }

    }
}
