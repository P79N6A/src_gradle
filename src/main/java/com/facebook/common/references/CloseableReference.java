package com.facebook.common.references;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.internal.c;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.PropagatesNullable;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class CloseableReference<T> implements Closeable, Cloneable {
    private static final b<Closeable> DEFAULT_CLOSEABLE_RELEASER = new b<Closeable>() {
        public final /* synthetic */ void release(Object obj) {
            try {
                c.a((Closeable) obj, true);
            } catch (IOException unused) {
            }
        }
    };
    private static Class<CloseableReference> TAG = CloseableReference.class;
    @GuardedBy
    private boolean mIsClosed;
    private final c<T> mSharedReference;

    @VisibleForTesting
    public final synchronized c<T> getUnderlyingReferenceTestOnly() {
        return this.mSharedReference;
    }

    public final synchronized CloseableReference<T> clone() {
        Preconditions.checkState(isValid());
        return new CloseableReference<>(this.mSharedReference);
    }

    @Nullable
    public final synchronized CloseableReference<T> cloneOrNull() {
        if (!isValid()) {
            return null;
        }
        return clone();
    }

    public final synchronized T get() {
        Preconditions.checkState(!this.mIsClosed);
        return this.mSharedReference.a();
    }

    public final int getValueHash() {
        if (isValid()) {
            return System.identityHashCode(this.mSharedReference.a());
        }
        return 0;
    }

    public final synchronized boolean isValid() {
        boolean z;
        if (!this.mIsClosed) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1 = r0.f23552a;
        r0.f23552a = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        r0.f23553b.release(r1);
        com.facebook.common.references.c.a((java.lang.Object) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        r0 = r3.mSharedReference;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r0.c() != 0) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.mIsClosed     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            return
        L_0x0007:
            r0 = 1
            r3.mIsClosed = r0     // Catch:{ all -> 0x0027 }
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            com.facebook.common.references.c<T> r0 = r3.mSharedReference
            int r1 = r0.c()
            if (r1 != 0) goto L_0x0026
            monitor-enter(r0)
            T r1 = r0.f23552a     // Catch:{ all -> 0x0023 }
            r2 = 0
            r0.f23552a = r2     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            com.facebook.common.references.b<T> r0 = r0.f23553b
            r0.release(r1)
            com.facebook.common.references.c.a((java.lang.Object) r1)
            goto L_0x0026
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        L_0x0026:
            return
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.references.CloseableReference.close():void");
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.mIsClosed) {
                    super.finalize();
                    return;
                }
                FLog.w(TAG, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.mSharedReference)), this.mSharedReference.a().getClass().getName());
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public static void closeSafely(@Nullable CloseableReference<?> closeableReference) {
        if (closeableReference != null) {
            closeableReference.close();
        }
    }

    private CloseableReference(c<T> cVar) {
        this.mSharedReference = (c) Preconditions.checkNotNull(cVar);
        cVar.b();
    }

    @Nullable
    public static <T> CloseableReference<T> cloneOrNull(@Nullable CloseableReference<T> closeableReference) {
        if (closeableReference != null) {
            return closeableReference.cloneOrNull();
        }
        return null;
    }

    public static boolean isValid(@Nullable CloseableReference<?> closeableReference) {
        if (closeableReference == null || !closeableReference.isValid()) {
            return false;
        }
        return true;
    }

    public static <T extends Closeable> CloseableReference<T> of(@PropagatesNullable T t) {
        if (t == null) {
            return null;
        }
        return new CloseableReference<>(t, DEFAULT_CLOSEABLE_RELEASER);
    }

    public static void closeSafely(@Nullable Iterable<? extends CloseableReference<?>> iterable) {
        if (iterable != null) {
            for (CloseableReference closeSafely : iterable) {
                closeSafely(closeSafely);
            }
        }
    }

    public static <T> List<CloseableReference<T>> cloneOrNull(@PropagatesNullable Collection<CloseableReference<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (CloseableReference<T> cloneOrNull : collection) {
            arrayList.add(cloneOrNull(cloneOrNull));
        }
        return arrayList;
    }

    private CloseableReference(T t, b<T> bVar) {
        this.mSharedReference = new c<>(t, bVar);
    }

    public static <T> CloseableReference<T> of(@PropagatesNullable T t, b<T> bVar) {
        if (t == null) {
            return null;
        }
        return new CloseableReference<>(t, bVar);
    }
}
