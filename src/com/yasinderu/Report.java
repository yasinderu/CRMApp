package com.yasinderu;

import java.util.ArrayList;
import java.util.List;

public class Report {
    private List<Opportunity> opportunities;

    private List<Opportunity> opLost;
    private List<Opportunity> opWon;

    public Report(List<Opportunity> opportunities) {
        this.opLost = new ArrayList<>();
        this.opWon = new ArrayList<>();
        this.opportunities = opportunities;
    }

    public void showDetail() {
        for (int i = 0; i < opportunities.size(); i++) {
            opportunities.get(i).showInfo();
        }
    }

    public void addOpportunityLost(Opportunity opLost) {
        this.opLost.add(opLost);
    }

    public void addOpportunityWon(Opportunity opWon) {
        this.opWon.add(opWon);
    }
}