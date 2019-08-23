package com.facebook.imagepipeline.core;

import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class b {
    @TargetClass
    @Proxy
    static ExecutorService a(int i, ThreadFactory threadFactory) {
        return h.a(m.a(p.FIXED).a(i).a(threadFactory).a());
    }
}
