import java.util.*;
class Main
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        int count = 0;
        double sum=0;
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextDouble();
            if(i%3 == 2 && arr[i]>0)
            {
                count++;
                sum += arr[i];
            }
        }
        System.out.print(count+" ");
        System.out.printf("%.2f", sum);
    }
}

