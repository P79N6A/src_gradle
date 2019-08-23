package com.ss.android.websocket.b.d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ss.android.websocket.b.b.e;

public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private long f78220a = -1;

    /* renamed from: b  reason: collision with root package name */
    private final Context f78221b;

    public void a() {
        this.f78220a = -1;
    }

    public a(Context context) {
        this.f78221b = context.getApplicationContext();
    }

    private static boolean a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public long a(e eVar) {
        if (!a(this.f78221b)) {
            return -1;
        }
        if (this.f78220a == -1) {
            this.f78220a = (long) ((Math.random() * 4500.0d) + 500.0d);
        } else {
            this.f78220a *= 2;
            if (this.f78220a > 120000) {
                this.f78220a = 120000;
            }
        }
        return this.f78220a;
    }
}
