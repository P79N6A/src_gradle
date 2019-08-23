package com.ss.android.ugc.aweme.miniapp;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.thread.h;
import com.storage.async.Scheduler;

public final /* synthetic */ class o implements Scheduler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55869a;

    /* renamed from: b  reason: collision with root package name */
    static final Scheduler f55870b = new o();

    private o() {
    }

    public final void execute(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2}, this, f55869a, false, 59037, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2}, this, f55869a, false, 59037, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        h.d().execute(runnable2);
    }
}
