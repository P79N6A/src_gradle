package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Bundle;
import com.amap.api.maps2d.LocationSource;
import com.autonavi.amap.mapcore2d.Inner_3dMap_location;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationListener;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption;

public class c implements LocationSource, Inner_3dMap_locationListener {

    /* renamed from: a  reason: collision with root package name */
    boolean f5803a;

    /* renamed from: b  reason: collision with root package name */
    long f5804b = 2000;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f5805c;

    /* renamed from: d  reason: collision with root package name */
    private LocationSource.OnLocationChangedListener f5806d;

    /* renamed from: e  reason: collision with root package name */
    private cn f5807e;

    /* renamed from: f  reason: collision with root package name */
    private Inner_3dMap_locationOption f5808f;
    private Context g;

    public void deactivate() {
        this.f5806d = null;
        if (this.f5807e != null) {
            this.f5807e.b();
            this.f5807e.c();
        }
        this.f5807e = null;
    }

    public c(Context context) {
        this.g = context;
    }

    public void a(int i) {
        if (i == 1 || i == 0) {
            a(true);
        } else {
            a(false);
        }
    }

    private void a(boolean z) {
        if (!(this.f5808f == null || this.f5807e == null)) {
            this.f5807e.c();
            this.f5807e = new cn(this.g);
            this.f5807e.a((Inner_3dMap_locationListener) this);
            this.f5808f.setOnceLocation(z);
            if (!z) {
                this.f5808f.setInterval(this.f5804b);
            }
            this.f5807e.a(this.f5808f);
            this.f5807e.a();
        }
        this.f5803a = z;
    }

    public void activate(LocationSource.OnLocationChangedListener onLocationChangedListener) {
        this.f5806d = onLocationChangedListener;
        if (this.f5807e == null) {
            this.f5807e = new cn(this.g);
            this.f5808f = new Inner_3dMap_locationOption();
            this.f5807e.a((Inner_3dMap_locationListener) this);
            this.f5808f.setInterval(this.f5804b);
            this.f5808f.setOnceLocation(this.f5803a);
            this.f5808f.setLocationMode(Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Hight_Accuracy);
            this.f5807e.a(this.f5808f);
            this.f5807e.a();
        }
    }

    public void a(long j) {
        if (!(this.f5808f == null || this.f5807e == null || this.f5808f.getInterval() == j)) {
            this.f5808f.setInterval(j);
            this.f5807e.a(this.f5808f);
        }
        this.f5804b = j;
    }

    public void onLocationChanged(Inner_3dMap_location inner_3dMap_location) {
        try {
            if (!(this.f5806d == null || inner_3dMap_location == null || inner_3dMap_location == null)) {
                this.f5805c = inner_3dMap_location.getExtras();
                if (this.f5805c == null) {
                    this.f5805c = new Bundle();
                }
                this.f5805c.putInt("errorCode", inner_3dMap_location.getErrorCode());
                this.f5805c.putString("errorInfo", inner_3dMap_location.getErrorInfo());
                this.f5805c.putInt("locationType", inner_3dMap_location.getLocationType());
                this.f5805c.putFloat("Accuracy", inner_3dMap_location.getAccuracy());
                this.f5805c.putString("AdCode", inner_3dMap_location.getAdCode());
                this.f5805c.putString("Address", inner_3dMap_location.getAddress());
                this.f5805c.putString("AoiName", inner_3dMap_location.getAoiName());
                this.f5805c.putString("City", inner_3dMap_location.getCity());
                this.f5805c.putString("CityCode", inner_3dMap_location.getCityCode());
                this.f5805c.putString("Country", inner_3dMap_location.getCountry());
                this.f5805c.putString("District", inner_3dMap_location.getDistrict());
                this.f5805c.putString("Street", inner_3dMap_location.getStreet());
                this.f5805c.putString("StreetNum", inner_3dMap_location.getStreetNum());
                this.f5805c.putString("PoiName", inner_3dMap_location.getPoiName());
                this.f5805c.putString("Province", inner_3dMap_location.getProvince());
                this.f5805c.putFloat("Speed", inner_3dMap_location.getSpeed());
                this.f5805c.putString("Floor", inner_3dMap_location.getFloor());
                this.f5805c.putFloat("Bearing", inner_3dMap_location.getBearing());
                this.f5805c.putString("BuildingId", inner_3dMap_location.getBuildingId());
                this.f5805c.putDouble("Altitude", inner_3dMap_location.getAltitude());
                inner_3dMap_location.setExtras(this.f5805c);
                this.f5806d.onLocationChanged(inner_3dMap_location);
            }
        } catch (Throwable unused) {
        }
    }
}
