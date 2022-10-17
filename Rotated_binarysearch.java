package Recurssion_easy_practice._2Arrays;

import java.util.Scanner;

public class Practice_2_3_rotated_binary_search {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int Array_len = sc.nextInt();

        int[] Arr = new int[Array_len];

        System.out.println("Enter the elements of the array ");
        for(int i = 0;i<Array_len;i++)
        {
            Arr[i] = sc.nextInt();
        }
        System.out.println(find_pivot(Arr,0,Arr.length-1));
        System.out.println(find_target_rotatod_BS(Arr,5,0,Arr.length-1)); // not yet done
    }
    static int find_pivot(int[] arr,int s,int e)
    {
        int mid = s + (e-s)/2;
        if(s==e) // at last both the start and end pointers meet at a point which is our desired answer ( e-1<e>e+1)
        {
            return mid+1;
        }
        if(arr[mid]<arr[mid+1] && arr[s]<=arr[mid]) // every element is smaller than next element except that pivot case
        {                                             // and aslo if we move the lowest value part then also it will excute
            return find_pivot(arr,mid+1,e);             // so i have done a check that if and only if the middle value is greater than start element
        }

        return find_pivot(arr,s,mid);

    }
    static int find_target_rotatod_BS(int[] arr,int target,int s,int e)
    {
        int mid = s + (e-s)/2;
        if(s>e)
        {
            return -1;
        }

        if(arr[s]<target)
        {
            if(arr[0]<target)
            {
                return find_target_rotatod_BS(arr,target,mid+1,e);
            }
            else if(target<arr[0])
            {
                return find_target_rotatod_BS(arr,target,mid+1,e);
            }
        }

        else if(target < arr[mid])
        {
            if(arr[s] == target)
            {
                return s;
            }
            else if(arr[0]<target)

            {
                return find_target_rotatod_BS(arr,target,mid+1,e);
            }
            else if(target<arr[0])
            {
                return find_target_rotatod_BS(arr,target,mid+1,e);
            }

        }
        return mid;


    }
}
