package com.facebook.imagepipeline.producers;

import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ExecutorService;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class u {
    @TargetClass
    @Proxy
    static ExecutorService a(int i) {
        return h.a(m.a(p.FIXED).a(3).a());
    }
}