package com.benchmark.bl;

import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final List f7490a;

    i(List list) {
        this.f7490a = list;
    }

    public final Object call() {
        return a.a(this.f7490a);
    }
}
