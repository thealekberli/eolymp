import java.util.*;
class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastnumber = n%10;
        int secondNumber = (n/10)%10;
         String flag = "YES";
        while(n>=1)
        {
            if(lastnumber>secondNumber)
            {
                n = n/10;
                lastnumber= secondNumber;
                secondNumber = (n/10)%10;
            }
            else
            {
                flag = "NO";
                break;
            }
        }
        System.out.println(flag);
    }
}
