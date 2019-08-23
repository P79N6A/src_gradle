package com.ss.android.ugc.aweme.photo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Closeable;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58544a;

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f58545b = {71, 73, 70, 56, 55, 97};

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f58546c = {71, 73, 70, 56, 57, 97};

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f58547d = {-1, -40, -1};

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f58548e = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f58549f = {66, 77};
    private static final byte[] g = {82, 73, 70, 70, 87, 69, 66, 80};
    private static final byte[] h = {0, 0, 0, 0, 102, 116, 121, 112};
    private static final byte[] i = {102, 116, 121, 112, 51, 103};

    private static boolean b(byte[] bArr) {
        byte[] bArr2 = h;
        if (bArr == null || bArr.length != 12) {
            return false;
        }
        for (int i2 = 4; i2 < 8; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static void a(Closeable closeable) {
        if (PatchProxy.isSupport(new Object[]{closeable}, null, f58544a, true, 63561, new Class[]{Closeable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{closeable}, null, f58544a, true, 63561, new Class[]{Closeable.class}, Void.TYPE);
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    private static boolean a(byte[] bArr) {
        byte[] bArr2 = g;
        if (bArr == null || bArr.length != 12) {
            return false;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        for (int i3 = 0; i3 < 4; i3++) {
            if (bArr[(bArr.length - i3) - 1] != bArr2[(bArr2.length - i3) - 1]) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.support.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f58544a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 63559(0xf847, float:8.9065E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f58544a
            r13 = 1
            r14 = 63559(0xf847, float:8.9065E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0037:
            r2 = 0
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ Throwable -> 0x00e3, all -> 0x00dd }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x00e3, all -> 0x00dd }
            java.io.File r5 = new java.io.File     // Catch:{ Throwable -> 0x00e3, all -> 0x00dd }
            r5.<init>(r0)     // Catch:{ Throwable -> 0x00e3, all -> 0x00dd }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x00e3, all -> 0x00dd }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x00e3, all -> 0x00dd }
            r0 = 12
            byte[] r0 = new byte[r0]     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            r3.read(r0)     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            r10[r9] = r0     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f58544a     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            r13 = 1
            r14 = 63560(0xf848, float:8.9067E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            java.lang.Class<byte[]> r2 = byte[].class
            r15[r9] = r2     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            if (r2 == 0) goto L_0x0081
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            r10[r9] = r0     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f58544a     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            r13 = 1
            r14 = 63560(0xf848, float:8.9067E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            java.lang.Class<byte[]> r0 = byte[].class
            r15[r9] = r0     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            goto L_0x00d5
        L_0x0081:
            byte[] r1 = f58546c     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            boolean r1 = a(r0, r1)     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            if (r1 != 0) goto L_0x00d3
            byte[] r1 = f58545b     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            boolean r1 = a(r0, r1)     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            if (r1 == 0) goto L_0x0092
            goto L_0x00d3
        L_0x0092:
            byte[] r1 = f58547d     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            boolean r1 = a(r0, r1)     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            if (r1 == 0) goto L_0x009d
            java.lang.String r0 = "image/jpg"
            goto L_0x00d5
        L_0x009d:
            byte[] r1 = f58548e     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            boolean r1 = a(r0, r1)     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            if (r1 == 0) goto L_0x00a8
            java.lang.String r0 = "image/png"
            goto L_0x00d5
        L_0x00a8:
            byte[] r1 = f58549f     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            boolean r1 = a(r0, r1)     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            if (r1 == 0) goto L_0x00b3
            java.lang.String r0 = "image/bmp"
            goto L_0x00d5
        L_0x00b3:
            boolean r1 = a((byte[]) r0)     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            if (r1 == 0) goto L_0x00bc
            java.lang.String r0 = "image/webp"
            goto L_0x00d5
        L_0x00bc:
            boolean r1 = b(r0)     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            if (r1 == 0) goto L_0x00c5
            java.lang.String r0 = "video/avc"
            goto L_0x00d5
        L_0x00c5:
            byte[] r1 = i     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            boolean r0 = a(r0, r1)     // Catch:{ Throwable -> 0x00db, all -> 0x00d9 }
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = "video/3gpp"
            goto L_0x00d5
        L_0x00d0:
            java.lang.String r0 = ""
            goto L_0x00d5
        L_0x00d3:
            java.lang.String r0 = "image/gif"
        L_0x00d5:
            a((java.io.Closeable) r3)
            return r0
        L_0x00d9:
            r0 = move-exception
            goto L_0x00df
        L_0x00db:
            r2 = r3
            goto L_0x00e3
        L_0x00dd:
            r0 = move-exception
            r3 = r2
        L_0x00df:
            a((java.io.Closeable) r3)
            throw r0
        L_0x00e3:
            a((java.io.Closeable) r2)
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.photo.i.a(java.lang.String):java.lang.String");
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        boolean z = false;
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= bArr2.length) {
                z = true;
                break;
            } else if (bArr[i2] != bArr2[i2]) {
                break;
            } else {
                i2++;
            }
        }
        return z;
    }
}
