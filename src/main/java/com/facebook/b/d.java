package com.facebook.b;

import com.facebook.b.c;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.b;
import com.facebook.common.internal.k;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.annotation.Nullable;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    private static d f23297b;
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public List<c.a> f23298a;

    /* renamed from: c  reason: collision with root package name */
    private int f23299c;

    /* renamed from: d  reason: collision with root package name */
    private final c.a f23300d = new a();

    private d() {
        a();
    }

    public static synchronized d b() {
        d dVar;
        synchronized (d.class) {
            if (f23297b == null) {
                f23297b = new d();
            }
            dVar = f23297b;
        }
        return dVar;
    }

    public void a() {
        this.f23299c = this.f23300d.a();
        if (this.f23298a != null) {
            for (c.a a2 : this.f23298a) {
                this.f23299c = Math.max(this.f23299c, a2.a());
            }
        }
    }

    public static c a(InputStream inputStream) {
        try {
            d b2 = b();
            Preconditions.checkNotNull(inputStream);
            byte[] bArr = new byte[b2.f23299c];
            int a2 = a(b2.f23299c, inputStream, bArr);
            if (b2.f23298a != null) {
                for (c.a a3 : b2.f23298a) {
                    c a4 = a3.a(bArr, a2);
                    if (a4 != null && a4 != c.f23294a) {
                        return a4;
                    }
                }
            }
            c a5 = b2.f23300d.a(bArr, a2);
            if (a5 == null || a5 == c.f23294a) {
                return c.f23294a;
            }
            return a5;
        } catch (IOException e2) {
            throw k.b(e2);
        }
    }

    private static int a(int i, InputStream inputStream, byte[] bArr) throws IOException {
        boolean z;
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(bArr);
        if (bArr.length >= i) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (!inputStream.markSupported()) {
            return b.a(inputStream, bArr, 0, i);
        }
        try {
            inputStream.mark(i);
            return b.a(inputStream, bArr, 0, i);
        } finally {
            inputStream.reset();
        }
    }
}
