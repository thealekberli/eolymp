import java.util.*;
class Main
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(long i=a; i<=b; i++)
        {
            System.out.print(i*i+" ");
        }
        System.out.println();
        for(long i=b; i>=a; i--)
        {
            System.out.print(i*i*i+" ");
        }
    }
}

