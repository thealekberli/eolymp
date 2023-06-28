import java.util.*;

class Main {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[4];
        for(int i=a; i<=b; i++)
        {
            arr[0] = i%10;
            arr[1] = (i/10)%10;
            arr[2] = (i/100)%10;
            arr[3]= i/1000;
            double quadSum = Math.pow(arr[0],4)+Math.pow(arr[1],4)+Math.pow(arr[2],4)+Math.pow(arr[3],4);
            if(i==(int)quadSum)
            {
                System.out.print(i+" ");
            }
        }

    }
}

