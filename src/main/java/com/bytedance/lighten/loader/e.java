package com.bytedance.lighten.loader;

import com.facebook.common.memory.MemoryTrimmable;
import com.facebook.common.memory.b;
import java.util.HashSet;
import java.util.Set;

public final class e implements b {

    /* renamed from: c  reason: collision with root package name */
    private static e f21813c;

    /* renamed from: a  reason: collision with root package name */
    private final Set<MemoryTrimmable> f21814a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final Object f21815b = new Object();

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            if (f21813c == null) {
                f21813c = new e();
            }
            eVar = f21813c;
        }
        return eVar;
    }

    public final void registerMemoryTrimmable(MemoryTrimmable memoryTrimmable) {
        if (memoryTrimmable != null) {
            synchronized (this.f21815b) {
                this.f21814a.add(memoryTrimmable);
            }
        }
    }
}
