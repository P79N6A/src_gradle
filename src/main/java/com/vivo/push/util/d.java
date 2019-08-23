package com.vivo.push.util;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final int f81657a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b  reason: collision with root package name */
    private static final int f81658b = Math.max(2, Math.min(f81657a - 1, 4));

    /* renamed from: c  reason: collision with root package name */
    private static final int f81659c = ((f81657a * 2) + 1);

    /* renamed from: d  reason: collision with root package name */
    private static ExecutorService f81660d = a("COMMON_THREAD");

    public static ExecutorService a(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f81658b, f81659c, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(SearchJediMixFeedAdapter.f42517f), new e(str), new ThreadPoolExecutor.DiscardPolicy());
        return threadPoolExecutor;
    }
}
