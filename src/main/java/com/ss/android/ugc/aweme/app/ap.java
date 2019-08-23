package com.ss.android.ugc.aweme.app;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.common.a.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;

public final class ap {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2634a = null;

    /* renamed from: e  reason: collision with root package name */
    private static final String f2635e = "ap";
    @SuppressLint({"all"})

    /* renamed from: f  reason: collision with root package name */
    private static ap f2636f;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2637b;

    /* renamed from: c  reason: collision with root package name */
    public final q f2638c;

    /* renamed from: d  reason: collision with root package name */
    public int f2639d = -1;
    private final Context g;

    private ap(Context context) {
        this.g = context;
        this.f2637b = ToolUtils.isMainProcess(this.g);
        this.f2638c = q.a();
    }

    public static synchronized ap a(Context context) {
        Context context2 = context;
        synchronized (ap.class) {
            if (PatchProxy.isSupport(new Object[]{context2}, null, f2634a, true, 22959, new Class[]{Context.class}, ap.class)) {
                ap apVar = (ap) PatchProxy.accessDispatch(new Object[]{context2}, null, f2634a, true, 22959, new Class[]{Context.class}, ap.class);
                return apVar;
            }
            if (f2636f == null) {
                f2636f = new ap(context2);
            }
            ap apVar2 = f2636f;
            return apVar2;
        }
    }
}
