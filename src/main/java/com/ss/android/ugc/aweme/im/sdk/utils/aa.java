package com.ss.android.ugc.aweme.im.sdk.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52459a;

    /* renamed from: b  reason: collision with root package name */
    protected static char[] f52460b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(File file) {
        File file2 = file;
        if (PatchProxy.isSupport(new Object[]{file2}, null, f52459a, true, 53647, new Class[]{File.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{file2}, null, f52459a, true, 53647, new Class[]{File.class}, String.class);
        } else if (!file.isFile()) {
            return "";
        } else {
            byte[] bArr = new byte[1024];
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 1024);
                    if (read != -1) {
                        instance.update(bArr, 0, read);
                    } else {
                        bufferedInputStream.close();
                        return b(instance.digest());
                    }
                }
            } catch (Exception unused) {
                return "";
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(byte[] r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f52459a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r3 = byte[].class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 53646(0xd18e, float:7.5174E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f52459a
            r13 = 1
            r14 = 53646(0xd18e, float:7.5174E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r0 = byte[].class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0037:
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0067 }
            byte[] r0 = r1.digest(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0067 }
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ NoSuchAlgorithmException -> 0x0067 }
            r1.<init>()     // Catch:{ NoSuchAlgorithmException -> 0x0067 }
        L_0x0046:
            int r2 = r0.length     // Catch:{ NoSuchAlgorithmException -> 0x0067 }
            if (r9 >= r2) goto L_0x0062
            byte r2 = r0[r9]     // Catch:{ NoSuchAlgorithmException -> 0x0067 }
            char[] r3 = f52460b     // Catch:{ NoSuchAlgorithmException -> 0x0067 }
            r4 = r2 & 240(0xf0, float:3.36E-43)
            int r4 = r4 >> 4
            char r3 = r3[r4]     // Catch:{ NoSuchAlgorithmException -> 0x0067 }
            r1.append(r3)     // Catch:{ NoSuchAlgorithmException -> 0x0067 }
            char[] r3 = f52460b     // Catch:{ NoSuchAlgorithmException -> 0x0067 }
            r2 = r2 & 15
            char r2 = r3[r2]     // Catch:{ NoSuchAlgorithmException -> 0x0067 }
            r1.append(r2)     // Catch:{ NoSuchAlgorithmException -> 0x0067 }
            int r9 = r9 + 1
            goto L_0x0046
        L_0x0062:
            java.lang.String r0 = r1.toString()     // Catch:{ NoSuchAlgorithmException -> 0x0067 }
            return r0
        L_0x0067:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.utils.aa.a(byte[]):java.lang.String");
    }

    private static String b(byte[] bArr) {
        byte[] bArr2 = bArr;
        if (PatchProxy.isSupport(new Object[]{bArr2}, null, f52459a, true, 53648, new Class[]{byte[].class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{bArr2}, null, f52459a, true, 53648, new Class[]{byte[].class}, String.class);
        } else if (bArr2 == null || bArr2.length <= 0) {
            return "";
        } else {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            char[] cArr2 = new char[(bArr2.length * 2)];
            int i = 0;
            for (byte b2 : bArr2) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b2 >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b2 & 15];
            }
            return new String(cArr2);
        }
    }
}
