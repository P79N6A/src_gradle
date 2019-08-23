package com.bytedance.bdlocation.service;

import android.content.Context;
import android.os.HandlerThread;
import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.annotation.WorkerThread;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.IThirdPartLocation;
import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.client.BDLocationClient;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.BDLocationException;
import com.bytedance.bdlocation.client.BDPoint;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.client.LocationRequest;
import com.bytedance.bdlocation.client.LocationTrace;
import com.bytedance.bdlocation.netwok.a.i;
import com.bytedance.bdlocation.utils.e;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class a {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f19266d;

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.bdlocation.a.a f19267a;

    /* renamed from: b  reason: collision with root package name */
    public IThirdPartLocation f19268b;

    /* renamed from: c  reason: collision with root package name */
    public IThirdPartLocation f19269c;

    /* renamed from: e  reason: collision with root package name */
    private b f19270e;

    /* renamed from: f  reason: collision with root package name */
    private d f19271f;

    public final void a(int i) {
        if (i != -1) {
            this.f19270e.a(i);
            if (!this.f19270e.a()) {
                this.f19271f.a();
            }
            if (BDLocationConfig.isDebug()) {
                com.ss.b.a.a.b("BDLocation", "stopLocation :" + i);
            }
        }
    }

    public final boolean b() {
        return this.f19270e.a();
    }

    public static a a() {
        if (f19266d == null) {
            synchronized (a.class) {
                if (f19266d == null) {
                    f19266d = new a(BDLocationConfig.getContext());
                }
            }
        }
        return f19266d;
    }

    public final void a(c cVar) {
        this.f19271f.a(cVar);
    }

    private a(Context context) {
        this.f19267a = new com.bytedance.bdlocation.a.a(context);
        QPSController qPSController = new QPSController();
        if (e.f19329a == null) {
            HandlerThread handlerThread = new HandlerThread("LocationConnectWorker");
            e.f19329a = handlerThread;
            handlerThread.start();
        }
        this.f19270e = new b(qPSController, e.f19329a.getLooper());
        this.f19268b = a(context, qPSController);
        this.f19269c = new SystemBaseLocationImpl(context, qPSController);
        this.f19271f = new d(context, this.f19268b, this.f19269c, e.a());
        d dVar = this.f19271f;
        dVar.g = new e(this.f19270e, dVar.f19291a, dVar.f19292b, dVar);
    }

    @Nullable
    @VisibleForTesting(otherwise = 2)
    private BDLocation b(LocationOption locationOption) {
        if (locationOption.getMaxCacheTime() <= 0 || locationOption.getInterval() != 0) {
            return null;
        }
        BDLocation mockLocation = BDLocationConfig.getMockLocation();
        if (mockLocation != null) {
            return mockLocation;
        }
        BDLocation a2 = this.f19267a.a();
        if (a2 == null || LocationUtil.isEmpty(a2)) {
            return null;
        }
        if ((locationOption.geocodeMode() == 0 || a2.hasAddress()) && LocationUtil.checkCacheTime(a2.getLocationMs(), locationOption.getMaxCacheTime())) {
            return a2;
        }
        return null;
    }

    @WorkerThread
    public final BDLocation a(LocationOption locationOption) throws BDLocationException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final BDLocation[] bDLocationArr = new BDLocation[1];
        a((BDLocationClient.Callback) new BDLocationClient.Callback() {
            public final void onError(BDLocationException bDLocationException) {
                countDownLatch.countDown();
            }

            public final void onLocationChanged(BDLocation bDLocation) {
                bDLocationArr[0] = bDLocation;
                countDownLatch.countDown();
            }
        }, locationOption);
        try {
            countDownLatch.await(locationOption.getLocationTimeOutMs(), TimeUnit.MILLISECONDS);
            return bDLocationArr[0];
        } catch (InterruptedException e2) {
            throw new BDLocationException((Throwable) e2);
        }
    }

    @WorkerThread
    public final BDPoint a(BDPoint bDPoint) {
        BDPoint bDPoint2;
        if (this.f19268b != null) {
            bDPoint2 = this.f19268b.convertGCJ02(bDPoint);
        } else {
            bDPoint2 = null;
        }
        if (bDPoint2 == null) {
            return this.f19269c.convertGCJ02(bDPoint);
        }
        return bDPoint2;
    }

    @Nullable
    @VisibleForTesting(otherwise = 2)
    private static IThirdPartLocation a(Context context, QPSController qPSController) {
        IThirdPartLocation iThirdPartLocation;
        try {
            iThirdPartLocation = (IThirdPartLocation) Class.forName("com.bytedance.bdlocation.amap.AMapLocationImpl").getConstructor(new Class[]{Context.class, QPSController.class}).newInstance(new Object[]{context, qPSController});
        } catch (Throwable unused) {
            iThirdPartLocation = null;
        }
        if (iThirdPartLocation == null) {
            try {
                return (IThirdPartLocation) Class.forName("com.bytedance.bdlocation.glocation.GoogleLocationImpl").getConstructor(new Class[]{Context.class, QPSController.class}).newInstance(new Object[]{context, qPSController});
            } catch (Throwable unused2) {
            }
        }
        return iThirdPartLocation;
    }

    @AnyThread
    public final int a(BDLocationClient.Callback callback, LocationOption locationOption) {
        int i;
        BDLocationConfig.checkInit();
        locationOption.getTrace().startTrace();
        BDLocation b2 = b(locationOption);
        if (b2 != null) {
            callback.onLocationChanged(b2);
            LocationTrace trace = locationOption.getTrace();
            trace.setCacheTrace(true);
            trace.addTraceInfo(b2);
            trace.endTrace();
            i = -1;
        } else {
            i = this.f19270e.a(new LocationRequest(locationOption, callback));
            this.f19271f.a(locationOption);
        }
        com.ss.b.a.a.b("BDLocation", "startLocation :" + i);
        return i;
    }

    @WorkerThread
    public final List<i> a(@NonNull BDPoint bDPoint, String str) {
        List<i> list;
        if (this.f19268b != null) {
            list = this.f19268b.getPoiSync(bDPoint, str);
        } else {
            list = null;
        }
        if (list == null) {
            return this.f19269c.getPoiSync(bDPoint, str);
        }
        return list;
    }

    @Nullable
    @WorkerThread
    public final BDLocation a(@NonNull BDPoint bDPoint, String str, int i) {
        BDLocation bDLocation = null;
        if (i == 0) {
            return null;
        }
        if (i == 2 && this.f19268b != null) {
            bDLocation = this.f19268b.geocode(bDPoint, str);
        }
        if (!LocationUtil.checkGeocode(bDLocation)) {
            bDLocation = this.f19269c.geocode(bDPoint, str);
        }
        return bDLocation;
    }
}
