package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.infer.annotation.ThreadSafe;
import java.util.LinkedList;
import javax.annotation.Nullable;

@ThreadSafe
public final class g<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final SparseArray<a<T>> f23969a = new SparseArray<>();
    @VisibleForTesting
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    a<T> f23970b;
    @VisibleForTesting
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    a<T> f23971c;

    @VisibleForTesting
    static class a<I> {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        a<I> f23972a;

        /* renamed from: b  reason: collision with root package name */
        int f23973b;

        /* renamed from: c  reason: collision with root package name */
        LinkedList<I> f23974c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        a<I> f23975d;

        public final String toString() {
            return "LinkedEntry(key: " + this.f23973b + ")";
        }

        private a(@Nullable a<I> aVar, int i, LinkedList<I> linkedList, @Nullable a<I> aVar2) {
            this.f23972a = aVar;
            this.f23973b = i;
            this.f23974c = linkedList;
            this.f23975d = aVar2;
        }

        /* synthetic */ a(a aVar, int i, LinkedList linkedList, a aVar2, byte b2) {
            this(null, i, linkedList, null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        return r1;
     */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized T removeFromEnd() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.facebook.imagepipeline.memory.g$a<T> r0 = r3.f23971c     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0008
            r0 = 0
            monitor-exit(r3)
            return r0
        L_0x0008:
            java.util.LinkedList<I> r1 = r0.f23974c     // Catch:{ all -> 0x0024 }
            java.lang.Object r1 = r1.pollLast()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            java.util.LinkedList<I> r2 = r0.f23974c     // Catch:{ all -> 0x0024 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x0022
            r3.a(r0)     // Catch:{ all -> 0x0024 }
            android.util.SparseArray<com.facebook.imagepipeline.memory.g$a<T>> r2 = r3.f23969a     // Catch:{ all -> 0x0024 }
            int r0 = r0.f23973b     // Catch:{ all -> 0x0024 }
            r2.remove(r0)     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r3)
            return r1
        L_0x0024:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.g.removeFromEnd():java.lang.Object");
    }

    private void b(a<T> aVar) {
        if (this.f23970b != aVar) {
            a(aVar);
            if (this.f23970b == null) {
                this.f23970b = aVar;
                this.f23971c = aVar;
                return;
            }
            aVar.f23975d = this.f23970b;
            this.f23970b.f23972a = aVar;
            this.f23970b = aVar;
        }
    }

    @Nullable
    public final synchronized T acquire(int i) {
        a aVar = this.f23969a.get(i);
        if (aVar == null) {
            return null;
        }
        T pollFirst = aVar.f23974c.pollFirst();
        b(aVar);
        return pollFirst;
    }

    private synchronized void a(a<T> aVar) {
        a<I> aVar2 = aVar.f23972a;
        a<I> aVar3 = aVar.f23975d;
        if (aVar2 != null) {
            aVar2.f23975d = aVar3;
        }
        if (aVar3 != null) {
            aVar3.f23972a = aVar2;
        }
        aVar.f23972a = null;
        aVar.f23975d = null;
        if (aVar == this.f23970b) {
            this.f23970b = aVar3;
        }
        if (aVar == this.f23971c) {
            this.f23971c = aVar2;
        }
    }

    public final synchronized void release(int i, T t) {
        a aVar = this.f23969a.get(i);
        if (aVar == null) {
            aVar = new a(null, i, new LinkedList(), null, (byte) 0);
            this.f23969a.put(i, aVar);
        }
        aVar.f23974c.addLast(t);
        b(aVar);
    }
}
