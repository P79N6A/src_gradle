package com.facebook.common.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final int f23546a;

    /* renamed from: b  reason: collision with root package name */
    private final a f23547b;

    public i(a aVar) {
        this(aVar, 16384);
    }

    @VisibleForTesting
    private i(a aVar, int i) {
        Preconditions.checkArgument(true);
        this.f23546a = 16384;
        this.f23547b = aVar;
    }

    public final long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = (byte[]) this.f23547b.get(this.f23546a);
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.f23546a);
                if (read == -1) {
                    return j;
                }
                outputStream.write(bArr, 0, read);
                j += (long) read;
            } finally {
                this.f23547b.release(bArr);
            }
        }
    }
}
