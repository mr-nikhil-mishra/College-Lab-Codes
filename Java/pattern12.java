import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n ");
        n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if( row == 1 || row == n ) {
                   System.out.print("* ");
                }
                else if(col == n -row + 1) {
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        sc.close();
    }
}
