package com.ss.android.ugc.aweme.shortvideo.s;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.b.a.c;

public final class b extends a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f69131e;

    /* renamed from: f  reason: collision with root package name */
    private c f69132f;

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

    public final void a(boolean z) {
        this.f69129c = z;
    }

    public b(c cVar) {
        this.f69132f = cVar;
    }

    public final void a(Context context, com.ss.android.medialib.camera.c cVar) {
        int i = 2;
        if (PatchProxy.isSupport(new Object[]{context, null}, this, f69131e, false, 81256, new Class[]{Context.class, com.ss.android.medialib.camera.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, null}, this, f69131e, false, 81256, new Class[]{Context.class, com.ss.android.medialib.camera.c.class}, Void.TYPE);
            return;
        }
        c cVar2 = this.f69132f;
        if (this.f69129c) {
            i = 0;
        }
        cVar2.a(i, new com.ss.android.medialib.camera.c(null) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69133a;

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69133a, false, 81257, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69133a, false, 81257, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (null != null) {
                    null.a(i);
                }
                b.this.f69129c = !b.this.f69129c;
                f.a(b.this.f69129c);
            }

            public final void a(int i, int i2, String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f69133a, false, 81258, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f69133a, false, 81258, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
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
