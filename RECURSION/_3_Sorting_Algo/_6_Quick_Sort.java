

import java.util.Arrays;
import java.util.Scanner;

public class Practice_3_6_Quick_sort {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array ");
        int Array_len = sc.nextInt();
        System.out.println("Enter the elements of the array ");
        int[] Arr = new int[Array_len];

        for(int i = 0;i<Array_len;i++)
        {
            Arr[i] = sc.nextInt();
        }
        quick_sort(Arr,0,Arr.length-1); //     Adjacent value check
        System.out.println(Arrays.toString(Arr));
    }

    static void quick_sort(int[] arr, int s ,int e)
    {
        if(s<e)
        {
            int pivot = pivot(arr,s,e);
            // divide step
            quick_sort(arr,s,pivot-1); // passing array of elements which are less than pivot to further sort the array
            quick_sort(arr,pivot+1,e); // passing array of elements which are greater than pivot for further sorting the array
        }
    }
    static int pivot(int[] arr, int s, int e)
    {
        int pivot = arr[e];         // let consider that the last element is pivot value
        int i = s;                 // second pointer
        int j = s-1;              // first pointer

        for(i = s;i<e;i++)          // second pointer which makes constant moves in array
        {
            if(arr[i]<pivot)
            {
                j++;

                 /* XOR SWAP */
                arr[i] = arr[i] ^ arr[j];
                arr[j] = arr[i] ^ arr[j];
                arr[i] = arr[i] ^ arr[j];

//                int temp = arr[i];     // when both the first and second pointers pointing on the same index then it doesn't change
//                arr[i] = arr[j];
//                arr[j] = temp;
            }
        }

        System.out.println(arr[j+1] + " " + arr[e]);

        /* XOR SWAP */

        arr[e] = arr[e] ^ arr[j+1];
        arr[j+1] = arr[e] ^ arr[j+1];
        arr[e] = arr[e] ^ arr[j+1];


//
//        int temp = arr[e];        // if their is any greater value than pivot element then it get swap with the element
//        arr[e] = arr[j+1];
//        arr[j+1] = temp;

        return j+1;
    }
}
