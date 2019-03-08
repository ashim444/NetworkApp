package com.example.networkapp.Network;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.networkapp.LunchesViewModel;
import com.example.networkapp.R;
import com.example.networkapp.adapter.NetworkListAdapter;
import com.example.networkapp.appdata.AppData;
import com.example.networkapp.model.NetworkListCharacter;
import com.example.networkapp.networking.RestApiRepository;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

public class NetworkList extends Fragment {
    InteractionsListener listener;
    NetworkListAdapter netWorkAdapetr;


    public static NetworkList newInstance() {
        return new NetworkList();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppData.lunchesViewModel = ViewModelProviders.of(this).get(LunchesViewModel.class);
        AppData.lunchesViewModel.getAllLunches().observe(this, new Observer<List<NetworkListCharacter>>() {
            @Override
            public void onChanged(List<NetworkListCharacter> networkListCharacters) {

            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.network_list, container, false);
        return v;
    }

        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof InteractionsListener) {
            listener        = (InteractionsListener) context;
        } else {
            throw new RuntimeException() {
            };
        }
    }
}
