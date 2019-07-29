package com.courtney.learningorganization;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class AgencyViewModel extends AndroidViewModel {
    LiveData<List<Agency>> agencyLiveData;
    private AgencyDao agencyDao;

    public AgencyViewModel(@NonNull Application application) {
        super(application);
        agencyDao = AgencyDatabase.getInstance(application.getApplicationContext())
                .agencyDao();
        agencyLiveData = agencyDao.getAgency();
    }

    public LiveData<List<Agency>> getAgency() {
        return agencyLiveData;
    }
}
