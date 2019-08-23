package com.mapbox.android.core.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConnectivityReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f25932a;

    /* renamed from: b  reason: collision with root package name */
    private Context f25933b;

    /* renamed from: c  reason: collision with root package name */
    private CopyOnWriteArrayList<Object> f25934c;

    private static boolean a(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo().isConnectedOrConnecting();
        } catch (Exception unused) {
            return false;
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (this.f25932a == null) {
            a(this.f25933b);
        } else {
            this.f25932a.booleanValue();
        }
        Iterator<Object> it2 = this.f25934c.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }
}
