package Tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class descending {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get size
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        Integer[] num = new Integer[size];  // Use Integer[] to sort in descending
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        // Sort in descending order
        Arrays.sort(num, Collections.reverseOrder());
        System.out.println("Sorted in descending order:");
        for (int n : num) {
            System.out.print(n + " ");
        }

        sc.close();
    }
}
