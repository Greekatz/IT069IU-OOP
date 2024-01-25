package Hackerrank;

import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0 ; i < (n/2); ++i) {
            if(s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a string: ");
        String A = scanner.next();
        if (isPalindrome(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
