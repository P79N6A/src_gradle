package com.cmic.sso.sdk.d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static ReentrantLock f23066a = new ReentrantLock(true);

    private static byte[] a() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    private static String c(Context context) {
        return n.b(context, "AES_KEY", "");
    }

    private static byte[] b(Context context) {
        byte[] bArr;
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load(null);
            if (!TextUtils.isEmpty(c(context))) {
                String c2 = c(context);
                if (!TextUtils.isEmpty(c2)) {
                    byte[] decode = Base64.decode(c2, 0);
                    PrivateKey privateKey = (PrivateKey) instance.getKey("CMCC_SDK", null);
                    if (privateKey == null) {
                        return null;
                    }
                    Cipher instance2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                    instance2.init(2, privateKey);
                    bArr = instance2.doFinal(decode);
                } else {
                    bArr = null;
                }
            } else if (!a(context)) {
                return null;
            } else {
                byte[] a2 = a();
                PublicKey publicKey = instance.getCertificate("CMCC_SDK").getPublicKey();
                Cipher instance3 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                instance3.init(1, publicKey);
                c(context, Base64.encodeToString(instance3.doFinal(a2), 0));
                bArr = a2;
            }
            return bArr;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        com.cmic.sso.sdk.d.f.a("KeystoreUtil", r8.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        f23066a.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e9, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        com.cmic.sso.sdk.d.f.a("KeystoreUtil", r8.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f3, code lost:
        f23066a.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f8, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f9, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fa, code lost:
        f23066a.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ff, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0105, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f9 A[ExcHandler:  FINALLY, Splitter:B:1:0x0001] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r8) {
        /*
            r0 = 0
            java.util.concurrent.locks.ReentrantLock r1 = f23066a     // Catch:{ Exception -> 0x0100, all -> 0x00f9 }
            r1.lock()     // Catch:{ Exception -> 0x0100, all -> 0x00f9 }
            java.lang.String r1 = "AndroidKeyStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)     // Catch:{ Exception -> 0x00e9, all -> 0x00f9 }
            r2 = 0
            r1.load(r2)     // Catch:{ Exception -> 0x00e9, all -> 0x00f9 }
            java.lang.String r2 = "CMCC_SDK"
            java.security.cert.Certificate r1 = r1.getCertificate(r2)     // Catch:{ Exception -> 0x00e9, all -> 0x00f9 }
            r2 = 1
            if (r1 == 0) goto L_0x001f
            java.util.concurrent.locks.ReentrantLock r8 = f23066a
            r8.unlock()
            return r2
        L_0x001f:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0100, all -> 0x00f9 }
            r3 = 23
            r4 = 1000(0x3e8, double:4.94E-321)
            if (r1 < r3) goto L_0x0079
            java.lang.String r8 = "RSA"
            java.lang.String r1 = "AndroidKeyStore"
            java.security.KeyPairGenerator r8 = java.security.KeyPairGenerator.getInstance(r8, r1)     // Catch:{ Exception -> 0x0069, all -> 0x00f9 }
            android.security.keystore.KeyGenParameterSpec$Builder r1 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ Exception -> 0x0069, all -> 0x00f9 }
            java.lang.String r3 = "CMCC_SDK"
            r6 = 3
            r1.<init>(r3, r6)     // Catch:{ Exception -> 0x0069, all -> 0x00f9 }
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0069, all -> 0x00f9 }
            java.lang.String r6 = "SHA-256"
            r3[r0] = r6     // Catch:{ Exception -> 0x0069, all -> 0x00f9 }
            java.lang.String r6 = "SHA-512"
            r3[r2] = r6     // Catch:{ Exception -> 0x0069, all -> 0x00f9 }
            android.security.keystore.KeyGenParameterSpec$Builder r1 = r1.setDigests(r3)     // Catch:{ Exception -> 0x0069, all -> 0x00f9 }
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0069, all -> 0x00f9 }
            java.lang.String r6 = "PKCS1Padding"
            r3[r0] = r6     // Catch:{ Exception -> 0x0069, all -> 0x00f9 }
            android.security.keystore.KeyGenParameterSpec$Builder r1 = r1.setEncryptionPaddings(r3)     // Catch:{ Exception -> 0x0069, all -> 0x00f9 }
            r3 = 2048(0x800, float:2.87E-42)
            android.security.keystore.KeyGenParameterSpec$Builder r1 = r1.setKeySize(r3)     // Catch:{ Exception -> 0x0069, all -> 0x00f9 }
            android.security.keystore.KeyGenParameterSpec r1 = r1.build()     // Catch:{ Exception -> 0x0069, all -> 0x00f9 }
            r8.initialize(r1)     // Catch:{ Exception -> 0x0069, all -> 0x00f9 }
            java.lang.Thread.sleep(r4)     // Catch:{ Exception -> 0x0069, all -> 0x00f9 }
            r8.generateKeyPair()     // Catch:{ Exception -> 0x0069, all -> 0x00f9 }
            java.util.concurrent.locks.ReentrantLock r8 = f23066a
            r8.unlock()
            return r2
        L_0x0069:
            r8 = move-exception
            java.lang.String r1 = "KeystoreUtil"
            java.lang.String r8 = r8.getMessage()     // Catch:{ Exception -> 0x0100, all -> 0x00f9 }
            com.cmic.sso.sdk.d.f.a(r1, r8)     // Catch:{ Exception -> 0x0100, all -> 0x00f9 }
            java.util.concurrent.locks.ReentrantLock r8 = f23066a
            r8.unlock()
            return r0
        L_0x0079:
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x0100, all -> 0x00f9 }
            java.util.Calendar r3 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x0100, all -> 0x00f9 }
            r6 = 30
            r3.add(r2, r6)     // Catch:{ Exception -> 0x0100, all -> 0x00f9 }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00d9, all -> 0x00f9 }
            r7 = 18
            if (r6 < r7) goto L_0x00d3
            android.security.KeyPairGeneratorSpec$Builder r6 = new android.security.KeyPairGeneratorSpec$Builder     // Catch:{ Exception -> 0x00d9, all -> 0x00f9 }
            r6.<init>(r8)     // Catch:{ Exception -> 0x00d9, all -> 0x00f9 }
            java.lang.String r8 = "CMCC_SDK"
            android.security.KeyPairGeneratorSpec$Builder r8 = r6.setAlias(r8)     // Catch:{ Exception -> 0x00d9, all -> 0x00f9 }
            javax.security.auth.x500.X500Principal r6 = new javax.security.auth.x500.X500Principal     // Catch:{ Exception -> 0x00d9, all -> 0x00f9 }
            java.lang.String r7 = "CN=CMCC_SDK"
            r6.<init>(r7)     // Catch:{ Exception -> 0x00d9, all -> 0x00f9 }
            android.security.KeyPairGeneratorSpec$Builder r8 = r8.setSubject(r6)     // Catch:{ Exception -> 0x00d9, all -> 0x00f9 }
            java.math.BigInteger r6 = java.math.BigInteger.TEN     // Catch:{ Exception -> 0x00d9, all -> 0x00f9 }
            android.security.KeyPairGeneratorSpec$Builder r8 = r8.setSerialNumber(r6)     // Catch:{ Exception -> 0x00d9, all -> 0x00f9 }
            java.util.Date r1 = r1.getTime()     // Catch:{ Exception -> 0x00d9, all -> 0x00f9 }
            android.security.KeyPairGeneratorSpec$Builder r8 = r8.setStartDate(r1)     // Catch:{ Exception -> 0x00d9, all -> 0x00f9 }
            java.util.Date r1 = r3.getTime()     // Catch:{ Exception -> 0x00d9, all -> 0x00f9 }
            android.security.KeyPairGeneratorSpec$Builder r8 = r8.setEndDate(r1)     // Catch:{ Exception -> 0x00d9, all -> 0x00f9 }
            android.security.KeyPairGeneratorSpec r8 = r8.build()     // Catch:{ Exception -> 0x00d9, all -> 0x00f9 }
            java.lang.String r1 = "RSA"
            java.lang.String r3 = "AndroidKeyStore"
            java.security.KeyPairGenerator r1 = java.security.KeyPairGenerator.getInstance(r1, r3)     // Catch:{ Exception -> 0x00d9, all -> 0x00f9 }
            r1.initialize(r8)     // Catch:{ Exception -> 0x00d9, all -> 0x00f9 }
            java.lang.Thread.sleep(r4)     // Catch:{ Exception -> 0x00d9, all -> 0x00f9 }
            r1.generateKeyPair()     // Catch:{ Exception -> 0x00d9, all -> 0x00f9 }
            java.util.concurrent.locks.ReentrantLock r8 = f23066a
            r8.unlock()
            return r2
        L_0x00d3:
            java.util.concurrent.locks.ReentrantLock r8 = f23066a
            r8.unlock()
            return r0
        L_0x00d9:
            r8 = move-exception
            java.lang.String r1 = "KeystoreUtil"
            java.lang.String r8 = r8.getMessage()     // Catch:{ Exception -> 0x0100, all -> 0x00f9 }
            com.cmic.sso.sdk.d.f.a(r1, r8)     // Catch:{ Exception -> 0x0100, all -> 0x00f9 }
            java.util.concurrent.locks.ReentrantLock r8 = f23066a
            r8.unlock()
            return r0
        L_0x00e9:
            r8 = move-exception
            java.lang.String r1 = "KeystoreUtil"
            java.lang.String r8 = r8.getMessage()     // Catch:{ Exception -> 0x0100, all -> 0x00f9 }
            com.cmic.sso.sdk.d.f.a(r1, r8)     // Catch:{ Exception -> 0x0100, all -> 0x00f9 }
            java.util.concurrent.locks.ReentrantLock r8 = f23066a
            r8.unlock()
            return r0
        L_0x00f9:
            r8 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = f23066a
            r0.unlock()
            throw r8
        L_0x0100:
            java.util.concurrent.locks.ReentrantLock r8 = f23066a
            r8.unlock()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmic.sso.sdk.d.e.a(android.content.Context):boolean");
    }

    private static void c(Context context, String str) {
        n.a(context, "AES_KEY", str);
    }

    static String a(Context context, String str) {
        byte[] b2 = b(context);
        if (b2 != null) {
            return a.a(b2, str);
        }
        return null;
    }

    static String b(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            byte[] b2 = b(context);
            if (b2 != null) {
                return a.b(b2, str);
            }
        }
        return null;
    }
}
