package com.yasinderu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Report {
    private List<Opportunity> opportunities;

    private List<Opportunity> opLost;
    private List<Opportunity> opWon;

    private double totalAmont;
    private double amountLoss;

    Scanner in = new Scanner(System.in);

    public Report() {
        this.opportunities = new ArrayList<>();
        this.opLost = new ArrayList<>();
        this.opWon = new ArrayList<>();
    }

    private void clusterOpportunities() {
        for (int i = 0; i < opportunities.size(); i++) {
            if (opportunities.get(i).isLost()) {
                opLost.add(opportunities.get(i));
                amountLoss += opportunities.get(i).getAmount();
            } else {
                opWon.add(opportunities.get(i));
                totalAmont += opportunities.get(i).getAmount();
            }
        }
    }

    public void addNewReport(Opportunity opp) {
        opportunities.add(opp);
        clusterOpportunities();
    }

    public void showLost() {
        for (int i = 0; i < opLost.size(); i++) {
            System.out.println(i + 1 + " - " + opLost.get(i).getOpName());
        }

        System.out.println("Total amount loss : $" + amountLoss);

        System.out.print("Pick one to show detail : ");
        int index = in.nextInt() - 1;

        opLost.get(index).showInfo();
    }

    public void showWon() {
        for (int i = 0; i < opWon.size(); i++) {
            System.out.println(i + 1 + " - " + opWon.get(i).getOpName());
        }

        System.out.println("Total amount won : $" + totalAmont);

        System.out.print("Pick one to show detail : ");
        int index = in.nextInt() - 1;

        opWon.get(index).showInfo();
    }
}