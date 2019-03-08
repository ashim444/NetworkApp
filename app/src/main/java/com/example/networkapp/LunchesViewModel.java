package com.example.networkapp;


import android.app.Application;

import com.example.networkapp.model.NetworkListCharacter;
import com.example.networkapp.networking.RestApiRepository;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class LunchesViewModel extends AndroidViewModel {
    private LiveData<List<NetworkListCharacter>>  getAllData;

    public LunchesViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<List<NetworkListCharacter>> getAllLunches() {
            return  ApiRepository.getInstance().getLunchesList();
    }
}
