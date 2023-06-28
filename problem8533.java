import java.util.*;
class Main
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a; i<=b; i++)
        {
            int first = i%10;
            int second = (i/10)%10;
            int third = (i/100)%10;
            int fourth = i/1000;
            if(first!=second && first!=third && first!=fourth & second!=third && second!=fourth && third!=fourth)
                System.out.print(i+" ");
        }
    }
}

