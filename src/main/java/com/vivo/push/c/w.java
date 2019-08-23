package com.vivo.push.c;

import com.vivo.push.model.UPSNotificationMessage;

public final class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPSNotificationMessage f81573a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s f81574b;

    public final void run() {
        this.f81574b.f81532b.onNotificationMessageClicked(this.f81574b.f81705a, this.f81573a);
    }

    w(s sVar, UPSNotificationMessage uPSNotificationMessage) {
        this.f81574b = sVar;
        this.f81573a = uPSNotificationMessage;
    }
}
