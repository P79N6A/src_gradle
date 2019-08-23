package com.vivo.push.c;

import java.util.List;

public final class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f81553a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List f81554b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List f81555c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f81556d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ h f81557e;

    public final void run() {
        this.f81557e.f81532b.onDelAlias(this.f81557e.f81705a, this.f81553a, this.f81554b, this.f81555c, this.f81556d);
    }

    j(h hVar, int i, List list, List list2, String str) {
        this.f81557e = hVar;
        this.f81553a = i;
        this.f81554b = list;
        this.f81555c = list2;
        this.f81556d = str;
    }
}
