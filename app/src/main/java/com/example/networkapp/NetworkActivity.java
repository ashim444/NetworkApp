package com.example.networkapp;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class NetworkActivity extends AppCompatActivity implements InteractionsListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);


        showDefaultFragment();
    }

    @Override
    public void navigateToDetails() {
        Log.d("test", "callbackRaised");
    }

    @Override
    public void showDefaultFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.network_fragment_container, NetworkList.newInstance()).commit();
    }

    @Override
    public void pop() {

    }
}
