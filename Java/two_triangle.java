/*
 * Objective : Pattern 7;
 * by : Nikhil Mishra(2102900100097)
 */
import java.util.Scanner;
public class two_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n ");
        n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row = 1 ;row<n; row++) {
            for(int col = 1; col<=row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
