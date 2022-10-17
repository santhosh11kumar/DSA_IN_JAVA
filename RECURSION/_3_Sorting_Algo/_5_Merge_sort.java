

import java.util.Arrays;
import java.util.Scanner;

public class Practice_3_5_merge_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array ");
        int Array_len = sc.nextInt();
        System.out.println("Enter the elements of the array ");
        int[] Arr = new int[Array_len];

        for(int i = 0;i<Array_len;i++)
        {
            Arr[i] = sc.nextInt();
        }
        Merge_sort(Arr,0,Arr.length-1);
        System.out.println(Arrays.toString(Arr));
    }
    static void Merge_sort(int[] arr,int s, int e)
    {
        if(s==e) // when there is only one element left in the array
        {
            return;
        }
        int mid = s + (e-s)/2;
        Merge_sort(arr,s,mid); // first dividing the first half of the array
        Merge_sort(arr,mid+1,e); // when we are done with first half we divide next half of the array
        Conquere(arr,s,mid,e); //the mid was passed because to track the array
    }
    static void Conquere(int[] arr,int s, int m, int e)
    {
        int[] Reference_array = new int[e - s + 1];
        int First_array = s;
        int Second_array = m +1;
        int Reference_array_index = 0;

        while(First_array <= m && Second_array <= e)
        {
            if(arr[First_array] <= arr[Second_array])
            {
                Reference_array[Reference_array_index] = arr[First_array];
                First_array++;
                Reference_array_index++;
            }
            else
            {
                Reference_array[Reference_array_index] = arr[Second_array];
                Second_array++;
                Reference_array_index++;
            }
        }
        while(First_array <= m)    // this will run when there are elements still present in first half the array
        {
            Reference_array[Reference_array_index] = arr[First_array];
            First_array++;
            Reference_array_index++;
        }

        while (Second_array <= e) // this will run when elements still present in  second half of the array
        {
            Reference_array[Reference_array_index] = arr[Second_array];
            Second_array++;
            Reference_array_index++;
        }

        for(int i = s, j = 0;i<=e;i++ , j++) // just copying elements from the changed array to original array
        {
            arr[i] = Reference_array[j];
        }



    }
}
