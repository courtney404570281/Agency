package com.courtney.learningorganization;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Agency {
    @PrimaryKey
    @NonNull
    String agencyName;
    @NonNull
    String category;

    public Agency(@NonNull String agencyName, @NonNull String category) {
        this.agencyName = agencyName;
        this.category = category;
    }

    @NonNull
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(@NonNull String agencyName) {
        this.agencyName = agencyName;
    }

    @NonNull
    public String getCategory() {
        return category;
    }

    public void setCategory(@NonNull String category) {
        this.category = category;
    }
}
