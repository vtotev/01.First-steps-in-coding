package com.company;

import java.util.Scanner;


public class FishTank {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int Length = Integer.parseInt(scan.nextLine());
        int Width = Integer.parseInt(scan.nextLine());
        int Height = Integer.parseInt(scan.nextLine());
        double Percent = Double.parseDouble(scan.nextLine());

        double Remaining = ((100 - Percent) / 100);

        double Area = (Width * Height * Length);
        double AreaDM = Area / 1000;
        double WaterNeeded = AreaDM * Remaining;
        System.out.printf("%.2f", WaterNeeded);

    }
} 