package edu.eci.ieti.androidgmaps.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class MyLocation implements Serializable {
    private String name,description;
    private float lat,lon;

    public MyLocation(String name, String description, float lat, float lon) {
        this.name = name;
        this.description = description;
        this.lat = lat;
        this.lon = lon;
    }

    protected MyLocation(Parcel in) {
        name = in.readString();
        description = in.readString();
        lat = in.readLong();
        lon = in.readLong();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }


}
