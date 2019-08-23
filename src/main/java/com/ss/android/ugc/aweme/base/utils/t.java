package com.ss.android.ugc.aweme.base.utils;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.SoftReference;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35051a;

    /* renamed from: b  reason: collision with root package name */
    private static SoftReference<Handler> f35052b;

    public static Handler a() {
        if (PatchProxy.isSupport(new Object[0], null, f35051a, true, 25291, new Class[0], Handler.class)) {
            return (Handler) PatchProxy.accessDispatch(new Object[0], null, f35051a, true, 25291, new Class[0], Handler.class);
        }
        if (f35052b != null) {
            Handler handler = f35052b.get();
            if (handler != null) {
                return handler;
            }
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        f35052b = new SoftReference<>(handler2);
        return handler2;
    }

    public static void a(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2}, null, f35051a, true, 25292, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2}, null, f35051a, true, 25292, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        a().post(runnable2);
    }
}
