package com.courtney.learningorganization;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface AgencyDao {

    @Query("SELECT * FROM agency")
    List<Agency> getAgency();
}
