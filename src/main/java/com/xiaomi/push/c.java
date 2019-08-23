package com.xiaomi.push;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f81881a;

    /* renamed from: a  reason: collision with other field name */
    private final OutputStream f206a;

    /* renamed from: a  reason: collision with other field name */
    private final byte[] f207a;

    /* renamed from: b  reason: collision with root package name */
    private int f81882b;

    public static class a extends IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private c(OutputStream outputStream, byte[] bArr) {
        this.f206a = outputStream;
        this.f207a = bArr;
        this.f81881a = bArr.length;
    }

    private c(byte[] bArr, int i, int i2) {
        this.f207a = bArr;
        this.f81882b = i;
        this.f81881a = i + i2;
    }

    public static int a(int i) {
        if (i >= 0) {
            return d(i);
        }
        return 10;
    }

    public static int a(int i, int i2) {
        return c(i) + a(i2);
    }

    public static int a(int i, long j) {
        return c(i) + a(j);
    }

    public static int a(int i, a aVar) {
        return c(i) + a(aVar);
    }

    public static int a(int i, e eVar) {
        return c(i) + a(eVar);
    }

    public static int a(int i, String str) {
        return c(i) + a(str);
    }

    public static int a(int i, boolean z) {
        return c(i) + a(z);
    }

    public static int a(long j) {
        return c(j);
    }

    public static int a(a aVar) {
        return d(aVar.a()) + aVar.a();
    }

    public static int a(e eVar) {
        int b2 = eVar.b();
        return b2 + d(b2);
    }

    public static int a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return bytes.length + d(bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public static int a(boolean z) {
        return 1;
    }

    public static c a(OutputStream outputStream) {
        return a(outputStream, 4096);
    }

    public static c a(OutputStream outputStream, int i) {
        return new c(outputStream, new byte[i]);
    }

    public static c a(byte[] bArr, int i, int i2) {
        return new c(bArr, i, i2);
    }

    public static int b(int i) {
        return d(i);
    }

    public static int b(int i, int i2) {
        return c(i) + b(i2);
    }

    public static int b(int i, long j) {
        return c(i) + b(j);
    }

    public static int b(long j) {
        return c(j);
    }

    public static int c(int i) {
        return d(f.a(i, 0));
    }

    public static int c(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    private void c() {
        if (this.f206a != null) {
            this.f206a.write(this.f207a, 0, this.f81882b);
            this.f81882b = 0;
            return;
        }
        throw new a();
    }

    public static int d(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public final int a() {
        if (this.f206a == null) {
            return this.f81881a - this.f81882b;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m136a() {
        if (this.f206a != null) {
            c();
        }
    }

    public final void a(byte b2) {
        if (this.f81882b == this.f81881a) {
            c();
        }
        byte[] bArr = this.f207a;
        int i = this.f81882b;
        this.f81882b = i + 1;
        bArr[i] = b2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m137a(int i) {
        if (i >= 0) {
            d(i);
        } else {
            c((long) i);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m138a(int i, int i2) {
        c(i, 0);
        a(i2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m139a(int i, long j) {
        c(i, 0);
        a(j);
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m140a(int i, a aVar) {
        c(i, 2);
        a(aVar);
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m141a(int i, e eVar) {
        c(i, 2);
        a(eVar);
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m142a(int i, String str) {
        c(i, 2);
        a(str);
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m143a(int i, boolean z) {
        c(i, 0);
        a(z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m144a(long j) {
        c(j);
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m145a(a aVar) {
        byte[] a2 = aVar.a();
        d(a2.length);
        a(a2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m146a(e eVar) {
        d(eVar.a());
        eVar.a(this);
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m147a(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        d(bytes.length);
        a(bytes);
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m148a(boolean z) {
        c(z ? 1 : 0);
    }

    public final void a(byte[] bArr) {
        a(bArr, 0, bArr.length);
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m149a(byte[] bArr, int i, int i2) {
        if (this.f81881a - this.f81882b >= i2) {
            System.arraycopy(bArr, i, this.f207a, this.f81882b, i2);
            this.f81882b += i2;
            return;
        }
        int i3 = this.f81881a - this.f81882b;
        System.arraycopy(bArr, i, this.f207a, this.f81882b, i3);
        int i4 = i + i3;
        int i5 = i2 - i3;
        this.f81882b = this.f81881a;
        c();
        if (i5 <= this.f81881a) {
            System.arraycopy(bArr, i4, this.f207a, 0, i5);
            this.f81882b = i5;
            return;
        }
        this.f206a.write(bArr, i4, i5);
    }

    public final void b() {
        if (a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public final void m150b(int i) {
        d(i);
    }

    /* renamed from: b  reason: collision with other method in class */
    public final void m151b(int i, int i2) {
        c(i, 0);
        b(i2);
    }

    /* renamed from: b  reason: collision with other method in class */
    public final void m152b(int i, long j) {
        c(i, 0);
        b(j);
    }

    /* renamed from: b  reason: collision with other method in class */
    public final void m153b(long j) {
        c(j);
    }

    /* renamed from: c  reason: collision with other method in class */
    public final void m154c(int i) {
        a((byte) i);
    }

    public final void c(int i, int i2) {
        d(f.a(i, i2));
    }

    /* renamed from: c  reason: collision with other method in class */
    public final void m155c(long j) {
        while ((-128 & j) != 0) {
            c((((int) j) & 127) | SearchJediMixFeedAdapter.f42517f);
            j >>>= 7;
        }
        c((int) j);
    }

    /* renamed from: d  reason: collision with other method in class */
    public final void m156d(int i) {
        while ((i & -128) != 0) {
            c((i & 127) | SearchJediMixFeedAdapter.f42517f);
            i >>>= 7;
        }
        c(i);
    }
}
