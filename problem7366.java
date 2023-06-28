import java.util.*;
class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print(number/86400+" "+(number/3600)%24+" "+(number/60)%60+" "+number%60);
    }
}

