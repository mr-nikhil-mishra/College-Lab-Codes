import java.util.Scanner;

public class pattern_char4 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter the value of n ");
    n = sc.nextInt();
    int count = 0;
    for(int row = 1; row<=n; row++) {
        count  = count+row;
            int x = count;
        for(int col = 1; col<=n; col++) {      
           if(col>=1 && col<=n-row) {
            System.out.print("  ");
           }
           else {
             System.out.print(x-- + " ");
           }
        }
        
        System.out.println();
    }
    sc.close();
}
}
