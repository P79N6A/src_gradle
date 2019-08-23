package com.facebook.imagepipeline.c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.common.e.a;
import com.facebook.common.g.b;
import com.facebook.common.internal.k;
import com.facebook.common.memory.e;
import com.facebook.common.memory.g;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

public final class c extends DalvikPurgeableDecoder {

    /* renamed from: a  reason: collision with root package name */
    private static Method f23839a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final b f23840b = com.facebook.common.g.c.a();

    private synchronized Method a() {
        if (f23839a == null) {
            try {
                f23839a = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e2) {
                throw k.b(e2);
            }
        }
        return f23839a;
    }

    private FileDescriptor a(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) a().invoke(memoryFile, new Object[0]);
        } catch (Exception e2) {
            throw k.b(e2);
        }
    }

    public final Bitmap decodeByteArrayAsPurgeable(CloseableReference<e> closeableReference, BitmapFactory.Options options) {
        return a(closeableReference, ((e) closeableReference.get()).size(), null, options);
    }

    public final Bitmap decodeJPEGByteArrayAsPurgeable(CloseableReference<e> closeableReference, int i, BitmapFactory.Options options) {
        byte[] bArr;
        if (endsWithEOI(closeableReference, i)) {
            bArr = null;
        } else {
            bArr = EOI;
        }
        return a(closeableReference, i, bArr, options);
    }

    private static MemoryFile a(CloseableReference<e> closeableReference, int i, @Nullable byte[] bArr) throws IOException {
        int i2;
        OutputStream outputStream;
        g gVar;
        a aVar;
        if (bArr == null) {
            i2 = 0;
        } else {
            i2 = bArr.length;
        }
        a aVar2 = null;
        MemoryFile memoryFile = new MemoryFile(null, i2 + i);
        memoryFile.allowPurging(false);
        try {
            gVar = new g((e) closeableReference.get());
            try {
                aVar = new a(gVar, i);
            } catch (Throwable th) {
                th = th;
                outputStream = null;
                CloseableReference.closeSafely(closeableReference);
                com.facebook.common.internal.c.a(gVar);
                com.facebook.common.internal.c.a(aVar2);
                com.facebook.common.internal.c.a(outputStream, true);
                throw th;
            }
            try {
                outputStream = memoryFile.getOutputStream();
                try {
                    com.facebook.common.internal.b.a((InputStream) aVar, outputStream);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    CloseableReference.closeSafely(closeableReference);
                    com.facebook.common.internal.c.a(gVar);
                    com.facebook.common.internal.c.a(aVar);
                    com.facebook.common.internal.c.a(outputStream, true);
                    return memoryFile;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar;
                    CloseableReference.closeSafely(closeableReference);
                    com.facebook.common.internal.c.a(gVar);
                    com.facebook.common.internal.c.a(aVar2);
                    com.facebook.common.internal.c.a(outputStream, true);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                outputStream = null;
                aVar2 = aVar;
                CloseableReference.closeSafely(closeableReference);
                com.facebook.common.internal.c.a(gVar);
                com.facebook.common.internal.c.a(aVar2);
                com.facebook.common.internal.c.a(outputStream, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            gVar = null;
            outputStream = null;
            CloseableReference.closeSafely(closeableReference);
            com.facebook.common.internal.c.a(gVar);
            com.facebook.common.internal.c.a(aVar2);
            com.facebook.common.internal.c.a(outputStream, true);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap a(com.facebook.common.references.CloseableReference<com.facebook.common.memory.e> r2, int r3, byte[] r4, android.graphics.BitmapFactory.Options r5) {
        /*
            r1 = this;
            r0 = 0
            android.os.MemoryFile r2 = a(r2, r3, r4)     // Catch:{ IOException -> 0x002f }
            java.io.FileDescriptor r3 = r1.a(r2)     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            com.facebook.common.g.b r4 = r1.f23840b     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            if (r4 == 0) goto L_0x001f
            com.facebook.common.g.b r4 = r1.f23840b     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            android.graphics.Bitmap r3 = r4.decodeFileDescriptor(r3, r0, r5)     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            java.lang.String r4 = "BitmapFactory returned null"
            java.lang.Object r3 = com.facebook.common.internal.Preconditions.checkNotNull(r3, r4)     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            r2.close()
            return r3
        L_0x001f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            java.lang.String r4 = "WebpBitmapFactory is null"
            r3.<init>(r4)     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            throw r3     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
        L_0x0027:
            r3 = move-exception
            goto L_0x0035
        L_0x0029:
            r3 = move-exception
            r0 = r2
            goto L_0x0030
        L_0x002c:
            r3 = move-exception
            r2 = r0
            goto L_0x0035
        L_0x002f:
            r3 = move-exception
        L_0x0030:
            java.lang.RuntimeException r2 = com.facebook.common.internal.k.b(r3)     // Catch:{ all -> 0x002c }
            throw r2     // Catch:{ all -> 0x002c }
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r2.close()
        L_0x003a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.c.c.a(com.facebook.common.references.CloseableReference, int, byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }
}
