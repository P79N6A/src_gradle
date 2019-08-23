package com.taobao.applink.util;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class c {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r5) {
        /*
            boolean r0 = com.taobao.applink.util.e.a((java.lang.String) r5)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{ Throwable -> 0x0040 }
            byte[] r5 = r5.getBytes()     // Catch:{ Throwable -> 0x0040 }
            r0.update(r5)     // Catch:{ Throwable -> 0x0040 }
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x0040 }
            r5.<init>()     // Catch:{ Throwable -> 0x0040 }
            byte[] r0 = r0.digest()     // Catch:{ Throwable -> 0x0040 }
            r2 = 0
        L_0x001f:
            int r3 = r0.length     // Catch:{ Throwable -> 0x0040 }
            if (r2 >= r3) goto L_0x003b
            byte r3 = r0[r2]     // Catch:{ Throwable -> 0x0040 }
            if (r3 >= 0) goto L_0x0028
            int r3 = r3 + 256
        L_0x0028:
            r4 = 16
            if (r3 >= r4) goto L_0x0031
            java.lang.String r4 = "0"
            r5.append(r4)     // Catch:{ Throwable -> 0x0040 }
        L_0x0031:
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch:{ Throwable -> 0x0040 }
            r5.append(r3)     // Catch:{ Throwable -> 0x0040 }
            int r2 = r2 + 1
            goto L_0x001f
        L_0x003b:
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0040 }
            return r5
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.applink.util.c.a(java.lang.String):java.lang.String");
    }

    public static String a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b2 : digest) {
                byte b3 = b2 & 255;
                if (b3 < 16) {
                    sb.append(PushConstants.PUSH_TYPE_NOTIFY);
                }
                sb.append(Integer.toHexString(b3));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}
