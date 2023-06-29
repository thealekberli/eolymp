import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int size = number.length();
        char[] arr = new char[size];
        arr = number.toCharArray();
        int[] result = new int[10];
        int count=0;
        for(int i=0; i<10; i++)
        {
            result[i]=0;
        }
        for(int i=0; i<size; i++)
        {
            if(arr[i]!=' ' && arr[i]!='+' && arr[i]!='-')
            {
                int index = (int)arr[i]-48;
                result[index]++;
            }
        }
        int[] arr2 = new int[10];
        int j=0;
        for(int i=0; i<10;i++)
        {
            if(result[i]==0)
            {
                count++;
                arr2[j]=i;
                j++;
            }
        }
        System.out.println(count);
        for(int i=0;i<j;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}
