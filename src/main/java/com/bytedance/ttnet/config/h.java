package com.bytedance.ttnet.config;

import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.encrypt.c;
import java.util.Collections;
import java.util.Set;

public final class h implements c.a {

    /* renamed from: a  reason: collision with root package name */
    Set<String> f22615a;

    /* renamed from: b  reason: collision with root package name */
    long f22616b;

    public final boolean l() {
        if (TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "ttnet_token_enabled", 1) > 0) {
            return true;
        }
        return false;
    }

    public final Set<String> m() {
        if (!l()) {
            return Collections.emptySet();
        }
        long parseLong = Long.parseLong(TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "ttnet_token_config_time", "-1"));
        if (this.f22616b != 0 && this.f22616b == parseLong && this.f22615a != null) {
            return this.f22615a;
        }
        this.f22616b = parseLong;
        this.f22615a = a.f(TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "ttnet_token_api", "[]"));
        return this.f22615a;
    }
}
