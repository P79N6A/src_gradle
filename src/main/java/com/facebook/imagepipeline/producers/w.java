package com.facebook.imagepipeline.producers;

import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ScheduledExecutorService;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class w {
    @TargetClass
    @Proxy
    static ScheduledExecutorService a() {
        return (ScheduledExecutorService) h.a(m.a(p.SCHEDULED).a(1).a());
    }
}
