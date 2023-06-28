import java.util.*;
class Main {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        char[] arr = number.toCharArray();
        for(int i=number.length()-1; i>=0; i--)
        {
            System.out.print(arr[i]);
        }
    }
}

