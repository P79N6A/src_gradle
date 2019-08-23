package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class z implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75973a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f75974b;

    /* renamed from: c  reason: collision with root package name */
    private final String f75975c;

    z(Runnable runnable, String str) {
        this.f75974b = runnable;
        this.f75975c = str;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f75973a, false, 88034, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f75973a, false, 88034, new Class[0], Object.class);
        }
        Runnable runnable = this.f75974b;
        if (runnable == null) {
            return null;
        }
        runnable.run();
        return null;
    }
}
