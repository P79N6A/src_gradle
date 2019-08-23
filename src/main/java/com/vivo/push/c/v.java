package com.vivo.push.c;

import com.vivo.push.model.UPSNotificationMessage;

public final class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPSNotificationMessage f81571a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s f81572b;

    public final void run() {
        this.f81572b.f81532b.onNotificationMessageClicked(this.f81572b.f81705a, this.f81571a);
    }

    v(s sVar, UPSNotificationMessage uPSNotificationMessage) {
        this.f81572b = sVar;
        this.f81571a = uPSNotificationMessage;
    }
}
