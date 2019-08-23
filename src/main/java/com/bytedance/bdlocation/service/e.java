package com.bytedance.bdlocation.service;

import android.os.Looper;
import android.support.annotation.Nullable;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.IThirdPartLocation;
import com.bytedance.bdlocation.client.BDLocationClient;
import com.bytedance.bdlocation.client.BDLocationException;
import com.bytedance.bdlocation.client.LocationOption;

public final class e implements BDLocationClient.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final BDLocationClient.Callback f19311a;

    /* renamed from: b  reason: collision with root package name */
    private final IThirdPartLocation f19312b;

    /* renamed from: c  reason: collision with root package name */
    private final IThirdPartLocation f19313c;

    /* renamed from: d  reason: collision with root package name */
    private final d f19314d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f19315e;

    /* renamed from: f  reason: collision with root package name */
    private int f19316f;
    private IThirdPartLocation g;
    private LocationOption h;
    private Looper i;

    private static IThirdPartLocation a(IThirdPartLocation iThirdPartLocation, IThirdPartLocation iThirdPartLocation2) {
        return iThirdPartLocation != null ? iThirdPartLocation : iThirdPartLocation2;
    }

    public final void a() {
        if (this.g != null) {
            this.g.stopLocation();
        }
    }

    public final void onLocationChanged(@Nullable BDLocation bDLocation) {
        this.f19316f = 0;
        this.f19311a.onLocationChanged(bDLocation);
    }

    private boolean a(IThirdPartLocation iThirdPartLocation) {
        if (this.g != iThirdPartLocation) {
            this.g.stopLocation();
            this.g = iThirdPartLocation;
            try {
                this.g.startLocation(this, this.h, this.i);
                return true;
            } catch (Exception e2) {
                onError(new BDLocationException((Throwable) e2));
                this.f19314d.a();
            }
        }
        return false;
    }

    public final void onError(BDLocationException bDLocationException) {
        this.f19316f++;
        if (this.f19315e) {
            if (a(this.f19313c)) {
                return;
            }
        } else if (this.f19316f > 2) {
            a(this.f19313c);
        }
        this.f19311a.onError(bDLocationException);
    }

    public final void a(LocationOption locationOption, Looper looper) {
        boolean z;
        if (locationOption.getInterval() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f19315e = z;
        this.f19316f = 0;
        this.h = locationOption;
        this.i = looper;
        this.g = a(this.f19312b, this.f19313c);
        try {
            this.g.startLocation(this, locationOption, looper);
        } catch (Exception e2) {
            onError(new BDLocationException((Throwable) e2));
            this.f19314d.a();
        }
    }

    public e(BDLocationClient.Callback callback, IThirdPartLocation iThirdPartLocation, IThirdPartLocation iThirdPartLocation2, d dVar) {
        this.f19311a = callback;
        this.f19312b = iThirdPartLocation;
        this.f19313c = iThirdPartLocation2;
        this.f19314d = dVar;
    }
}
