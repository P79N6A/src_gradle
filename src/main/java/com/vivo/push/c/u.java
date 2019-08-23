package com.vivo.push.c;

import com.vivo.push.model.UPSNotificationMessage;

public final class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPSNotificationMessage f81569a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s f81570b;

    public final void run() {
        this.f81570b.f81532b.onNotificationMessageClicked(this.f81570b.f81705a, this.f81569a);
    }

    u(s sVar, UPSNotificationMessage uPSNotificationMessage) {
        this.f81570b = sVar;
        this.f81569a = uPSNotificationMessage;
    }
}
