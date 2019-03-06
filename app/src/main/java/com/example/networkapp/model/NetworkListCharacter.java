package com.example.networkapp.model;

import android.os.Parcel;
import android.os.Parcelable;

public class NetworkListCharacter implements Parcelable {

    private int listImageId;
    private int listHeadingId;

    public NetworkListCharacter(int listImageId, int listHeadingId) {
        this.listImageId = listImageId;
        this.listHeadingId = listHeadingId;
    }

    protected NetworkListCharacter(Parcel in) {
        listImageId = in.readInt();
        listHeadingId = in.readInt();
    }

    public static final Creator<NetworkListCharacter> CREATOR = new Creator<NetworkListCharacter>() {
        @Override
        public NetworkListCharacter createFromParcel(Parcel in) {
            return new NetworkListCharacter(in);
        }

        @Override
        public NetworkListCharacter[] newArray(int size) {
            return new NetworkListCharacter[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(listImageId);
        dest.writeInt(listHeadingId);
    }
}