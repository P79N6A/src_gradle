package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.autonavi.amap.mapcore2d.Inner_3dMap_location;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption;
import org.json.JSONArray;
import org.json.JSONObject;

public final class fp {
    private static int k = 200;
    private static boolean l = true;

    /* renamed from: a  reason: collision with root package name */
    Context f6159a;

    /* renamed from: b  reason: collision with root package name */
    fk f6160b;

    /* renamed from: c  reason: collision with root package name */
    fq f6161c;

    /* renamed from: d  reason: collision with root package name */
    b f6162d;

    /* renamed from: e  reason: collision with root package name */
    Handler f6163e;

    /* renamed from: f  reason: collision with root package name */
    Handler f6164f;
    boolean g;
    boolean h;
    Inner_3dMap_locationOption i;
    Object j = new Object();
    private JSONArray m;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                fp.this.b();
            }
        }
    }

    class b extends HandlerThread {
        public b(String str) {
            super(str);
        }

        /* access modifiers changed from: protected */
        public final void onLooperPrepared() {
            super.onLooperPrepared();
        }
    }

    public fp(Context context, Handler handler) {
        if (context != null) {
            try {
                this.f6159a = context.getApplicationContext();
                this.f6164f = handler;
                this.i = new Inner_3dMap_locationOption();
                e();
                this.f6162d = new b("locServiceAction");
                this.f6162d.setPriority(5);
                this.f6162d.start();
                this.f6163e = new a(this.f6162d.getLooper());
            } catch (Throwable th) {
                gc.a(th, "LocationService", "<init>");
            }
        } else {
            throw new IllegalArgumentException("Context参数不能为null");
        }
    }

    private void a(Inner_3dMap_location inner_3dMap_location) {
        try {
            if (l && inner_3dMap_location != null && inner_3dMap_location.getErrorCode() == 0) {
                if (inner_3dMap_location.getLocationType() == 1) {
                    if (this.m == null) {
                        this.m = new JSONArray();
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("lon", inner_3dMap_location.getLongitude());
                    jSONObject.put("lat", inner_3dMap_location.getLatitude());
                    jSONObject.put("type", 0);
                    jSONObject.put("timestamp", gf.a());
                    this.m = this.m.put(jSONObject);
                    if (this.m.length() >= k) {
                        g();
                    }
                }
            }
        } catch (Throwable th) {
            gc.a(th, "LocationService", "recordOfflineLocLog");
        }
    }

    private void e() {
        try {
            if (this.i == null) {
                this.i = new Inner_3dMap_locationOption();
            }
            if (!this.h) {
                this.f6160b = new fk(this.f6159a);
                this.f6161c = new fq(this.f6159a);
                this.f6161c.a(this.i);
                f();
                this.h = true;
            }
        } catch (Throwable th) {
            gc.a(th, "LocationService", "init");
        }
    }

    private void f() {
        try {
            l = ge.b(this.f6159a, "maploc", "ue");
            int a2 = ge.a(this.f6159a, "maploc", "opn");
            k = a2;
            if (a2 > 500) {
                k = 500;
            }
            if (k < 30) {
                k = 30;
            }
        } catch (Throwable th) {
            gc.a(th, "LocationService", "getSPConfig");
        }
    }

    private synchronized void g() {
        try {
            if (this.m != null && this.m.length() > 0) {
                fa.a(new ez(this.f6159a, gc.b(), this.m.toString()), this.f6159a);
                this.m = null;
            }
        } catch (Throwable th) {
            gc.a(th, "LocationService", "writeOfflineLog");
        }
    }

    private void h() {
        synchronized (this.j) {
            if (this.f6163e != null) {
                this.f6163e.removeCallbacksAndMessages(null);
            }
            this.f6163e = null;
        }
    }

    private void i() {
        synchronized (this.j) {
            if (this.f6163e != null) {
                this.f6163e.removeMessages(1);
            }
        }
    }

    public final void a() {
        try {
            e();
            if (!this.i.getLocationMode().equals(Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Battery_Saving) && !this.g) {
                this.g = true;
                this.f6160b.a();
            }
            if (this.f6163e != null) {
                this.f6163e.sendEmptyMessage(1);
            }
        } catch (Throwable th) {
            gc.a(th, "LocationService", "getLocation");
        }
    }

    public final void a(Inner_3dMap_locationOption inner_3dMap_locationOption) {
        this.i = inner_3dMap_locationOption;
        if (this.i == null) {
            this.i = new Inner_3dMap_locationOption();
        }
        if (this.f6161c != null) {
            this.f6161c.a(inner_3dMap_locationOption);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        Inner_3dMap_location inner_3dMap_location = null;
        try {
            if (this.i.getLocationMode().equals(Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Battery_Saving) && this.g) {
                this.f6160b.b();
                this.g = false;
            }
            if (this.f6160b.c()) {
                inner_3dMap_location = this.f6160b.d();
            } else if (!this.i.getLocationMode().equals(Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Device_Sensors)) {
                inner_3dMap_location = this.f6161c.a();
            }
            if (!(this.f6164f == null || inner_3dMap_location == null)) {
                Message obtain = Message.obtain();
                obtain.obj = inner_3dMap_location;
                obtain.what = 1;
                this.f6164f.sendMessage(obtain);
            }
            a(inner_3dMap_location);
        } catch (Throwable th) {
            gc.a(th, "LocationService", "doGetLocation");
        }
    }

    public final void c() {
        this.g = false;
        try {
            i();
            if (this.f6160b != null) {
                this.f6160b.b();
            }
        } catch (Throwable th) {
            gc.a(th, "LocationService", "stopLocation");
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r4 = this;
            r4.c()     // Catch:{ Throwable -> 0x0032 }
            r4.h()     // Catch:{ Throwable -> 0x0032 }
            com.amap.api.mapcore2d.fp$b r0 = r4.f6162d     // Catch:{ Throwable -> 0x0032 }
            if (r0 == 0) goto L_0x0026
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0032 }
            r1 = 18
            if (r0 < r1) goto L_0x0023
            com.amap.api.mapcore2d.fp$b r0 = r4.f6162d     // Catch:{ Throwable -> 0x001d }
            java.lang.Class<android.os.HandlerThread> r1 = android.os.HandlerThread.class
            java.lang.String r2 = "quitSafely"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x001d }
            com.amap.api.mapcore2d.gd.a((java.lang.Object) r0, (java.lang.Class<?>) r1, (java.lang.String) r2, (java.lang.Object[]) r3)     // Catch:{ Throwable -> 0x001d }
            goto L_0x0026
        L_0x001d:
            com.amap.api.mapcore2d.fp$b r0 = r4.f6162d     // Catch:{ Throwable -> 0x0032 }
        L_0x001f:
            r0.quit()     // Catch:{ Throwable -> 0x0032 }
            goto L_0x0026
        L_0x0023:
            com.amap.api.mapcore2d.fp$b r0 = r4.f6162d     // Catch:{ Throwable -> 0x0032 }
            goto L_0x001f
        L_0x0026:
            r0 = 0
            r4.f6162d = r0     // Catch:{ Throwable -> 0x0032 }
            com.amap.api.mapcore2d.fq r0 = r4.f6161c     // Catch:{ Throwable -> 0x0032 }
            r0.b()     // Catch:{ Throwable -> 0x0032 }
            r4.g()     // Catch:{ Throwable -> 0x0032 }
            return
        L_0x0032:
            r0 = move-exception
            java.lang.String r1 = "LocationService"
            java.lang.String r2 = "destroy"
            com.amap.api.mapcore2d.gc.a(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.fp.d():void");
    }
}
