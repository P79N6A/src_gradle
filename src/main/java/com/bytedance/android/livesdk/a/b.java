package com.bytedance.android.livesdk.a;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.aspectj.lang.a;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8892a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ b f8893b;

    /* renamed from: c  reason: collision with root package name */
    private static /* synthetic */ Throwable f8894c;

    static {
        try {
            if (PatchProxy.isSupport(new Object[0], null, f8892a, true, 3120, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f8892a, true, 3120, new Class[0], Void.TYPE);
            } else {
                f8893b = new b();
            }
        } catch (Throwable th) {
            f8894c = th;
        }
    }

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f8892a, true, 3119, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f8892a, true, 3119, new Class[0], b.class);
        }
        if (f8893b != null) {
            return f8893b;
        }
        throw new org.aspectj.lang.b("com.bytedance.android.livesdk.aop.UserActionTraceAspect", f8894c);
    }

    @Before
    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f8892a, false, 3114, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f8892a, false, 3114, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Object[] b2 = aVar.b();
        if (b2.length > 0) {
            Object obj = b2[0];
            if (obj instanceof View) {
                com.bytedance.android.livesdk.j.a.a.a().a(com.bytedance.android.livesdk.j.a.a.a().a((View) obj, "View#onClick()"));
            }
        }
    }
}
