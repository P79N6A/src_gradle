package com.ss.android.ugc.aweme.audio;

import android.content.Context;
import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.aj.b;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34417a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f34418b = com.ss.android.ugc.aweme.g.a.a();
    private static volatile g j;

    /* renamed from: c  reason: collision with root package name */
    public boolean f34419c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f34420d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f34421e;

    /* renamed from: f  reason: collision with root package name */
    public int f34422f;
    public Handler g;
    public a h;
    i i;

    public interface a {
        void a();
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f34419c = true;
        this.f34420d = false;
    }

    private g() {
        if (j == null) {
            this.i = i.a();
            return;
        }
        throw new RuntimeException("Illegal access.");
    }

    public static g a() {
        if (PatchProxy.isSupport(new Object[0], null, f34417a, true, 23905, new Class[0], g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[0], null, f34417a, true, 23905, new Class[0], g.class);
        }
        if (j == null) {
            synchronized (g.class) {
                if (j == null) {
                    j = new g();
                }
            }
        }
        return j;
    }

    public static boolean a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f34417a, true, 23906, new Class[]{Context.class}, Boolean.TYPE)) {
            return b.b().b(context2, "has_show_volume_guide", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f34417a, true, 23906, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
    }
}
