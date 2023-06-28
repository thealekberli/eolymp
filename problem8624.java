import java.util.*;
class Main
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        String s = "NO";
        for(int i=0; i<5; i++)
        {
            arr[i] = n%10;
            n /=10;
        }
        Arrays.sort(arr);
        for(int i=0; i<4; i++)
        {
            if(arr[i]==arr[i+1])
            {
                s = "YES";
                break;
            }
        }
        System.out.println(s);
    }
}

