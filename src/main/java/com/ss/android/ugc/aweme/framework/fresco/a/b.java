package com.ss.android.ugc.aweme.framework.fresco.a;

import com.facebook.common.executors.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Executor;

public final class b extends a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f48529e;

    public final synchronized void execute(Runnable runnable) {
        if (PatchProxy.isSupport(new Object[]{runnable}, this, f48529e, false, 45916, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable}, this, f48529e, false, 45916, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        super.execute(runnable);
    }

    public b(Executor executor, int i) {
        super("FixSizeSerialExecutor", 1, executor, new a(10));
    }
}
