package com.example.networkapp.data;

import com.example.networkapp.R;
import com.example.networkapp.model.NetworkListCharacter;

import java.util.ArrayList;
import java.util.List;

public class NetworkDummyCharacter {

    public static List<NetworkListCharacter>
            networkActivityCharacter ;

    public static List<NetworkListCharacter> getNetworkActivityCharacter() {
        return networkActivityCharacter;
    }

    public static NetworkListCharacter getNetworkActivityPositionCharacter(int position) {
        return networkActivityCharacter.get(position);
    }
}
