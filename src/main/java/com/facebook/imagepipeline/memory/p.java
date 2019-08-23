package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.b;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public final class p {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    final a f23980a;

    /* renamed from: b  reason: collision with root package name */
    private final b<byte[]> f23981b;

    @VisibleForTesting
    static class a extends q {
        /* access modifiers changed from: package-private */
        public final f<byte[]> d(int i) {
            return new ab(c(i), this.f23944b.maxNumThreads, 0);
        }

        public a(com.facebook.common.memory.b bVar, af afVar, ag agVar) {
            super(bVar, afVar, agVar);
        }
    }

    public final void release(byte[] bArr) {
        this.f23980a.release(bArr);
    }

    public final CloseableReference<byte[]> get(int i) {
        return CloseableReference.of(this.f23980a.get(i), this.f23981b);
    }

    public p(com.facebook.common.memory.b bVar, af afVar) {
        boolean z;
        if (afVar.maxNumThreads > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f23980a = new a(bVar, afVar, aa.getInstance());
        this.f23981b = new b<byte[]>() {
            public final void release(byte[] bArr) {
                p.this.release(bArr);
            }
        };
    }
}
