package com.example.networkapp;

import com.example.networkapp.model.NetworkListCharacter;
import com.example.networkapp.networking.RestApiRepository;
import com.example.networkapp.networking.ServerDataPlaceHolder;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ApiRepository {

    private static  ApiRepository instance = new ApiRepository();

    public static ApiRepository getInstance() {
        if(instance == null){
            instance = new ApiRepository();
        }
        return instance;
    }

    private RestApiRepository restApiRepository;
    private ServerDataPlaceHolder serverDataPlaceHolder;

    private ApiRepository() {
        restApiRepository = new RestApiRepository();
        this.serverDataPlaceHolder = restApiRepository.getRetrofit().create(ServerDataPlaceHolder.class);
    }

    public LiveData<List<NetworkListCharacter>> getLunchesList() {

        final MutableLiveData<List<NetworkListCharacter>> data = new MutableLiveData<>();
        serverDataPlaceHolder.getNetworkListCharacter().enqueue(new Callback<List<NetworkListCharacter>>() {
            @Override
            public void onResponse(Call<List<NetworkListCharacter>> call, Response<List<NetworkListCharacter>> response) {

                if (!response.isSuccessful()) {
                    return;
                }
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<NetworkListCharacter>> call, Throwable t) {
                data.setValue(null);
            }
        });
        return data;
    }
}
