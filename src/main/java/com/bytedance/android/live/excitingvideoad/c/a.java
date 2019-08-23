package com.bytedance.android.live.excitingvideoad.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8382a;

    /* renamed from: b  reason: collision with root package name */
    static final char[] f8383b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f8382a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 1634(0x662, float:2.29E-42)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f8382a
            r13 = 1
            r14 = 1634(0x662, float:2.29E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0035:
            r2 = 0
            if (r0 == 0) goto L_0x0094
            int r3 = r17.length()     // Catch:{ Exception -> 0x0093 }
            if (r3 != 0) goto L_0x003f
            goto L_0x0094
        L_0x003f:
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r4 = "UTF-8"
            byte[] r0 = r0.getBytes(r4)     // Catch:{ Exception -> 0x0093 }
            r3.update(r0)     // Catch:{ Exception -> 0x0093 }
            byte[] r0 = r3.digest()     // Catch:{ Exception -> 0x0093 }
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0093 }
            r10[r9] = r0     // Catch:{ Exception -> 0x0093 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f8382a     // Catch:{ Exception -> 0x0093 }
            r13 = 1
            r14 = 1630(0x65e, float:2.284E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0093 }
            java.lang.Class<byte[]> r3 = byte[].class
            r15[r9] = r3     // Catch:{ Exception -> 0x0093 }
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0093 }
            if (r3 == 0) goto L_0x0083
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0093 }
            r10[r9] = r0     // Catch:{ Exception -> 0x0093 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f8382a     // Catch:{ Exception -> 0x0093 }
            r13 = 1
            r14 = 1630(0x65e, float:2.284E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0093 }
            java.lang.Class<byte[]> r0 = byte[].class
            r15[r9] = r0     // Catch:{ Exception -> 0x0093 }
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0093 }
            return r0
        L_0x0083:
            if (r0 == 0) goto L_0x008b
            int r1 = r0.length     // Catch:{ Exception -> 0x0093 }
            java.lang.String r0 = a(r0, r9, r1)     // Catch:{ Exception -> 0x0093 }
            return r0
        L_0x008b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0093 }
            java.lang.String r1 = "bytes is null"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0093 }
            throw r0     // Catch:{ Exception -> 0x0093 }
        L_0x0093:
            return r2
        L_0x0094:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.excitingvideoad.c.a.a(java.lang.String):java.lang.String");
    }

    private static String a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{bArr2, 0, Integer.valueOf(i2)}, null, f8382a, true, 1631, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{bArr2, 0, Integer.valueOf(i2)}, null, f8382a, true, 1631, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, String.class);
        } else if (bArr2 == null) {
            throw new NullPointerException("bytes is null");
        } else if (i3 + 0 <= bArr2.length) {
            int i4 = i3 * 2;
            char[] cArr = new char[i4];
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                byte b2 = bArr2[i6 + 0] & 255;
                int i7 = i5 + 1;
                cArr[i5] = f8383b[b2 >> 4];
                i5 = i7 + 1;
                cArr[i7] = f8383b[b2 & 15];
            }
            return new String(cArr, 0, i4);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
