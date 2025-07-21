package Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            int num = sc.nextInt();

            // %-15s : left-justified string in 15 character spaces
            // %03d   : 3-digit integer with leading zeros
            System.out.printf("%-15s%03d%n", str, num);
        }
        
        System.out.println("================================");
        sc.close();
    }
    
}
