package com.ss.android.ugc.aweme.im.sdk.arch.adpater;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ExecutorService;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50147a;

    @TargetClass
    @Proxy
    static ExecutorService a(int i) {
        if (!PatchProxy.isSupport(new Object[]{2}, null, f50147a, true, 50169, new Class[]{Integer.TYPE}, ExecutorService.class)) {
            return h.a(m.a(p.FIXED).a(2).a());
        }
        return (ExecutorService) PatchProxy.accessDispatch(new Object[]{2}, null, f50147a, true, 50169, new Class[]{Integer.TYPE}, ExecutorService.class);
    }
}
