package com.example.networkapp.model;

public class NetworkListCharacter {

    private int listImageId;
    private int listHeadingId;

    public NetworkListCharacter(int listImageId, int listHeadingId) {
        this.listImageId            = listImageId;
        this.listHeadingId          = listHeadingId;
    }

    public int getListImageId() {
        return listImageId;
    }

    public void setListImageId(int listImageId) {
        this.listImageId = listImageId;
    }

    public int getListHeadingId() {
        return listHeadingId;
    }

    public void setListHeadingId(int listHeadingId) {
        this.listHeadingId = listHeadingId;
    }

}
