import java.util.*;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        for(int i=0; i<3; i++)
        {
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<3; i++)
        {
            arr2[i] = sc.nextInt();
        }
        if(arr1[2]>arr2[2])
        {
            arr2[1] = arr2[1]-1;
            arr2[2] = arr2[2] + 60;
        }
        if(arr1[1]>arr2[1])
        {
            arr2[0] = arr2[0]-1;
            arr2[1] = arr2[1] + 60;
        }
        int h = arr2[0] - arr1[0];
        int m = arr2[1] - arr1[1];
        int s = arr2[2] - arr1[2];
        System.out.print(h+" "+m+" "+s);
    }

}

