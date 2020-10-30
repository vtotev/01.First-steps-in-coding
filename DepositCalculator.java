package com.company;

import jdk.jfr.Percentage;

import java.util.Scanner;

public class DepositCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double  DepositSum = Double.parseDouble(scan.nextLine());
        int DepositTime = Integer.parseInt(scan.nextLine());
        double  Interest = Double.parseDouble(scan.nextLine());

        double Sum = DepositSum + DepositTime * ((DepositSum * (Interest/100) / 12));
        System.out.printf("%.2f", Sum);
    }
}
