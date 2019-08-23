package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class fm implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67758a;

    /* renamed from: b  reason: collision with root package name */
    static final ThreadFactory f67759b = new fm();

    private fm() {
    }

    public final Thread newThread(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2}, this, f67758a, false, 74639, new Class[]{Runnable.class}, Thread.class)) {
            return (Thread) PatchProxy.accessDispatch(new Object[]{runnable2}, this, f67758a, false, 74639, new Class[]{Runnable.class}, Thread.class);
        }
        Thread thread = new Thread(runnable2);
        thread.setName("sdk-synthetise");
        return thread;
    }
}
