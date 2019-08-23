package com.bytedance.frameworks.plugin.f;

import com.bytedance.frameworks.plugin.Mira;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public long f2266a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2267b;

    /* renamed from: c  reason: collision with root package name */
    private long f2268c;

    public static m a(String str) {
        return new m(str);
    }

    private m(String str) {
        this.f2267b = "StopWatch-" + str;
        long currentTimeMillis = System.currentTimeMillis();
        this.f2266a = currentTimeMillis;
        this.f2268c = currentTimeMillis;
    }

    public final long b(String str) {
        long currentTimeMillis = System.currentTimeMillis() - this.f2268c;
        if (Mira.a()) {
            g.b(String.format("job[%s] cost=%s, total=%s", new Object[]{str, Long.valueOf(currentTimeMillis), Long.valueOf(System.currentTimeMillis() - this.f2266a)}));
            this.f2268c = System.currentTimeMillis();
        }
        return currentTimeMillis;
    }
}
