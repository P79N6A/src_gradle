package com.mapbox.android.telemetry;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class l<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Queue<T> f26114a = new ConcurrentLinkedQueue();

    /* renamed from: b  reason: collision with root package name */
    public int f26115b;

    l() {
    }

    /* access modifiers changed from: package-private */
    public final List<T> a() {
        ArrayList arrayList = new ArrayList(this.f26115b);
        for (int i = 0; i < this.f26115b; i++) {
            arrayList.add(this.f26114a.remove());
        }
        this.f26115b = 0;
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(T t) {
        boolean add = this.f26114a.add(t);
        this.f26115b++;
        return add;
    }
}
