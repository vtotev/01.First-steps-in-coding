package com.company;

import java.util.Scanner;

public class CharityCampaign {

    public static void main(String[] args) {

        int TortaPrice = 45;
        double GofretaPrice = 5.80;
        double PalachinkiPrice = 3.20;

        Scanner scan = new Scanner(System.in);

        int CampaignDays = Integer.parseInt(scan.nextLine());
        int Sladkari = Integer.parseInt(scan.nextLine());
        int Torti = Integer.parseInt(scan.nextLine());
        int Gofreti = Integer.parseInt(scan.nextLine());
        int Palachinki = Integer.parseInt(scan.nextLine());

        double TortiTotal = Torti * TortaPrice;
        double GofretiTOtal = Gofreti * GofretaPrice;
        double PalachinkiTotal = Palachinki * PalachinkiPrice;

        int MultiINdex = CampaignDays * Sladkari;

        double Total = (TortiTotal + GofretiTOtal + PalachinkiTotal) * MultiINdex;
        double Costs = Total / 8;
        double Left = Total - Costs;

        System.out.printf("%.2f", Left);
    }
}
