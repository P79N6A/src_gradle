package com.bumptech.glide.load.model;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.InputStream;

public class StreamEncoder implements Encoder<InputStream> {
    private final ArrayPool byteArrayPool;

    public StreamEncoder(ArrayPool arrayPool) {
        this.byteArrayPool = arrayPool;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e A[SYNTHETIC, Splitter:B:17:0x002e] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0039 A[SYNTHETIC, Splitter:B:24:0x0039] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean encode(@android.support.annotation.NonNull java.io.InputStream r4, @android.support.annotation.NonNull java.io.File r5, @android.support.annotation.NonNull com.bumptech.glide.load.Options r6) {
        /*
            r3 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r6 = r3.byteArrayPool
            java.lang.Class<byte[]> r0 = byte[].class
            r1 = 65536(0x10000, float:9.18355E-41)
            java.lang.Object r6 = r6.get(r1, r0)
            byte[] r6 = (byte[]) r6
            r0 = 0
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0037, all -> 0x002a }
            r2.<init>(r5)     // Catch:{ IOException -> 0x0037, all -> 0x002a }
        L_0x0013:
            int r5 = r4.read(r6)     // Catch:{ IOException -> 0x0028, all -> 0x0026 }
            r1 = -1
            if (r5 == r1) goto L_0x001e
            r2.write(r6, r0, r5)     // Catch:{ IOException -> 0x0028, all -> 0x0026 }
            goto L_0x0013
        L_0x001e:
            r2.close()     // Catch:{ IOException -> 0x0028, all -> 0x0026 }
            r0 = 1
            r2.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x003c
        L_0x0026:
            r4 = move-exception
            goto L_0x002c
        L_0x0028:
            r1 = r2
            goto L_0x0037
        L_0x002a:
            r4 = move-exception
            r2 = r1
        L_0x002c:
            if (r2 == 0) goto L_0x0031
            r2.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r5 = r3.byteArrayPool
            r5.put(r6)
            throw r4
        L_0x0037:
            if (r1 == 0) goto L_0x003c
            r1.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r4 = r3.byteArrayPool
            r4.put(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.model.StreamEncoder.encode(java.io.InputStream, java.io.File, com.bumptech.glide.load.Options):boolean");
    }
}
