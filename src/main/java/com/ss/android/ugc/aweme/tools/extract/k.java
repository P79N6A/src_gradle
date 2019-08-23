package com.ss.android.ugc.aweme.tools.extract;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ScheduledExecutorService;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74721a;

    @TargetClass
    @Proxy
    static ScheduledExecutorService a() {
        return (ScheduledExecutorService) (PatchProxy.isSupport(new Object[0], null, f74721a, true, 87071, new Class[0], ScheduledExecutorService.class) ? PatchProxy.accessDispatch(new Object[0], null, f74721a, true, 87071, new Class[0], ScheduledExecutorService.class) : h.a(m.a(p.SCHEDULED).a(1).a()));
    }
}
