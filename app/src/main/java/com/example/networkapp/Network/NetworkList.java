package com.example.networkapp.Network;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.networkapp.R;
import com.example.networkapp.adapter.NetworkListAdapter;
import com.example.networkapp.data.NetworkDummyCharacter;
import com.example.networkapp.model.NetworkListCharacter;
import com.example.networkapp.networking.RestApi;
import com.example.networkapp.networking.ServerData;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NetworkList extends Fragment {
    InteractionsListener listener;
    NetworkListAdapter netWorkAdapetr;

    public static NetworkList newInstance() {
        return new NetworkList();
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
        netWorkAdapetr       = new NetworkListAdapter(getActivity(), serverData.getApiData());
        return v;
    }

        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ListView networkList        =  view.findViewById(R.id.network_list_item);
        networkList.setAdapter(netWorkAdapetr);
        networkList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listener.navigateToDetails(position);
            }
        });
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
