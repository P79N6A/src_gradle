package com.bytedance.frameworks.core.b;

import com.bytedance.frameworks.core.b.b;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f19971a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f19972b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f19973c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile ScheduledExecutorService f19974d;

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap<String, c> f19975e = new ConcurrentHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private static final ConcurrentHashMap<String, c> f19976f = new ConcurrentHashMap<>();

    public static a a() {
        if (f19971a == null) {
            synchronized (a.class) {
                if (f19971a == null) {
                    f19971a = new a();
                }
            }
        }
        return f19971a;
    }

    private a() {
        int i = e.f19983a;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 1, TimeUnit.SECONDS, e.f19985c, new d(b.a.NORMAL, "tt-api-thread-"));
        f19972b = threadPoolExecutor;
        int i2 = e.f19984b;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(i2, i2, 1, TimeUnit.SECONDS, e.f19986d, new d(b.a.NORMAL, "tt-default-thread-"));
        f19973c = threadPoolExecutor2;
        f19974d = (ScheduledExecutorService) h.a(m.a(p.SCHEDULED).a(1).a((ThreadFactory) new d(b.a.LOW, "tt-delay-thread-")).a());
    }

    public static void a(c cVar) {
        if (f19972b != null) {
            f19972b.execute(cVar);
        }
    }
}
