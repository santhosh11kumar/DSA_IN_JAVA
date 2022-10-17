
import java.util.Arrays;
import java.util.Scanner;

public class Practice_1_1_reverse_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int length = sc.nextInt();
        System.out.println("Enter elements of array ");
        int[] ar = new int[length];


        for(int i =0;i<length;i++) {
            ar[i] = sc.nextInt();
        }
        int start = 0;
        int end = ar.length-1;
        System.out.print("Array before swapping ");
        System.out.println(Arrays.toString(ar));

        reverse(ar,start,end);

        System.out.print("Array after swapping ");
        System.out.println(Arrays.toString(ar));
    }
    static void reverse(int ar[],int s,int e)
    {
        //Base case
        if(s>=e)
        {
            return;
        }
        //Swapping
        ar[s] = ar[s] ^ ar[e];
        ar[e] = ar[s] ^ ar[e];
        ar[s] = ar[s] ^ ar[e];

        reverse(ar,s+1,e-1);

    }
}
