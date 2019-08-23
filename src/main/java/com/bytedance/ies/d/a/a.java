package com.bytedance.ies.d.a;

import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.d.a.a.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a implements Comparable<a>, Runnable {

    /* renamed from: e  reason: collision with root package name */
    private static c f20229e = new c();

    /* renamed from: f  reason: collision with root package name */
    private static AtomicBoolean f20230f = new AtomicBoolean(false);
    private static AtomicInteger g = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    protected final AtomicBoolean f20231a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    protected final AtomicBoolean f20232b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public final String f20233c;

    /* renamed from: d  reason: collision with root package name */
    public final C0182a f20234d;
    private int h;

    /* renamed from: com.bytedance.ies.d.a.a$a  reason: collision with other inner class name */
    public enum C0182a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public void run() {
    }

    public final boolean a() {
        return this.f20232b.get();
    }

    public final void b() {
        if (this.f20231a.compareAndSet(false, true)) {
            this.h = g.incrementAndGet();
            if (f20230f.compareAndSet(false, true)) {
                f20229e.a();
            }
            f20229e.a(this);
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        a aVar = (a) obj;
        C0182a aVar2 = this.f20234d;
        C0182a aVar3 = aVar.f20234d;
        if (aVar2 == null) {
            aVar2 = C0182a.NORMAL;
        }
        if (aVar3 == null) {
            aVar3 = C0182a.NORMAL;
        }
        if (aVar2 == aVar3) {
            return this.h - aVar.h;
        }
        return aVar3.ordinal() - aVar2.ordinal();
    }

    protected a(String str, C0182a aVar) {
        this.f20234d = aVar;
        this.f20233c = StringUtils.isEmpty(str) ? getClass().getSimpleName() : str;
    }
}
