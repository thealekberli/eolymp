import java.util.*;

class Main {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[3];
        for(int i=a; i<=b; i++)
        {
            arr[0] = i%10;
            arr[1] = (i/10)%10;
            arr[2] = i/100;
            double cubeSum = Math.pow(arr[0],3)+Math.pow(arr[1],3)+Math.pow(arr[2],3);
            if(i==(int)cubeSum)
            {
                System.out.print(i+" ");
            }
        }

    }
}

