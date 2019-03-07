package com.example.networkapp.model;

import android.media.Image;

public class NetworkListCharacter {

    private Image mission_patch_small;
    private String mission_name;


    public Image getMission_patch_small() {
        return mission_patch_small;
    }

    public String getMission_name() {
        return mission_name;
    }


    public NetworkListCharacter(Image mission_patch_small, String mission_name) {
        this.mission_patch_small = mission_patch_small;
        this.mission_name = mission_name;

    }
}
