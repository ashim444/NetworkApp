package com.example.networkapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.networkapp.R;
import com.example.networkapp.model.NetworkListCharacter;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class NetworkListAdapter extends ArrayAdapter<NetworkListCharacter> {
    public NetworkListAdapter(@NonNull Context context, List<NetworkListCharacter> characters) {
        super(context, 0,characters);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView       = convertView;
        if(listItemView == null){
            listItemView        = LayoutInflater.from(getContext())
                                            .inflate(R.layout.list_item_network, parent, false);
        }
        NetworkListCharacter networkListCharacter = getItem(position);

        //((ImageView)listItemView.findViewById(R.id.item_network_image))
          //                      .setImageResource(networkListCharacter.getMission_patch_small());
        ((TextView)listItemView.findViewById(R.id.item_network_heading))
                                .setText(networkListCharacter.getMission_name());
        return listItemView;
    }
}
