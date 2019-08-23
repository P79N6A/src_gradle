package com.loc;

import com.amap.api.location.AMapLocation;
import com.autonavi.aps.amapapi.model.AMapLocationServer;

public final class bm {

    /* renamed from: a  reason: collision with root package name */
    AMapLocationServer f25542a;

    /* renamed from: b  reason: collision with root package name */
    long f25543b;

    /* renamed from: c  reason: collision with root package name */
    long f25544c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f25545d = true;

    /* renamed from: e  reason: collision with root package name */
    int f25546e;

    /* renamed from: f  reason: collision with root package name */
    long f25547f;
    AMapLocation g;
    long h;

    /* access modifiers changed from: package-private */
    public AMapLocationServer a(AMapLocationServer aMapLocationServer) {
        int i;
        if (cn.a(aMapLocationServer)) {
            if (!this.f25545d || !cd.b(aMapLocationServer.getTime())) {
                i = this.f25546e;
            } else if (aMapLocationServer.getLocationType() == 5 || aMapLocationServer.getLocationType() == 6) {
                i = 4;
            }
            aMapLocationServer.setLocationType(i);
        }
        return aMapLocationServer;
    }

    public final void a() {
        this.f25542a = null;
        this.f25543b = 0;
        this.f25544c = 0;
        this.g = null;
        this.h = 0;
    }
}
