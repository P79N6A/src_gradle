package com.ss.android.vesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter;
import com.ss.android.medialib.presenter.IStickerRequestCallback;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ttve.model.a;
import com.ss.android.ttve.model.b;
import com.ss.android.ttve.model.c;
import com.ss.android.ttve.model.d;
import com.ss.android.ttve.model.e;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.af;
import java.util.List;

public abstract class f {
    af.h A;
    MessageCenter.a B;
    af.a C;
    af.e D;
    af.c E;
    IStickerRequestCallback F;
    l G;
    VEVideoEncodeSettings H;
    j I;
    String J;
    String K;
    public boolean L;
    o M;
    ad N;
    public ae O = ae.DEFAULT;
    String P;
    long Q;
    long R;
    int S;
    a T = new a();
    b U = new b();
    d V = new d();
    e W = new e();
    c X = new c();
    am Y = new am();
    Context q;
    public com.ss.android.vesdk.d.c r;
    com.ss.android.vesdk.runtime.d s;
    public VEListener.q t;
    VEListener.d u;
    public VEListener.b v;
    af.d w;
    public VEListener.o x;
    af.g y;
    af.f z;

    public abstract int a(String str, int i, int i2, boolean z2, boolean z3, Bitmap.CompressFormat compressFormat, af.b bVar);

    public abstract void a();

    public long b() {
        return 0;
    }

    public abstract void b(boolean z2);

    public abstract int c(Surface surface);

    public MediaRecordPresenter c() {
        return null;
    }

    public abstract void e();

    public abstract void f();

    public abstract int g();

    public int h() {
        return 0;
    }

    public void a(@NonNull String str, @NonNull String str2, int i, @NonNull String str3, @NonNull String str4, VEListener.c cVar) {
        cVar.a(-1);
    }

    @CallSuper
    public void d() {
        this.u = null;
        this.w = null;
        this.x = null;
        this.t = null;
        this.v = null;
        this.E = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.C = null;
        this.B = null;
        this.D = null;
        this.q = null;
        this.r = null;
    }

    public void b(VEListener.c cVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void a(VEListener.c cVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void a(com.ss.android.vesdk.a.b bVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void a(af.c cVar) {
        this.E = cVar;
    }

    public void a(am amVar) {
        this.Y = amVar;
    }

    public void a(float f2, VEListener.c cVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void a(@Nullable Surface surface, VEListener.c cVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public f(Context context, com.ss.android.vesdk.runtime.d dVar, com.ss.android.vesdk.d.c cVar) {
        this.q = context;
        this.s = dVar;
        this.r = cVar;
    }

    @CallSuper
    public int a(String str, long j, long j2, int i) {
        this.P = str;
        this.Q = j;
        this.R = j2;
        this.S = i;
        return 0;
    }

    public int a(List<ak> list, String str, int i, int i2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int a(@NonNull com.ss.android.vesdk.a.a aVar, @NonNull VEVideoEncodeSettings vEVideoEncodeSettings, @NonNull j jVar, @NonNull ab abVar, @NonNull String str, @NonNull String str2) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }
}
