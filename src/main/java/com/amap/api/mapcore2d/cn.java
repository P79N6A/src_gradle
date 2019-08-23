package com.amap.api.mapcore2d;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationListener;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationManagerBase;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public class cn {

    /* renamed from: a  reason: collision with root package name */
    Context f5840a;

    /* renamed from: b  reason: collision with root package name */
    Inner_3dMap_locationManagerBase f5841b;

    /* renamed from: c  reason: collision with root package name */
    Object f5842c;

    /* renamed from: d  reason: collision with root package name */
    boolean f5843d;

    /* renamed from: e  reason: collision with root package name */
    Object f5844e;

    public cn(Context context) {
        a(context);
    }

    private void a(Context context) {
        ServiceInfo serviceInfo;
        if (context != null) {
            try {
                this.f5840a = context.getApplicationContext();
                Class<?> cls = Class.forName("com.amap.api.location.AMapLocationClient");
                try {
                    serviceInfo = this.f5840a.getPackageManager().getServiceInfo(new ComponentName(this.f5840a, "com.amap.api.location.APSService"), SearchJediMixFeedAdapter.f42517f);
                } catch (Throwable unused) {
                    serviceInfo = null;
                }
                if (!(cls == null || serviceInfo == null)) {
                    this.f5843d = true;
                }
            } catch (Throwable th) {
                gc.a(th, "AMapLocationClient", "AMapLocationClient 1");
                return;
            }
            if (this.f5843d) {
                this.f5842c = new AMapLocationClient(this.f5840a);
            } else {
                this.f5841b = b(this.f5840a);
            }
        } else {
            throw new IllegalArgumentException("Context参数不能为null");
        }
    }

    private static Inner_3dMap_locationManagerBase b(Context context) {
        Inner_3dMap_locationManagerBase inner_3dMap_locationManagerBase;
        try {
            inner_3dMap_locationManagerBase = (Inner_3dMap_locationManagerBase) eb.a(context, fs.a(), "com.amap.api.wrapper.Inner_2dMap_locationManagerWrapper", fm.class, new Class[]{Context.class}, new Object[]{context});
        } catch (Throwable unused) {
            inner_3dMap_locationManagerBase = new fm(context);
        }
        return inner_3dMap_locationManagerBase == null ? new fm(context) : inner_3dMap_locationManagerBase;
    }

    public void a() {
        try {
            if (this.f5843d) {
                ((AMapLocationClient) this.f5842c).startLocation();
            } else {
                this.f5841b.startLocation();
            }
        } catch (Throwable th) {
            gc.a(th, "AMapLocationClient", "startLocation");
        }
    }

    public void a(Inner_3dMap_locationListener inner_3dMap_locationListener) {
        if (inner_3dMap_locationListener != null) {
            try {
                if (this.f5843d) {
                    fh.a(this.f5842c, inner_3dMap_locationListener);
                } else {
                    this.f5841b.setLocationListener(inner_3dMap_locationListener);
                }
            } catch (Throwable th) {
                gc.a(th, "AMapLocationClient", "setLocationListener");
            }
        } else {
            throw new IllegalArgumentException("listener参数不能为null");
        }
    }

    public void a(Inner_3dMap_locationOption inner_3dMap_locationOption) {
        if (inner_3dMap_locationOption != null) {
            try {
                if (this.f5843d) {
                    AMapLocationClientOption a2 = fh.a();
                    fh.a(a2, inner_3dMap_locationOption);
                    ((AMapLocationClient) this.f5842c).setLocationOption(a2);
                    return;
                }
                this.f5841b.setLocationOption(inner_3dMap_locationOption);
            } catch (Throwable th) {
                gc.a(th, "AMapLocationClient", "setLocationOption");
            }
        } else {
            throw new IllegalArgumentException("LocationManagerOption参数不能为null");
        }
    }

    public void b() {
        try {
            if (this.f5843d) {
                ((AMapLocationClient) this.f5842c).stopLocation();
            } else {
                this.f5841b.stopLocation();
            }
        } catch (Throwable th) {
            gc.a(th, "AMapLocationClient", "stopLocation");
        }
    }

    public void c() {
        try {
            if (this.f5843d) {
                ((AMapLocationClient) this.f5842c).onDestroy();
            } else {
                this.f5841b.destroy();
            }
        } catch (Throwable th) {
            gc.a(th, "AMapLocationClient", "onDestroy");
        }
    }
}
