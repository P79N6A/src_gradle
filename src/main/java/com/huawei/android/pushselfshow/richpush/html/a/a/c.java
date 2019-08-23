package com.huawei.android.pushselfshow.richpush.html.a.a;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushselfshow.richpush.html.a.j;
import com.huawei.android.pushselfshow.richpush.html.api.d;

public class c implements LocationListener {

    /* renamed from: a  reason: collision with root package name */
    protected LocationManager f25275a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f25276b;

    /* renamed from: c  reason: collision with root package name */
    private j f25277c;

    /* renamed from: d  reason: collision with root package name */
    private String f25278d = "PLocationListener";

    public c(LocationManager locationManager, j jVar, String str) {
        this.f25275a = locationManager;
        this.f25277c = jVar;
        this.f25278d = str;
    }

    private void a(Location location) {
        this.f25277c.b(location);
        if (!this.f25277c.f25306b) {
            e.a(this.f25278d, "Stopping global listener");
            b();
        }
    }

    public void a() {
        b();
    }

    public void a(long j, float f2) {
        try {
            if (!this.f25276b) {
                if (this.f25275a.getProvider("network") != null) {
                    this.f25276b = true;
                    this.f25275a.requestLocationUpdates("network", j, f2, this);
                    return;
                }
                a(d.a.POSITION_UNAVAILABLE_NETOWRK);
            }
        } catch (Exception e2) {
            e.d(this.f25278d, "start postion error ", e2);
        }
    }

    /* access modifiers changed from: protected */
    public void a(d.a aVar) {
        this.f25277c.a(aVar);
        if (!this.f25277c.f25306b) {
            e.a(this.f25278d, "Stopping global listener");
            b();
        }
    }

    public void b() {
        try {
            if (this.f25276b) {
                this.f25275a.removeUpdates(this);
                this.f25276b = false;
            }
        } catch (Exception e2) {
            e.d(this.f25278d, "stop postion error ", e2);
        }
    }

    public void onLocationChanged(Location location) {
        e.a(this.f25278d, "The location has been updated!");
        a(location);
    }

    public void onProviderDisabled(String str) {
        String str2 = this.f25278d;
        e.a(str2, "Location provider '" + str + "' disabled.");
        a(d.a.POSITION_UNAVAILABLE_GPS);
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
        String str2 = this.f25278d;
        e.a(str2, "The status of the provider " + str + " has changed");
        if (i == 0) {
            String str3 = this.f25278d;
            e.a(str3, str + " is OUT OF SERVICE");
            if ("network".equals(str)) {
                a(d.a.POSTION_OUT_OF_SERVICE_NETOWRK);
            } else {
                a(d.a.POSTION_OUT_OF_SERVICE_GPS);
            }
        } else if (i == 1) {
            String str4 = this.f25278d;
            e.a(str4, str + " is TEMPORARILY_UNAVAILABLE");
        } else {
            String str5 = this.f25278d;
            e.a(str5, str + " is AVAILABLE");
        }
    }
}
