package com.bytedance.frameworks.apm.trace;

import java.util.LinkedList;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    f f19670a;

    /* renamed from: b  reason: collision with root package name */
    h f19671b;

    /* renamed from: c  reason: collision with root package name */
    LinkedList<h> f19672c = new LinkedList<>();

    public final int a() {
        if (this.f19670a == null) {
            return 0;
        }
        return this.f19670a.f19662c;
    }

    public final void a(h hVar) {
        this.f19672c.push(hVar);
    }

    h(f fVar, h hVar) {
        this.f19670a = fVar;
        this.f19671b = hVar;
    }
}
