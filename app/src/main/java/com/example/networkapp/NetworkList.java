package com.example.networkapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class NetworkList extends Fragment {

    InteractionsListener listener;

    public static NetworkList newInstance() {
        Bundle args = new Bundle();
        NetworkList fragment = new NetworkList();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.network_list_fragment, container, false);
        listener.navigateToDetails();
        ((NetworkActivity) getActivity()).navigateToDetails();
        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof InteractionsListener) {
            listener = (InteractionsListener) context;
        }
    }
}
