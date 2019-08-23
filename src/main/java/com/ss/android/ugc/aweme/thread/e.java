package com.ss.android.ugc.aweme.thread;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class e implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4190a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4191b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4192c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f4193d;

    e(int i, String str, boolean z) {
        this.f4191b = i;
        this.f4192c = str;
        this.f4193d = z;
    }

    public final Thread newThread(Runnable runnable) {
        if (PatchProxy.isSupport(new Object[]{runnable}, this, f4190a, false, 86875, new Class[]{Runnable.class}, Thread.class)) {
            return (Thread) PatchProxy.accessDispatch(new Object[]{runnable}, this, f4190a, false, 86875, new Class[]{Runnable.class}, Thread.class);
        }
        int i = this.f4191b;
        String str = this.f4192c;
        boolean z = this.f4193d;
        Thread thread = new Thread(new f(i, runnable));
        thread.setName(str + "-" + d.f4182b.incrementAndGet());
        thread.setDaemon(z);
        return thread;
    }
}
