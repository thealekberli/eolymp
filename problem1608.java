import java.util.*;
class Main {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        Boolean flag = true;
        char[] arr = number.toCharArray();
        for(int i=0; i<= number.length()/2; i++)
        {
            if(arr[i]!=arr[number.length()-1-i])
            {
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

