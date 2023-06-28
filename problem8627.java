import java.util.*;
class Main
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<5; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(arr[0]+" ");
        for(int i=1; i<4; i++)
        {
            System.out.print(arr[i-1]+arr[i+1]+" ");
        }
        System.out.print(arr[4]);
    }
}

