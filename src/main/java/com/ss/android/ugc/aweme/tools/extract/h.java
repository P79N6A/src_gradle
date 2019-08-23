package com.ss.android.ugc.aweme.tools.extract;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import com.google.common.a.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.tools.extract.e;
import dmt.av.video.b.y;
import java.io.File;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class h extends a {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f74709f = null;
    private static final String l = "h";
    public s<y> g;
    public long h;
    public boolean i = a.L.a(e.a.IsExportHqFrame);
    public AtomicBoolean j = new AtomicBoolean(false);
    private ScheduledExecutorService k;

    public final String f() {
        return "extract_shot";
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    public final /* bridge */ /* synthetic */ boolean b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ ExtractFramesModel e() {
        return super.e();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f74709f, false, 87065, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74709f, false, 87065, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        if (this.k != null) {
            this.k.shutdown();
        }
    }

    public final /* bridge */ /* synthetic */ void a(ExtractFramesModel extractFramesModel) {
        super.a(extractFramesModel);
    }

    public final /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    public h(s<y> sVar) {
        this.g = sVar;
    }

    public final Runnable a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74709f, false, 87066, new Class[]{Integer.TYPE}, Runnable.class)) {
            return (Runnable) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74709f, false, 87066, new Class[]{Integer.TYPE}, Runnable.class);
        }
        final int i3 = i2;
        return new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74710a;

            public final void run() {
                String str;
                if (PatchProxy.isSupport(new Object[0], this, f74710a, false, 87068, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f74710a, false, 87068, new Class[0], Void.TYPE);
                } else if (h.this.f74693c) {
                    if (i3 == 2 || i3 == 4) {
                        h.this.j.set(true);
                    }
                    if (!h.this.j.get() || !h.this.i) {
                        str = h.this.f74694d.a();
                    } else {
                        f fVar = h.this.f74694d;
                        if (PatchProxy.isSupport(new Object[0], fVar, f.f74701a, false, 87057, new Class[0], String.class)) {
                            str = (String) PatchProxy.accessDispatch(new Object[0], fVar, f.f74701a, false, 87057, new Class[0], String.class);
                        } else {
                            str = fVar.f74702b + File.separator + "extract-frame-" + System.currentTimeMillis() + "_hq.jpg";
                        }
                    }
                    String str2 = str;
                    h.this.h = System.currentTimeMillis();
                    int[] iArr = (!h.this.j.get() || !h.this.i) ? ExtractFrameConfig.f74690a : new int[]{a.q.getVideoWidth(), a.q.getVideoHeight()};
                    h.this.j.set(false);
                    ((y) h.this.g.get()).a(str2, iArr, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.f69351c, Bitmap.CompressFormat.JPEG, (Function1<? super Integer, Unit>) new i<Object,Unit>(this, str2, i3));
                }
            }

            /* access modifiers changed from: package-private */
            public final /* synthetic */ Object a(Integer num, String str) throws Exception {
                if (num.intValue() == 0) {
                    h.this.f74692b.addFrameAtLastSegment(str);
                }
                return null;
            }
        };
    }

    public final void a(@NonNull e.a aVar) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f74709f, false, 87063, new Class[]{e.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f74709f, false, 87063, new Class[]{e.a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        if (b()) {
            if (this.f74692b != null) {
                i2 = this.f74692b.getAllFrames().size();
            } else {
                i2 = 0;
            }
            a(a(i2), 0);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74709f, false, 87064, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74709f, false, 87064, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(z);
    }

    public final void a(Runnable runnable, int i2) {
        if (PatchProxy.isSupport(new Object[]{runnable, Integer.valueOf(i2)}, this, f74709f, false, 87067, new Class[]{Runnable.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable, Integer.valueOf(i2)}, this, f74709f, false, 87067, new Class[]{Runnable.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.k == null || this.k.isShutdown()) {
            this.k = k.a();
        }
        this.k.schedule(runnable, (long) i2, TimeUnit.MILLISECONDS);
    }
}
