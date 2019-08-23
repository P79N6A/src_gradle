package com.vivo.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.a.a.a.a.a.a;
import com.vivo.push.util.o;
import com.vivo.push.util.r;
import com.vivo.push.util.y;
import com.vivo.vms.IPCInvoke;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class b implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f81484a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, b> f81485b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private boolean f81486c;

    /* renamed from: d  reason: collision with root package name */
    private String f81487d;

    /* renamed from: e  reason: collision with root package name */
    private Context f81488e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public AtomicInteger f81489f;
    private volatile IPCInvoke g;
    private Object h = new Object();
    private String i;
    private Handler j = null;

    private void d() {
        this.j.removeMessages(1);
    }

    private boolean c() {
        Intent intent = new Intent(this.i);
        intent.setPackage(this.f81487d);
        try {
            return this.f81488e.bindService(intent, this, 1);
        } catch (Exception e2) {
            o.a("AidlManager", "bind core error", e2);
            return false;
        }
    }

    /* access modifiers changed from: private */
    public void e() {
        try {
            this.f81488e.unbindService(this);
        } catch (Exception e2) {
            o.a("AidlManager", "On unBindServiceException:" + e2.getMessage());
        }
    }

    private void b() {
        int i2 = this.f81489f.get();
        o.d("AidlManager", "Enter connect, Connection Status: ".concat(String.valueOf(i2)));
        if (!(i2 == 4 || i2 == 2 || i2 == 3 || i2 == 5 || !this.f81486c)) {
            a(2);
            if (!c()) {
                a(1);
                o.a("AidlManager", "bind core service fail");
                return;
            }
            this.j.removeMessages(1);
            this.j.sendEmptyMessageDelayed(1, 3000);
        }
    }

    public final boolean a() {
        this.f81487d = r.b(this.f81488e);
        boolean z = false;
        if (TextUtils.isEmpty(this.f81487d)) {
            o.c(this.f81488e, "push pkgname is null");
            return false;
        }
        if (y.a(this.f81488e, this.f81487d) >= 1260) {
            z = true;
        }
        this.f81486c = z;
        return this.f81486c;
    }

    /* access modifiers changed from: private */
    public void a(int i2) {
        this.f81489f.set(i2);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.g = null;
        a(1);
    }

    public final void onBindingDied(ComponentName componentName) {
        o.b("AidlManager", "onBindingDied : ".concat(String.valueOf(componentName)));
    }

    public final boolean a(Bundle bundle) {
        b();
        if (this.f81489f.get() == 2) {
            synchronized (this.h) {
                try {
                    this.h.wait(2000);
                } catch (InterruptedException e2) {
                    a.b(e2);
                }
            }
        }
        try {
            int i2 = this.f81489f.get();
            if (i2 == 4) {
                this.j.removeMessages(2);
                this.j.sendEmptyMessageDelayed(2, 30000);
                this.g.asyncCall(bundle, null);
                return true;
            }
            o.d("AidlManager", "invoke error : connect status = ".concat(String.valueOf(i2)));
            return false;
        } catch (RemoteException e3) {
            a.b(e3);
            o.a("AidlManager", "invoke error ", e3);
            int i3 = this.f81489f.get();
            o.d("AidlManager", "Enter disconnect, Connection Status: ".concat(String.valueOf(i3)));
            switch (i3) {
                case 2:
                    d();
                    a(1);
                    break;
                case 3:
                    a(1);
                    break;
                case 4:
                    a(1);
                    e();
                    break;
            }
        }
    }

    public static b a(Context context, String str) {
        b bVar = f81485b.get(str);
        if (bVar == null) {
            synchronized (f81484a) {
                bVar = f81485b.get(str);
                if (bVar == null) {
                    bVar = new b(context, str);
                    f81485b.put(str, bVar);
                }
            }
        }
        return bVar;
    }

    private b(Context context, String str) {
        this.f81488e = context;
        this.i = str;
        this.f81487d = r.b(context);
        boolean z = false;
        if (TextUtils.isEmpty(this.f81487d) || TextUtils.isEmpty(this.i)) {
            Context context2 = this.f81488e;
            o.c(context2, "init error : push pkgname is " + this.f81487d + " ; action is " + this.i);
            this.f81486c = false;
            return;
        }
        this.f81486c = y.a(context, this.f81487d) >= 1260 ? true : z;
        this.f81489f = new AtomicInteger(1);
        this.j = new Handler(Looper.getMainLooper(), new c(this));
        b();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d();
        this.g = IPCInvoke.Stub.asInterface(iBinder);
        if (this.g == null) {
            o.d("AidlManager", "onServiceConnected error : aidl must not be null.");
            e();
            this.f81489f.set(1);
            return;
        }
        if (this.f81489f.get() == 2) {
            a(4);
        } else if (this.f81489f.get() != 4) {
            e();
        }
        synchronized (this.h) {
            this.h.notifyAll();
        }
    }
}
