import java.util.*;
class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        char[] arr = number.toCharArray();
        String number2 = sc.next();
        char[] arr2 = number2.toCharArray();
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            if (arr[i] == arr2[0]) {
                count++;
            }
        }
        System.out.println(count);
    }
}

