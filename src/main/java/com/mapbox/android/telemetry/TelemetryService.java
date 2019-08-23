package com.mapbox.android.telemetry;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.LocalBroadcastManager;
import com.mapbox.android.core.a.f;
import com.mapbox.android.core.a.g;
import com.mapbox.android.core.a.h;
import com.mapbox.android.core.a.i;
import com.mapbox.android.telemetry.bo;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class TelemetryService extends Service implements g, bi, s {

    /* renamed from: a  reason: collision with root package name */
    public t f25970a;

    /* renamed from: b  reason: collision with root package name */
    int f25971b;

    /* renamed from: c  reason: collision with root package name */
    public CopyOnWriteArraySet<be> f25972c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f25973d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f25974e;

    /* renamed from: f  reason: collision with root package name */
    private LocationReceiver f25975f;
    private TelemetryReceiver g;
    private f h;
    private h i = h.NO_POWER;
    private bo j;
    private boolean k = true;

    class a extends Binder {
        a() {
        }
    }

    private void j() {
        this.h.a();
    }

    public final void a() {
        this.h.e();
    }

    public final int e() {
        int i2;
        synchronized (this) {
            i2 = this.f25971b;
        }
        return i2;
    }

    @VisibleForTesting
    private boolean f() {
        if (ContextCompat.checkSelfPermission(getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
            return true;
        }
        return false;
    }

    private void g() {
        h();
        i();
        if (f()) {
            j();
        }
    }

    private void h() {
        this.h = new i(this).a();
    }

    private void i() {
        this.h.a(this.i);
        this.h.a((g) this);
    }

    private void k() {
        this.h.f();
        this.h.b(this);
        this.h.b();
    }

    private void l() {
        if (this.j == null) {
            this.j = new bo(true);
        }
    }

    public final void c() {
        System.out.println("TelemetryService#onForeground: Restarting location receiver...");
        a(getApplicationContext());
    }

    public final void d() {
        synchronized (this) {
            this.f25971b--;
        }
    }

    public final void b() {
        System.out.println("TelemetryService#onBackground: Shutting down location receiver...");
        b(getApplicationContext());
    }

    public void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        this.f25975f = new LocationReceiver(this);
        a(applicationContext);
        this.g = new TelemetryReceiver(this);
        LocalBroadcastManager.getInstance(applicationContext).registerReceiver(this.g, new IntentFilter("com.mapbox.telemetry_receiver"));
        this.f25974e = true;
        this.f25972c = new CopyOnWriteArraySet<>();
    }

    public void onDestroy() {
        Context applicationContext = getApplicationContext();
        b(applicationContext);
        LocalBroadcastManager.getInstance(applicationContext).unregisterReceiver(this.g);
        this.f25974e = false;
        if (this.k) {
            l();
            this.j.a(bo.a.DISABLED, applicationContext);
        }
        super.onDestroy();
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return new a();
    }

    private void b(Context context) {
        k();
        LocalBroadcastManager.getInstance(context).unregisterReceiver(this.f25975f);
        this.f25973d = false;
    }

    public void onEventReceived(r rVar) {
        if (this.f25970a != null) {
            this.f25970a.a(rVar);
        }
    }

    private void a(Context context) {
        g();
        LocalBroadcastManager.getInstance(context).registerReceiver(this.f25975f, new IntentFilter("com.mapbox.location_receiver"));
        this.f25973d = true;
    }

    public void onTaskRemoved(Intent intent) {
        Iterator<be> it2 = this.f25972c.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        super.onTaskRemoved(intent);
    }

    public final void a(Location location) {
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(getApplicationContext());
        Intent intent = new Intent("com.mapbox.location_receiver");
        intent.putExtra("location_received", "onLocation");
        intent.putExtra("location", location);
        instance.sendBroadcast(intent);
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        Context applicationContext = getApplicationContext();
        if (intent != null) {
            this.k = intent.getBooleanExtra("isLocationEnablerFromPreferences", true);
        } else {
            this.k = true;
        }
        if (this.k) {
            l();
            this.j.a(bo.a.ENABLED, applicationContext);
        }
        return 3;
    }
}
