package com.facebook.common.g;

import java.io.UnsupportedEncodingException;
import javax.annotation.Nullable;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f2345a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f2346b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f2347c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public static b f2348d = null;

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f2349e = a("VP8 ");

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f2350f = a("VP8L");
    public static final byte[] g = a("VP8X");
    private static boolean h = false;
    private static final byte[] i = a("RIFF");
    private static final byte[] j = a("WEBP");

    @Nullable
    public static b a() {
        if (h) {
            return f2348d;
        }
        b bVar = null;
        try {
            bVar = (b) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        } catch (Throwable unused) {
        }
        h = true;
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r1.outWidth == 1) goto L_0x003c;
     */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            r2 = 1
            r3 = 0
            if (r0 > r1) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            f2345a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 14
            if (r0 < r4) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            f2346b = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r1) goto L_0x001e
        L_0x001c:
            r2 = 0
            goto L_0x003c
        L_0x001e:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 != r1) goto L_0x003c
            java.lang.String r0 = "UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA=="
            byte[] r0 = android.util.Base64.decode(r0, r3)
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r1.inJustDecodeBounds = r2
            int r4 = r0.length
            android.graphics.BitmapFactory.decodeByteArray(r0, r3, r4, r1)
            int r0 = r1.outHeight
            if (r0 != r2) goto L_0x001c
            int r0 = r1.outWidth
            if (r0 == r2) goto L_0x003c
            goto L_0x001c
        L_0x003c:
            f2347c = r2
            r0 = 0
            f2348d = r0
            h = r3
            java.lang.String r0 = "RIFF"
            byte[] r0 = a(r0)
            i = r0
            java.lang.String r0 = "WEBP"
            byte[] r0 = a(r0)
            j = r0
            java.lang.String r0 = "VP8 "
            byte[] r0 = a(r0)
            f2349e = r0
            java.lang.String r0 = "VP8L"
            byte[] r0 = a(r0)
            f2350f = r0
            java.lang.String r0 = "VP8X"
            byte[] r0 = a(r0)
            g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.g.c.<clinit>():void");
    }

    private static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }

    public static boolean a(byte[] bArr, int i2, int i3) {
        if (i3 < 20 || !a(bArr, i2, i) || !a(bArr, i2 + 8, j)) {
            return false;
        }
        return true;
    }

    public static boolean a(byte[] bArr, int i2, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i2 > bArr.length) {
            return false;
        }
        for (int i3 = 0; i3 < bArr2.length; i3++) {
            if (bArr[i3 + i2] != bArr2[i3]) {
                return false;
            }
        }
        return true;
    }
}
