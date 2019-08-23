package com.ss.android.ugc.aweme.tools.extract;

import a.i;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.tools.extract.e;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;

public final class g extends a {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f74703f = null;
    public static final String h = "g";
    public List<String> g;

    public final String f() {
        return "extract_movie";
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
        if (PatchProxy.isSupport(new Object[0], this, f74703f, false, 87060, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74703f, false, 87060, new Class[0], Void.TYPE);
            return;
        }
        super.a();
    }

    public final /* bridge */ /* synthetic */ void a(ExtractFramesModel extractFramesModel) {
        super.a(extractFramesModel);
    }

    public g(List<String> list) {
        this.g = list;
    }

    public final /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    public final void a(@NonNull final e.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f74703f, false, 87058, new Class[]{e.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f74703f, false, 87058, new Class[]{e.a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        if (b()) {
            i.a((Callable<TResult>) new Callable<Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f74707a;

                public final /* synthetic */ Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f74707a, false, 87062, new Class[0], Void.class)) {
                        return (Void) PatchProxy.accessDispatch(new Object[0], this, f74707a, false, 87062, new Class[0], Void.class);
                    } else if (g.this.g == null || g.this.g.isEmpty()) {
                        return null;
                    } else {
                        for (String a2 : g.this.g) {
                            Bitmap a3 = com.ss.android.ugc.aweme.tools.e.a(a2, ExtractFrameConfig.f74690a);
                            if (a3 != null) {
                                String a4 = g.this.f74694d.a();
                                com.ss.android.ugc.aweme.tools.e.a(a3, new File(a4), 70, Bitmap.CompressFormat.JPEG);
                                g.this.f74692b.addFrameAtLastSegment(a4);
                            }
                        }
                        return null;
                    }
                }
            }).a((a.g<TResult, TContinuationResult>) new a.g<Void, Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f74704a;

                public final /* synthetic */ Object then(i iVar) throws Exception {
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f74704a, false, 87061, new Class[]{i.class}, Void.class)) {
                        return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f74704a, false, 87061, new Class[]{i.class}, Void.class);
                    }
                    aVar.a(iVar.b());
                    g.this.a(true);
                    g.this.a();
                    return null;
                }
            });
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74703f, false, 87059, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74703f, false, 87059, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(z);
    }
}
