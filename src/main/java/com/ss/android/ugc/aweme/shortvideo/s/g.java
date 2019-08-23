package com.ss.android.ugc.aweme.shortvideo.s;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.b.a.c;

public final class g extends a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f69152e;

    /* renamed from: f  reason: collision with root package name */
    private c f69153f;

    public final boolean b(boolean z) {
        return !z;
    }

    public final boolean c() {
        return true;
    }

    public final int a() {
        if (this.f69129c) {
            return 2;
        }
        return 0;
    }

    public g(c cVar) {
        this.f69153f = cVar;
    }

    public final void a(boolean z) {
        this.f69128b = true;
        this.f69129c = z;
    }

    public final void a(Context context, com.ss.android.medialib.camera.c cVar) {
        int i = 2;
        if (PatchProxy.isSupport(new Object[]{context, null}, this, f69152e, false, 81271, new Class[]{Context.class, com.ss.android.medialib.camera.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, null}, this, f69152e, false, 81271, new Class[]{Context.class, com.ss.android.medialib.camera.c.class}, Void.TYPE);
            return;
        }
        c cVar2 = this.f69153f;
        if (this.f69129c) {
            i = 0;
        }
        cVar2.a(i, new com.ss.android.medialib.camera.c(null) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69154a;

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69154a, false, 81272, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69154a, false, 81272, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (null != null) {
                    null.a(i);
                }
                g.this.f69129c = !g.this.f69129c;
                f.a(g.this.f69129c);
            }

            public final void a(int i, int i2, String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f69154a, false, 81273, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f69154a, false, 81273, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                    return;
                }
                if (null != null) {
                    int i3 = i;
                    int i4 = i2;
                    null.a(i, i2, str2);
                }
            }
        });
    }
}
