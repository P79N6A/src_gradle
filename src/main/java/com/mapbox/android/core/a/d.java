package com.mapbox.android.core.a;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class d extends f implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, LocationListener {

    /* renamed from: a  reason: collision with root package name */
    private static final h f25919a = h.NO_POWER;
    private WeakReference<Context> g;
    private GoogleApiClient h;
    private final Map<h, l> i = new HashMap<h, l>() {
        {
            put(h.NO_POWER, new l() {
                public final void a(LocationRequest locationRequest) {
                    locationRequest.setPriority(105);
                }
            });
            put(h.LOW_POWER, new l() {
                public final void a(LocationRequest locationRequest) {
                    locationRequest.setPriority(104);
                }
            });
            put(h.BALANCED_POWER_ACCURACY, new l() {
                public final void a(LocationRequest locationRequest) {
                    locationRequest.setPriority(102);
                }
            });
            put(h.HIGH_ACCURACY, new l() {
                public final void a(LocationRequest locationRequest) {
                    locationRequest.setPriority(100);
                }
            });
        }
    };

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
    }

    public final void onConnectionSuspended(int i2) {
    }

    public final boolean c() {
        return this.h.isConnected();
    }

    public final void f() {
        if (this.h.isConnected()) {
            LocationServices.FusedLocationApi.removeLocationUpdates(this.h, this);
        }
    }

    public final void b() {
        if (this.h != null && this.h.isConnected()) {
            this.h.disconnect();
        }
    }

    public final Location d() {
        if (this.h.isConnected()) {
            return LocationServices.FusedLocationApi.getLastLocation(this.h);
        }
        return null;
    }

    public final void a() {
        if (this.h != null) {
            if (this.h.isConnected()) {
                onConnected(null);
                return;
            }
            this.h.connect();
        }
    }

    public final void e() {
        LocationRequest create = LocationRequest.create();
        if (this.f25926c != null) {
            create.setInterval((long) this.f25926c.intValue());
        }
        if (this.f25927d != null) {
            create.setFastestInterval((long) this.f25927d.intValue());
        }
        if (this.f25928e != null) {
            create.setSmallestDisplacement(this.f25928e.floatValue());
        }
        this.i.get(this.f25925b).a(create);
        if (this.h.isConnected()) {
            LocationServices.FusedLocationApi.requestLocationUpdates(this.h, create, this);
        }
    }

    static synchronized f a(Context context) {
        d dVar;
        synchronized (d.class) {
            dVar = new d(context.getApplicationContext());
        }
        return dVar;
    }

    public final void onConnected(@Nullable Bundle bundle) {
        Iterator it2 = this.f25929f.iterator();
        while (it2.hasNext()) {
            ((g) it2.next()).a();
        }
    }

    private d(Context context) {
        this.g = new WeakReference<>(context);
        this.h = new GoogleApiClient.Builder((Context) this.g.get()).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
        this.f25925b = f25919a;
    }
}
