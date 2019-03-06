package com.example.networkapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NetworkListInfo extends Fragment {

    final static String ARG_SRING= "NetWorkList";

    public static NetworkListInfo newInstance(String text) {
        Bundle args = new Bundle();
        NetworkListInfo fragment = new NetworkListInfo();
        args.putString(ARG_SRING, text);
        fragment.setArguments(args );
        return fragment;


    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.network_list_info, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Bundle args = getArguments();
        if(args != null){
            updateArticleText(args.getString(ARG_SRING));
        }
    }

    private void updateArticleText(String string) {

    }
}
