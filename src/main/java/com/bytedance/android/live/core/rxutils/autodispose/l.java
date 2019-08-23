package com.bytedance.android.live.core.rxutils.autodispose;

import io.reactivex.CompletableSource;
import io.reactivex.parallel.ParallelFlowable;

public final /* synthetic */ class l implements ad {

    /* renamed from: a  reason: collision with root package name */
    private final ParallelFlowable f8057a;

    /* renamed from: b  reason: collision with root package name */
    private final CompletableSource f8058b;

    l(ParallelFlowable parallelFlowable, CompletableSource completableSource) {
        this.f8057a = parallelFlowable;
        this.f8058b = completableSource;
    }
}
