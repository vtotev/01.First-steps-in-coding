package com.company;

import jdk.jfr.Percentage;

import java.util.Scanner;

public class BirthdayParty {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Rent = Integer.parseInt(scan.nextLine());

        double Cake = Rent * 0.2;
        double Drinks = Cake - (Cake*0.45);
        double Anim = Rent / 3;

        double Total = Rent + Cake + Drinks + Anim;
        System.out.printf("%.1f", Total);
    }
}
