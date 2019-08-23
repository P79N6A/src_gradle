package org.msgpack.a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;

public final class g extends c {

    /* renamed from: e  reason: collision with root package name */
    private LinkedList<a> f84191e = new LinkedList<>();

    /* renamed from: f  reason: collision with root package name */
    private int f84192f;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final byte[] f84193a;

        /* renamed from: b  reason: collision with root package name */
        final int f84194b;

        /* renamed from: c  reason: collision with root package name */
        final int f84195c;

        a(byte[] bArr, int i, int i2) {
            this.f84193a = bArr;
            this.f84194b = i;
            this.f84195c = i2;
        }
    }

    public final void close() {
    }

    public final /* bridge */ /* synthetic */ void flush() throws IOException {
        super.flush();
    }

    public final byte[] a() {
        byte[] bArr = new byte[(this.f84192f + this.f84183b)];
        Iterator it2 = this.f84191e.iterator();
        int i = 0;
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            System.arraycopy(aVar.f84193a, aVar.f84194b, bArr, i, aVar.f84195c);
            i += aVar.f84195c;
        }
        if (this.f84183b > 0) {
            System.arraycopy(this.f84182a, 0, bArr, i, this.f84183b);
        }
        return bArr;
    }

    public final /* bridge */ /* synthetic */ void a(byte b2) throws IOException {
        super.a(b2);
    }

    public g(int i) {
        super(i);
    }

    public final /* bridge */ /* synthetic */ void a(ByteBuffer byteBuffer) throws IOException {
        super.a(byteBuffer);
    }

    public final /* bridge */ /* synthetic */ void a(byte b2, byte b3) throws IOException {
        super.a(b2, b3);
    }

    public final /* bridge */ /* synthetic */ void a(byte b2, double d2) throws IOException {
        super.a(b2, d2);
    }

    public final /* bridge */ /* synthetic */ void a(byte b2, float f2) throws IOException {
        super.a(b2, f2);
    }

    public final /* bridge */ /* synthetic */ void a(byte b2, int i) throws IOException {
        super.a(b2, i);
    }

    public final /* bridge */ /* synthetic */ void a(byte b2, long j) throws IOException {
        super.a(b2, j);
    }

    public final /* bridge */ /* synthetic */ void a(byte b2, short s) throws IOException {
        super.a(b2, s);
    }

    /* access modifiers changed from: protected */
    public final boolean b(byte[] bArr, int i, int i2) {
        this.f84191e.add(new a(bArr, i, i2));
        this.f84192f += i2;
        return false;
    }

    public final /* bridge */ /* synthetic */ void a(byte[] bArr, int i, int i2) throws IOException {
        super.a(bArr, i, i2);
    }
}
