package com.ali.auth.third.core.util;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class Rsa {
    private static PublicKey a(String str, String str2) throws NoSuchAlgorithmException, Exception {
        return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(Base64.decode(str2)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053 A[SYNTHETIC, Splitter:B:19:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A[SYNTHETIC, Splitter:B:27:0x005a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String decrypt(java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 0
            java.security.spec.PKCS8EncodedKeySpec r1 = new java.security.spec.PKCS8EncodedKeySpec     // Catch:{ Exception -> 0x0057, all -> 0x0050 }
            byte[] r6 = com.ali.auth.third.core.util.Base64.decode(r6)     // Catch:{ Exception -> 0x0057, all -> 0x0050 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x0057, all -> 0x0050 }
            java.lang.String r6 = "RSA"
            java.security.KeyFactory r6 = java.security.KeyFactory.getInstance(r6)     // Catch:{ Exception -> 0x0057, all -> 0x0050 }
            java.security.PrivateKey r6 = r6.generatePrivate(r1)     // Catch:{ Exception -> 0x0057, all -> 0x0050 }
            java.lang.String r1 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch:{ Exception -> 0x0057, all -> 0x0050 }
            r2 = 2
            r1.init(r2, r6)     // Catch:{ Exception -> 0x0057, all -> 0x0050 }
            byte[] r5 = com.ali.auth.third.core.util.Base64.decode(r5)     // Catch:{ Exception -> 0x0057, all -> 0x0050 }
            int r6 = r1.getBlockSize()     // Catch:{ Exception -> 0x0057, all -> 0x0050 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0057, all -> 0x0050 }
            r2.<init>()     // Catch:{ Exception -> 0x0057, all -> 0x0050 }
            r3 = 0
        L_0x002c:
            int r4 = r5.length     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            if (r3 >= r4) goto L_0x0040
            int r4 = r5.length     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            int r4 = r4 - r3
            if (r4 >= r6) goto L_0x0036
            int r4 = r5.length     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            int r4 = r4 - r3
            goto L_0x0037
        L_0x0036:
            r4 = r6
        L_0x0037:
            byte[] r4 = r1.doFinal(r5, r3, r4)     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            r2.write(r4)     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            int r3 = r3 + r6
            goto L_0x002c
        L_0x0040:
            java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            byte[] r6 = r2.toByteArray()     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0058, all -> 0x004d }
            r2.close()     // Catch:{ IOException -> 0x005e }
            goto L_0x005e
        L_0x004d:
            r5 = move-exception
            r0 = r2
            goto L_0x0051
        L_0x0050:
            r5 = move-exception
        L_0x0051:
            if (r0 == 0) goto L_0x0056
            r0.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            throw r5
        L_0x0057:
            r2 = r0
        L_0x0058:
            if (r2 == 0) goto L_0x005d
            r2.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            r5 = r0
        L_0x005e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.auth.third.core.util.Rsa.decrypt(java.lang.String, java.lang.String):java.lang.String");
    }

    public static boolean doCheck(String str, String str2, String str3) {
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str3)));
            Signature instance = Signature.getInstance("SHA1WithRSA");
            instance.initVerify(generatePublic);
            instance.update(str.getBytes("utf-8"));
            return instance.verify(Base64.decode(str2));
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c A[SYNTHETIC, Splitter:B:19:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0053 A[SYNTHETIC, Splitter:B:27:0x0053] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String encrypt(java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 0
            java.lang.String r1 = "RSA"
            java.security.PublicKey r6 = a(r1, r6)     // Catch:{ Exception -> 0x0050, all -> 0x0049 }
            java.lang.String r1 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch:{ Exception -> 0x0050, all -> 0x0049 }
            r2 = 1
            r1.init(r2, r6)     // Catch:{ Exception -> 0x0050, all -> 0x0049 }
            java.lang.String r6 = "UTF-8"
            byte[] r5 = r5.getBytes(r6)     // Catch:{ Exception -> 0x0050, all -> 0x0049 }
            int r6 = r1.getBlockSize()     // Catch:{ Exception -> 0x0050, all -> 0x0049 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0050, all -> 0x0049 }
            r2.<init>()     // Catch:{ Exception -> 0x0050, all -> 0x0049 }
            r3 = 0
        L_0x0021:
            int r4 = r5.length     // Catch:{ Exception -> 0x0051, all -> 0x0046 }
            if (r3 >= r4) goto L_0x0035
            int r4 = r5.length     // Catch:{ Exception -> 0x0051, all -> 0x0046 }
            int r4 = r4 - r3
            if (r4 >= r6) goto L_0x002b
            int r4 = r5.length     // Catch:{ Exception -> 0x0051, all -> 0x0046 }
            int r4 = r4 - r3
            goto L_0x002c
        L_0x002b:
            r4 = r6
        L_0x002c:
            byte[] r4 = r1.doFinal(r5, r3, r4)     // Catch:{ Exception -> 0x0051, all -> 0x0046 }
            r2.write(r4)     // Catch:{ Exception -> 0x0051, all -> 0x0046 }
            int r3 = r3 + r6
            goto L_0x0021
        L_0x0035:
            java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x0051, all -> 0x0046 }
            byte[] r6 = r2.toByteArray()     // Catch:{ Exception -> 0x0051, all -> 0x0046 }
            java.lang.String r6 = com.ali.auth.third.core.util.Base64.encode(r6)     // Catch:{ Exception -> 0x0051, all -> 0x0046 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0051, all -> 0x0046 }
            r2.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x0057
        L_0x0046:
            r5 = move-exception
            r0 = r2
            goto L_0x004a
        L_0x0049:
            r5 = move-exception
        L_0x004a:
            if (r0 == 0) goto L_0x004f
            r0.close()     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            throw r5
        L_0x0050:
            r2 = r0
        L_0x0051:
            if (r2 == 0) goto L_0x0056
            r2.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            r5 = r0
        L_0x0057:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.auth.third.core.util.Rsa.encrypt(java.lang.String, java.lang.String):java.lang.String");
    }

    public static String sign(String str, String str2) {
        try {
            PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2)));
            Signature instance = Signature.getInstance("SHA1WithRSA");
            instance.initSign(generatePrivate);
            instance.update(str.getBytes("utf-8"));
            return Base64.encode(instance.sign());
        } catch (Exception unused) {
            return null;
        }
    }
}
