import java.util.*;
class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i=0; i<4; i++)
        {
            arr[i] = sc.nextInt();
        }
        if(arr[0]==arr[2] || arr[1]==arr[3])
            System.out.println("YES");
        else 
            System.out.println("NO");
    }
}

