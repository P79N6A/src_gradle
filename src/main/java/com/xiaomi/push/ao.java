package com.xiaomi.push;

import com.xiaomi.push.am;

public class ao implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ am.b f81834a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ am f157a;

    ao(am amVar, am.b bVar) {
        this.f157a = amVar;
        this.f81834a = bVar;
    }

    public void run() {
        this.f157a.a(this.f81834a);
    }
}
