package com.bytedance.ttnet.config;

import com.bytedance.frameworks.baselib.network.http.cronet.a.c;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.b;

public final class f implements c.b, b.C0235b {
    public final boolean a() {
        if (!a.o && TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "http_dns_enabled", 0) > 0) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (a.o || a.k() || TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "chromium_boot_failures", 0) > 3) {
            return false;
        }
        if (a.p) {
            TTNetInit.getTTNetDepend();
            return true;
        } else if (TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "chromium_open", 0) > 0) {
            return true;
        } else {
            return false;
        }
    }
}
