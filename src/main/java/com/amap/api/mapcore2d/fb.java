package com.amap.api.mapcore2d;

import android.content.Context;
import android.text.TextUtils;

public class fb {

    /* renamed from: a  reason: collision with root package name */
    private Context f6114a;

    /* renamed from: b  reason: collision with root package name */
    private String f6115b;

    /* renamed from: c  reason: collision with root package name */
    private String f6116c;

    /* renamed from: d  reason: collision with root package name */
    private String f6117d;

    /* renamed from: e  reason: collision with root package name */
    private String f6118e;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072 A[SYNTHETIC, Splitter:B:18:0x0072] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079 A[SYNTHETIC, Splitter:B:23:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] a() {
        /*
            r6 = this;
            r0 = 0
            byte[] r0 = new byte[r0]
            r1 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x0065, all -> 0x0062 }
            r2.<init>()     // Catch:{ Throwable -> 0x0065, all -> 0x0062 }
            java.lang.String r1 = r6.f6116c     // Catch:{ Throwable -> 0x0060 }
            com.amap.api.mapcore2d.cz.a((java.io.ByteArrayOutputStream) r2, (java.lang.String) r1)     // Catch:{ Throwable -> 0x0060 }
            java.lang.String r1 = r6.f6117d     // Catch:{ Throwable -> 0x0060 }
            com.amap.api.mapcore2d.cz.a((java.io.ByteArrayOutputStream) r2, (java.lang.String) r1)     // Catch:{ Throwable -> 0x0060 }
            java.lang.String r1 = r6.f6115b     // Catch:{ Throwable -> 0x0060 }
            com.amap.api.mapcore2d.cz.a((java.io.ByteArrayOutputStream) r2, (java.lang.String) r1)     // Catch:{ Throwable -> 0x0060 }
            android.content.Context r1 = r6.f6114a     // Catch:{ Throwable -> 0x0060 }
            int r1 = com.amap.api.mapcore2d.ct.m(r1)     // Catch:{ Throwable -> 0x0060 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Throwable -> 0x0060 }
            com.amap.api.mapcore2d.cz.a((java.io.ByteArrayOutputStream) r2, (java.lang.String) r1)     // Catch:{ Throwable -> 0x0060 }
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch:{ Throwable -> 0x0060 }
            java.lang.String r3 = "SSS"
            r1.<init>(r3)     // Catch:{ Throwable -> 0x0060 }
            java.util.Date r3 = new java.util.Date     // Catch:{ Throwable -> 0x0060 }
            r3.<init>()     // Catch:{ Throwable -> 0x0060 }
            r1.format(r3)     // Catch:{ Throwable -> 0x0060 }
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch:{ Throwable -> 0x0060 }
            r3 = 14
            int r1 = r1.get(r3)     // Catch:{ Throwable -> 0x0060 }
            byte[] r1 = r6.a((int) r1)     // Catch:{ Throwable -> 0x0060 }
            r2.write(r1)     // Catch:{ Throwable -> 0x0060 }
            java.lang.String r1 = r6.f6118e     // Catch:{ Throwable -> 0x0060 }
            byte[] r1 = r6.b(r1)     // Catch:{ Throwable -> 0x0060 }
            r2.write(r1)     // Catch:{ Throwable -> 0x0060 }
            java.lang.String r1 = r6.f6118e     // Catch:{ Throwable -> 0x0060 }
            byte[] r1 = com.amap.api.mapcore2d.cz.a((java.lang.String) r1)     // Catch:{ Throwable -> 0x0060 }
            r2.write(r1)     // Catch:{ Throwable -> 0x0060 }
            byte[] r1 = r2.toByteArray()     // Catch:{ Throwable -> 0x0060 }
            r2.close()     // Catch:{ Throwable -> 0x005e }
        L_0x005e:
            r0 = r1
            goto L_0x0075
        L_0x0060:
            r1 = move-exception
            goto L_0x0069
        L_0x0062:
            r0 = move-exception
            r2 = r1
            goto L_0x0077
        L_0x0065:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L_0x0069:
            java.lang.String r3 = "StatisticsEntity"
            java.lang.String r4 = "toDatas"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r1, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x0076 }
            if (r2 == 0) goto L_0x0075
            r2.close()     // Catch:{ Throwable -> 0x0075 }
        L_0x0075:
            return r0
        L_0x0076:
            r0 = move-exception
        L_0x0077:
            if (r2 == 0) goto L_0x007c
            r2.close()     // Catch:{ Throwable -> 0x007c }
        L_0x007c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.fb.a():byte[]");
    }

    public void a(String str) throws co {
        if (TextUtils.isEmpty(str) || str.length() > 65536) {
            throw new co("无效的参数 - IllegalArgumentException");
        }
        this.f6118e = str;
    }

    public byte[] a(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public byte[] b(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[]{0, 0};
        }
        int length = str.length();
        return new byte[]{(byte) (length / 256), (byte) (length % 256)};
    }

    public fb(Context context, String str, String str2, String str3) throws co {
        if (TextUtils.isEmpty(str3) || str3.length() > 256) {
            throw new co("无效的参数 - IllegalArgumentException");
        }
        this.f6114a = context.getApplicationContext();
        this.f6116c = str;
        this.f6117d = str2;
        this.f6115b = str3;
    }
}
