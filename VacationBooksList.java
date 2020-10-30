package com.company;

import java.util.Scanner;

public class VacationBooksList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int BookPages = Integer.parseInt(scan.nextLine());
        int PagesPerHour = Integer.parseInt(scan.nextLine());
        int DaysToRead = Integer.parseInt(scan.nextLine());
        int BookTime = BookPages / PagesPerHour;
        int TotalDays = BookTime / DaysToRead;
        System.out.print(TotalDays);
    }
}
