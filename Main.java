package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double PricePerSquare = 7.61;
        double Discount = 18;

        Scanner scan = new Scanner(System.in);
        double  Area = Double.parseDouble(scan.nextLine());

        double TotalPrice = Area * PricePerSquare;
        double DiscountPrice = TotalPrice*(Discount/100);
        double PriceWithDiscount = TotalPrice - DiscountPrice;

        System.out.println("The final price is: " + PriceWithDiscount + " lv.");
        System.out.println("The discount is: " + DiscountPrice + " lv.");
    }
}
