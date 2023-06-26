import java.util.*;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        while(x<=y)
        {
            if(function(x,y)==1)
            {
                System.out.println(x);
            }
            x++;
        }
    }
    static int function(int x, int y)
    {
            int tmp1 = x%10;
            int tmp2 = (x/10)%10;
            int tmp3 = x/100;
            if(tmp1!=tmp2 && tmp1!=tmp3 && tmp2!=tmp3)
            {
                return 1;
            }
            else
            {
                return 0;
            }
    }
}

