package com.courtney.learningorganization;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Database(entities = Agency.class, version = 1)
public abstract class AgencyDatabase extends RoomDatabase {
    public abstract AgencyDao agencyDao();
    public static AgencyDatabase instance = null;

    public static AgencyDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context,
                    AgencyDatabase.class,
                    "agency-database")
                    .build();
            fillDataFromJson(instance.agencyDao(), context);
        }
        return instance;
    }

    private static void fillDataFromJson(AgencyDao agencyDao, Context context) {
        InputStream is = context.getResources().openRawResource(R.raw.edu);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder builder = new StringBuilder();
        String line;

        try {
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }

            JSONArray json = new JSONArray(builder.toString());
            for (int i = 0; i < json.length(); i++) {
                JSONObject agency = json.getJSONObject(i);
                Agency a = new Agency(agency.getString("o_tlc_agency_name"),
                        agency.getString("o_tlc_agency_categorychild"));
                new Thread(() -> agencyDao.insert(a)).start();
            }

        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }

    }
}
