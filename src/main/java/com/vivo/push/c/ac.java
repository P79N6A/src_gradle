package com.vivo.push.c;

import java.util.List;

public final class ac implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f81533a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List f81534b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List f81535c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f81536d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ab f81537e;

    public final void run() {
        this.f81537e.f81532b.onSetTags(this.f81537e.f81705a, this.f81533a, this.f81534b, this.f81535c, this.f81536d);
    }

    ac(ab abVar, int i, List list, List list2, String str) {
        this.f81537e = abVar;
        this.f81533a = i;
        this.f81534b = list;
        this.f81535c = list2;
        this.f81536d = str;
    }
}
