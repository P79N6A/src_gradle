package com.ss.android.ugc.aweme.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class i implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34748a;

    /* renamed from: b  reason: collision with root package name */
    static final ThreadFactory f34749b = new i();

    private i() {
    }

    public final Thread newThread(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (!PatchProxy.isSupport(new Object[]{runnable2}, this, f34748a, false, 24004, new Class[]{Runnable.class}, Thread.class)) {
            return new Thread(runnable2, "image-net-requests-monitor");
        }
        return (Thread) PatchProxy.accessDispatch(new Object[]{runnable2}, this, f34748a, false, 24004, new Class[]{Runnable.class}, Thread.class);
    }
}
