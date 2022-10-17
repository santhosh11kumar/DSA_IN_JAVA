package Recurssion_easy_practice._2Arrays;


import java.util.Scanner;


public class Practice_2_1_Array_sort_or_not {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int Array_len = sc.nextInt();
        System.out.println("Enter the elements of the array ");
        int[] Arr = new int[Array_len];

        for(int i = 0;i<Array_len;i++)
        {
            Arr[i] = sc.nextInt();
        }
        System.out.println(Sort_or_unsorted(Arr));
    }
    static boolean Sort_or_unsorted(int[] arr)
    {
        return helper(arr,0,arr.length-1);
    }

    static boolean helper(int[] arr, int start, int end)
    {
        if(start == end)   // where array completed
        {
            return true;
        }
        if(arr[start] <= arr[end]) // check for ascending order
        {
            if(arr[start] > arr[start+1]) // ascending order violating case
            {
                return false;
            }
        }
        else if(arr[start] >= arr[end] ) // check for descending order
        {
            if(arr[start]<arr[start+1]) // descending order violating case
            {
                return false;
            }
        }
        return helper(arr,start + 1, end);
    }
}
