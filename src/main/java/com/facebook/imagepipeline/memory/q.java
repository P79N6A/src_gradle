package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.a;
import com.facebook.common.memory.b;
import com.facebook.imagepipeline.memory.a;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class q extends a<byte[]> implements a {
    private final int[] g;

    /* access modifiers changed from: protected */
    public final int c(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new byte[i];
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(Object obj) {
        Preconditions.checkNotNull((byte[]) obj);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ int b(Object obj) {
        byte[] bArr = (byte[]) obj;
        Preconditions.checkNotNull(bArr);
        return bArr.length;
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

    public q(b bVar, af afVar, ag agVar) {
        super(bVar, afVar, agVar);
        SparseIntArray sparseIntArray = afVar.bucketSizes;
        this.g = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.g[i] = sparseIntArray.keyAt(i);
        }
        a();
    }
}
