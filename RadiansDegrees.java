package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RadiansDegrees {

    public static void main(String[] args) {
        double Radians = 180 / Math.PI;

        Scanner scan = new Scanner(System.in);
        double  Rad = Double.parseDouble(scan.nextLine());
        double Degrees = Rad * Radians;
        //  System.out.print(USD);
//        DecimalFormat USDdec = new DecimalFormat("#.##");
        System.out.printf("%.0f", Degrees);
    }
}
