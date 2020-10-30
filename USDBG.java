package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class USDBG {

    public static void main(String[] args) {
        double USDRate = 1.79549;

        Scanner scan = new Scanner(System.in);
        double  BGN = Double.parseDouble(scan.nextLine());
        double USD = BGN * USDRate;
      //  System.out.print(USD);
        DecimalFormat USDdec = new DecimalFormat("#.##");
        System.out.println(USDdec.format((USD)));
    }
}
