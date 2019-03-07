package com.example.networkapp.networking;


import com.example.networkapp.model.NetworkListCharacter;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServerDataPlaceHolder {

    @GET("launches")
    Call<List<NetworkListCharacter>> getNetworkListCharacter();
}
