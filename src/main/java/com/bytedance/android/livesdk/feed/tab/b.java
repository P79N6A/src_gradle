package com.bytedance.android.livesdk.feed.tab;

import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private BehaviorSubject<String> f14401a = BehaviorSubject.create();

    /* renamed from: b  reason: collision with root package name */
    private BehaviorSubject<Long> f14402b = BehaviorSubject.create();

    public final Observable<Long> a() {
        return this.f14402b;
    }
}
