package com.courtney.learningorganization;

public class Agency {
    String agencyName;
    String category;

    public Agency(String agencyName, String category) {
        this.agencyName = agencyName;
        this.category = category;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
