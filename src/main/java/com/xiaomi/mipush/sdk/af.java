package com.xiaomi.mipush.sdk;

import com.xiaomi.push.el;

public final class af implements Runnable {
    af() {
    }

    public final void run() {
        el.a(MiPushClient.sContext);
    }
}
