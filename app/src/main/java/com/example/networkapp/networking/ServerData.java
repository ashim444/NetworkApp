package com.example.networkapp.networking;

import com.example.networkapp.model.NetworkListCharacter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ServerData {
    private Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.spacexdata.com/v3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public ServerDataPlaceHolder serverDataPlaceHolder = retrofit.create(ServerDataPlaceHolder.class);


    static List<NetworkListCharacter> networkActivityCharacter = null;

    public List<NetworkListCharacter> getApiData() {

        Call<List<NetworkListCharacter>> call = serverDataPlaceHolder.getNetworkListCharacter();

        call.enqueue(new Callback<List<NetworkListCharacter>>() {
            @Override
            public void onResponse(Call<List<NetworkListCharacter>> call, Response<List<NetworkListCharacter>> response) {
                if (!response.isSuccessful()) {
                    return;
                }

                networkActivityCharacter = response.body();
            }

            @Override
            public void onFailure(Call<List<NetworkListCharacter>> call, Throwable t) {

            }
        });
        return networkActivityCharacter;
    }

    public NetworkListCharacter getServerPositionData(int position) {
        if (networkActivityCharacter != null) {
            return networkActivityCharacter.get(position);

        } else return null;
    }


}
