package com.ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.google.common.util.concurrent.b;
import com.google.common.util.concurrent.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class ei<V> extends b<V> {
    public static ChangeQuickRedirect k;

    /* renamed from: a  reason: collision with root package name */
    private String f67525a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f67526b;

    /* renamed from: c  reason: collision with root package name */
    private AtomicInteger f67527c = new AtomicInteger();
    private LinkedHashMap<Runnable, Executor> i = new LinkedHashMap<>();

    public ei() {
    }

    public final int e() {
        if (!PatchProxy.isSupport(new Object[0], this, k, false, 74408, new Class[0], Integer.TYPE)) {
            return this.f67527c.get();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, k, false, 74408, new Class[0], Integer.TYPE)).intValue();
    }

    public ei(String str) {
        this.f67525a = str;
        this.f67526b = !TextUtils.isEmpty(str);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, k, false, 74409, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, k, false, 74409, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f67526b) {
            ai.d(this.f67525a + " ProgressiveFuture.setProgress:" + i2);
        }
        this.f67527c.getAndSet(i2);
        g gVar = new g();
        synchronized (this) {
            for (Map.Entry next : this.i.entrySet()) {
                gVar.a((Runnable) next.getKey(), (Executor) next.getValue());
            }
        }
        gVar.a();
    }

    public final synchronized void b(Runnable runnable, Executor executor) {
        if (PatchProxy.isSupport(new Object[]{runnable, executor}, this, k, false, 74407, new Class[]{Runnable.class, Executor.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable, executor}, this, k, false, 74407, new Class[]{Runnable.class, Executor.class}, Void.TYPE);
            return;
        }
        this.i.put(runnable, executor);
    }
}
