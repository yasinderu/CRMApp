package com.yasinderu;

import java.util.ArrayList;
import java.util.List;

public class Report {
    private List<Opportunity> opportunities;

    private List<Opportunity> opLost;
    private List<Opportunity> opWon;

    public Report() {
        this.opportunities = new ArrayList<>();
        this.opLost = new ArrayList<>();
        this.opWon = new ArrayList<>();
    }

    private void clusterOpportunities() {
        for (int i = 0; i < opportunities.size(); i++) {
            if (opportunities.get(i).isLost()) {
                opLost.add(opportunities.get(i));
            } else {
                opWon.add(opportunities.get(i));
            }
        }
    }

    public void addNewReport(Opportunity opp) {
        opportunities.add(opp);
        clusterOpportunities();
    }
}