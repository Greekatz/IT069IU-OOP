package Hackerrank;

import java.io.*;
import java.util.*;
public class Map {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> Phonebook = new HashMap();
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int phoneNum = scanner.nextInt();
            Phonebook.put(name, phoneNum);
            scanner.nextLine();
        }

        while (scanner.hasNext()) {
            String test = scanner.nextLine();
            if (Phonebook.containsKey(test)) {
                System.out.println(test + "=" + Phonebook.get(test));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
