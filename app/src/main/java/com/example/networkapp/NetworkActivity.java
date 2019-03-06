package com.example.networkapp;

import android.os.Bundle;
import android.util.Log;

import com.example.networkapp.data.NetworkDummyCharacter;
import com.example.networkapp.model.NetworkListCharacter;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class NetworkActivity extends AppCompatActivity implements InteractionsListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);
        showDefaultFragment();
    }

    @Override
    public void navigateToDetails(int position) {
        NetworkListInfo networkListInfo         = new NetworkListInfo();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.network_fragment_container, NetworkListInfo.newInstance(position)).commit();
    }

    @Override
    public void showDefaultFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.network_fragment_container,
                        NetworkList.newInstance()).commit();
    }

    @Override
    public void pop() {

    }
}
