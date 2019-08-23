package com.facebook.imagepipeline.cache;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.internal.i;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.memory.MemoryTrimmable;
import com.facebook.common.references.CloseableReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class g<K, V> implements MemoryTrimmable, n<K, V> {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    static final long f23869a = TimeUnit.MINUTES.toMillis(5);
    @GuardedBy
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    final f<K, b<K, V>> f23870b;
    @GuardedBy
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    final f<K, b<K, V>> f23871c;
    @GuardedBy
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    final Map<Bitmap, Object> f23872d = new WeakHashMap();
    @GuardedBy

    /* renamed from: e  reason: collision with root package name */
    protected MemoryCacheParams f23873e;

    /* renamed from: f  reason: collision with root package name */
    private final s<V> f23874f;
    private final a g;
    private final Supplier<MemoryCacheParams> h;
    @GuardedBy
    private long i;

    public interface a {
        double getTrimRatio(MemoryTrimType memoryTrimType);
    }

    @VisibleForTesting
    static class b<K, V> {
        public int clientCount = 0;
        public boolean isOrphan = false;
        public final K key;
        @Nullable
        public final c<K> observer;
        public final CloseableReference<V> valueRef;

        b(K k, CloseableReference<V> closeableReference, @Nullable c<K> cVar) {
            this.key = Preconditions.checkNotNull(k);
            this.valueRef = (CloseableReference) Preconditions.checkNotNull(CloseableReference.cloneOrNull(closeableReference));
            this.observer = cVar;
        }
    }

    public interface c<K> {
        void onExclusivityChanged(K k, boolean z);
    }

    public void clear() {
        ArrayList clear;
        ArrayList clear2;
        synchronized (this) {
            clear = this.f23870b.clear();
            clear2 = this.f23871c.clear();
            c(clear2);
        }
        a(clear2);
        b(clear);
        a();
    }

    public synchronized int getInUseCount() {
        return this.f23871c.getCount() - this.f23870b.getCount();
    }

    public synchronized int getInUseSizeInBytes() {
        return this.f23871c.getSizeInBytes() - this.f23870b.getSizeInBytes();
    }

    private synchronized void a() {
        if (this.i + f23869a <= SystemClock.uptimeMillis()) {
            this.i = SystemClock.uptimeMillis();
            this.f23873e = (MemoryCacheParams) this.h.get();
        }
    }

    private void b() {
        ArrayList a2;
        synchronized (this) {
            a2 = a(Math.min(this.f23873e.maxEvictionQueueEntries, this.f23873e.maxCacheEntries - getInUseCount()), Math.min(this.f23873e.maxEvictionQueueSize, this.f23873e.maxCacheSize - getInUseSizeInBytes()));
            c(a2);
        }
        a(a2);
        b(a2);
    }

    private s<b<K, V>> a(final s<V> sVar) {
        return new s<b<K, V>>() {
            public final int getSizeInBytes(b<K, V> bVar) {
                return sVar.getSizeInBytes(bVar.valueRef.get());
            }
        };
    }

    private static <K, V> void c(@Nullable b<K, V> bVar) {
        if (bVar != null && bVar.observer != null) {
            bVar.observer.onExclusivityChanged(bVar.key, false);
        }
    }

    public synchronized boolean contains(K k) {
        return this.f23871c.contains(k);
    }

    private synchronized CloseableReference<V> a(final b<K, V> bVar) {
        e(bVar);
        return CloseableReference.of(bVar.valueRef.get(), new com.facebook.common.references.b<V>() {
            public final void release(V v) {
                g.this.releaseClientReference(bVar);
            }
        });
    }

    private static void b(@Nullable ArrayList<b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<b<K, V>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c(it2.next());
            }
        }
    }

    private synchronized void c(@Nullable ArrayList<b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<b<K, V>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                d(it2.next());
            }
        }
    }

    private synchronized void d(b<K, V> bVar) {
        Preconditions.checkNotNull(bVar);
        Preconditions.checkState(!bVar.isOrphan);
        bVar.isOrphan = true;
    }

    private synchronized void e(b<K, V> bVar) {
        Preconditions.checkNotNull(bVar);
        Preconditions.checkState(!bVar.isOrphan);
        bVar.clientCount++;
    }

    private synchronized void f(b<K, V> bVar) {
        boolean z;
        Preconditions.checkNotNull(bVar);
        if (bVar.clientCount > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        bVar.clientCount--;
    }

    @Nullable
    private synchronized CloseableReference<V> g(b<K, V> bVar) {
        Preconditions.checkNotNull(bVar);
        if (!bVar.isOrphan || bVar.clientCount != 0) {
            return null;
        }
        return bVar.valueRef;
    }

    public synchronized boolean contains(i<K> iVar) {
        boolean z;
        if (!this.f23871c.getMatchingEntries(iVar).isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    @Nullable
    public CloseableReference<V> get(K k) {
        b bVar;
        CloseableReference<V> closeableReference;
        Preconditions.checkNotNull(k);
        synchronized (this) {
            bVar = (b) this.f23870b.remove(k);
            b bVar2 = (b) this.f23871c.get(k);
            if (bVar2 != null) {
                closeableReference = a(bVar2);
            } else {
                closeableReference = null;
            }
        }
        c(bVar);
        a();
        b();
        return closeableReference;
    }

    public void releaseClientReference(b<K, V> bVar) {
        boolean b2;
        CloseableReference g2;
        Preconditions.checkNotNull(bVar);
        synchronized (this) {
            f(bVar);
            b2 = b(bVar);
            g2 = g(bVar);
        }
        CloseableReference.closeSafely(g2);
        if (!b2) {
            bVar = null;
        }
        if (!(bVar == null || bVar.observer == null)) {
            bVar.observer.onExclusivityChanged(bVar.key, true);
        }
        a();
        b();
    }

    public int removeAll(i<K> iVar) {
        ArrayList removeAll;
        ArrayList removeAll2;
        synchronized (this) {
            removeAll = this.f23870b.removeAll(iVar);
            removeAll2 = this.f23871c.removeAll(iVar);
            c(removeAll2);
        }
        a(removeAll2);
        b(removeAll);
        a();
        b();
        return removeAll2.size();
    }

    public int removeAllForExclusive(i<K> iVar) {
        ArrayList removeAll;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            removeAll = this.f23870b.removeAll(iVar);
            for (int i2 = 0; i2 < removeAll.size(); i2++) {
                arrayList.add(this.f23871c.remove(((b) removeAll.get(i2)).key));
            }
        }
        a(arrayList);
        b(removeAll);
        a();
        b();
        return arrayList.size();
    }

    @Nullable
    public CloseableReference<V> reuse(K k) {
        b bVar;
        boolean z;
        CloseableReference<V> closeableReference;
        Preconditions.checkNotNull(k);
        synchronized (this) {
            bVar = (b) this.f23870b.remove(k);
            z = true;
            boolean z2 = false;
            if (bVar != null) {
                b bVar2 = (b) this.f23871c.remove(k);
                Preconditions.checkNotNull(bVar2);
                if (bVar2.clientCount == 0) {
                    z2 = true;
                }
                Preconditions.checkState(z2);
                closeableReference = bVar2.valueRef;
            } else {
                closeableReference = null;
                z = false;
            }
        }
        if (z) {
            c(bVar);
        }
        return closeableReference;
    }

    public void trim(MemoryTrimType memoryTrimType) {
        ArrayList a2;
        double trimRatio = this.g.getTrimRatio(memoryTrimType);
        synchronized (this) {
            double sizeInBytes = (double) this.f23871c.getSizeInBytes();
            Double.isNaN(sizeInBytes);
            a2 = a(Integer.MAX_VALUE, Math.max(0, ((int) (sizeInBytes * (1.0d - trimRatio))) - getInUseSizeInBytes()));
            c(a2);
        }
        a(a2);
        b(a2);
        a();
        b();
    }

    private synchronized boolean b(b<K, V> bVar) {
        if (bVar.isOrphan || bVar.clientCount != 0) {
            return false;
        }
        this.f23870b.put(bVar.key, bVar);
        return true;
    }

    private void a(@Nullable ArrayList<b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<b<K, V>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                CloseableReference.closeSafely(g(it2.next()));
            }
        }
    }

    private synchronized boolean a(V v) {
        int sizeInBytes = this.f23874f.getSizeInBytes(v);
        if (sizeInBytes > this.f23873e.maxCacheEntrySize || getInUseCount() > this.f23873e.maxCacheEntries - 1 || getInUseSizeInBytes() > this.f23873e.maxCacheSize - sizeInBytes) {
            return false;
        }
        return true;
    }

    public CloseableReference<V> cache(K k, CloseableReference<V> closeableReference) {
        return cache(k, closeableReference, null);
    }

    @Nullable
    private synchronized ArrayList<b<K, V>> a(int i2, int i3) {
        int max = Math.max(i2, 0);
        int max2 = Math.max(i3, 0);
        if (this.f23870b.getCount() <= max && this.f23870b.getSizeInBytes() <= max2) {
            return null;
        }
        ArrayList<b<K, V>> arrayList = new ArrayList<>();
        while (true) {
            if (this.f23870b.getCount() <= max && this.f23870b.getSizeInBytes() <= max2) {
                return arrayList;
            }
            Object firstKey = this.f23870b.getFirstKey();
            this.f23870b.remove(firstKey);
            arrayList.add(this.f23871c.remove(firstKey));
        }
    }

    public g(s<V> sVar, a aVar, Supplier<MemoryCacheParams> supplier) {
        this.f23874f = sVar;
        this.f23870b = new f<>(a(sVar));
        this.f23871c = new f<>(a(sVar));
        this.g = aVar;
        this.h = supplier;
        this.f23873e = (MemoryCacheParams) this.h.get();
        this.i = SystemClock.uptimeMillis();
    }

    public CloseableReference<V> cache(K k, CloseableReference<V> closeableReference, c<K> cVar) {
        b bVar;
        CloseableReference<V> closeableReference2;
        CloseableReference closeableReference3;
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(closeableReference);
        a();
        synchronized (this) {
            bVar = (b) this.f23870b.remove(k);
            b bVar2 = (b) this.f23871c.remove(k);
            closeableReference2 = null;
            if (bVar2 != null) {
                d(bVar2);
                closeableReference3 = g(bVar2);
            } else {
                closeableReference3 = null;
            }
            if (a((V) closeableReference.get())) {
                b bVar3 = new b(k, closeableReference, cVar);
                this.f23871c.put(k, bVar3);
                closeableReference2 = a(bVar3);
            }
        }
        CloseableReference.closeSafely(closeableReference3);
        c(bVar);
        b();
        return closeableReference2;
    }
}
