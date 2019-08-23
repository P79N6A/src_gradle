package com.ss.android.message;

import android.app.Application;
import com.bytedance.common.push.ActivityLifecycleObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.b.k;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29845a;

    /* renamed from: b  reason: collision with root package name */
    private static Application f29846b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f29847c;

    public static Application a() {
        return f29846b;
    }

    public static int b() {
        if (PatchProxy.isSupport(new Object[0], null, f29845a, true, 17827, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f29845a, true, 17827, new Class[0], Integer.TYPE)).intValue();
        }
        return f29846b.getApplicationInfo().targetSdkVersion;
    }

    public static void a(Application application) {
        if (PatchProxy.isSupport(new Object[]{application}, null, f29845a, true, 17826, new Class[]{Application.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application}, null, f29845a, true, 17826, new Class[]{Application.class}, Void.TYPE);
            return;
        }
        f29846b = application;
        if (!f29847c) {
            f29847c = true;
            if (k.d(application)) {
                f29846b.registerActivityLifecycleCallbacks(ActivityLifecycleObserver.getIns());
            }
        }
    }
}
