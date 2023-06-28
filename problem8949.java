import java.util.*;
class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {

            for(int j=0; j<n; j++)
            {
                if(i<(n+1)/2) {
                    if (j < i || j > n - 1 - i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                if(i>=(n+1)/2)
                {
                    if (j > i || j < n - 1 - i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}

