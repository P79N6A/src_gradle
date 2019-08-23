package com.bytedance.bdlocation.service;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.client.BDLocationClient;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.BDLocationException;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.client.LocationRequest;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public final class b implements BDLocationClient.Callback {

    /* renamed from: a  reason: collision with root package name */
    public BDLocation f19275a;

    /* renamed from: b  reason: collision with root package name */
    public BDLocationException f19276b;

    /* renamed from: c  reason: collision with root package name */
    public final SparseArray<LocationRequest> f19277c = new SparseArray<>(50);

    /* renamed from: d  reason: collision with root package name */
    public Handler f19278d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f19279e = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    public QPSController f19280f;
    public long g;
    private AtomicInteger h = new AtomicInteger(0);

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final BDLocationClient.Callback f19281a;

        /* renamed from: c  reason: collision with root package name */
        private final int f19283c;

        /* renamed from: d  reason: collision with root package name */
        private final LocationOption f19284d;

        /* renamed from: e  reason: collision with root package name */
        private int f19285e;

        /* renamed from: f  reason: collision with root package name */
        private CountDownLatch f19286f;

        private BDLocation a() {
            synchronized (b.this) {
                if (b.this.f19275a == null) {
                    return null;
                }
                BDLocation bDLocation = new BDLocation(b.this.f19275a);
                return bDLocation;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
            if (r0 != false) goto L_0x0080;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r15 = this;
                com.bytedance.bdlocation.client.LocationOption r0 = r15.f19284d
                long r0 = r0.getInterval()
                r2 = 300(0x12c, double:1.48E-321)
                r4 = 0
                r6 = 1
                r7 = -1
                int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r9 <= 0) goto L_0x0039
                com.bytedance.bdlocation.BDLocation r0 = com.bytedance.bdlocation.client.BDLocationConfig.getMockLocation()
                com.bytedance.bdlocation.BDLocation r1 = r15.a()
                if (r0 == 0) goto L_0x001f
                r15.a((com.bytedance.bdlocation.BDLocation) r0)
                goto L_0x0032
            L_0x001f:
                if (r1 == 0) goto L_0x0025
                r15.a((com.bytedance.bdlocation.BDLocation) r1)
                goto L_0x0032
            L_0x0025:
                com.bytedance.bdlocation.service.b r0 = com.bytedance.bdlocation.service.b.this
                com.bytedance.bdlocation.client.BDLocationException r0 = r0.f19276b
                if (r0 == 0) goto L_0x0032
                com.bytedance.bdlocation.service.b r0 = com.bytedance.bdlocation.service.b.this
                com.bytedance.bdlocation.client.BDLocationException r0 = r0.f19276b
                r15.a((com.bytedance.bdlocation.client.BDLocationException) r0)
            L_0x0032:
                com.bytedance.bdlocation.client.LocationOption r0 = r15.f19284d
                long r2 = r0.getInterval()
                goto L_0x00a0
            L_0x0039:
                int r0 = r15.f19283c
                int r1 = r15.f19285e
                com.bytedance.bdlocation.BDLocation r9 = com.bytedance.bdlocation.client.BDLocationConfig.getMockLocation()
                com.bytedance.bdlocation.BDLocation r10 = r15.a()
                if (r9 == 0) goto L_0x004c
                r15.a((com.bytedance.bdlocation.BDLocation) r9)
            L_0x004a:
                r2 = r7
                goto L_0x00a0
            L_0x004c:
                if (r10 == 0) goto L_0x0084
                long r11 = r10.getTime()
                com.bytedance.bdlocation.client.LocationOption r9 = r15.f19284d
                long r13 = r9.getMaxCacheTime()
                boolean r9 = com.bytedance.bdlocation.LocationUtil.checkCacheTime(r11, r13)
                if (r9 != 0) goto L_0x0080
                com.bytedance.bdlocation.client.LocationOption r9 = r15.f19284d
                com.bytedance.bdlocation.service.b r11 = com.bytedance.bdlocation.service.b.this
                long r11 = r11.g
                r13 = 10
                boolean r1 = a(r9, r11, r1, r13)
                if (r1 != 0) goto L_0x0080
                com.bytedance.bdlocation.service.b r1 = com.bytedance.bdlocation.service.b.this
                com.bytedance.bdlocation.service.QPSController r1 = r1.f19280f
                long r11 = (long) r0
                com.bytedance.bdlocation.service.QPSController$a r0 = r1.getQPS(r11)
                if (r0 == 0) goto L_0x007d
                int r0 = r0.f19262a
                if (r0 <= r6) goto L_0x007d
                r0 = 1
                goto L_0x007e
            L_0x007d:
                r0 = 0
            L_0x007e:
                if (r0 == 0) goto L_0x00a0
            L_0x0080:
                r15.a((com.bytedance.bdlocation.BDLocation) r10)
                goto L_0x004a
            L_0x0084:
                com.bytedance.bdlocation.service.b r0 = com.bytedance.bdlocation.service.b.this
                com.bytedance.bdlocation.client.BDLocationException r0 = r0.f19276b
                if (r0 == 0) goto L_0x00a0
                com.bytedance.bdlocation.client.LocationOption r0 = r15.f19284d
                com.bytedance.bdlocation.service.b r9 = com.bytedance.bdlocation.service.b.this
                long r9 = r9.g
                r11 = 20
                boolean r0 = a(r0, r9, r1, r11)
                if (r0 == 0) goto L_0x00a0
                com.bytedance.bdlocation.service.b r0 = com.bytedance.bdlocation.service.b.this
                com.bytedance.bdlocation.client.BDLocationException r0 = r0.f19276b
                r15.a((com.bytedance.bdlocation.client.BDLocationException) r0)
                goto L_0x004a
            L_0x00a0:
                long r0 = com.bytedance.bdlocation.client.BDLocationConfig.getMaxLocationTimeMs()
                int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r9 <= 0) goto L_0x00d2
                long r0 = java.lang.System.currentTimeMillis()
                com.bytedance.bdlocation.client.LocationOption r4 = r15.f19284d
                com.bytedance.bdlocation.client.LocationTrace r4 = r4.getTrace()
                long r4 = r4.getStartTimeMs()
                long r0 = r0 - r4
                long r4 = com.bytedance.bdlocation.client.BDLocationConfig.getMaxLocationTimeMs()
                int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r9 <= 0) goto L_0x00d2
                com.bytedance.bdlocation.service.a r0 = com.bytedance.bdlocation.service.a.a()
                int r1 = r15.f19283c
                r0.a((int) r1)
                java.util.concurrent.CountDownLatch r0 = r15.f19286f
                if (r0 == 0) goto L_0x00d1
                java.util.concurrent.CountDownLatch r0 = r15.f19286f
                r0.countDown()
            L_0x00d1:
                return
            L_0x00d2:
                int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r0 == 0) goto L_0x00ee
                com.bytedance.bdlocation.service.b r0 = com.bytedance.bdlocation.service.b.this
                android.os.Handler r0 = r0.f19278d
                int r1 = r15.f19283c
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                long r4 = android.os.SystemClock.uptimeMillis()
                long r4 = r4 + r2
                r0.postAtTime(r15, r1, r4)
                int r0 = r15.f19285e
                int r0 = r0 + r6
                r15.f19285e = r0
                return
            L_0x00ee:
                com.bytedance.bdlocation.service.a r0 = com.bytedance.bdlocation.service.a.a()
                int r1 = r15.f19283c
                r0.a((int) r1)
                java.util.concurrent.CountDownLatch r0 = r15.f19286f
                if (r0 == 0) goto L_0x0100
                java.util.concurrent.CountDownLatch r0 = r15.f19286f
                r0.countDown()
            L_0x0100:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdlocation.service.b.a.run():void");
        }

        private void a(BDLocation bDLocation) {
            final BDLocation bDLocation2 = new BDLocation(bDLocation);
            this.f19284d.getTrace().addTraceInfo(bDLocation);
            b.this.f19279e.post(new Runnable() {
                public final void run() {
                    if (BDLocationConfig.isDebug()) {
                        com.ss.b.a.a.b("BDLocation", "Client onLocationChanged");
                    }
                    if (a.this.f19281a != null) {
                        a.this.f19281a.onLocationChanged(bDLocation2);
                    }
                }
            });
        }

        private void a(BDLocationException bDLocationException) {
            final BDLocationException bDLocationException2 = new BDLocationException((Throwable) bDLocationException);
            this.f19284d.getTrace().addTraceInfo((Throwable) bDLocationException);
            b.this.f19279e.post(new Runnable() {
                public final void run() {
                    if (BDLocationConfig.isDebug()) {
                        com.ss.b.a.a.b("BDLocation", "Client onError");
                    }
                    if (a.this.f19281a != null) {
                        a.this.f19281a.onError(bDLocationException2);
                    }
                }
            });
        }

        public a(b bVar, int i, BDLocationClient.Callback callback, LocationOption locationOption) {
            this(i, callback, locationOption, null);
        }

        private static boolean a(LocationOption locationOption, long j, int i, int i2) {
            long j2;
            long startTimeMs = locationOption.getTrace().getStartTimeMs();
            long locationTimeOutMs = locationOption.getLocationTimeOutMs();
            if (locationTimeOutMs > 0) {
                if (locationOption.getInterval() > 0) {
                    j2 = locationOption.getInterval();
                } else {
                    j2 = 300;
                }
                if (j < startTimeMs && ((long) i) * j2 > locationTimeOutMs) {
                    return true;
                }
                if (j <= startTimeMs || i <= i2 - 1) {
                    return false;
                }
                return true;
            } else if (i > i2 - 1) {
                return true;
            } else {
                return false;
            }
        }

        @VisibleForTesting
        private a(int i, BDLocationClient.Callback callback, LocationOption locationOption, CountDownLatch countDownLatch) {
            this.f19283c = i;
            this.f19281a = callback;
            this.f19284d = locationOption;
            this.f19286f = null;
        }
    }

    public final boolean a() {
        if (this.f19277c.size() != 0) {
            return true;
        }
        return false;
    }

    public final void onError(BDLocationException bDLocationException) {
        a(null, bDLocationException);
    }

    private void b(int i) {
        LocationRequest locationRequest = this.f19277c.get(i);
        if (locationRequest != null) {
            this.f19277c.remove(i);
            LocationOption option = locationRequest.getOption();
            com.ss.b.a.a.c("BDLocation", option.toString());
            option.getTrace().endTrace();
        }
    }

    public final synchronized int a(LocationRequest locationRequest) {
        int incrementAndGet;
        incrementAndGet = this.h.incrementAndGet();
        this.f19277c.put(incrementAndGet, locationRequest);
        this.f19280f.startLocation((long) incrementAndGet);
        LocationOption option = locationRequest.getOption();
        this.f19278d.postAtTime(new a(this, incrementAndGet, locationRequest.getCallback(), option), Integer.valueOf(incrementAndGet), SystemClock.uptimeMillis() + option.getInterval());
        return incrementAndGet;
    }

    public final void a(int i) {
        this.f19278d.removeCallbacksAndMessages(Integer.valueOf(i));
        this.f19280f.stopLocation((long) i);
        b(i);
    }

    public final void onLocationChanged(BDLocation bDLocation) {
        if (LocationUtil.isBetterLocation(bDLocation, this.f19275a) || LocationUtil.isGoodLocation(bDLocation)) {
            a(bDLocation, null);
            com.bytedance.bdlocation.a.a aVar = a.a().f19267a;
            if (aVar.f19223b != null) {
                int compareLocation = LocationUtil.compareLocation(aVar.f19223b, bDLocation);
                if (compareLocation != -1) {
                    BDLocationConfig.notificationLocationChange(compareLocation, aVar.f19223b, bDLocation);
                }
            }
            String a2 = com.bytedance.bdlocation.a.a.a(bDLocation);
            if (!TextUtils.isEmpty(a2)) {
                SharedPreferences.Editor edit = aVar.f19222a.edit();
                edit.putString("BDLocation", a2);
                edit.apply();
            }
            aVar.f19223b = new BDLocation(bDLocation);
            aVar.f19223b.setLocationType(5);
            if (BDLocationConfig.isDebug()) {
                com.ss.b.a.a.b("BDLocation", "ConnectManager : onLocationChanged, isBetter");
            }
        }
    }

    private void a(BDLocation bDLocation, BDLocationException bDLocationException) {
        synchronized (this) {
            this.g = System.currentTimeMillis();
            if (bDLocation != null) {
                this.f19275a = bDLocation;
                this.f19276b = null;
            } else {
                this.f19276b = bDLocationException;
                this.f19275a = null;
            }
        }
    }

    public b(QPSController qPSController, Looper looper) {
        this.f19278d = new Handler(looper);
        this.f19280f = qPSController;
    }
}
