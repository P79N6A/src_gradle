package com.vivo.push.c;

import com.vivo.push.model.UPSNotificationMessage;

public final class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPSNotificationMessage f81567a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s f81568b;

    public final void run() {
        this.f81568b.f81532b.onNotificationMessageClicked(this.f81568b.f81705a, this.f81567a);
    }

    t(s sVar, UPSNotificationMessage uPSNotificationMessage) {
        this.f81568b = sVar;
        this.f81567a = uPSNotificationMessage;
    }
}
