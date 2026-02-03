
package oop;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {

        System.out.println("Enter the sentence:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        boolean[] letters = new boolean[26];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                if (!letters[index]) {
                    letters[index] = true;
                    count++;
                }
            }
        }

        if (count == 26) {
            System.out.println("The given sentence is a Pangram");
        } else {
            System.out.println("The given sentence is NOT a Pangram");
        }

        sc.close();
    }
}
