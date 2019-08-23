package com.ss.android.ugc.c;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class b {

    /* renamed from: e  reason: collision with root package name */
    public static int f77190e = 10;

    /* renamed from: f  reason: collision with root package name */
    public static final Lock f77191f = new ReentrantLock();
    private static volatile b j;

    /* renamed from: a  reason: collision with root package name */
    public double f77192a = -1.0d;

    /* renamed from: b  reason: collision with root package name */
    public Queue<c> f77193b = new ArrayBlockingQueue(f77190e);

    /* renamed from: c  reason: collision with root package name */
    public c[] f77194c = new c[f77190e];

    /* renamed from: d  reason: collision with root package name */
    public c f77195d;
    public a g = this.k;
    private double h = -1.0d;
    private final List<Object> i = new ArrayList();
    private a k = new a();

    public interface a {
        double a(Queue<c> queue, c[] cVarArr);
    }

    public static b a() {
        if (j == null) {
            synchronized (b.class) {
                if (j == null) {
                    j = new b();
                }
            }
        }
        return j;
    }

    public static int e() {
        double b2 = a().b();
        if (b2 == -1.0d) {
            return -1;
        }
        return (int) ((b2 / 8.0d) / 1000.0d);
    }

    public final void d() {
        this.h = -1.0d;
        synchronized (this.i) {
            Iterator<Object> it2 = this.i.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public final double b() {
        double d2 = this.h;
        if (this.h == -1.0d) {
            f77191f.lock();
            try {
                if (this.h == -1.0d) {
                    d2 = this.g.a(this.f77193b, this.f77194c);
                    if (d2 == -1.0d && this.k != this.g) {
                        d2 = this.k.a(this.f77193b, this.f77194c);
                    }
                    this.h = d2;
                } else {
                    d2 = this.h;
                }
            } finally {
                f77191f.unlock();
            }
        }
        if (d2 > 0.001d || this.f77192a <= 0.001d) {
            return d2;
        }
        return this.f77192a;
    }

    public final c[] c() {
        f77191f.lock();
        try {
            if (this.f77193b != null) {
                c[] cVarArr = new c[this.f77193b.size()];
                int i2 = 0;
                for (c cVar : this.f77193b) {
                    int i3 = i2 + 1;
                    c cVar2 = new c(cVar.f77197b, cVar.f77198c, cVar.f77199d, cVar.f77200e);
                    cVarArr[i2] = cVar2;
                    i2 = i3;
                }
                return cVarArr;
            }
            f77191f.unlock();
            return null;
        } finally {
            f77191f.unlock();
        }
    }

    public final void a(double d2, double d3, long j2) {
        c cVar;
        f77191f.lock();
        try {
            if (this.f77195d != null) {
                cVar = this.f77195d;
                cVar.f77197b = d2;
                cVar.f77198c = d3;
                cVar.f77199d = j2;
                cVar.f77200e = SystemClock.elapsedRealtime();
            } else {
                double d4 = d2;
                double d5 = d3;
                long j3 = j2;
                cVar = new c(d2, d3, j2, SystemClock.elapsedRealtime());
            }
            if (!this.f77193b.offer(cVar)) {
                this.f77195d = this.f77193b.poll();
                this.f77193b.offer(cVar);
            }
        } finally {
            d();
            f77191f.unlock();
        }
    }
}
