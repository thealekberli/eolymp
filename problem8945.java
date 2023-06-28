import java.util.*;
class Main {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++)
            {
                if(j==0 || j==b-1 || i==0 || i== a-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}

