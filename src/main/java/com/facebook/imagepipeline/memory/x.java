package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.internal.k;
import com.facebook.common.memory.f;
import com.facebook.common.memory.i;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public final class x implements f {

    /* renamed from: a  reason: collision with root package name */
    private final i f23992a;

    /* renamed from: b  reason: collision with root package name */
    private final u f23993b;

    public final y newOutputStream() {
        return new y(this.f23993b);
    }

    public final w newByteBuffer(InputStream inputStream) throws IOException {
        y yVar = new y(this.f23993b);
        try {
            return a(inputStream, yVar);
        } finally {
            yVar.close();
        }
    }

    public final y newOutputStream(int i) {
        return new y(this.f23993b, i);
    }

    public final w newByteBuffer(byte[] bArr) {
        y yVar = new y(this.f23993b, bArr.length);
        try {
            yVar.write(bArr, 0, bArr.length);
            w byteBuffer = yVar.toByteBuffer();
            yVar.close();
            return byteBuffer;
        } catch (IOException e2) {
            throw k.b(e2);
        } catch (Throwable th) {
            yVar.close();
            throw th;
        }
    }

    public x(u uVar, i iVar) {
        this.f23993b = uVar;
        this.f23992a = iVar;
    }

    @VisibleForTesting
    private w a(InputStream inputStream, y yVar) throws IOException {
        this.f23992a.a(inputStream, yVar);
        return yVar.toByteBuffer();
    }

    public final w newByteBuffer(InputStream inputStream, int i) throws IOException {
        y yVar = new y(this.f23993b, i);
        try {
            return a(inputStream, yVar);
        } finally {
            yVar.close();
        }
    }
}
