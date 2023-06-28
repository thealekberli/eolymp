import java.util.*;
class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        for(int i=2; i<=number; i+=2)
        {
            if(number%i==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}

