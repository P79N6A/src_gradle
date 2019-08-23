package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.b;
import com.facebook.imagepipeline.memory.a;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public abstract class u extends a<t> {
    final int[] g;

    /* access modifiers changed from: protected */
    public final int c(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract t a(int i);

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(Object obj) {
        t tVar = (t) obj;
        Preconditions.checkNotNull(tVar);
        tVar.close();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ int b(Object obj) {
        t tVar = (t) obj;
        Preconditions.checkNotNull(tVar);
        return tVar.getSize();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ boolean c(Object obj) {
        t tVar = (t) obj;
        Preconditions.checkNotNull(tVar);
        if (!tVar.isClosed()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final int b(int i) {
        if (i > 0) {
            for (int i2 : this.g) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new a.b(Integer.valueOf(i));
    }

    u(b bVar, af afVar, ag agVar) {
        super(bVar, afVar, agVar);
        SparseIntArray sparseIntArray = afVar.bucketSizes;
        this.g = new int[sparseIntArray.size()];
        for (int i = 0; i < this.g.length; i++) {
            this.g[i] = sparseIntArray.keyAt(i);
        }
        a();
    }
}
