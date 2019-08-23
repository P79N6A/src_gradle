package com.ss.android.ugc.effectmanager.common.f;

import android.support.annotation.RestrictTo;
import java.util.HashMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, Object> f77325a = new HashMap<>();

    public static c a() {
        return new c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000f, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized org.json.JSONObject b() {
        /*
            r2 = this;
            monitor-enter(r2)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x000d, all -> 0x000a }
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r2.f77325a     // Catch:{ Exception -> 0x000d, all -> 0x000a }
            r0.<init>(r1)     // Catch:{ Exception -> 0x000d, all -> 0x000a }
            monitor-exit(r2)
            return r0
        L_0x000a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x000d:
            r0 = 0
            monitor-exit(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.f.c.b():org.json.JSONObject");
    }

    public final c a(String str, Integer num) {
        this.f77325a.put(str, num);
        return this;
    }

    public final c a(String str, Long l) {
        this.f77325a.put(str, l);
        return this;
    }

    public final c a(String str, String str2) {
        this.f77325a.put(str, str2);
        return this;
    }
}
