import java.util.*;
class Main
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n/100;
        int b = (n/10)%10;
        int c = n%10;
        if(a>=b && b>=c)
            System.out.println(a*10+b);
        else if(a>=b && b<=c)
            System.out.println(a*10+c);
        else
            System.out.println(b*10+c);

    }
}

