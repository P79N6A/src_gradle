package com.facebook.imagepipeline.transcoder;

import com.facebook.b.b;
import com.facebook.b.c;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.producers.p;
import javax.annotation.Nullable;

public final class f implements b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f24225a;

    /* renamed from: b  reason: collision with root package name */
    private final int f24226b;

    public final String getIdentifier() {
        return "SimpleImageTranscoder";
    }

    public final boolean canTranscode(c cVar) {
        if (cVar == b.k || cVar == b.f23288a) {
            return true;
        }
        return false;
    }

    public f(boolean z, int i) {
        this.f24225a = z;
        this.f24226b = i;
    }

    public final boolean canResize(com.facebook.imagepipeline.image.b bVar, @Nullable RotationOptions rotationOptions, @Nullable ResizeOptions resizeOptions) {
        if (rotationOptions == null) {
            rotationOptions = RotationOptions.autoRotate();
        }
        if (!this.f24225a || p.determineSampleSize(rotationOptions, resizeOptions, bVar, this.f24226b) <= 1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0099 A[Catch:{ OutOfMemoryError -> 0x0088 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.imagepipeline.transcoder.a transcode(com.facebook.imagepipeline.image.b r19, java.io.OutputStream r20, @javax.annotation.Nullable com.facebook.imagepipeline.common.RotationOptions r21, @javax.annotation.Nullable com.facebook.imagepipeline.common.ResizeOptions r22, @javax.annotation.Nullable com.facebook.b.c r23, @javax.annotation.Nullable java.lang.Integer r24) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r23
            if (r24 != 0) goto L_0x0010
            r3 = 85
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = r3
            goto L_0x0012
        L_0x0010:
            r4 = r24
        L_0x0012:
            if (r21 != 0) goto L_0x0019
            com.facebook.imagepipeline.common.RotationOptions r3 = com.facebook.imagepipeline.common.RotationOptions.autoRotate()
            goto L_0x001b
        L_0x0019:
            r3 = r21
        L_0x001b:
            boolean r5 = r1.f24225a
            r6 = 1
            if (r5 != 0) goto L_0x0022
            r5 = 1
            goto L_0x002a
        L_0x0022:
            int r5 = r1.f24226b
            r7 = r22
            int r5 = com.facebook.imagepipeline.producers.p.determineSampleSize(r3, r7, r0, r5)
        L_0x002a:
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options
            r7.<init>()
            r7.inSampleSize = r5
            r8 = 2
            java.io.InputStream r9 = r19.getInputStream()     // Catch:{ OutOfMemoryError -> 0x00be }
            r10 = 0
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r9, r10, r7)     // Catch:{ OutOfMemoryError -> 0x00be }
            if (r7 != 0) goto L_0x004a
            java.lang.String r0 = "SimpleImageTranscoder"
            java.lang.String r2 = "Couldn't decode the EncodedImage InputStream ! "
            com.facebook.common.logging.FLog.e((java.lang.String) r0, (java.lang.String) r2)
            com.facebook.imagepipeline.transcoder.a r0 = new com.facebook.imagepipeline.transcoder.a
            r0.<init>(r8)
            return r0
        L_0x004a:
            android.graphics.Matrix r16 = com.facebook.imagepipeline.transcoder.d.getTransformationMatrix(r0, r3)
            if (r16 == 0) goto L_0x0069
            r12 = 0
            r13 = 0
            int r14 = r7.getWidth()     // Catch:{ OutOfMemoryError -> 0x0066, all -> 0x0063 }
            int r15 = r7.getHeight()     // Catch:{ OutOfMemoryError -> 0x0066, all -> 0x0063 }
            r17 = 0
            r11 = r7
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ OutOfMemoryError -> 0x0066, all -> 0x0063 }
            r3 = r0
            goto L_0x006a
        L_0x0063:
            r0 = move-exception
            r3 = r7
            goto L_0x00b7
        L_0x0066:
            r0 = move-exception
            r3 = r7
            goto L_0x00a4
        L_0x0069:
            r3 = r7
        L_0x006a:
            if (r2 == 0) goto L_0x008a
            com.facebook.b.c r0 = com.facebook.b.b.f23288a     // Catch:{ OutOfMemoryError -> 0x0088 }
            if (r2 == r0) goto L_0x008a
            com.facebook.b.c r0 = com.facebook.b.b.f23289b     // Catch:{ OutOfMemoryError -> 0x0088 }
            if (r2 != r0) goto L_0x0077
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ OutOfMemoryError -> 0x0088 }
            goto L_0x008c
        L_0x0077:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ OutOfMemoryError -> 0x0088 }
            r9 = 14
            if (r0 < r9) goto L_0x008a
            boolean r0 = com.facebook.b.b.a(r23)     // Catch:{ OutOfMemoryError -> 0x0088 }
            if (r0 == 0) goto L_0x008a
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.WEBP     // Catch:{ OutOfMemoryError -> 0x0088 }
            goto L_0x008c
        L_0x0086:
            r0 = move-exception
            goto L_0x00b7
        L_0x0088:
            r0 = move-exception
            goto L_0x00a4
        L_0x008a:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ OutOfMemoryError -> 0x0088 }
        L_0x008c:
            int r2 = r4.intValue()     // Catch:{ OutOfMemoryError -> 0x0088 }
            r4 = r20
            r3.compress(r0, r2, r4)     // Catch:{ OutOfMemoryError -> 0x0088 }
            com.facebook.imagepipeline.transcoder.a r0 = new com.facebook.imagepipeline.transcoder.a     // Catch:{ OutOfMemoryError -> 0x0088 }
            if (r5 <= r6) goto L_0x009a
            r6 = 0
        L_0x009a:
            r0.<init>(r6)     // Catch:{ OutOfMemoryError -> 0x0088 }
            r3.recycle()
            r7.recycle()
            return r0
        L_0x00a4:
            java.lang.String r2 = "SimpleImageTranscoder"
            java.lang.String r4 = "Out-Of-Memory during transcode"
            com.facebook.common.logging.FLog.e((java.lang.String) r2, (java.lang.String) r4, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0086 }
            com.facebook.imagepipeline.transcoder.a r0 = new com.facebook.imagepipeline.transcoder.a     // Catch:{ all -> 0x0086 }
            r0.<init>(r8)     // Catch:{ all -> 0x0086 }
            r3.recycle()
            r7.recycle()
            return r0
        L_0x00b7:
            r3.recycle()
            r7.recycle()
            throw r0
        L_0x00be:
            r0 = move-exception
            java.lang.String r2 = "SimpleImageTranscoder"
            java.lang.String r3 = "Out-Of-Memory during transcode"
            com.facebook.common.logging.FLog.e((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r0)
            com.facebook.imagepipeline.transcoder.a r0 = new com.facebook.imagepipeline.transcoder.a
            r0.<init>(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.transcoder.f.transcode(com.facebook.imagepipeline.image.b, java.io.OutputStream, com.facebook.imagepipeline.common.RotationOptions, com.facebook.imagepipeline.common.ResizeOptions, com.facebook.b.c, java.lang.Integer):com.facebook.imagepipeline.transcoder.a");
    }
}
