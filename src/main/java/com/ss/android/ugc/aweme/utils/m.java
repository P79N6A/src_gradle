package com.ss.android.ugc.aweme.utils;

import android.content.pm.PackageManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75909a;

    public static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f75909a, true, 87899, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f75909a, true, 87899, new Class[0], String.class);
        }
        try {
            return a(k.a().getPackageManager().getPackageInfo(k.a().getPackageName(), 64).signatures[0].toByteArray());
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(byte[] r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f75909a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r3 = byte[].class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 87898(0x1575a, float:1.23171E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75909a
            r13 = 1
            r14 = 87898(0x1575a, float:1.23171E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r0 = byte[].class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0037:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x007c }
            r3.reset()     // Catch:{ NoSuchAlgorithmException -> 0x007c }
            r3.update(r0)     // Catch:{ NoSuchAlgorithmException -> 0x007c }
            byte[] r0 = r3.digest()     // Catch:{ NoSuchAlgorithmException -> 0x007c }
        L_0x004c:
            int r3 = r0.length     // Catch:{ NoSuchAlgorithmException -> 0x007c }
            if (r9 >= r3) goto L_0x007c
            byte r3 = r0[r9]     // Catch:{ NoSuchAlgorithmException -> 0x007c }
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch:{ NoSuchAlgorithmException -> 0x007c }
            int r3 = r3.length()     // Catch:{ NoSuchAlgorithmException -> 0x007c }
            if (r3 != r1) goto L_0x006e
            java.lang.String r3 = "0"
            r2.append(r3)     // Catch:{ NoSuchAlgorithmException -> 0x007c }
            byte r3 = r0[r9]     // Catch:{ NoSuchAlgorithmException -> 0x007c }
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch:{ NoSuchAlgorithmException -> 0x007c }
            r2.append(r3)     // Catch:{ NoSuchAlgorithmException -> 0x007c }
            goto L_0x0079
        L_0x006e:
            byte r3 = r0[r9]     // Catch:{ NoSuchAlgorithmException -> 0x007c }
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch:{ NoSuchAlgorithmException -> 0x007c }
            r2.append(r3)     // Catch:{ NoSuchAlgorithmException -> 0x007c }
        L_0x0079:
            int r9 = r9 + 1
            goto L_0x004c
        L_0x007c:
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.m.a(byte[]):java.lang.String");
    }
}
