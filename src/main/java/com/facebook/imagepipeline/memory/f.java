package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import java.util.LinkedList;
import java.util.Queue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@VisibleForTesting
@NotThreadSafe
public class f<V> {

    /* renamed from: a  reason: collision with root package name */
    final Queue f23967a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f23968b;
    public int mInUseLength;
    public final int mItemSize;
    public final int mMaxLength;

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f23967a.size();
    }

    public void incrementInUseCount() {
        this.mInUseLength++;
    }

    @Nullable
    public V pop() {
        return this.f23967a.poll();
    }

    @Deprecated
    @Nullable
    public V get() {
        V pop = pop();
        if (pop != null) {
            this.mInUseLength++;
        }
        return pop;
    }

    public boolean isMaxLengthExceeded() {
        if (this.mInUseLength + a() > this.mMaxLength) {
            return true;
        }
        return false;
    }

    public void decrementInUseCount() {
        boolean z;
        if (this.mInUseLength > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        this.mInUseLength--;
    }

    /* access modifiers changed from: package-private */
    public void a(V v) {
        this.f23967a.add(v);
    }

    public void release(V v) {
        Preconditions.checkNotNull(v);
        boolean z = false;
        if (this.f23968b) {
            if (this.mInUseLength > 0) {
                z = true;
            }
            Preconditions.checkState(z);
            this.mInUseLength--;
            a(v);
        } else if (this.mInUseLength > 0) {
            this.mInUseLength--;
            a(v);
        } else {
            FLog.e("BUCKET", "Tried to release value %s from an empty bucket!", v);
        }
    }

    public f(int i, int i2, int i3, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkState(z2);
        if (i2 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Preconditions.checkState(z3);
        Preconditions.checkState(i3 >= 0 ? true : z4);
        this.mItemSize = i;
        this.mMaxLength = i2;
        this.f23967a = new LinkedList();
        this.mInUseLength = i3;
        this.f23968b = z;
    }
}
