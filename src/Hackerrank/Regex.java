package Hackerrank;
import java.util.Scanner;
public class Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // check for the test case to have next line
        while (scanner.hasNext()) {
            String ipInput = scanner.nextLine();
            MyRegex regex = new MyRegex();

            if (ipInput.matches(regex.pattern)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }


        }
    }

    static class MyRegex {
        String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    }
}
/*
^ and $ are anchors that match the start and end of the string, respectively. They ensure that the entire string adheres to the pattern.
(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?) defines a group of patterns to match each segment of the IP address.
25[0-5] matches numbers from 250 to 255.
2[0-4][0-9] matches numbers from 200 to 249.
[01]?[0-9][0-9]? matches numbers from 0 to 199. The [01]? part allows for single-digit numbers.
\. matches a dot character (since the dot has special meaning in regular expressions, it needs to be escaped with a backslash).
{3} specifies that the preceding group (number followed by a dot) should occur exactly three times.
(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?) is used again to match the fourth segment of the IP address.*/