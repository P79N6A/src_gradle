package com.ss.android.ugc.aweme.miniapp;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.storage.async.Scheduler;
import com.storage.async.SchedulerCreator;

public final /* synthetic */ class l implements SchedulerCreator {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55813a;

    /* renamed from: b  reason: collision with root package name */
    static final SchedulerCreator f55814b = new l();

    private l() {
    }

    public final Scheduler create() {
        if (!PatchProxy.isSupport(new Object[0], this, f55813a, false, 59034, new Class[0], Scheduler.class)) {
            return o.f55870b;
        }
        return (Scheduler) PatchProxy.accessDispatch(new Object[0], this, f55813a, false, 59034, new Class[0], Scheduler.class);
    }
}
