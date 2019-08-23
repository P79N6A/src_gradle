package com.tencent.open.a;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class g implements Iterable<String> {

    /* renamed from: a  reason: collision with root package name */
    ConcurrentLinkedQueue<String> f79674a = new ConcurrentLinkedQueue<>();

    /* renamed from: b  reason: collision with root package name */
    AtomicInteger f79675b = new AtomicInteger(0);

    public final Iterator<String> iterator() {
        return this.f79674a.iterator();
    }

    public final void a() {
        this.f79674a.clear();
        this.f79675b.set(0);
    }
}
