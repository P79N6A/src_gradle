package com.bytedance.bdlocation.service;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import com.bytedance.bdlocation.IThirdPartLocation;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.utils.b;
import com.bytedance.frameworks.baselib.network.http.util.g;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    final IThirdPartLocation f19291a;

    /* renamed from: b  reason: collision with root package name */
    final IThirdPartLocation f19292b;

    /* renamed from: c  reason: collision with root package name */
    public b f19293c;

    /* renamed from: d  reason: collision with root package name */
    final List<a> f19294d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public boolean f19295e;

    /* renamed from: f  reason: collision with root package name */
    public Handler f19296f;
    public e g;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public c f19305a;

        /* renamed from: b  reason: collision with root package name */
        long f19306b;

        /* renamed from: c  reason: collision with root package name */
        boolean f19307c;

        /* access modifiers changed from: package-private */
        public final void a() {
            if (!this.f19307c) {
                this.f19307c = true;
                run();
            }
        }

        public final void run() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long a2 = this.f19305a.a();
            if (!d.this.f19295e && elapsedRealtime - this.f19306b >= a2) {
                this.f19305a.b();
            }
            d.this.f19296f.postDelayed(this, a2);
            this.f19306b = elapsedRealtime;
        }

        a(c cVar) {
            this.f19305a = cVar;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final LocationOption f19309a;

        /* renamed from: b  reason: collision with root package name */
        final long f19310b;

        public b(LocationOption locationOption, long j) {
            this.f19309a = locationOption;
            this.f19310b = j;
        }
    }

    public final void a() {
        this.f19296f.post(new Runnable() {
            public final void run() {
                if (BDLocationConfig.isDebug()) {
                    com.ss.b.a.a.b("BDLocation", "StopLocation");
                }
                d.this.g.a();
                d.this.f19293c = null;
            }
        });
    }

    public final void a(@NonNull final LocationOption locationOption) {
        this.f19296f.post(new Runnable() {
            public final void run() {
                LocationOption locationOption;
                int i;
                long j;
                long j2;
                long j3;
                d dVar = d.this;
                LocationOption locationOption2 = locationOption;
                if (BDLocationConfig.isDebug()) {
                    com.ss.b.a.a.b("BDLocation", "LocationScheduler:StartLocation: " + locationOption2.toString());
                }
                if (dVar.f19293c == null) {
                    if (BDLocationConfig.isDebug()) {
                        com.ss.b.a.a.b("BDLocation", "LocationScheduler:StartLocation: state is ready");
                    }
                    dVar.f19293c = new b(locationOption2, System.currentTimeMillis());
                    dVar.g.a(locationOption2, dVar.f19296f.getLooper());
                    return;
                }
                if (BDLocationConfig.isDebug()) {
                    com.ss.b.a.a.b("BDLocation", "LocationScheduler:StartLocation: state is running");
                }
                LocationOption locationOption3 = dVar.f19293c.f19309a;
                boolean z = false;
                if (locationOption3 == locationOption2 || (locationOption3.getMode() == locationOption2.getMode() && locationOption3.getInterval() == locationOption2.getInterval())) {
                    z = true;
                }
                if (z) {
                    locationOption = null;
                } else {
                    LocationOption locationOption4 = new LocationOption();
                    if (locationOption3.getInterval() > 0) {
                        if (locationOption3.getInterval() <= locationOption2.getInterval()) {
                            j3 = locationOption3.getInterval();
                        } else {
                            j3 = locationOption2.getInterval();
                        }
                        locationOption4.setInterval(j3);
                    } else {
                        locationOption4.setInterval(locationOption2.getInterval());
                    }
                    if (locationOption3.getMode() != locationOption2.getMode()) {
                        i = 2;
                    } else {
                        i = locationOption3.getMode();
                    }
                    locationOption4.setMode(i);
                    if (locationOption3.getMaxCacheTime() < locationOption2.getMaxCacheTime()) {
                        j = locationOption3.getMaxCacheTime();
                    } else {
                        j = locationOption2.getMaxCacheTime();
                    }
                    locationOption4.setMaxCacheTime(j);
                    if (locationOption3.getLocationTimeOutMs() < locationOption2.getLocationTimeOutMs()) {
                        j2 = locationOption3.getLocationTimeOutMs();
                    } else {
                        j2 = locationOption2.getLocationTimeOutMs();
                    }
                    locationOption4.setLocationTimeOutMs(j2);
                    locationOption = locationOption4;
                }
                if (locationOption != null) {
                    dVar.f19293c = new b(locationOption, dVar.f19293c.f19310b);
                    dVar.g.a();
                    dVar.g.a(locationOption, dVar.f19296f.getLooper());
                }
            }
        });
    }

    public final void a(c cVar) {
        a aVar = new a(cVar);
        this.f19294d.add(aVar);
        aVar.a();
    }

    public d(final Context context, IThirdPartLocation iThirdPartLocation, IThirdPartLocation iThirdPartLocation2, Looper looper) {
        this.f19291a = iThirdPartLocation;
        this.f19292b = iThirdPartLocation2;
        this.f19296f = new Handler(looper);
        BDLocationConfig.getAppBackgroundProvider().f19327a = new b.a() {
            public final void a(final boolean z) {
                d.this.f19296f.post(new Runnable() {
                    public final void run() {
                        if (z) {
                            d dVar = d.this;
                            dVar.f19295e = true;
                            if (!dVar.f19294d.isEmpty()) {
                                for (a next : dVar.f19294d) {
                                    d.this.f19296f.removeCallbacks(next);
                                    next.f19307c = false;
                                }
                            }
                            return;
                        }
                        d dVar2 = d.this;
                        dVar2.f19295e = false;
                        for (a a2 : dVar2.f19294d) {
                            a2.a();
                        }
                    }
                });
            }
        };
        if (g.a(context)) {
            this.f19296f.postDelayed(new Runnable() {
                public final void run() {
                    if (BDLocationConfig.isUpload() && !f.c()) {
                        f.a(true);
                        a.a().a((c) new f(context));
                    }
                }
            }, 30000);
        }
    }
}
