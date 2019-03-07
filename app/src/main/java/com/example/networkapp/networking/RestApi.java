package com.example.networkapp.networking;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestApi {
    private static final RestApi ourInstance = new RestApi();

    public static RestApi getInstance() {
        return ourInstance;
    }

    private Retrofit retrofit;
    private ServerDataPlaceHolder serverDataPlaceHolder;

    private RestApi() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.spacexdata.com/v3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        serverDataPlaceHolder = retrofit.create(ServerDataPlaceHolder.class);
    }

    public ServerDataPlaceHolder getServerDataPlaceHolder() {
        return serverDataPlaceHolder;
    }
}
