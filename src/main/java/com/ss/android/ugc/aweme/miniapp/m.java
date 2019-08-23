package com.ss.android.ugc.aweme.miniapp;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.storage.async.Scheduler;
import com.storage.async.SchedulerCreator;

public final /* synthetic */ class m implements SchedulerCreator {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55857a;

    /* renamed from: b  reason: collision with root package name */
    static final SchedulerCreator f55858b = new m();

    private m() {
    }

    public final Scheduler create() {
        if (!PatchProxy.isSupport(new Object[0], this, f55857a, false, 59035, new Class[0], Scheduler.class)) {
            return n.f55868b;
        }
        return (Scheduler) PatchProxy.accessDispatch(new Object[0], this, f55857a, false, 59035, new Class[0], Scheduler.class);
    }
}
