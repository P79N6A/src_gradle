package com.ss.android.ugc.aweme.commercialize.utils;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class q<TKey, TValue> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39813a;

    /* renamed from: b  reason: collision with root package name */
    public final long f39814b;

    /* renamed from: c  reason: collision with root package name */
    public final ReadWriteLock f39815c = new ReentrantReadWriteLock();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedList<a<TKey, TValue>> f39816d = new LinkedList<>();

    public static class a<TKey, TValue> {

        /* renamed from: a  reason: collision with root package name */
        public final TKey f39817a;

        /* renamed from: b  reason: collision with root package name */
        public final TValue f39818b;

        /* renamed from: c  reason: collision with root package name */
        public final long f39819c;

        public a(TKey tkey, TValue tvalue, long j) {
            this.f39817a = tkey;
            this.f39818b = tvalue;
            this.f39819c = j;
        }
    }

    public q(long j) {
        this.f39814b = j;
    }

    public final TValue a(@NonNull TKey tkey) {
        TValue tvalue;
        a aVar;
        if (PatchProxy.isSupport(new Object[]{tkey}, this, f39813a, false, 32420, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{tkey}, this, f39813a, false, 32420, new Class[]{Object.class}, Object.class);
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f39815c.readLock().lock();
        try {
            Iterator it2 = this.f39816d.iterator();
            do {
                tvalue = null;
                if (it2.hasNext()) {
                    aVar = (a) it2.next();
                } else {
                    this.f39815c.readLock().unlock();
                    return null;
                }
            } while (!tkey.equals(aVar.f39817a));
            if (aVar.f39819c >= currentTimeMillis) {
                tvalue = aVar.f39818b;
            }
            return tvalue;
        } finally {
            this.f39815c.readLock().unlock();
        }
    }
}
