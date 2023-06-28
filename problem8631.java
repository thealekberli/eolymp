import java.util.*;
class Main
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char[] arr1 = n.toCharArray();
        int[] arr2 = new int[n.length()];
        int count=0;
        for(int i=0; i<n.length(); i++)
        {
            arr2[i] = (int)arr1[i];
        }
        Arrays.sort(arr2);
        int maximum = arr2[n.length()-1];
        for(int i=n.length()-1; i>=0; i--)
        {
            if(arr2[i]==maximum)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}

