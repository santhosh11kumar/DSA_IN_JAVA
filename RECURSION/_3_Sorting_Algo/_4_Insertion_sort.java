
import java.util.Arrays;
import java.util.Scanner;

public class Practice_3_4_insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int Array_len = sc.nextInt();
        int[] Arr = new int[Array_len];
        System.out.println("Enter the elements of the array");
        for(int i = 0;i<Array_len;i++)
        {
            Arr[i] = sc.nextInt();
        }

        insertion_sort(Arr);
        System.out.println(Arrays.toString(Arr));

    }

    static void insertion_sort(int[] arr)
    {
        helper(arr,0,arr.length-1);
    }
    public static void helper(int[] arr, int s, int e)
    {

        if(s==0)
        {
            if(arr[0]>arr[1])
            {
                arr[0] = arr[0] ^ arr[1];
                arr[1] = arr[0] ^ arr[1];
                arr[0] = arr[0] ^ arr[1];
                helper(arr,s+1,e);
            }
        }
        else
        {
            if(arr[s-1]>arr[s])
            {
                arr[s-1] = arr[s-1] ^ arr[s];
                arr[s] = arr[s-1] ^ arr[s];
                arr[s-1]   = arr[s-1] ^ arr[s];
                helper(arr,s-1,e);
            }
        }
        if(s==e)
        {
            return;
        }

        helper(arr,s+1,e);

    }

}