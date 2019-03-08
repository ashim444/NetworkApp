package com.example.networkapp.Network;

import android.os.Bundle;

import com.example.networkapp.R;
import com.example.networkapp.networking.RestApiRepository;

import androidx.appcompat.app.AppCompatActivity;

public class NetworkActivity extends AppCompatActivity implements InteractionsListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);
        showDefaultFragment();
    }
    @Override
    public void navigateToDetails(int position) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.network_fragment_container,
                        NetworkListInfo.newInstance(position)).commit();
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
