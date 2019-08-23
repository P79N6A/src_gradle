package com.google.common.d;

import com.google.common.a.m;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@GwtIncompatible
public abstract class b {
    public abstract InputStream a() throws IOException;

    protected b() {
    }

    @CanIgnoreReturnValue
    public final long a(a aVar) throws IOException {
        m.a(aVar);
        d dVar = new d(d.f24824a);
        try {
            InputStream inputStream = (InputStream) dVar.a(a());
            OutputStream outputStream = (OutputStream) dVar.a(aVar.a());
            m.a(inputStream);
            m.a(outputStream);
            byte[] bArr = new byte[8192];
            long j = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                    j += (long) read;
                } else {
                    dVar.close();
                    return j;
                }
            }
        } catch (Throwable th) {
            dVar.close();
            throw th;
        }
    }
}
