import java.util.*;
class Main
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int size = n.length();
        String result = "";
        char[] arr = new char[size];
        arr = n.toCharArray();
        for(int i=0; i<size; i++)
        {
            if((int)arr[i]%2!=0)
            {
                result+=arr[i];
            }
        }
        if(result!="")
            System.out.println(result);
        else
            System.out.println(0);
    }
}

