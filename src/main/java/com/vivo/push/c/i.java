package com.vivo.push.c;

import java.util.List;

public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f81548a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List f81549b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List f81550c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f81551d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ h f81552e;

    public final void run() {
        this.f81552e.f81532b.onDelTags(this.f81552e.f81705a, this.f81548a, this.f81549b, this.f81550c, this.f81551d);
    }

    i(h hVar, int i, List list, List list2, String str) {
        this.f81552e = hVar;
        this.f81548a = i;
        this.f81549b = list;
        this.f81550c = list2;
        this.f81551d = str;
    }
}
