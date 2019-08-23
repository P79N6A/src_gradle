package com.facebook.imagepipeline.image;

import android.graphics.ColorSpace;
import android.os.Build;
import android.util.Pair;
import com.facebook.b.c;
import com.facebook.b.d;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.e;
import com.facebook.common.memory.g;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.a;
import com.facebook.imageutils.HeifExifUtil;
import com.facebook.imageutils.h;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
public final class b implements Closeable {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final CloseableReference<e> f23936a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final Supplier<FileInputStream> f23937b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private ColorSpace f23938c;
    @Nullable
    public a mBytesRange;
    public int mExifOrientation;
    public int mHeight;
    public c mImageFormat;
    public int mRotationAngle;
    public int mSampleSize;
    public int mStreamSize;
    public int mWidth;

    public final void close() {
        CloseableReference.closeSafely(this.f23936a);
    }

    public final CloseableReference<e> getByteBufferRef() {
        return CloseableReference.cloneOrNull(this.f23936a);
    }

    @Nullable
    public final ColorSpace getColorSpace() {
        a();
        return this.f23938c;
    }

    public final int getExifOrientation() {
        a();
        return this.mExifOrientation;
    }

    public final int getHeight() {
        a();
        return this.mHeight;
    }

    public final c getImageFormat() {
        a();
        return this.mImageFormat;
    }

    public final int getRotationAngle() {
        a();
        return this.mRotationAngle;
    }

    public final int getWidth() {
        a();
        return this.mWidth;
    }

    private void a() {
        if (this.mWidth < 0 || this.mHeight < 0) {
            parseMetaData();
        }
    }

    public final int getSize() {
        if (this.f23936a == null || this.f23936a.get() == null) {
            return this.mStreamSize;
        }
        return ((e) this.f23936a.get()).size();
    }

    public final synchronized boolean isValid() {
        boolean z;
        if (CloseableReference.isValid(this.f23936a) || this.f23937b != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030 A[SYNTHETIC, Splitter:B:15:0x0030] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.imageutils.d c() {
        /*
            r4 = this;
            java.io.InputStream r0 = r4.getInputStream()     // Catch:{ all -> 0x002c }
            com.facebook.imageutils.d r1 = com.facebook.imageutils.a.b(r0)     // Catch:{ all -> 0x002a }
            android.graphics.ColorSpace r2 = r1.f24235b     // Catch:{ all -> 0x002a }
            r4.f23938c = r2     // Catch:{ all -> 0x002a }
            android.util.Pair<java.lang.Integer, java.lang.Integer> r2 = r1.f24234a     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0024
            java.lang.Object r3 = r2.first     // Catch:{ all -> 0x002a }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x002a }
            int r3 = r3.intValue()     // Catch:{ all -> 0x002a }
            r4.mWidth = r3     // Catch:{ all -> 0x002a }
            java.lang.Object r2 = r2.second     // Catch:{ all -> 0x002a }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x002a }
            int r2 = r2.intValue()     // Catch:{ all -> 0x002a }
            r4.mHeight = r2     // Catch:{ all -> 0x002a }
        L_0x0024:
            if (r0 == 0) goto L_0x0029
            r0.close()     // Catch:{ IOException -> 0x0029 }
        L_0x0029:
            return r1
        L_0x002a:
            r1 = move-exception
            goto L_0x002e
        L_0x002c:
            r1 = move-exception
            r0 = 0
        L_0x002e:
            if (r0 == 0) goto L_0x0033
            r0.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.image.b.c():com.facebook.imageutils.d");
    }

    public final b cloneOrNull() {
        b bVar;
        b bVar2;
        if (this.f23937b != null) {
            bVar = new b(this.f23937b, this.mStreamSize);
        } else {
            CloseableReference cloneOrNull = CloseableReference.cloneOrNull(this.f23936a);
            if (cloneOrNull == null) {
                bVar2 = null;
            } else {
                try {
                    bVar2 = new b(cloneOrNull);
                } catch (Throwable th) {
                    CloseableReference.closeSafely(cloneOrNull);
                    throw th;
                }
            }
            CloseableReference.closeSafely(cloneOrNull);
            bVar = bVar2;
        }
        if (bVar != null) {
            bVar.copyMetaDataFrom(this);
        }
        return bVar;
    }

    public final InputStream getInputStream() {
        if (this.f23937b != null) {
            return (InputStream) this.f23937b.get();
        }
        CloseableReference cloneOrNull = CloseableReference.cloneOrNull(this.f23936a);
        if (cloneOrNull == null) {
            return null;
        }
        try {
            return new g((e) cloneOrNull.get());
        } finally {
            CloseableReference.closeSafely(cloneOrNull);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Pair<java.lang.Integer, java.lang.Integer> b() {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.getInputStream()
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 8192(0x2000, float:1.14794E-41)
            r3 = 1
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x0047, all -> 0x004b }
        L_0x000e:
            int r4 = r0.read(r2)     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r5 = -1
            r6 = 0
            if (r4 == r5) goto L_0x001a
            r1.write(r2, r6, r4)     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            goto L_0x000e
        L_0x001a:
            byte[] r0 = r1.toByteArray()     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            int r2 = r0.length     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            int[] r0 = com.facebook.imageutils.c.a(r0, r2)     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            if (r0 == 0) goto L_0x0047
            r2 = r0[r6]     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r7.mWidth = r2     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r2 = r0[r3]     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r7.mHeight = r2     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r2 = 2
            r2 = r0[r2]     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r7.mRotationAngle = r2     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r4 = r0[r6]     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r0 = r0[r3]     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r2.<init>(r4, r0)     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            com.facebook.common.internal.c.a(r1, r3)     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            return r2
        L_0x0047:
            com.facebook.common.internal.c.a(r1, r3)     // Catch:{ IOException -> 0x0050 }
            goto L_0x0050
        L_0x004b:
            r0 = move-exception
            com.facebook.common.internal.c.a(r1, r3)     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            throw r0
        L_0x0050:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.image.b.b():android.util.Pair");
    }

    public final void parseMetaData() {
        boolean z;
        Pair<Integer, Integer> pair;
        c a2 = d.a(getInputStream());
        this.mImageFormat = a2;
        boolean z2 = true;
        int i = 0;
        if (com.facebook.b.b.a(a2) || a2 == com.facebook.b.b.j) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            pair = h.a(getInputStream());
            if (pair != null) {
                this.mWidth = ((Integer) pair.first).intValue();
                this.mHeight = ((Integer) pair.second).intValue();
            }
        } else {
            if (a2 != com.facebook.imageutils.c.a()) {
                z2 = false;
            }
            pair = z2 ? b() : c().f24234a;
        }
        if (a2 == com.facebook.b.b.f23288a && this.mRotationAngle == -1) {
            if (pair != null) {
                this.mExifOrientation = com.facebook.imageutils.e.a(getInputStream());
                this.mRotationAngle = com.facebook.imageutils.e.a(this.mExifOrientation);
            }
        } else if (a2 == com.facebook.b.b.k && this.mRotationAngle == -1) {
            InputStream inputStream = getInputStream();
            if (Build.VERSION.SDK_INT >= 24) {
                i = HeifExifUtil.HeifExifUtilAndroidN.getOrientation(inputStream);
            } else {
                FLog.d("HeifExifUtil", "Trying to read Heif Exif information before Android N -> ignoring");
            }
            this.mExifOrientation = i;
            this.mRotationAngle = com.facebook.imageutils.e.a(this.mExifOrientation);
        } else {
            this.mRotationAngle = 0;
        }
    }

    public static void closeSafely(@Nullable b bVar) {
        if (bVar != null) {
            bVar.close();
        }
    }

    public static b cloneOrNull(b bVar) {
        if (bVar != null) {
            return bVar.cloneOrNull();
        }
        return null;
    }

    public static boolean isMetaDataAvailable(b bVar) {
        if (bVar.mRotationAngle < 0 || bVar.mWidth < 0 || bVar.mHeight < 0) {
            return false;
        }
        return true;
    }

    public static boolean isValid(@Nullable b bVar) {
        if (bVar == null || !bVar.isValid()) {
            return false;
        }
        return true;
    }

    public b(Supplier<FileInputStream> supplier) {
        this.mImageFormat = c.f23294a;
        this.mRotationAngle = -1;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mSampleSize = 1;
        this.mStreamSize = -1;
        Preconditions.checkNotNull(supplier);
        this.f23936a = null;
        this.f23937b = supplier;
    }

    public b(CloseableReference<e> closeableReference) {
        this.mImageFormat = c.f23294a;
        this.mRotationAngle = -1;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mSampleSize = 1;
        this.mStreamSize = -1;
        Preconditions.checkArgument(CloseableReference.isValid(closeableReference));
        this.f23936a = closeableReference.clone();
        this.f23937b = null;
    }

    public final void copyMetaDataFrom(b bVar) {
        this.mImageFormat = bVar.getImageFormat();
        this.mWidth = bVar.getWidth();
        this.mHeight = bVar.getHeight();
        this.mRotationAngle = bVar.getRotationAngle();
        this.mExifOrientation = bVar.getExifOrientation();
        this.mSampleSize = bVar.mSampleSize;
        this.mStreamSize = bVar.getSize();
        this.mBytesRange = bVar.mBytesRange;
        this.f23938c = bVar.getColorSpace();
    }

    public final boolean isCompleteAt(int i) {
        if (this.mImageFormat != com.facebook.b.b.f23288a || this.f23937b != null) {
            return true;
        }
        Preconditions.checkNotNull(this.f23936a);
        e eVar = (e) this.f23936a.get();
        if (eVar.read(i - 2) == -1 && eVar.read(i - 1) == -39) {
            return true;
        }
        return false;
    }

    public final String getFirstBytesAsHexString(int i) {
        CloseableReference<e> byteBufferRef = getByteBufferRef();
        if (byteBufferRef == null) {
            return "";
        }
        int min = Math.min(getSize(), i);
        byte[] bArr = new byte[min];
        try {
            e eVar = (e) byteBufferRef.get();
            if (eVar == null) {
                return "";
            }
            eVar.read(0, bArr, 0, min);
            byteBufferRef.close();
            StringBuilder sb = new StringBuilder(min * 2);
            for (int i2 = 0; i2 < min; i2++) {
                sb.append(String.format("%02X", new Object[]{Byte.valueOf(bArr[i2])}));
            }
            return sb.toString();
        } finally {
            byteBufferRef.close();
        }
    }

    public b(Supplier<FileInputStream> supplier, int i) {
        this(supplier);
        this.mStreamSize = i;
    }
}
