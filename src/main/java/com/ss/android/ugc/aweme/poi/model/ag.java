package com.ss.android.ugc.aweme.poi.model;

import java.io.Serializable;

public class ag implements Serializable {
    public String address;
    public double latitude;
    public double longitude;
    public String name;
    public float zoom;

    public ag() {
    }

    public ag(double d2, double d3) {
        this.latitude = d2;
        this.longitude = d3;
    }
}
