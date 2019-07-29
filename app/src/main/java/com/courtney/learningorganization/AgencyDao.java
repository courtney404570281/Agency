package com.courtney.learningorganization;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface AgencyDao {

    @Query("SELECT * FROM agency")
    List<Agency> getAgency();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Agency agency);

    @Delete
    void delete(Agency agency);
}
