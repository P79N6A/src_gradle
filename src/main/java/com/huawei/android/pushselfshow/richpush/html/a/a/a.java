package com.huawei.android.pushselfshow.richpush.html.a.a;

import android.location.LocationManager;
import com.huawei.android.pushselfshow.richpush.html.a.j;
import com.huawei.android.pushselfshow.richpush.html.api.d;

public class a extends c {
    public a(LocationManager locationManager, j jVar) {
        super(locationManager, jVar, "GPSListener");
    }

    public void a(long j, float f2) {
        if (!this.f25276b) {
            if (this.f25275a.getProvider("gps") != null) {
                this.f25276b = true;
                this.f25275a.requestLocationUpdates("gps", j, f2, this);
                return;
            }
            a(d.a.POSITION_UNAVAILABLE_GPS);
        }
    }
}
