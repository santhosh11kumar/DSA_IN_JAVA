
import java.util.Arrays;
import java.util.Scanner;

public class Practice_1_2_binarysearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int length = sc.nextInt();
        System.out.println("Enter elements of array ");
        int[] ar = new int[length];


        for(int i =0;i<length;i++) {
            ar[i] = sc.nextInt();
        }

        System.out.println("Enter a target value ");
        int target = sc.nextInt();

        int start = 0;
        int end = ar.length-1;


        System.out.print("Inputted Array ");
        System.out.println(Arrays.toString(ar));

        System.out.println("\nYour target value is at index : " + binarysearch(ar,start,end,target));
    }
    static int binarysearch(int[] ar , int s , int e , int key)
    {
        int mid = s + ( e-s )/2;
        if(s>e)
        {
            return -1;
        }
        if(ar[mid] == key)
        {
            return mid;
        }
        else if(ar[mid]<key)
        {
            return binarysearch(ar, mid + 1 , e , key);
        }
        else
        {
            return binarysearch(ar, s , mid-1 , key);
        }

    }
}
