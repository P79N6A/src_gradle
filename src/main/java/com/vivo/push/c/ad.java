package com.vivo.push.c;

import java.util.List;

public final class ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f81538a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List f81539b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List f81540c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f81541d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ab f81542e;

    public final void run() {
        this.f81542e.f81532b.onSetAlias(this.f81542e.f81705a, this.f81538a, this.f81539b, this.f81540c, this.f81541d);
    }

    ad(ab abVar, int i, List list, List list2, String str) {
        this.f81542e = abVar;
        this.f81538a = i;
        this.f81539b = list;
        this.f81540c = list2;
        this.f81541d = str;
    }
}
