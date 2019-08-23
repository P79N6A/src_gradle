package com.ss.android.ugc.aweme.account.login.twostep;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.g.b;
import com.ss.android.ugc.aweme.account.g.c;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32329a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile e f32330b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f32331c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private b f32332d;

    private e() {
    }

    public static e a() {
        if (PatchProxy.isSupport(new Object[0], null, f32329a, true, 20393, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], null, f32329a, true, 20393, new Class[0], e.class);
        }
        if (f32330b == null) {
            synchronized (e.class) {
                if (f32330b == null) {
                    f32330b = new e();
                }
            }
        }
        return f32330b;
    }

    public final void a(b bVar) {
        synchronized (f32331c) {
            this.f32332d = bVar;
        }
    }

    public final void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f32329a, false, 20394, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f32329a, false, 20394, new Class[]{c.class}, Void.TYPE);
            return;
        }
        synchronized (f32331c) {
            if (this.f32332d != null) {
                this.f32332d.onComplete(cVar);
                this.f32332d = null;
            }
        }
    }
}
