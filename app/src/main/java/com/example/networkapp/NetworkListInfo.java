package com.example.networkapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.networkapp.data.NetworkDummyCharacter;
import com.example.networkapp.model.NetworkListCharacter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NetworkListInfo extends Fragment {

    final static String     NETWORK_LIST_POSITION       = "position";
    NetworkListCharacter    networkListCharacter;
    TextView                networkListDesc, netWorkListTitle;

    public static NetworkListInfo newInstance(int position) {
        Bundle args = new Bundle();
        NetworkListInfo fragment = new NetworkListInfo();
        args.putInt(NETWORK_LIST_POSITION, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.network_list_info, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        networkListDesc             = ( (view.findViewById(R.id.network_info_description)));
        netWorkListTitle            = ( (view.findViewById(R.id.network_info_heading)));
    }

    @Override
    public void onStart() {
        super.onStart();
        Bundle args = getArguments();
        if (args != null) {
            int position                    = args.getInt(NETWORK_LIST_POSITION);
            networkListCharacter            = NetworkDummyCharacter.getNetworkActivityPositionCharacter(position);
            networkListDesc.setText("position you clicket is " + position + "Heading is ");
            netWorkListTitle.setText(networkListCharacter.getListHeadingId());
        }
    }
}
