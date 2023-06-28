import java.util.*;
class Main
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[3];
        arr[0] = n/100;
        arr[1] = (n/10)%10;
        arr[2] = n%10;
        Arrays.sort(arr);
        int newnum = arr[2]*100+arr[1]*10+arr[0];
        System.out.println(newnum*newnum);
    }
}

