import java.util.*;
class Main
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
            temp[i] = arr[i];
        }
        Arrays.sort(arr);
        for(int i=0; i<n;i++)
        {
            if(temp[i]==arr[0])
            {
                System.out.print(arr[n-1]+" ");
            }
            else if(temp[i]==arr[n-1])
            {
                System.out.print(arr[0]+" ");
            }
            else
            {
                System.out.print(temp[i]+" ");
            }
        }
    }
}

