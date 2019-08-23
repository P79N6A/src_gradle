package com.mapbox.mapboxsdk.net;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import com.mapbox.mapboxsdk.d;
import com.mapbox.mapboxsdk.log.Logger;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConnectivityReceiver extends BroadcastReceiver {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static ConnectivityReceiver f26751a;

    /* renamed from: b  reason: collision with root package name */
    private List<a> f26752b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private Context f26753c;

    /* renamed from: d  reason: collision with root package name */
    private int f26754d;

    @UiThread
    public final void a() {
        if (this.f26754d == 0) {
            this.f26753c.registerReceiver(f26751a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        this.f26754d++;
    }

    @UiThread
    public final void b() {
        this.f26754d--;
        if (this.f26754d == 0) {
            this.f26753c.unregisterReceiver(f26751a);
        }
    }

    private ConnectivityReceiver(@NonNull Context context) {
        this.f26753c = context;
    }

    public static synchronized ConnectivityReceiver a(Context context) {
        ConnectivityReceiver connectivityReceiver;
        synchronized (ConnectivityReceiver.class) {
            if (f26751a == null) {
                ConnectivityReceiver connectivityReceiver2 = new ConnectivityReceiver(context.getApplicationContext());
                f26751a = connectivityReceiver2;
                connectivityReceiver2.f26752b.add(new NativeConnectivityListener());
            }
            connectivityReceiver = f26751a;
        }
        return connectivityReceiver;
    }

    public static boolean b(Context context) {
        Boolean c2 = d.c();
        if (c2 != null) {
            return c2.booleanValue();
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public void onReceive(Context context, Intent intent) {
        boolean b2 = b(context);
        Logger.v("Mbgl-ConnectivityReceiver", String.format("Connected: %s", new Object[]{Boolean.valueOf(b2)}));
        for (a a2 : this.f26752b) {
            a2.a(b2);
        }
    }
}
