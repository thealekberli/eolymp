import java.util.*;

class Main {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i =a; i<=b; i++)
        {
            if(isOdd(i)==1)
            {
                System.out.print(i+" ");
            }
        }

    }

    static int isOdd(int x)
    {
        int flag = 1;
        while(x>=1)
        {
            if(x%2==0)
            {
                flag = 0;
                break;
            }
            x /= 10;
        }
        return flag;
    }

}

