import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("================================");

            for(int i=0; i<3; i++){
                String s1 = sc.next();
                int x =  sc.nextInt();
                
                // Format and print the output
                System.out.printf("%-15s%03d\n",s1, x);
            }
        }
        System.out.println("================================");
    }
}
