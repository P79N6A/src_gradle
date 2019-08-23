package com.benchmark.bl;

import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.aj.b;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    static final Callable f7482a = new c();

    private c() {
    }

    public final Object call() {
        return (BenchmarkResponse) b.b().a(GlobalContext.getContext(), "benchmark", BenchmarkResponse.class);
    }
}
