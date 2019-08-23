package com.meizu.cloud.pushsdk.b.c;

import com.meizu.cloud.pushsdk.b.g.b;
import com.meizu.cloud.pushsdk.b.g.f;
import com.meizu.cloud.pushsdk.b.g.l;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public abstract class j {
    public static j a(final g gVar, final File file) {
        if (file != null) {
            return new j() {
                public final g a() {
                    return gVar;
                }

                public final void a(b bVar) throws IOException {
                    l lVar = null;
                    try {
                        l a2 = f.a(file);
                        try {
                            bVar.a(a2);
                            m.a((Closeable) a2);
                        } catch (Throwable th) {
                            th = th;
                            lVar = a2;
                            m.a((Closeable) lVar);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        m.a((Closeable) lVar);
                        throw th;
                    }
                }

                public final long b() {
                    return file.length();
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public static j a(g gVar, String str) {
        Charset charset = m.f26983c;
        if (gVar != null) {
            charset = gVar.b();
            if (charset == null) {
                charset = m.f26983c;
                gVar = g.a(gVar + "; charset=utf-8");
            }
        }
        return a(gVar, str.getBytes(charset));
    }

    public static j a(g gVar, byte[] bArr) {
        return a(gVar, bArr, 0, bArr.length);
    }

    public static j a(final g gVar, final byte[] bArr, final int i, final int i2) {
        if (bArr != null) {
            m.a((long) bArr.length, (long) i, (long) i2);
            return new j() {
                public final g a() {
                    return gVar;
                }

                public final void a(b bVar) throws IOException {
                    bVar.c(bArr, i, i2);
                }

                public final long b() {
                    return (long) i2;
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public abstract g a();

    public abstract void a(b bVar) throws IOException;

    public long b() throws IOException {
        return -1;
    }
}
