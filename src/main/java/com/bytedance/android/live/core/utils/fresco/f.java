package com.bytedance.android.live.core.utils.fresco;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class f implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8283a;

    /* renamed from: b  reason: collision with root package name */
    static final ThreadFactory f8284b = new f();

    private f() {
    }

    public final Thread newThread(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (!PatchProxy.isSupport(new Object[]{runnable2}, this, f8283a, false, 1388, new Class[]{Runnable.class}, Thread.class)) {
            return new Thread(runnable2, "image-net-requests-monitor");
        }
        return (Thread) PatchProxy.accessDispatch(new Object[]{runnable2}, this, f8283a, false, 1388, new Class[]{Runnable.class}, Thread.class);
    }
}
