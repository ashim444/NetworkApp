package com.example.networkapp.data;

import com.example.networkapp.R;
import com.example.networkapp.model.NetworkListCharacter;

import java.util.ArrayList;

public class NetworkDummyCharacter {

    private static final ArrayList<NetworkListCharacter>
            networkActivityCharacter = new ArrayList<NetworkListCharacter>() {{
        add(new NetworkListCharacter(R.drawable.ic_launcher_background, R.string.dummyHeading));
        add(new NetworkListCharacter(R.drawable.ic_launcher_background, R.string.dummyHeading1));
        add(new NetworkListCharacter(R.drawable.ic_launcher_background, R.string.dummyHeading2));
        add(new NetworkListCharacter(R.drawable.ic_launcher_background, R.string.dummyHeading3));
    }};

    public static ArrayList<NetworkListCharacter> getNetworkActivityCharacter() {
        return networkActivityCharacter;
    }

    public static NetworkListCharacter getNetworkActivityPositionCharacter(int position) {
        return networkActivityCharacter.get(position);
    }
}
