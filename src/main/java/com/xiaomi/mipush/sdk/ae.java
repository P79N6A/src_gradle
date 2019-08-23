package com.xiaomi.mipush.sdk;

public final class ae implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f81747a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f81748b;

    ae(String str, String str2) {
        this.f81747a = str;
        this.f81748b = str2;
    }

    public final void run() {
        MiPushClient.initialize(MiPushClient.sContext, this.f81747a, this.f81748b, null);
    }
}
