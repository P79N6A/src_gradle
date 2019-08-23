package com.amap.api.services.geocoder;

public class GeocodeQuery {

    /* renamed from: a  reason: collision with root package name */
    private String f7030a;

    /* renamed from: b  reason: collision with root package name */
    private String f7031b;

    public String getCity() {
        return this.f7031b;
    }

    public String getLocationName() {
        return this.f7030a;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (this.f7031b == null) {
            i = 0;
        } else {
            i = this.f7031b.hashCode();
        }
        int i3 = (i + 31) * 31;
        if (this.f7030a != null) {
            i2 = this.f7030a.hashCode();
        }
        return i3 + i2;
    }

    public void setCity(String str) {
        this.f7031b = str;
    }

    public void setLocationName(String str) {
        this.f7030a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeocodeQuery geocodeQuery = (GeocodeQuery) obj;
        if (this.f7031b == null) {
            if (geocodeQuery.f7031b != null) {
                return false;
            }
        } else if (!this.f7031b.equals(geocodeQuery.f7031b)) {
            return false;
        }
        if (this.f7030a == null) {
            if (geocodeQuery.f7030a != null) {
                return false;
            }
        } else if (!this.f7030a.equals(geocodeQuery.f7030a)) {
            return false;
        }
        return true;
    }

    public GeocodeQuery(String str, String str2) {
        this.f7030a = str;
        this.f7031b = str2;
    }
}
