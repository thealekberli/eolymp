import java.util.*;

class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        for(int i = (int)Math.pow(10,n-1); i<(int)Math.pow(10,n); i++ )
        {
            if(digits(i)==x)
            {
                System.out.println(i);
            }
        }
    }

    static int digits(int x)
    {
        int sum=0;
        while(x>=1)
        {
            sum += x%10;
            x /= 10;
        }
        return sum;
    }
}
