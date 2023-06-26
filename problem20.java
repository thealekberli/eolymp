import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        while(number>0)
        {
            number = number-function(number);
            count++;
        }

        System.out.println(count);
    }

    static int function(int x)
    {
        int sum=0;
        while(x>=1)
        {
            sum = sum + x%10;
            x = x/10;
        }
        return sum;
    }
}

