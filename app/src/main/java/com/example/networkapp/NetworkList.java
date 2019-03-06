package com.example.networkapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.networkapp.adapter.NetworkListAdapter;
import com.example.networkapp.model.NetworkListCharacter;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NetworkList extends Fragment {

    final static String NETWORK_LIST_CONST = "listCharacter";
    InteractionsListener listener;
    NetworkListAdapter netWorkAdapetr;


    public static NetworkList newInstance(ArrayList<NetworkListCharacter> listCharacters) {
        Bundle args = new Bundle();
        NetworkList fragment = new NetworkList();
        args.putParcelableArrayList(NETWORK_LIST_CONST, listCharacters);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.network_list, container, false);
        //listener.navigateToDetails();
        //((NetworkActivity) getActivity()).navigateToDetails();
        if (getArguments() != null) {
            ArrayList<NetworkListCharacter> characters = getArguments().getParcelableArrayList(NETWORK_LIST_CONST);
            netWorkAdapetr = new NetworkListAdapter(getActivity(), characters);
        }
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ListView networkList = (ListView) view.findViewById(R.id.network_list_item);
        networkList.setAdapter(netWorkAdapetr);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof InteractionsListener) {
            listener = (InteractionsListener) context;
        } else {
            throw new RuntimeException() {
            };
        }
    }
}
