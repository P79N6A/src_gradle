package com.vivo.push.c;

import com.vivo.push.model.UnvarnishedMessage;

public final class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UnvarnishedMessage f81562a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o f81563b;

    public final void run() {
        this.f81563b.f81532b.onTransmissionMessage(this.f81563b.f81705a, this.f81562a);
    }

    p(o oVar, UnvarnishedMessage unvarnishedMessage) {
        this.f81563b = oVar;
        this.f81562a = unvarnishedMessage;
    }
}
