package com.tencent.wxop.stat.a;

import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ExecutorService;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class g {
    @TargetClass
    @Proxy
    static ExecutorService a() {
        return h.a(m.a(p.FIXED).a(1).a());
    }
}
