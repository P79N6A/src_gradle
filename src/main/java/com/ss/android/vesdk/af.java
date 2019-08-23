package com.ss.android.vesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Surface;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.runtime.VERuntime;
import java.io.File;
import java.util.List;

public final class af {

    /* renamed from: a  reason: collision with root package name */
    protected com.ss.android.vesdk.runtime.d f77877a;

    /* renamed from: b  reason: collision with root package name */
    protected f f77878b;

    /* renamed from: c  reason: collision with root package name */
    protected VERuntime f77879c;

    public interface a {
    }

    public interface b {
        void a(int i);
    }

    public interface c {
        void a(EGLContext eGLContext, int i, int i2, int i3, int i4, long j);

        boolean a();
    }

    public interface d {
        void a(int i, float f2, boolean z);

        void a(int i, boolean z, boolean z2, float f2, List<Integer> list);

        boolean a();
    }

    public interface e {
    }

    public interface f {
    }

    public interface g {
    }

    public interface h {
    }

    public final void a(String str, int i, int i2, boolean z, boolean z2, Bitmap.CompressFormat compressFormat, b bVar) {
        com.ss.android.vesdk.keyvaluepair.a aVar = new com.ss.android.vesdk.keyvaluepair.a();
        aVar.a("iesve_verecorder_take_photo_width", i).a("iesve_verecorder_take_photo_height", i2).a("old", 1);
        com.ss.android.ttve.monitor.d.a("iesve_verecorder_take_photo", 1, aVar);
        this.f77878b.a(str, i, i2, false, z2, compressFormat, bVar);
    }

    public final void a(com.ss.android.vesdk.a.b bVar) {
        this.f77878b.a(bVar);
    }

    public final void a(am amVar) {
        this.f77878b.a(amVar);
    }

    public final void a(boolean z) {
        this.f77878b.b(z);
    }

    public final void a(c cVar) {
        this.f77878b.a(cVar);
    }

    public final int b() {
        return this.f77878b.h();
    }

    public final int c() {
        return this.f77878b.g();
    }

    public final long d() {
        return this.f77878b.b();
    }

    public final void e() throws r {
        this.f77878b.a();
    }

    public final void f() {
        this.f77878b.e();
    }

    public final void g() {
        this.f77878b.f();
    }

    public final MediaRecordPresenter a() {
        return this.f77878b.c();
    }

    public final void h() {
        if (this.f77878b != null) {
            this.f77878b.d();
        }
        if (this.f77877a != null) {
            com.ss.android.vesdk.runtime.d dVar = this.f77877a;
            if (dVar.f78128b != null) {
                dVar.f78128b.clear();
                dVar.f78128b = null;
            }
            if (dVar.f78129c != null) {
                dVar.f78129c.clear();
                dVar.f78129c = null;
            }
        }
    }

    public final void b(@Nullable VEListener.c cVar) {
        this.f77878b.a(cVar);
    }

    public final void a(Surface surface) {
        this.f77878b.c(surface);
    }

    public final void a(@Nullable VEListener.c cVar) {
        this.f77878b.b(cVar);
    }

    public final void a(VEListener.q qVar) {
        this.f77878b.t = qVar;
    }

    public af(com.ss.android.vesdk.runtime.d dVar, Context context) {
        this(dVar, context, null);
    }

    public final void a(float f2, @Nullable VEListener.c cVar) {
        this.f77878b.a(f2, cVar);
    }

    public final void a(@Nullable Surface surface, @Nullable VEListener.c cVar) {
        this.f77878b.a(surface, cVar);
    }

    private af(com.ss.android.vesdk.runtime.d dVar, Context context, com.ss.android.vesdk.d.c cVar) {
        f fVar;
        this.f77877a = dVar;
        this.f77879c = VERuntime.a();
        com.ss.android.vesdk.runtime.d dVar2 = this.f77877a;
        if (VERuntime.a().h) {
            fVar = new e(context, dVar2, null);
        } else {
            fVar = new b(context, dVar2, null);
        }
        this.f77878b = fVar;
    }

    public final int a(List<ak> list, String str, int i, int i2) {
        return this.f77878b.a(list, str, i, 2);
    }

    public final int a(String str, int i, int i2, int i3) {
        return this.f77878b.a(str, (long) i, -1, 2);
    }

    public final int a(@Nullable com.ss.android.vesdk.a.a aVar, @NonNull VEVideoEncodeSettings vEVideoEncodeSettings, @NonNull j jVar, @NonNull ab abVar) {
        try {
            return this.f77878b.a((com.ss.android.vesdk.a.a) null, vEVideoEncodeSettings, jVar, abVar, this.f77877a.a(), this.f77879c.f78083e.a());
        } catch (NullPointerException unused) {
            throw new r(-1, "init failed: VESDK need to be init");
        }
    }

    public final void a(int i, @NonNull String str, @NonNull String str2, final VEListener.f fVar) {
        com.ss.android.vesdk.runtime.d dVar = this.f77877a;
        dVar.f78130d = com.ss.android.vesdk.runtime.e.a(dVar.f78127a, "concat") + File.separator + "concat.mp4";
        com.ss.android.vesdk.runtime.d dVar2 = this.f77877a;
        dVar2.f78131e = com.ss.android.vesdk.runtime.e.a(dVar2.f78127a, "concat") + File.separator + "concat.wav";
        final String b2 = this.f77877a.b();
        final String c2 = this.f77877a.c();
        s.a(b2);
        s.a(c2);
        this.f77878b.a(b2, c2, 0, str, str2, (VEListener.c) new VEListener.c() {
            public final void a(int i) {
                if (fVar != null) {
                    fVar.a(i, b2, c2);
                }
            }
        });
    }
}
