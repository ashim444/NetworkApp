package com.example.networkapp.model;

public class NetworkListCharacter {

    //    private Image mission_patch_small;
    private String mission_name;
    private String lunch_year;

    public String getLunch_year() {
        return lunch_year;
    }


    public NetworkListCharacter(String mission_name, String lunch_year) {
        this.mission_name = mission_name;
        this.lunch_year = lunch_year;
    }
//    public Image getMission_patch_small() {
//        return mission_patch_small;
//    }

    public void setMission_name(String mission_name) {
        this.mission_name = mission_name;
    }

    public void setLunch_year(String lunch_year) {
        this.lunch_year = lunch_year;
    }

    public String getMission_name() {
        return mission_name;
    }



}
