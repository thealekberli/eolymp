import java.util.*;
class Main
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = new char[s.length()];
        arr = s.toCharArray();
        int count=0;
        int index=0;
        for(int i=0; i<s.length(); i++)
        {
            if(arr[i]=='f')
            {
                index = i;
                count++;
                if(count == 1)
                {
                    System.out.print(i+" ");
                }
            }
        }
        if(count!=1 && count!=0)
        {
            System.out.print(index);
        }
    }
}

