package com.bytedance.apm.e;

import java.util.LinkedList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<c> f18969a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    volatile boolean f18970b = false;

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        if (!this.f18970b) {
            synchronized (this.f18969a) {
                if (this.f18969a.size() > 40) {
                    this.f18969a.poll();
                }
                this.f18969a.add(new c(str, str2));
            }
        }
    }
}
