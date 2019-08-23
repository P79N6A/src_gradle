package com.bytedance.dataplatform;

import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ScheduledExecutorService f19619a = ((ScheduledExecutorService) h.a(m.a(p.SCHEDULED).a(1).a()));

    public static Future a(Runnable runnable, long j, long j2) {
        return f19619a.scheduleWithFixedDelay(runnable, j, 3600000, TimeUnit.MILLISECONDS);
    }
}
