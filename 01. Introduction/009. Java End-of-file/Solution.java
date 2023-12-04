import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lineNumber = 0;

        while (sc.hasNext()) {
            String line = sc.nextLine();
            lineNumber++;
            System.out.println(lineNumber + " " + line);
        }

        sc.close();
    }
}
