package com.company;

import java.util.Scanner;

public class FruitMarket {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double YagodiPrice = Double.parseDouble(scan.nextLine());
        double BananiKG = Double.parseDouble(scan.nextLine());
        double PortokaliKG = Double.parseDouble(scan.nextLine());
        double MaliniKG = Double.parseDouble(scan.nextLine());
        double YagodiKG = Double.parseDouble(scan.nextLine());

        double MaliniPrice = YagodiPrice * 0.5;
        double PortokaliPrice = MaliniPrice * 0.6;
        double BananiPrice = MaliniPrice * 0.2;

        double YagodiTotal = YagodiPrice * YagodiKG;
        double BananiTotal = BananiPrice * BananiKG;
        double MaliniTotal = MaliniKG * MaliniPrice;
        double PortokaliTotal = PortokaliKG * PortokaliPrice;

        double Total = YagodiTotal + BananiTotal + MaliniTotal + PortokaliTotal;

        System.out.printf("%.2f", Total);
    }
}
