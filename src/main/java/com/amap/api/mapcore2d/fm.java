package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.autonavi.amap.mapcore2d.Inner_3dMap_location;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationListener;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationManagerBase;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.bugly.CrashModule;
import java.util.ArrayList;
import java.util.Iterator;

public class fm implements Inner_3dMap_locationManagerBase {

    /* renamed from: a  reason: collision with root package name */
    Context f6150a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<Inner_3dMap_locationListener> f6151b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    Object f6152c = new Object();

    /* renamed from: d  reason: collision with root package name */
    Handler f6153d = null;

    /* renamed from: e  reason: collision with root package name */
    a f6154e = null;

    /* renamed from: f  reason: collision with root package name */
    Handler f6155f = null;
    Inner_3dMap_locationOption g = new Inner_3dMap_locationOption();
    fp h = null;
    Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode i = Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Hight_Accuracy;
    boolean j = false;

    static class a extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        fm f6156a;

        public a(String str, fm fmVar) {
            super(str);
            this.f6156a = fmVar;
        }

        /* access modifiers changed from: protected */
        public final void onLooperPrepared() {
            try {
                this.f6156a.h = new fp(this.f6156a.f6150a, this.f6156a.f6153d);
                super.onLooperPrepared();
            } catch (Throwable unused) {
            }
        }
    }

    public fm(Context context) {
        if (context != null) {
            this.f6150a = context.getApplicationContext();
            e();
            return;
        }
        throw new IllegalArgumentException("Context参数不能为null");
    }

    private Handler a(Looper looper) {
        Handler handler;
        synchronized (this.f6152c) {
            this.f6155f = new fn(looper, this);
            handler = this.f6155f;
        }
        return handler;
    }

    private void a(int i2) {
        synchronized (this.f6152c) {
            if (this.f6155f != null) {
                this.f6155f.removeMessages(i2);
            }
        }
    }

    private void a(int i2, Object obj, long j2) {
        synchronized (this.f6152c) {
            if (this.f6155f != null) {
                Message obtain = Message.obtain();
                obtain.what = i2;
                obtain.obj = obj;
                this.f6155f.sendMessageDelayed(obtain, j2);
            }
        }
    }

    private void e() {
        try {
            this.f6153d = Looper.myLooper() == null ? new fo(this.f6150a.getMainLooper(), this) : new fo(this);
        } catch (Throwable th) {
            gc.a(th, "LocationClientManager", "initResultHandler");
        }
        try {
            this.f6154e = new a("locaitonClientActionThread", this);
            this.f6154e.setPriority(5);
            this.f6154e.start();
            this.f6155f = a(this.f6154e.getLooper());
        } catch (Throwable th2) {
            gc.a(th2, "LocationClientManager", "initActionThreadAndActionHandler");
        }
    }

    private void f() {
        synchronized (this.f6152c) {
            if (this.f6155f != null) {
                this.f6155f.removeCallbacksAndMessages(null);
            }
            this.f6155f = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        try {
            if (!this.j) {
                this.j = true;
                a(1005, null, 0);
            }
        } catch (Throwable th) {
            gc.a(th, "LocationClientManager", "doStartLocation");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Inner_3dMap_location inner_3dMap_location) {
        try {
            if (this.j) {
                if (!"gps".equalsIgnoreCase(inner_3dMap_location.getProvider())) {
                    inner_3dMap_location.setProvider("lbs");
                }
                inner_3dMap_location.setAltitude(gf.b(inner_3dMap_location.getAltitude()));
                inner_3dMap_location.setBearing(gf.a(inner_3dMap_location.getBearing()));
                inner_3dMap_location.setSpeed(gf.a(inner_3dMap_location.getSpeed()));
                Iterator<Inner_3dMap_locationListener> it2 = this.f6151b.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().onLocationChanged(inner_3dMap_location);
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.g.isOnceLocation()) {
                c();
            }
        } catch (Throwable th) {
            gc.a(th, "LocationClientManger", "callBackLocation");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Inner_3dMap_locationListener inner_3dMap_locationListener) {
        if (inner_3dMap_locationListener != null) {
            try {
                if (this.f6151b == null) {
                    this.f6151b = new ArrayList<>();
                }
                if (!this.f6151b.contains(inner_3dMap_locationListener)) {
                    this.f6151b.add(inner_3dMap_locationListener);
                }
            } catch (Throwable th) {
                gc.a(th, "LocationClientManager", "doSetLocationListener");
            }
        } else {
            throw new IllegalArgumentException("listener参数不能为null");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Inner_3dMap_locationOption inner_3dMap_locationOption) {
        this.g = inner_3dMap_locationOption;
        if (this.g == null) {
            this.g = new Inner_3dMap_locationOption();
        }
        if (this.h != null) {
            this.h.a(this.g);
        }
        if (this.j && !this.i.equals(inner_3dMap_locationOption.getLocationMode())) {
            c();
            a();
        }
        this.i = this.g.getLocationMode();
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        long j2 = 1000;
        try {
            if (this.h != null) {
                this.h.a();
            }
            if (!this.g.isOnceLocation()) {
                if (this.g.getInterval() >= 1000) {
                    j2 = this.g.getInterval();
                }
                a(1005, null, j2);
            }
        } catch (Throwable th) {
            if (!this.g.isOnceLocation()) {
                if (this.g.getInterval() >= 1000) {
                    j2 = this.g.getInterval();
                }
                a(1005, null, j2);
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(Inner_3dMap_locationListener inner_3dMap_locationListener) {
        if (inner_3dMap_locationListener != null) {
            try {
                if (!this.f6151b.isEmpty() && this.f6151b.contains(inner_3dMap_locationListener)) {
                    this.f6151b.remove(inner_3dMap_locationListener);
                }
            } catch (Throwable th) {
                gc.a(th, "LocationClientManager", "doUnregisterListener");
                return;
            }
        }
        if (this.f6151b.isEmpty()) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        try {
            this.j = false;
            a((int) CrashModule.MODULE_ID);
            a(1005);
            if (this.h != null) {
                this.h.c();
            }
        } catch (Throwable th) {
            gc.a(th, "LocationClientManager", "doStopLocation");
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        c();
        if (this.h != null) {
            this.h.d();
        }
        f();
        if (this.f6154e != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                try {
                    gd.a((Object) this.f6154e, HandlerThread.class, "quitSafely", new Object[0]);
                } catch (Throwable unused) {
                }
            }
            this.f6154e.quit();
        }
        this.f6154e = null;
    }

    public void destroy() {
        try {
            a(1007, null, 0);
        } catch (Throwable th) {
            gc.a(th, "LocationClientManager", "stopLocation");
        }
    }

    public void setLocationListener(Inner_3dMap_locationListener inner_3dMap_locationListener) {
        try {
            a(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR, inner_3dMap_locationListener, 0);
        } catch (Throwable th) {
            gc.a(th, "LocationClientManager", "setLocationListener");
        }
    }

    public void setLocationOption(Inner_3dMap_locationOption inner_3dMap_locationOption) {
        try {
            a(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, inner_3dMap_locationOption, 0);
        } catch (Throwable th) {
            gc.a(th, "LocationClientManager", "setLocationOption");
        }
    }

    public void startLocation() {
        try {
            a(CrashModule.MODULE_ID, null, 0);
        } catch (Throwable th) {
            gc.a(th, "LocationClientManager", "startLocation");
        }
    }

    public void stopLocation() {
        try {
            a(1006, null, 0);
        } catch (Throwable th) {
            gc.a(th, "LocationClientManager", "stopLocation");
        }
    }

    public void unRegisterLocationListener(Inner_3dMap_locationListener inner_3dMap_locationListener) {
        try {
            a(1006, inner_3dMap_locationListener, 0);
        } catch (Throwable th) {
            gc.a(th, "LocationClientManager", "stopLocation");
        }
    }
}
