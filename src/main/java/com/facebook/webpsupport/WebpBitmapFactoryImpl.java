package com.facebook.webpsupport;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import com.facebook.common.g.a;
import com.facebook.common.g.b;
import com.facebook.common.g.c;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.imagepipeline.nativecode.d;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

@DoNotStrip
public class WebpBitmapFactoryImpl implements b {
    public static final boolean IN_BITMAP_SUPPORTED;
    private static a mBitmapCreator;
    private static b.a mWebpErrorLogger;

    @DoNotStrip
    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options, float f2, byte[] bArr2);

    @DoNotStrip
    private static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f2, byte[] bArr);

    @DoNotStrip
    private static native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z);

    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return a.a(bArr, i, i2, options);
    }

    private static Bitmap originalDecodeFile(String str) {
        return a.a(str);
    }

    private static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        return a.a(str, options);
    }

    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return a.a(fileDescriptor);
    }

    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return a.a(fileDescriptor, rect, options);
    }

    private static Bitmap originalDecodeStream(InputStream inputStream) {
        return a.a(inputStream);
    }

    private static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return a.a(inputStream, rect, options);
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 11) {
            z = true;
        } else {
            z = false;
        }
        IN_BITMAP_SUPPORTED = z;
    }

    public void setBitmapCreator(a aVar) {
        mBitmapCreator = aVar;
    }

    public void setWebpErrorLogger(b.a aVar) {
        mWebpErrorLogger = aVar;
    }

    @DoNotStrip
    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, null);
    }

    @DoNotStrip
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, null, null);
    }

    @DoNotStrip
    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, null, null);
    }

    @DoNotStrip
    public static Bitmap originalDecodeFile$___twin___(String str) {
        return BitmapFactory.decodeFile(str);
    }

    @DoNotStrip
    public static Bitmap originalDecodeFileDescriptor$___twin___(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    @DoNotStrip
    public static Bitmap originalDecodeStream$___twin___(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    @DoNotStrip
    private static byte[] getInTempStorageFromOptions(@Nullable BitmapFactory.Options options) {
        if (options == null || options.inTempStorage == null) {
            return new byte[8192];
        }
        return options.inTempStorage;
    }

    private static void sendWebpErrorLog(String str) {
        if (mWebpErrorLogger != null) {
            mWebpErrorLogger.onWebpErrorLog(str, "decoding_failure");
        }
    }

    @DoNotStrip
    private static void setPaddingDefaultValues(@Nullable Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    @SuppressLint({"NewApi"})
    @DoNotStrip
    private static boolean shouldPremultiply(BitmapFactory.Options options) {
        if (Build.VERSION.SDK_INT < 19 || options == null) {
            return true;
        }
        return options.inPremultiplied;
    }

    private static InputStream wrapToMarkSupportedStream(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            return new BufferedInputStream(inputStream, 20);
        }
        return inputStream;
    }

    @DoNotStrip
    private static float getScaleFromOptions(BitmapFactory.Options options) {
        float f2 = 1.0f;
        if (options == null) {
            return 1.0f;
        }
        int i = options.inSampleSize;
        if (i > 1) {
            f2 = 1.0f / ((float) i);
        }
        if (!options.inScaled) {
            return f2;
        }
        int i2 = options.inDensity;
        int i3 = options.inTargetDensity;
        int i4 = options.inScreenDensity;
        if (i2 == 0 || i3 == 0 || i2 == i4) {
            return f2;
        }
        return ((float) i3) / ((float) i2);
    }

    @DoNotStrip
    public static Bitmap hookDecodeResource(Resources resources, int i) {
        return hookDecodeResource(resources, i, null);
    }

    @DoNotStrip
    private static Bitmap originalDecodeResource(Resources resources, int i) {
        return BitmapFactory.decodeResource(resources, i);
    }

    public Bitmap decodeFile(String str, BitmapFactory.Options options) {
        return hookDecodeFile(str, options);
    }

    @DoNotStrip
    public static Bitmap originalDecodeFile$___twin___(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    private static void setWebpBitmapOptions(Bitmap bitmap, BitmapFactory.Options options) {
        setDensityFromOptions(bitmap, options);
        if (options != null) {
            options.outMimeType = "image/webp";
        }
    }

    private static byte[] getWebpHeader(InputStream inputStream, BitmapFactory.Options options) {
        byte[] bArr;
        inputStream.mark(20);
        if (options == null || options.inTempStorage == null || options.inTempStorage.length < 20) {
            bArr = new byte[20];
        } else {
            bArr = options.inTempStorage;
        }
        try {
            inputStream.read(bArr, 0, 20);
            inputStream.reset();
            return bArr;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
        r2 = r4;
        r4 = r3;
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r4 = null;
     */
    @com.facebook.common.internal.DoNotStrip
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap hookDecodeFile(java.lang.String r3, android.graphics.BitmapFactory.Options r4) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0026 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0026 }
            android.graphics.Bitmap r3 = hookDecodeStream(r1, r0, r4)     // Catch:{ Throwable -> 0x0011, all -> 0x000e }
            r1.close()     // Catch:{ Exception -> 0x0027 }
            goto L_0x0027
        L_0x000e:
            r3 = move-exception
            r4 = r0
            goto L_0x0017
        L_0x0011:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0013 }
        L_0x0013:
            r4 = move-exception
            r2 = r4
            r4 = r3
            r3 = r2
        L_0x0017:
            if (r4 == 0) goto L_0x0022
            r1.close()     // Catch:{ Throwable -> 0x001d }
            goto L_0x0025
        L_0x001d:
            r1 = move-exception
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r4, (java.lang.Throwable) r1)     // Catch:{ Exception -> 0x0026 }
            goto L_0x0025
        L_0x0022:
            r1.close()     // Catch:{ Exception -> 0x0026 }
        L_0x0025:
            throw r3     // Catch:{ Exception -> 0x0026 }
        L_0x0026:
            r3 = r0
        L_0x0027:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeFile(java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    private static void setDensityFromOptions(Bitmap bitmap, BitmapFactory.Options options) {
        if (bitmap != null && options != null) {
            int i = options.inDensity;
            if (i != 0) {
                bitmap.setDensity(i);
                int i2 = options.inTargetDensity;
                if (!(i2 == 0 || i == i2 || i == options.inScreenDensity || !options.inScaled)) {
                    bitmap.setDensity(i2);
                }
                return;
            }
            if (IN_BITMAP_SUPPORTED && options.inBitmap != null) {
                bitmap.setDensity(160);
            }
        }
    }

    @DoNotStrip
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {
        return hookDecodeByteArray(bArr, i, i2, null);
    }

    @DoNotStrip
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {
        return BitmapFactory.decodeByteArray(bArr, i, i2);
    }

    @DoNotStrip
    private static void setBitmapSize(@Nullable BitmapFactory.Options options, int i, int i2) {
        if (options != null) {
            options.outWidth = i;
            options.outHeight = i2;
        }
    }

    public Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return hookDecodeFileDescriptor(fileDescriptor, rect, options);
    }

    public Bitmap decodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return hookDecodeStream(inputStream, rect, options);
    }

    @DoNotStrip
    public static Bitmap originalDecodeFileDescriptor$___twin___(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    @DoNotStrip
    private static Bitmap originalDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(resources, i, options);
    }

    @DoNotStrip
    public static Bitmap originalDecodeStream$___twin___(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    @DoNotStrip
    private static boolean setOutDimensions(BitmapFactory.Options options, int i, int i2) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i;
        options.outHeight = i2;
        return true;
    }

    @DoNotStrip
    private static Bitmap createBitmap(int i, int i2, BitmapFactory.Options options) {
        if (!IN_BITMAP_SUPPORTED || options == null || options.inBitmap == null || !options.inBitmap.isMutable()) {
            return mBitmapCreator.createNakedBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }
        return options.inBitmap;
    }

    @DoNotStrip
    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        Bitmap bitmap;
        d.ensure();
        InputStream wrapToMarkSupportedStream = wrapToMarkSupportedStream(inputStream);
        byte[] webpHeader = getWebpHeader(wrapToMarkSupportedStream, options);
        if (!c.f2345a || !c.a(webpHeader, 0, 20)) {
            bitmap = originalDecodeStream(wrapToMarkSupportedStream, rect, options);
            if (bitmap == null) {
                sendWebpErrorLog("webp_direct_decode_stream_failed_on_no_webp");
            }
        } else {
            bitmap = nativeDecodeStream(wrapToMarkSupportedStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
            if (bitmap == null) {
                sendWebpErrorLog("webp_direct_decode_stream");
            }
            setWebpBitmapOptions(bitmap, options);
            setPaddingDefaultValues(rect);
        }
        return bitmap;
    }

    @DoNotStrip
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        Bitmap bitmap;
        d.ensure();
        long nativeSeek = nativeSeek(fileDescriptor, 0, false);
        if (nativeSeek != -1) {
            InputStream wrapToMarkSupportedStream = wrapToMarkSupportedStream(new FileInputStream(fileDescriptor));
            try {
                byte[] webpHeader = getWebpHeader(wrapToMarkSupportedStream, options);
                if (!c.f2345a || !c.a(webpHeader, 0, 20)) {
                    nativeSeek(fileDescriptor, nativeSeek, true);
                    bitmap = originalDecodeFileDescriptor(fileDescriptor, rect, options);
                    if (bitmap == null) {
                        sendWebpErrorLog("webp_direct_decode_fd_failed_on_no_webp");
                    }
                } else {
                    bitmap = nativeDecodeStream(wrapToMarkSupportedStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
                    if (bitmap == null) {
                        sendWebpErrorLog("webp_direct_decode_fd");
                    }
                    setPaddingDefaultValues(rect);
                    setWebpBitmapOptions(bitmap, options);
                }
                try {
                    wrapToMarkSupportedStream.close();
                    return bitmap;
                } catch (Throwable unused) {
                    return bitmap;
                }
            } catch (Throwable unused2) {
            }
        } else {
            Bitmap hookDecodeStream = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
            setPaddingDefaultValues(rect);
            return hookDecodeStream;
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        r2 = r0;
        r0 = r3;
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r0 = null;
     */
    @com.facebook.common.internal.DoNotStrip
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap hookDecodeResource(android.content.res.Resources r3, int r4, android.graphics.BitmapFactory.Options r5) {
        /*
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1 = 0
            java.io.InputStream r4 = r3.openRawResource(r4, r0)     // Catch:{ Exception -> 0x002e }
            android.graphics.Bitmap r3 = hookDecodeResourceStream(r3, r0, r4, r1, r5)     // Catch:{ Throwable -> 0x0017, all -> 0x0014 }
            if (r4 == 0) goto L_0x002f
            r4.close()     // Catch:{ Exception -> 0x002f }
            goto L_0x002f
        L_0x0014:
            r3 = move-exception
            r0 = r1
            goto L_0x001d
        L_0x0017:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r0 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
        L_0x001d:
            if (r4 == 0) goto L_0x002d
            if (r0 == 0) goto L_0x002a
            r4.close()     // Catch:{ Throwable -> 0x0025 }
            goto L_0x002d
        L_0x0025:
            r4 = move-exception
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r0, (java.lang.Throwable) r4)     // Catch:{ Exception -> 0x002e }
            goto L_0x002d
        L_0x002a:
            r4.close()     // Catch:{ Exception -> 0x002e }
        L_0x002d:
            throw r3     // Catch:{ Exception -> 0x002e }
        L_0x002e:
            r3 = r1
        L_0x002f:
            boolean r4 = IN_BITMAP_SUPPORTED
            if (r4 == 0) goto L_0x0044
            if (r3 != 0) goto L_0x0044
            if (r5 == 0) goto L_0x0044
            android.graphics.Bitmap r4 = r5.inBitmap
            if (r4 != 0) goto L_0x003c
            goto L_0x0044
        L_0x003c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Problem decoding into existing bitmap"
            r3.<init>(r4)
            throw r3
        L_0x0044:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeResource(android.content.res.Resources, int, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    @DoNotStrip
    public static Bitmap originalDecodeByteArray$___twin___(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return BitmapFactory.decodeByteArray(bArr, i, i2, options);
    }

    public Bitmap decodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return hookDecodeByteArray(bArr, i, i2, options);
    }

    @DoNotStrip
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        Bitmap bitmap;
        d.ensure();
        if (!c.f2345a || !c.a(bArr, i, i2)) {
            bitmap = originalDecodeByteArray(bArr, i, i2, options);
            if (bitmap == null) {
                sendWebpErrorLog("webp_direct_decode_array_failed_on_no_webp");
            }
        } else {
            bitmap = nativeDecodeByteArray(bArr, i, i2, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
            if (bitmap == null) {
                sendWebpErrorLog("webp_direct_decode_array");
            }
            setWebpBitmapOptions(bitmap, options);
        }
        return bitmap;
    }

    @DoNotStrip
    private static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    @DoNotStrip
    public static Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i = typedValue.density;
            if (i == 0) {
                options.inDensity = 160;
            } else if (i != 65535) {
                options.inDensity = i;
            }
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return hookDecodeStream(inputStream, rect, options);
    }
}
