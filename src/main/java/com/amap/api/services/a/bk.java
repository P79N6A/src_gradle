package com.amap.api.services.a;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bk {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f6642a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f6643b = new byte[SearchJediMixFeedAdapter.f42517f];

    static {
        for (int i = 0; i < 128; i++) {
            f6643b[i] = -1;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f6643b[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            f6643b[i3] = (byte) ((i3 - 97) + 26);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            f6643b[i4] = (byte) ((i4 - 48) + 52);
        }
        f6643b[43] = 62;
        f6643b[47] = 63;
    }

    public static String c(byte[] bArr) {
        try {
            return d(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(String str) {
        return bo.a(b(str));
    }

    public static String b(byte[] bArr) {
        try {
            return d(bArr);
        } catch (Throwable th) {
            bx.a(th, "er", "e64");
            return null;
        }
    }

    public static byte[] a(byte[] bArr) throws CertificateException, InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IOException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        if (instance == null) {
            return null;
        }
        instance.init(256);
        byte[] encoded = instance.generateKey().getEncoded();
        PublicKey c2 = bo.c();
        if (c2 == null) {
            return null;
        }
        byte[] a2 = a(encoded, (Key) c2);
        byte[] a3 = a(encoded, bArr);
        byte[] bArr2 = new byte[(a2.length + a3.length)];
        System.arraycopy(a2, 0, bArr2, 0, a2.length);
        System.arraycopy(a3, 0, bArr2, a2.length, a3.length);
        return bArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[LOOP:2: B:11:0x0024->B:14:0x0031, LOOP_START, PHI: r4 
      PHI: (r4v1 int) = (r4v0 int), (r4v8 int) binds: [B:10:0x0022, B:14:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0096 A[EDGE_INSN: B:49:0x0096->B:43:0x0096 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0096 A[EDGE_INSN: B:51:0x0096->B:43:0x0096 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] b(java.lang.String r8) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0006
            byte[] r8 = new byte[r0]
            return r8
        L_0x0006:
            byte[] r8 = com.amap.api.services.a.bo.a((java.lang.String) r8)
            int r1 = r8.length
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>(r1)
        L_0x0010:
            if (r0 >= r1) goto L_0x0096
        L_0x0012:
            byte[] r3 = f6643b
            int r4 = r0 + 1
            byte r0 = r8[r0]
            byte r0 = r3[r0]
            r3 = -1
            if (r4 >= r1) goto L_0x0022
            if (r0 == r3) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r0 = r4
            goto L_0x0012
        L_0x0022:
            if (r0 == r3) goto L_0x0096
        L_0x0024:
            byte[] r5 = f6643b
            int r6 = r4 + 1
            byte r4 = r8[r4]
            byte r4 = r5[r4]
            if (r6 >= r1) goto L_0x0033
            if (r4 == r3) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r4 = r6
            goto L_0x0024
        L_0x0033:
            if (r4 == r3) goto L_0x0096
            int r0 = r0 << 2
            r5 = r4 & 48
            int r5 = r5 >>> 4
            r0 = r0 | r5
            r2.write(r0)
        L_0x003f:
            if (r6 != r1) goto L_0x0046
            byte[] r8 = r2.toByteArray()
            return r8
        L_0x0046:
            int r0 = r6 + 1
            byte r5 = r8[r6]
            r6 = 61
            if (r5 != r6) goto L_0x0053
            byte[] r8 = r2.toByteArray()
            return r8
        L_0x0053:
            byte[] r7 = f6643b
            byte r5 = r7[r5]
            if (r0 >= r1) goto L_0x005e
            if (r5 == r3) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r6 = r0
            goto L_0x003f
        L_0x005e:
            if (r5 == r3) goto L_0x0096
            r4 = r4 & 15
            int r4 = r4 << 4
            r7 = r5 & 60
            int r7 = r7 >>> 2
            r4 = r4 | r7
            r2.write(r4)
        L_0x006c:
            if (r0 != r1) goto L_0x0073
            byte[] r8 = r2.toByteArray()
            return r8
        L_0x0073:
            int r4 = r0 + 1
            byte r0 = r8[r0]
            if (r0 != r6) goto L_0x007e
            byte[] r8 = r2.toByteArray()
            return r8
        L_0x007e:
            byte[] r7 = f6643b
            byte r0 = r7[r0]
            if (r4 >= r1) goto L_0x0089
            if (r0 == r3) goto L_0x0087
            goto L_0x0089
        L_0x0087:
            r0 = r4
            goto L_0x006c
        L_0x0089:
            if (r0 == r3) goto L_0x0096
            r3 = r5 & 3
            int r3 = r3 << 6
            r0 = r0 | r3
            r2.write(r0)
            r0 = r4
            goto L_0x0010
        L_0x0096:
            byte[] r8 = r2.toByteArray()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.bk.b(java.lang.String):byte[]");
    }

    private static String d(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i2 = i + 1;
            byte b2 = bArr[i] & 255;
            if (i2 == length) {
                stringBuffer.append(f6642a[b2 >>> 2]);
                stringBuffer.append(f6642a[(b2 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i3 = i2 + 1;
            byte b3 = bArr[i2] & 255;
            if (i3 == length) {
                stringBuffer.append(f6642a[b2 >>> 2]);
                stringBuffer.append(f6642a[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
                stringBuffer.append(f6642a[(b3 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            int i4 = i3 + 1;
            byte b4 = bArr[i3] & 255;
            stringBuffer.append(f6642a[b2 >>> 2]);
            stringBuffer.append(f6642a[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
            stringBuffer.append(f6642a[((b3 & 15) << 2) | ((b4 & 192) >>> 6)]);
            stringBuffer.append(f6642a[b4 & 63]);
            i = i4;
        }
        return stringBuffer.toString();
    }

    static byte[] a(byte[] bArr, Key key) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher instance = Cipher.getInstance(bo.c(bv.f6658a));
        instance.init(1, key);
        return instance.doFinal(bArr);
    }

    private static byte[] b(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        return c(bArr, bArr2, bo.b());
    }

    static byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return b(bArr, bArr2);
        } catch (Throwable th) {
            bx.a(th, "er", "asEn");
            return null;
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        return d(bArr, bArr2, bArr3);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {
        return c(bArr, bArr2, bArr3);
    }

    private static byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        try {
            instance.init(1, secretKeySpec, ivParameterSpec);
        } catch (InvalidAlgorithmParameterException unused) {
        }
        return instance.doFinal(bArr2);
    }

    private static byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, secretKeySpec, ivParameterSpec);
        return instance.doFinal(bArr2);
    }
}
