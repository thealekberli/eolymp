import java.util.*;
class Main
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((int)(Math.pow(n%10,2)+Math.pow((n/10)%10,2)+Math.pow((n/100)%10,2)+Math.pow(n/1000,2)));
    }
}

