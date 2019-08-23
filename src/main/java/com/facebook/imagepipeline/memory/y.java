package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.h;
import com.facebook.common.references.CloseableReference;
import java.io.IOException;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public final class y extends h {

    /* renamed from: a  reason: collision with root package name */
    private final u f23994a;

    /* renamed from: b  reason: collision with root package name */
    private CloseableReference<t> f23995b;

    /* renamed from: c  reason: collision with root package name */
    private int f23996c;

    public static class a extends RuntimeException {
        public a() {
            super("OutputStream no longer valid");
        }
    }

    public final int size() {
        return this.f23996c;
    }

    private void a() {
        if (!CloseableReference.isValid(this.f23995b)) {
            throw new a();
        }
    }

    public final void close() {
        CloseableReference.closeSafely(this.f23995b);
        this.f23995b = null;
        this.f23996c = -1;
        super.close();
    }

    public final w toByteBuffer() {
        a();
        return new w(this.f23995b, this.f23996c);
    }

    public y(u uVar) {
        this(uVar, uVar.g[0]);
    }

    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    public y(u uVar, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f23994a = (u) Preconditions.checkNotNull(uVar);
        this.f23996c = 0;
        this.f23995b = CloseableReference.of(this.f23994a.get(i), this.f23994a);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        a();
        int i3 = this.f23996c + i2;
        a();
        if (i3 > ((t) this.f23995b.get()).getSize()) {
            t tVar = (t) this.f23994a.get(i3);
            ((t) this.f23995b.get()).copy(0, tVar, 0, this.f23996c);
            this.f23995b.close();
            this.f23995b = CloseableReference.of(tVar, this.f23994a);
        }
        ((t) this.f23995b.get()).write(this.f23996c, bArr, i, i2);
        this.f23996c += i2;
    }
}
