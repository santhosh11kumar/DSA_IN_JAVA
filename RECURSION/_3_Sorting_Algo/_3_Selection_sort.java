
import java.util.Arrays;
import java.util.Scanner;

public class Practice_3_3_Selection_sort {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Array_len = sc.nextInt();
        int[] Arr = new int[Array_len];

        for(int i = 0;i<Array_len;i++)
        {
            Arr[i] = sc.nextInt();
        }
        selection_sort(Arr);
        System.out.println(Arrays.toString(Arr));
//        selectionSort(Arr,Arr.length-1,0,0);
//        System.out.println(Arrays.toString(Arr));
    }
    static void selection_sort(int[] arr)
    {
        helper(arr,arr.length-1,0,0);
    }
    public static void helper(int[] arr,int e,int s,int max)
    {
        if(e == 0)
        {
            return;
        }

        if(s <= e)
        {
            if(arr[s] > arr[max])
            {
                helper(arr,e,s+1,s);
            }
            else
            {
                helper(arr,e,s+1,max);
            }
        }
        else
        {
            arr[max] = arr[max] ^ arr[e]; // xor swap failing but below one is fine
            arr[e] = arr[max] ^ arr[e];
            arr[max]   = arr[max] ^ arr[e];


            helper(arr, e - 1, 0, 0);
        }
    }
//    public static void selectionSort(int[] arr,int e,int s,int max)
//    {
//        if(e == 0)
//        {
//            return;
//        }
//        if(s <= e)
//        {
//            if(arr[s] > arr[max])
//            {
//                selectionSort(arr,e,s+1,s);
//            }
//            else
//            {
//                selectionSort(arr,e,s+1,max);
//            }
//        }
//        else
//        {
//            int temp = arr[max];
//            arr[max] = arr[e];
//            arr[e] = temp;
//
//
//            selectionSort(arr, e - 1, 0, 0);
//        }
//    }


}

