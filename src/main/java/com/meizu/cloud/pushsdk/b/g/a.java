package com.meizu.cloud.pushsdk.b.g;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class a implements b, c, Cloneable {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f26996c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a  reason: collision with root package name */
    i f26997a;

    /* renamed from: b  reason: collision with root package name */
    long f26998b;

    public final int a(byte[] bArr, int i, int i2) {
        n.a((long) bArr.length, (long) i, (long) i2);
        i iVar = this.f26997a;
        if (iVar == null) {
            return -1;
        }
        int min = Math.min(i2, iVar.f27020c - iVar.f27019b);
        System.arraycopy(iVar.f27018a, iVar.f27019b, bArr, i, min);
        iVar.f27019b += min;
        this.f26998b -= (long) min;
        if (iVar.f27019b == iVar.f27020c) {
            this.f26997a = iVar.a();
            j.a(iVar);
        }
        return min;
    }

    public final long a() {
        return this.f26998b;
    }

    public final long a(l lVar) throws IOException {
        if (lVar != null) {
            long j = 0;
            while (true) {
                long b2 = lVar.b(this, 2048);
                if (b2 == -1) {
                    return j;
                }
                j += b2;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public final a a(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i < 55296 || i > 57343) {
                        i2 = (i >> 12) | 224;
                    } else {
                        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                    }
                } else if (i <= 1114111) {
                    b((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | SearchJediMixFeedAdapter.f42517f;
                } else {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                }
                b(i2);
                i3 = ((i >> 6) & 63) | SearchJediMixFeedAdapter.f42517f;
            }
            b(i3);
            i = (i & 63) | SearchJediMixFeedAdapter.f42517f;
        }
        b(i);
        return this;
    }

    /* renamed from: a */
    public final a b(d dVar) {
        if (dVar != null) {
            dVar.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    /* renamed from: a */
    public final a b(String str) {
        return a(str, 0, str.length());
    }

    public final a a(String str, int i, int i2) {
        int i3;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    i c2 = c(1);
                    byte[] bArr = c2.f27018a;
                    int i4 = c2.f27020c - i;
                    int min = Math.min(i2, 2048 - i4);
                    int i5 = i + 1;
                    bArr[i + i4] = (byte) charAt;
                    while (true) {
                        i = i5;
                        if (i >= min) {
                            break;
                        }
                        char charAt2 = str.charAt(i);
                        if (charAt2 >= 128) {
                            break;
                        }
                        i5 = i + 1;
                        bArr[i + i4] = (byte) charAt2;
                    }
                    int i6 = (i4 + i) - c2.f27020c;
                    c2.f27020c += i6;
                    this.f26998b += (long) i6;
                } else {
                    if (charAt < 2048) {
                        i3 = (charAt >> 6) | 192;
                    } else if (charAt < 55296 || charAt > 57343) {
                        b((charAt >> 12) | 224);
                        i3 = ((charAt >> 6) & 63) | SearchJediMixFeedAdapter.f42517f;
                    } else {
                        int i7 = i + 1;
                        char charAt3 = i7 < i2 ? str.charAt(i7) : 0;
                        if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            b(63);
                            i = i7;
                        } else {
                            int i8 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 0;
                            b((i8 >> 18) | 240);
                            b(((i8 >> 12) & 63) | SearchJediMixFeedAdapter.f42517f);
                            b(((i8 >> 6) & 63) | SearchJediMixFeedAdapter.f42517f);
                            b((i8 & 63) | SearchJediMixFeedAdapter.f42517f);
                            i += 2;
                        }
                    }
                    b(i3);
                    b((int) (charAt & '?') | 128);
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
    }

    public final String a(long j, Charset charset) throws EOFException {
        n.a(this.f26998b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return "";
        } else {
            i iVar = this.f26997a;
            if (((long) iVar.f27019b) + j > ((long) iVar.f27020c)) {
                return new String(a(j), charset);
            }
            String str = new String(iVar.f27018a, iVar.f27019b, (int) j, charset);
            iVar.f27019b = (int) (((long) iVar.f27019b) + j);
            this.f26998b -= j;
            if (iVar.f27019b == iVar.f27020c) {
                this.f26997a = iVar.a();
                j.a(iVar);
            }
            return str;
        }
    }

    public final void a(a aVar, long j) {
        if (aVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (aVar != this) {
            n.a(aVar.f26998b, 0, j);
            while (j > 0) {
                if (j < ((long) (aVar.f26997a.f27020c - aVar.f26997a.f27019b))) {
                    i iVar = this.f26997a != null ? this.f26997a.g : null;
                    if (iVar != null && iVar.f27022e) {
                        if ((((long) iVar.f27020c) + j) - ((long) (iVar.f27021d ? 0 : iVar.f27019b)) <= 2048) {
                            aVar.f26997a.a(iVar, (int) j);
                            aVar.f26998b -= j;
                            this.f26998b += j;
                            return;
                        }
                    }
                    aVar.f26997a = aVar.f26997a.a((int) j);
                }
                i iVar2 = aVar.f26997a;
                long j2 = (long) (iVar2.f27020c - iVar2.f27019b);
                aVar.f26997a = iVar2.a();
                if (this.f26997a == null) {
                    this.f26997a = iVar2;
                    i iVar3 = this.f26997a;
                    i iVar4 = this.f26997a;
                    i iVar5 = this.f26997a;
                    iVar4.g = iVar5;
                    iVar3.f27023f = iVar5;
                } else {
                    this.f26997a.g.a(iVar2).b();
                }
                aVar.f26998b -= j2;
                this.f26998b += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public final void a(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int a2 = a(bArr, i, bArr.length - i);
            if (a2 != -1) {
                i += a2;
            } else {
                throw new EOFException();
            }
        }
    }

    public final byte[] a(long j) throws EOFException {
        n.a(this.f26998b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            a(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    public final long b(a aVar, long j) {
        if (aVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f26998b == 0) {
            return -1;
        } else {
            if (j > this.f26998b) {
                j = this.f26998b;
            }
            aVar.a(this, j);
            return j;
        }
    }

    public final a b() {
        return this;
    }

    public final a b(int i) {
        i c2 = c(1);
        byte[] bArr = c2.f27018a;
        int i2 = c2.f27020c;
        c2.f27020c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f26998b++;
        return this;
    }

    /* renamed from: b */
    public final a c(byte[] bArr) {
        if (bArr != null) {
            return c(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: b */
    public final a c(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            n.a((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                i c2 = c(1);
                int min = Math.min(i3 - i, 2048 - c2.f27020c);
                System.arraycopy(bArr, i, c2.f27018a, c2.f27020c, min);
                i += min;
                c2.f27020c += min;
            }
            this.f26998b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final void b(long j) throws EOFException {
        while (j > 0) {
            if (this.f26997a != null) {
                int min = (int) Math.min(j, (long) (this.f26997a.f27020c - this.f26997a.f27019b));
                long j2 = (long) min;
                this.f26998b -= j2;
                j -= j2;
                this.f26997a.f27019b += min;
                if (this.f26997a.f27019b == this.f26997a.f27020c) {
                    i iVar = this.f26997a;
                    this.f26997a = iVar.a();
                    j.a(iVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: c */
    public final a e(long j) {
        if (j == 0) {
            return b(48);
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return b("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        i c2 = c(i);
        byte[] bArr = c2.f27018a;
        int i2 = c2.f27020c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f26996c[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        c2.f27020c += i;
        this.f26998b += (long) i;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final i c(int i) {
        if (i <= 0 || i > 2048) {
            throw new IllegalArgumentException();
        } else if (this.f26997a == null) {
            this.f26997a = j.a();
            i iVar = this.f26997a;
            i iVar2 = this.f26997a;
            i iVar3 = this.f26997a;
            iVar2.g = iVar3;
            iVar.f27023f = iVar3;
            return iVar3;
        } else {
            i iVar4 = this.f26997a.g;
            if (iVar4.f27020c + i > 2048 || !iVar4.f27022e) {
                iVar4 = iVar4.a(j.a());
            }
            return iVar4;
        }
    }

    public final boolean c() {
        return this.f26998b == 0;
    }

    public final void close() {
    }

    public final a d(long j) {
        if (j == 0) {
            return b(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        i c2 = c(numberOfTrailingZeros);
        byte[] bArr = c2.f27018a;
        int i = c2.f27020c;
        for (int i2 = (c2.f27020c + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f26996c[(int) (15 & j)];
            j >>>= 4;
        }
        c2.f27020c += numberOfTrailingZeros;
        this.f26998b += (long) numberOfTrailingZeros;
        return this;
    }

    public final InputStream d() {
        return new InputStream() {
            public int available() {
                return (int) Math.min(a.this.f26998b, 2147483647L);
            }

            public void close() {
            }

            public int read() {
                if (a.this.f26998b > 0) {
                    return a.this.f() & 255;
                }
                return -1;
            }

            public int read(byte[] bArr, int i, int i2) {
                return a.this.a(bArr, i, i2);
            }

            public String toString() {
                return a.this + ".inputStream()";
            }
        };
    }

    public final long e() {
        long j = this.f26998b;
        if (j == 0) {
            return 0;
        }
        i iVar = this.f26997a.g;
        if (iVar.f27020c < 2048 && iVar.f27022e) {
            j -= (long) (iVar.f27020c - iVar.f27019b);
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f26998b != aVar.f26998b) {
            return false;
        }
        long j = 0;
        if (this.f26998b == 0) {
            return true;
        }
        i iVar = this.f26997a;
        i iVar2 = aVar.f26997a;
        int i = iVar.f27019b;
        int i2 = iVar2.f27019b;
        while (j < this.f26998b) {
            long min = (long) Math.min(iVar.f27020c - i, iVar2.f27020c - i2);
            int i3 = i2;
            int i4 = i;
            int i5 = 0;
            while (((long) i5) < min) {
                int i6 = i4 + 1;
                int i7 = i3 + 1;
                if (iVar.f27018a[i4] != iVar2.f27018a[i3]) {
                    return false;
                }
                i5++;
                i4 = i6;
                i3 = i7;
            }
            if (i4 == iVar.f27020c) {
                iVar = iVar.f27023f;
                i = iVar.f27019b;
            } else {
                i = i4;
            }
            if (i3 == iVar2.f27020c) {
                iVar2 = iVar2.f27023f;
                i2 = iVar2.f27019b;
            } else {
                i2 = i3;
            }
            j += min;
        }
        return true;
    }

    public final byte f() {
        if (this.f26998b != 0) {
            i iVar = this.f26997a;
            int i = iVar.f27019b;
            int i2 = iVar.f27020c;
            int i3 = i + 1;
            byte b2 = iVar.f27018a[i];
            this.f26998b--;
            if (i3 == i2) {
                this.f26997a = iVar.a();
                j.a(iVar);
            } else {
                iVar.f27019b = i3;
            }
            return b2;
        }
        throw new IllegalStateException("size == 0");
    }

    public final void flush() {
    }

    public final d g() {
        return new d(i());
    }

    public final String h() {
        try {
            return a(this.f26998b, n.f27029a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public final int hashCode() {
        i iVar = this.f26997a;
        if (iVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = iVar.f27020c;
            for (int i3 = iVar.f27019b; i3 < i2; i3++) {
                i = (i * 31) + iVar.f27018a[i3];
            }
            iVar = iVar.f27023f;
        } while (iVar != this.f26997a);
        return i;
    }

    public final byte[] i() {
        try {
            return a(this.f26998b);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void j() {
        try {
            b(this.f26998b);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: k */
    public final a clone() {
        a aVar = new a();
        if (this.f26998b == 0) {
            return aVar;
        }
        aVar.f26997a = new i(this.f26997a);
        i iVar = aVar.f26997a;
        i iVar2 = aVar.f26997a;
        i iVar3 = aVar.f26997a;
        iVar2.g = iVar3;
        iVar.f27023f = iVar3;
        i iVar4 = this.f26997a;
        while (true) {
            iVar4 = iVar4.f27023f;
            if (iVar4 != this.f26997a) {
                aVar.f26997a.g.a(new i(iVar4));
            } else {
                aVar.f26998b = this.f26998b;
                return aVar;
            }
        }
    }

    public final String toString() {
        if (this.f26998b == 0) {
            return "Buffer[size=0]";
        }
        if (this.f26998b <= 16) {
            return String.format("Buffer[size=%s data=%s]", new Object[]{Long.valueOf(this.f26998b), clone().g().c()});
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(this.f26997a.f27018a, this.f26997a.f27019b, this.f26997a.f27020c - this.f26997a.f27019b);
            i iVar = this.f26997a;
            while (true) {
                iVar = iVar.f27023f;
                if (iVar != this.f26997a) {
                    instance.update(iVar.f27018a, iVar.f27019b, iVar.f27020c - iVar.f27019b);
                } else {
                    return String.format("Buffer[size=%s md5=%s]", new Object[]{Long.valueOf(this.f26998b), d.a(instance.digest()).c()});
                }
            }
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }
}
