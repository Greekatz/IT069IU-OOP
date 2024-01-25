package Hackerrank;

import java.util.Scanner;
import java.math.BigDecimal;

public class BigDec {

   public static void main(String[] args) {
       //Input
       Scanner scanner = new Scanner(System.in);
       System.out.print("Input n real number strings: ");
       int n = scanner.nextInt();
       String []s =new String[n+2];
       for(int i=0;i<n;i++){
           System.out.print("Choose a number: ");
           s[i]=scanner.next();
       }
       scanner.close();
       //Write your code here
       for (int i = 0; i < n - 1; i++) {
           boolean swap = false;
           for (int j = 0; j < n - 1; j++) {
               BigDecimal bdNum1 = new BigDecimal(s[j]);
               BigDecimal bdNum2 = new BigDecimal(s[j + 1]);
               if (bdNum1.compareTo(bdNum2) == -1) {
                   String smallerNum = s[j];
                   s[j] = s[j + 1];
                   s[j+1] = smallerNum;
                   swap = true;
               }
           }
           if (!swap) {
               break;
           }
       }
       for (int i = 0; i < n; i++) {
           System.out.println(s[i]);

       }
   }
}
