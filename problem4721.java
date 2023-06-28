import java.util.*;
class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        char[] arr = new char[number.length()];
        arr = number.toCharArray();
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            if (arr[i] == '5') {
                count++;
            }
        }
        System.out.println(count);
    }
}

