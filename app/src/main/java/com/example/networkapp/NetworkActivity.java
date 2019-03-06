package com.example.networkapp;

import android.os.Bundle;
import android.util.Log;

import com.example.networkapp.model.NetworkListCharacter;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class NetworkActivity extends AppCompatActivity implements InteractionsListener {
    ArrayList<NetworkListCharacter> networkActivityCharacter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);
        mockData();
        showDefaultFragment();
    }




    private void  mockData() {
        networkActivityCharacter = new ArrayList<>();
        networkActivityCharacter.add(new NetworkListCharacter(R.drawable.ic_launcher_background, R.string.dummyHeading));
        networkActivityCharacter.add(new NetworkListCharacter(R.drawable.ic_launcher_background, R.string.dummyHeading));
        networkActivityCharacter.add(new NetworkListCharacter(R.drawable.ic_launcher_background, R.string.dummyHeading));

    }

    @Override
    public void navigateToDetails() {
        NetworkListInfo networkListInfo = new NetworkListInfo();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.network_fragment_container, NetworkListInfo.newInstance("Ashim")).commit();
    }

    @Override
    public void showDefaultFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.network_fragment_container,
                        NetworkList.newInstance(networkActivityCharacter)).commit();
    }

    @Override
    public void pop() {

    }
}
