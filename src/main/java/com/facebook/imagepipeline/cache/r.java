package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.e;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f23885a = r.class;
    @GuardedBy

    /* renamed from: b  reason: collision with root package name */
    private Map<CacheKey, b> f23886b = new HashMap();

    public static r getInstance() {
        return new r();
    }

    private r() {
    }

    private synchronized void a() {
        FLog.v(f23885a, "Count = %d", (Object) Integer.valueOf(this.f23886b.size()));
    }

    public void clearAll() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f23886b.values());
            this.f23886b.clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            b bVar = (b) arrayList.get(i);
            if (bVar != null) {
                bVar.close();
            }
        }
    }

    public boolean remove(CacheKey cacheKey) {
        b remove;
        Preconditions.checkNotNull(cacheKey);
        synchronized (this) {
            remove = this.f23886b.remove(cacheKey);
        }
        if (remove == null) {
            return false;
        }
        try {
            return remove.isValid();
        } finally {
            remove.close();
        }
    }

    public synchronized boolean containsKey(CacheKey cacheKey) {
        Preconditions.checkNotNull(cacheKey);
        if (!this.f23886b.containsKey(cacheKey)) {
            return false;
        }
        b bVar = this.f23886b.get(cacheKey);
        synchronized (bVar) {
            if (b.isValid(bVar)) {
                return true;
            }
            this.f23886b.remove(cacheKey);
            FLog.w(f23885a, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(bVar)), cacheKey.getUriString(), Integer.valueOf(System.identityHashCode(cacheKey)));
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.facebook.imagepipeline.image.b get(com.facebook.cache.common.CacheKey r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.facebook.common.internal.Preconditions.checkNotNull(r7)     // Catch:{ all -> 0x0051 }
            java.util.Map<com.facebook.cache.common.CacheKey, com.facebook.imagepipeline.image.b> r0 = r6.f23886b     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x0051 }
            com.facebook.imagepipeline.image.b r0 = (com.facebook.imagepipeline.image.b) r0     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x004e
            monitor-enter(r0)     // Catch:{ all -> 0x0051 }
            boolean r1 = com.facebook.imagepipeline.image.b.isValid(r0)     // Catch:{ all -> 0x004b }
            if (r1 != 0) goto L_0x0045
            java.util.Map<com.facebook.cache.common.CacheKey, com.facebook.imagepipeline.image.b> r1 = r6.f23886b     // Catch:{ all -> 0x004b }
            r1.remove(r7)     // Catch:{ all -> 0x004b }
            java.lang.Class<?> r1 = f23885a     // Catch:{ all -> 0x004b }
            java.lang.String r2 = "Found closed reference %d for key %s (%d)"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x004b }
            r4 = 0
            int r5 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x004b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x004b }
            r3[r4] = r5     // Catch:{ all -> 0x004b }
            r4 = 1
            java.lang.String r5 = r7.getUriString()     // Catch:{ all -> 0x004b }
            r3[r4] = r5     // Catch:{ all -> 0x004b }
            r4 = 2
            int r7 = java.lang.System.identityHashCode(r7)     // Catch:{ all -> 0x004b }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x004b }
            r3[r4] = r7     // Catch:{ all -> 0x004b }
            com.facebook.common.logging.FLog.w((java.lang.Class<?>) r1, (java.lang.String) r2, (java.lang.Object[]) r3)     // Catch:{ all -> 0x004b }
            r7 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            monitor-exit(r6)
            return r7
        L_0x0045:
            com.facebook.imagepipeline.image.b r7 = com.facebook.imagepipeline.image.b.cloneOrNull(r0)     // Catch:{ all -> 0x004b }
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            throw r7     // Catch:{ all -> 0x0051 }
        L_0x004e:
            r7 = r0
        L_0x004f:
            monitor-exit(r6)
            return r7
        L_0x0051:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.cache.r.get(com.facebook.cache.common.CacheKey):com.facebook.imagepipeline.image.b");
    }

    public synchronized void put(CacheKey cacheKey, b bVar) {
        Preconditions.checkNotNull(cacheKey);
        Preconditions.checkArgument(b.isValid(bVar));
        b.closeSafely(this.f23886b.put(cacheKey, b.cloneOrNull(bVar)));
        a();
    }

    /* JADX INFO: finally extract failed */
    public synchronized boolean remove(CacheKey cacheKey, b bVar) {
        Preconditions.checkNotNull(cacheKey);
        Preconditions.checkNotNull(bVar);
        Preconditions.checkArgument(b.isValid(bVar));
        b bVar2 = this.f23886b.get(cacheKey);
        if (bVar2 == null) {
            return false;
        }
        CloseableReference<e> byteBufferRef = bVar2.getByteBufferRef();
        CloseableReference<e> byteBufferRef2 = bVar.getByteBufferRef();
        if (!(byteBufferRef == null || byteBufferRef2 == null)) {
            try {
                if (byteBufferRef.get() == byteBufferRef2.get()) {
                    this.f23886b.remove(cacheKey);
                    CloseableReference.closeSafely(byteBufferRef2);
                    CloseableReference.closeSafely(byteBufferRef);
                    b.closeSafely(bVar2);
                    a();
                    return true;
                }
            } catch (Throwable th) {
                CloseableReference.closeSafely(byteBufferRef2);
                CloseableReference.closeSafely(byteBufferRef);
                b.closeSafely(bVar2);
                throw th;
            }
        }
        CloseableReference.closeSafely(byteBufferRef2);
        CloseableReference.closeSafely(byteBufferRef);
        b.closeSafely(bVar2);
        return false;
    }
}
