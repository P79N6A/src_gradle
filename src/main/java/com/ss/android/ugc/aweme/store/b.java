package com.ss.android.ugc.aweme.store;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71745a;

    /* renamed from: b  reason: collision with root package name */
    private Map<Integer, ReentrantLock> f71746b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final long f71747c;

    public final int a() {
        if (!PatchProxy.isSupport(new Object[0], this, f71745a, false, 82108, new Class[0], Integer.TYPE)) {
            return this.f71746b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f71745a, false, 82108, new Class[0], Integer.TYPE)).intValue();
    }

    public b(int i) {
        this.f71747c = (long) i;
    }

    public final void b(int i) {
        ReentrantLock reentrantLock;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71745a, false, 82107, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71745a, false, 82107, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        synchronized (this.f71746b) {
            reentrantLock = this.f71746b.get(Integer.valueOf(i));
        }
        if (reentrantLock != null) {
            new StringBuilder("un lock ").append(i);
            reentrantLock.unlock();
            return;
        }
        throw new IllegalStateException("lock not found");
    }

    public final void a(int i) {
        ReentrantLock reentrantLock;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71745a, false, 82106, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71745a, false, 82106, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        synchronized (this.f71746b) {
            reentrantLock = this.f71746b.get(Integer.valueOf(i));
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                this.f71746b.put(Integer.valueOf(i), reentrantLock);
                if (((long) this.f71746b.size()) > this.f71747c) {
                    Iterator<ReentrantLock> it2 = this.f71746b.values().iterator();
                    ReentrantLock next = it2.next();
                    if (next != reentrantLock && !next.isLocked()) {
                        it2.remove();
                    }
                }
            }
        }
        new StringBuilder("lock ").append(i);
        reentrantLock.lock();
    }
}
