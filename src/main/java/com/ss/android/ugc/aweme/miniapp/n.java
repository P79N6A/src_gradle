package com.ss.android.ugc.aweme.miniapp;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.thread.h;
import com.storage.async.Scheduler;

public final /* synthetic */ class n implements Scheduler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55867a;

    /* renamed from: b  reason: collision with root package name */
    static final Scheduler f55868b = new n();

    private n() {
    }

    public final void execute(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2}, this, f55867a, false, 59036, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2}, this, f55867a, false, 59036, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        h.c().execute(runnable2);
    }
}
