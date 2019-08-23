package com.bytedance.frameworks.core.b;

import com.bytedance.frameworks.core.b.b;
import java.util.UUID;

public abstract class c implements b, Comparable<c>, Runnable {

    /* renamed from: a  reason: collision with root package name */
    private b.a f19977a = b.a.NORMAL;
    public String i = (UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime()));

    private b.a a() {
        return this.f19977a;
    }

    public /* synthetic */ int compareTo(Object obj) {
        c cVar = (c) obj;
        if (a().getValue() < cVar.a().getValue()) {
            return 1;
        }
        if (a().getValue() > cVar.a().getValue()) {
            return -1;
        }
        return 0;
    }
}
