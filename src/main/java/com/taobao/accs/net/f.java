package com.taobao.accs.net;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import com.taobao.accs.internal.AccsJobService;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.h;

public abstract class f {

    /* renamed from: b  reason: collision with root package name */
    protected static volatile f f79001b;

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f79002c = {270, 360, 480};

    /* renamed from: a  reason: collision with root package name */
    protected Context f79003a;

    /* renamed from: d  reason: collision with root package name */
    private int f79004d;

    /* renamed from: e  reason: collision with root package name */
    private long f79005e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f79006f;
    private int[] g = {0, 0, 0};
    private boolean h = true;

    /* access modifiers changed from: protected */
    public abstract void a(int i);

    public void d() {
        this.f79005e = -1;
        ALog.d("HeartbeatManager", "onNetworkFail", new Object[0]);
    }

    public int b() {
        int i;
        if (this.h) {
            i = f79002c[this.f79004d];
        } else {
            i = 270;
        }
        this.h = h.b();
        return i;
    }

    public void f() {
        this.f79004d = 0;
        this.f79005e = System.currentTimeMillis();
        ALog.d("HeartbeatManager", "resetLevel", new Object[0]);
    }

    public void c() {
        int i;
        this.f79005e = -1;
        if (this.f79006f) {
            int[] iArr = this.g;
            int i2 = this.f79004d;
            iArr[i2] = iArr[i2] + 1;
        }
        if (this.f79004d > 0) {
            i = this.f79004d - 1;
        } else {
            i = 0;
        }
        this.f79004d = i;
        ALog.d("HeartbeatManager", "onNetworkTimeout", new Object[0]);
    }

    public void e() {
        ALog.d("HeartbeatManager", "onHeartbeatSucc", new Object[0]);
        if (System.currentTimeMillis() - this.f79005e <= 7199000) {
            this.f79006f = false;
            this.g[this.f79004d] = 0;
        } else if (this.f79004d < f79002c.length - 1 && this.g[this.f79004d] <= 2) {
            ALog.d("HeartbeatManager", "upgrade", new Object[0]);
            this.f79004d++;
            this.f79006f = true;
            this.f79005e = System.currentTimeMillis();
        }
    }

    public synchronized void a() {
        try {
            if (this.f79005e < 0) {
                this.f79005e = System.currentTimeMillis();
            }
            int b2 = b();
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d("HeartbeatManager", "set " + b2, new Object[0]);
            }
            a(b2);
        } catch (Throwable th) {
            ALog.e("HeartbeatManager", "set", th, new Object[0]);
        }
    }

    protected f(Context context) {
        try {
            this.f79003a = context;
            this.f79005e = System.currentTimeMillis();
            this.h = h.b();
        } catch (Throwable th) {
            ALog.e("HeartbeatManager", "HeartbeatManager", th, new Object[0]);
        }
    }

    private static boolean b(Context context) {
        try {
            return context.getPackageManager().getServiceInfo(new ComponentName(context.getPackageName(), AccsJobService.class.getName()), 0).isEnabled();
        } catch (Throwable th) {
            ALog.e("HeartbeatManager", "isJobServiceExist", th, new Object[0]);
            return false;
        }
    }

    public static f a(Context context) {
        if (f79001b == null) {
            synchronized (f.class) {
                if (f79001b == null) {
                    if (Build.VERSION.SDK_INT < 21 || !b(context)) {
                        ALog.i("HeartbeatManager", "hb use alarm", new Object[0]);
                        f79001b = new a(context);
                    } else {
                        ALog.i("HeartbeatManager", "hb use job", new Object[0]);
                        f79001b = new r(context);
                    }
                }
            }
        }
        return f79001b;
    }
}
