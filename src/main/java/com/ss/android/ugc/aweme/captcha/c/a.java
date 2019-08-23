package com.ss.android.ugc.aweme.captcha.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35280a;

    private static String a(byte[] bArr) {
        byte[] bArr2 = bArr;
        if (PatchProxy.isSupport(new Object[]{bArr2}, null, f35280a, true, 25765, new Class[]{byte[].class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{bArr2}, null, f35280a, true, 25765, new Class[]{byte[].class}, String.class);
        } else if (bArr2 == null) {
            return null;
        } else {
            char[] charArray = "0123456789abcdef".toCharArray();
            char[] cArr = new char[(bArr2.length * 2)];
            for (int i = 0; i < bArr2.length; i++) {
                byte b2 = bArr2[i] & 255;
                int i2 = i * 2;
                cArr[i2] = charArray[b2 >>> 4];
                cArr[i2 + 1] = charArray[b2 & 15];
            }
            return new String(cArr);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r17) {
        /*
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r4 = f35280a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 25764(0x64a4, float:3.6103E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0033
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f35280a
            r13 = 1
            r14 = 25764(0x64a4, float:3.6103E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0033:
            java.lang.String r2 = ""
            byte[] r0 = r17.getBytes()     // Catch:{ Exception -> 0x0095 }
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0095 }
            r10[r9] = r0     // Catch:{ Exception -> 0x0095 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f35280a     // Catch:{ Exception -> 0x0095 }
            r13 = 1
            r14 = 25761(0x64a1, float:3.6099E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0095 }
            java.lang.Class<byte[]> r3 = byte[].class
            r15[r9] = r3     // Catch:{ Exception -> 0x0095 }
            java.lang.Class<byte[]> r16 = byte[].class
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0095 }
            if (r3 == 0) goto L_0x006a
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0095 }
            r10[r9] = r0     // Catch:{ Exception -> 0x0095 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f35280a     // Catch:{ Exception -> 0x0095 }
            r13 = 1
            r14 = 25761(0x64a1, float:3.6099E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0095 }
            java.lang.Class<byte[]> r0 = byte[].class
            r15[r9] = r0     // Catch:{ Exception -> 0x0095 }
            java.lang.Class<byte[]> r16 = byte[].class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0095 }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x0095 }
            goto L_0x0090
        L_0x006a:
            java.lang.String r3 = "eagleye_9fd&fwfl"
            byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x0095 }
            javax.crypto.spec.SecretKeySpec r4 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x0095 }
            java.lang.String r5 = "AES"
            r4.<init>(r3, r5)     // Catch:{ Exception -> 0x0095 }
            r3 = 16
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x0095 }
            r3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15} // fill-array     // Catch:{ Exception -> 0x0095 }
            javax.crypto.spec.IvParameterSpec r5 = new javax.crypto.spec.IvParameterSpec     // Catch:{ Exception -> 0x0095 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r3 = "AES/CFB/NoPadding "
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r3)     // Catch:{ Exception -> 0x0095 }
            r3.init(r1, r4, r5)     // Catch:{ Exception -> 0x0095 }
            byte[] r0 = r3.doFinal(r0)     // Catch:{ Exception -> 0x0095 }
        L_0x0090:
            java.lang.String r0 = a((byte[]) r0)     // Catch:{ Exception -> 0x0095 }
            goto L_0x0096
        L_0x0095:
            r0 = r2
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.captcha.c.a.a(java.lang.String):java.lang.String");
    }
}
