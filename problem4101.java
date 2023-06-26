import java.util.*;

class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        int k=0;
        int[] arr = new int[100];
        for(int i = 100; i<=999; i++)
        {
            if(x == digits(i))
            {
                count++;
                arr[k] = i;
                k++;
            }
        }
        System.out.println(count);
        for(int i=0; i<count; i++)
        {
            System.out.println(arr[i]);
        }
    }

    static int digits(int x)
    {
        int sum=x%10+(x/10)%10+x/100;
        return sum;
    }
}
