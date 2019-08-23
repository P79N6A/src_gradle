package com.bytedance.ttnet.config;

import com.bytedance.frameworks.core.encrypt.a;
import com.bytedance.ttnet.TTNetInit;

public final class e implements a.C0163a {
    public final boolean b() {
        if (TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "add_ss_queries_open", 0) > 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "add_ss_queries_header_open", 1) > 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "add_ss_queries_plaintext_open", 1) > 0) {
            return true;
        }
        return false;
    }
}
