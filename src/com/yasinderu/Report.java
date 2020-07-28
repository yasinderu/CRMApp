package com.yasinderu;

import java.util.List;

public class Report {
    private List<Opportunity> opportunities;

    public Report(List<Opportunity> opportunities) {
        this.opportunities = opportunities;
    }

    public void showDetail() {
        for (int i = 0; i < opportunities.size(); i++) {
            opportunities.get(i).showInfo();
        }
    }
}