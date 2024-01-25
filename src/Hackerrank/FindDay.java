package Hackerrank;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.io.*;

public class FindDay {
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.name();
    }

}

class Solution {
    public static void main(String[] args) throws IOException {


        int month = 12;

        int day = 19;

        int year = 2023;

        String res = FindDay.findDay(month, day, year);
        System.out.println(res);


    }
}
