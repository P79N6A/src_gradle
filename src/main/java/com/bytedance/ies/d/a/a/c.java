package com.bytedance.ies.d.a.a;

import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.ies.d.a.a;
import java.util.concurrent.PriorityBlockingQueue;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f20241a;

    /* renamed from: b  reason: collision with root package name */
    private final PriorityBlockingQueue<a> f20242b;

    /* renamed from: c  reason: collision with root package name */
    private final PriorityBlockingQueue<a> f20243c;

    /* renamed from: d  reason: collision with root package name */
    private a[] f20244d;

    /* renamed from: e  reason: collision with root package name */
    private b f20245e;

    public c() {
        this(4);
    }

    private synchronized void b() {
        this.f20241a = false;
        if (this.f20245e != null) {
            b bVar = this.f20245e;
            bVar.f20238a = true;
            bVar.interrupt();
        }
        for (int i = 0; i < this.f20244d.length; i++) {
            if (this.f20244d[i] != null) {
                a aVar = this.f20244d[i];
                aVar.f20236b = true;
                aVar.interrupt();
                this.f20244d[i] = null;
            }
        }
    }

    public final synchronized void a() {
        b();
        this.f20245e = new b(this.f20242b, this.f20243c);
        this.f20245e.start();
        for (int i = 0; i < this.f20244d.length; i++) {
            a aVar = new a(this.f20243c);
            this.f20244d[i] = aVar;
            aVar.start();
        }
        this.f20241a = true;
    }

    private c(int i) {
        this.f20242b = new PriorityBlockingQueue<>();
        this.f20243c = new PriorityBlockingQueue<>();
        this.f20244d = new a[4];
    }

    public final synchronized void a(a aVar) {
        if (aVar.f20234d == a.C0182a.IMMEDIATE) {
            ThreadPlus.submitRunnable(aVar);
        } else {
            this.f20243c.add(aVar);
        }
        boolean z = this.f20241a;
    }
}
