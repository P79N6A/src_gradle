package com.bytedance.android.live.core.utils.fresco;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8285a;

    @TargetClass
    @Proxy
    static ExecutorService a(int i, ThreadFactory threadFactory) {
        ThreadFactory threadFactory2 = threadFactory;
        if (!PatchProxy.isSupport(new Object[]{1, threadFactory2}, null, f8285a, true, 1389, new Class[]{Integer.TYPE, ThreadFactory.class}, ExecutorService.class)) {
            return h.a(m.a(p.FIXED).a(1).a(threadFactory2).a());
        }
        return (ExecutorService) PatchProxy.accessDispatch(new Object[]{1, threadFactory2}, null, f8285a, true, 1389, new Class[]{Integer.TYPE, ThreadFactory.class}, ExecutorService.class);
    }
}