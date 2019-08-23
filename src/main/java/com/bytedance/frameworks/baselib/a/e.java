package com.bytedance.frameworks.baselib.a;

import android.content.Context;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e {

    /* renamed from: b  reason: collision with root package name */
    private static e f19687b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, b> f19688a;

    /* renamed from: c  reason: collision with root package name */
    private final Context f19689c;

    /* renamed from: d  reason: collision with root package name */
    private final f f19690d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f19691e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final LinkedList<c> f19692f = new LinkedList<>();

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.f19691e.get();
    }

    /* access modifiers changed from: package-private */
    public final b a(String str) {
        return this.f19688a.get(str);
    }

    public static e a(Context context) {
        if (f19687b == null) {
            synchronized (e.class) {
                if (f19687b == null) {
                    f19687b = new e(context);
                }
            }
        }
        return f19687b;
    }

    private e(Context context) {
        this.f19689c = context.getApplicationContext();
        this.f19688a = new ConcurrentHashMap();
        this.f19690d = new f(this.f19689c, this, this.f19692f, this.f19691e);
        this.f19690d.start();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, byte[] bArr) {
        if (a() || bArr == null || bArr.length <= 0 || a(str) == null) {
            return false;
        }
        synchronized (this.f19692f) {
            if (this.f19691e.get()) {
                return false;
            }
            if (this.f19692f.size() >= 2000) {
                this.f19692f.poll();
            }
            boolean add = this.f19692f.add(new c(str, bArr));
            f fVar = this.f19690d;
            synchronized (fVar.f19693a) {
                fVar.f19693a.notify();
            }
            return add;
        }
    }
}
