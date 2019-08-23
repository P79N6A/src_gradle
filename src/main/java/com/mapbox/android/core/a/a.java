package com.mapbox.android.core.a;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class a extends f implements LocationListener {

    /* renamed from: a  reason: collision with root package name */
    public String f25914a;
    private WeakReference<Context> g;
    private LocationManager h;
    private final Map<h, k> i = new HashMap<h, k>() {
        {
            put(h.NO_POWER, new k() {
                public final void a() {
                    a.this.f25914a = "passive";
                }
            });
            put(h.LOW_POWER, new k() {
                public final void a() {
                    a.this.f25914a = "network";
                }
            });
            put(h.BALANCED_POWER_ACCURACY, new k() {
                public final void a() {
                    a.this.f25914a = "network";
                }
            });
            put(h.HIGH_ACCURACY, new k() {
                public final void a() {
                    a.this.f25914a = "gps";
                }
            });
        }
    };

    public final void b() {
    }

    public final boolean c() {
        return true;
    }

    public final void onProviderDisabled(String str) {
    }

    public final void onProviderEnabled(String str) {
    }

    public final void onStatusChanged(String str, int i2, Bundle bundle) {
    }

    public final Location d() {
        if (!TextUtils.isEmpty(this.f25914a)) {
            return this.h.getLastKnownLocation(this.f25914a);
        }
        return null;
    }

    public final void e() {
        if (!TextUtils.isEmpty(this.f25914a)) {
            this.h.requestLocationUpdates(this.f25914a, (long) this.f25927d.intValue(), this.f25928e.floatValue(), this);
        }
    }

    public final void f() {
        if (com.mapbox.android.core.b.a.a((Context) this.g.get())) {
            this.h.removeUpdates(this);
        }
    }

    public final void a() {
        Iterator it2 = this.f25929f.iterator();
        while (it2.hasNext()) {
            ((g) it2.next()).a();
        }
    }

    static synchronized f a(Context context) {
        a aVar;
        synchronized (a.class) {
            aVar = new a(context.getApplicationContext());
        }
        return aVar;
    }

    public final void onLocationChanged(Location location) {
        Iterator it2 = this.f25929f.iterator();
        while (it2.hasNext()) {
            ((g) it2.next()).a(location);
        }
    }

    private a(Context context) {
        this.g = new WeakReference<>(context);
        this.h = (LocationManager) ((Context) this.g.get()).getSystemService("location");
        this.f25914a = "passive";
    }

    public final void a(h hVar) {
        super.a(hVar);
        this.i.get(this.f25925b).a();
    }
}
