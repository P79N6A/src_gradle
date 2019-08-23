package com.ss.android.ugc.aweme.base;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Executor;

public final class k implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34751a;

    /* renamed from: b  reason: collision with root package name */
    public static final k f34752b = new k();

    /* renamed from: c  reason: collision with root package name */
    private final Handler f34753c = new Handler(Looper.getMainLooper());

    private k() {
    }

    public final void execute(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2}, this, f34751a, false, 24006, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2}, this, f34751a, false, 24006, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        this.f34753c.post(runnable2);
    }
}
