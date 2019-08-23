package com.bytedance.ttnet.config;

import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.retrofit.a;
import java.util.HashSet;
import java.util.Set;

public final class g implements SsHttpCall.a {
    public final int f() {
        return a.a(TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "request_max_delay_time", 600000));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r5 = this;
            com.bytedance.ttnet.c r0 = com.bytedance.ttnet.TTNetInit.getTTNetDepend()
            com.bytedance.ttnet.c r1 = com.bytedance.ttnet.TTNetInit.getTTNetDepend()
            android.content.Context r1 = r1.a()
            java.lang.String r2 = "request_delay_time_range"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.a((android.content.Context) r1, (java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ","
            java.lang.String[] r0 = r0.split(r3)
            java.util.List r0 = java.util.Arrays.asList(r0)
            int r3 = r0.size()
            r4 = 2
            if (r3 != r4) goto L_0x0038
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 1
            java.lang.Object r0 = r0.get(r2)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x0038:
            boolean r0 = com.bytedance.ttnet.retrofit.a.a((java.lang.String) r1, (java.lang.String) r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.config.g.e():boolean");
    }

    public final boolean e(String str) {
        String[] split = TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "request_random_delay_apis", "").split(",");
        HashSet hashSet = new HashSet();
        for (String add : split) {
            hashSet.add(add);
        }
        return a.a(str, (Set<String>) hashSet);
    }
}
