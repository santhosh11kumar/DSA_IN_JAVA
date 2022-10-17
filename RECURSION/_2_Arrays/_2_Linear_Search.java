package Recurssion_easy_practice._2Arrays;

import java.util.Scanner;

public class Practice_2_2_linear_search {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array len: ");
        int Array_len = sc.nextInt();
        int[] Arr = new int[Array_len];
        System.out.println("Enter the desired target: ");
        int target = sc.nextInt();

        System.out.println("Enter the elements of Array");
        for(int i = 0;i<Array_len;i++)
        {
            Arr[i] = sc.nextInt();
        }
        System.out.print("Do value present in an array?: ");
        System.out.println(Linearsearch(Arr,target,0));
    }
    static boolean Linearsearch(int[] arr, int target, int index)
    {
        if(index == arr.length)
        {
            return false;
        }
        return (arr[index] == target) || (Linearsearch(arr, target , index +1));
    }





}
