package com.ss.android.ttvecamera;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.ss.android.ttvecamera.TECameraSettings;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f31363a = new AtomicBoolean(false);
    public boolean g;
    public TECameraSettings h;
    protected boolean i;
    public a j;
    public Handler k;
    public Context l;
    float[] m = new float[16];
    public com.ss.android.ttvecamera.f.c n;
    public int o;
    public int p;
    public int q;
    protected Map<String, Bundle> r = new HashMap();

    public interface a {
        void a();

        void a(int i, int i2);

        void a(int i, int i2, String str);

        void a(int i, String str);
    }

    public abstract int a(TECameraSettings tECameraSettings);

    public abstract void a();

    /* access modifiers changed from: package-private */
    public abstract void a(float f2, TECameraSettings.f fVar);

    /* access modifiers changed from: package-private */
    public abstract void a(int i2);

    public abstract void a(int i2, int i3, float f2, int i4, int i5);

    public abstract void a(int i2, int i3, TECameraSettings.e eVar);

    public void a(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public abstract void a(TECameraSettings.f fVar);

    /* access modifiers changed from: package-private */
    public abstract void a(boolean z);

    public abstract void a(boolean z, String str);

    public abstract void b();

    /* access modifiers changed from: package-private */
    public abstract void b(@TECameraSettings.FlashMode int i2);

    /* access modifiers changed from: package-private */
    public abstract void b(TECameraSettings.f fVar);

    public abstract int d();

    public abstract void e();

    public abstract boolean f();

    /* access modifiers changed from: package-private */
    public abstract boolean g();

    /* access modifiers changed from: protected */
    public void o() {
    }

    public void c() {
        ad.b("TECameraBase", "close...");
    }

    public final TECameraSettings.a n() {
        return this.h.t;
    }

    public final int m() {
        if (this.f31363a.getAndSet(false)) {
            d();
        }
        if (this.o == 1) {
            return this.p;
        }
        return this.q;
    }

    public final Bundle a(String str) {
        return this.r.get(str);
    }

    public void a(TECameraSettings.c cVar) {
        if (cVar != null && cVar.f31301a == 2) {
            this.f31363a.set(true);
        }
    }

    public c(Context context, a aVar, Handler handler) {
        this.l = context;
        this.j = aVar;
        this.k = handler;
    }
}
