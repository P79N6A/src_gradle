package com.ss.android.ugc.aweme.shortvideo;

import a.g;
import a.i;
import a.j;
import android.annotation.SuppressLint;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.camera.f;
import com.ss.android.ugc.aweme.shortvideo.cg;
import dmt.av.video.b.a.c;
import java.io.File;

@SuppressLint({"NewApi"})
public final class ca {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65949a;

    /* renamed from: b  reason: collision with root package name */
    c f65950b;

    /* renamed from: c  reason: collision with root package name */
    cg f65951c = new cg();

    /* renamed from: d  reason: collision with root package name */
    public String f65952d;

    public final j<Void> a() {
        if (PatchProxy.isSupport(new Object[0], this, f65949a, false, 74172, new Class[0], j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[0], this, f65949a, false, 74172, new Class[0], j.class);
        }
        j<Void> jVar = new j<>();
        try {
            a(jVar, 2);
            this.f65950b.l();
        } catch (Exception e2) {
            jVar.a(e2);
        }
        return jVar;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f65949a, false, 74176, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65949a, false, 74176, new Class[0], Void.TYPE);
            return;
        }
        this.f65950b.a((f) null);
        cg cgVar = this.f65951c;
        if (PatchProxy.isSupport(new Object[0], cgVar, cg.f66007a, false, 74211, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cgVar, cg.f66007a, false, 74211, new Class[0], Void.TYPE);
        } else if (cgVar.f66009c != null) {
            cgVar.f66009c.clear();
        }
        this.f65951c.a(0);
    }

    public ca(c cVar) {
        this.f65950b = cVar;
    }

    public final void a(FragmentActivity fragmentActivity) {
        if (PatchProxy.isSupport(new Object[]{fragmentActivity}, this, f65949a, false, 74177, new Class[]{FragmentActivity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity}, this, f65949a, false, 74177, new Class[]{FragmentActivity.class}, Void.TYPE);
            return;
        }
        String str = fg.g;
        this.f65952d = new File(str, System.currentTimeMillis() + "_slow_motion.mp4").getPath();
        this.f65950b.a(this.f65952d);
        this.f65950b.a((f) new co(fragmentActivity, new f() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65964a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f65964a, false, 74181, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f65964a, false, 74181, new Class[0], Void.TYPE);
                    return;
                }
                ca.this.f65951c.a(0);
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f65964a, false, 74182, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f65964a, false, 74182, new Class[0], Void.TYPE);
                    return;
                }
                ca.this.f65951c.a(1);
            }

            public final void c() {
                if (PatchProxy.isSupport(new Object[0], this, f65964a, false, 74183, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f65964a, false, 74183, new Class[0], Void.TYPE);
                    return;
                }
                ca.this.f65951c.a(2);
            }

            public final void d() {
                if (PatchProxy.isSupport(new Object[0], this, f65964a, false, 74184, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f65964a, false, 74184, new Class[0], Void.TYPE);
                    return;
                }
                ca.this.f65951c.a(3);
            }
        }));
    }

    public void a(final j<Void> jVar, final int i) {
        if (PatchProxy.isSupport(new Object[]{jVar, Integer.valueOf(i)}, this, f65949a, false, 74175, new Class[]{j.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar, Integer.valueOf(i)}, this, f65949a, false, 74175, new Class[]{j.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        final AnonymousClass2 r0 = new cg.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65957a;

            public final void a(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f65957a, false, 74179, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f65957a, false, 74179, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (i2 == i) {
                    jVar.a(null);
                }
            }
        };
        this.f65951c.a((cg.a) r0);
        if (this.f65951c.a() == i) {
            jVar.a(null);
        }
        jVar.f1091a.a((g<TResult, TContinuationResult>) new g<Void, Void>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65961a;

            public final /* synthetic */ Object then(i iVar) throws Exception {
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f65961a, false, 74180, new Class[]{i.class}, Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f65961a, false, 74180, new Class[]{i.class}, Void.class);
                }
                if (iVar.b()) {
                    cg cgVar = ca.this.f65951c;
                    cg.a aVar = r0;
                    if (PatchProxy.isSupport(new Object[]{aVar}, cgVar, cg.f66007a, false, 74210, new Class[]{cg.a.class}, Void.TYPE)) {
                        cg cgVar2 = cgVar;
                        PatchProxy.accessDispatch(new Object[]{aVar}, cgVar2, cg.f66007a, false, 74210, new Class[]{cg.a.class}, Void.TYPE);
                    } else if (cgVar.f66009c != null) {
                        cgVar.f66009c.remove(aVar);
                    }
                }
                return null;
            }
        });
    }
}
