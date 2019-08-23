package com.ss.android.ugc.aweme.account.base;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Executor;

public final class a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31687a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f31688b = new a();

    /* renamed from: c  reason: collision with root package name */
    private final Handler f31689c = new Handler(Looper.getMainLooper());

    private a() {
    }

    public final void execute(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2}, this, f31687a, false, 19653, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2}, this, f31687a, false, 19653, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        this.f31689c.post(runnable2);
    }
}
