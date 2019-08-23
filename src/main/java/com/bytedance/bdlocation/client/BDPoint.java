package com.bytedance.bdlocation.client;

public class BDPoint {
    private double latitude;
    private double longitude;
    private String provider;

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getProvider() {
        return this.provider;
    }

    public BDPoint() {
        this("none");
    }

    public int hashCode() {
        return Double.valueOf((this.latitude + this.longitude) * 1000000.0d).intValue();
    }

    public String toString() {
        return "BDPoint{provider='" + this.provider + '\'' + ", longitude=" + this.longitude + ", latitude=" + this.latitude + '}';
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public BDPoint(String str) {
        this.provider = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BDPoint)) {
            return false;
        }
        BDPoint bDPoint = (BDPoint) obj;
        if (this.latitude == bDPoint.latitude && this.longitude == bDPoint.longitude) {
            return true;
        }
        return false;
    }

    public void setLatitude(double d2) {
        if (d2 > 90.0d) {
            d2 = 90.0d;
        }
        if (d2 < -90.0d) {
            d2 = -90.0d;
        }
        this.latitude = d2;
    }

    public void setLongitude(double d2) {
        if (d2 > 180.0d) {
            d2 = 180.0d;
        }
        if (d2 < -180.0d) {
            d2 = -180.0d;
        }
        this.longitude = d2;
    }

    public BDPoint(double d2, double d3) {
        this(d2, d3, "none");
    }

    public BDPoint(double d2, double d3, String str) {
        d3 = d3 > 180.0d ? 180.0d : d3;
        d3 = d3 < -180.0d ? -180.0d : d3;
        d2 = d2 > 90.0d ? 90.0d : d2;
        d2 = d2 < -90.0d ? -90.0d : d2;
        this.longitude = d3;
        this.latitude = d2;
        this.provider = str;
    }
}
