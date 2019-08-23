package com.amap.api.mapcore2d;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class cu {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f5894a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f5895b = new byte[SearchJediMixFeedAdapter.f42517f];

    static {
        for (int i = 0; i < 128; i++) {
            f5895b[i] = -1;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f5895b[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            f5895b[i3] = (byte) ((i3 - 97) + 26);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            f5895b[i4] = (byte) ((i4 - 48) + 52);
        }
        f5895b[43] = 62;
        f5895b[47] = 63;
    }

    public static String b(byte[] bArr) {
        try {
            return c(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(String str) {
        return cz.a(b(str));
    }

    public static String a(byte[] bArr) {
        try {
            return c(bArr);
        } catch (Throwable th) {
            dd.a(th, "Encrypt", "encodeBase64");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[LOOP:2: B:11:0x0024->B:14:0x0031, LOOP_START, PHI: r4 
      PHI: (r4v1 int) = (r4v0 int), (r4v8 int) binds: [B:10:0x0022, B:14:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007d A[LOOP:0: B:5:0x0010->B:36:0x007d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0087 A[EDGE_INSN: B:41:0x0087->B:37:0x0087 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0087 A[EDGE_INSN: B:42:0x0087->B:37:0x0087 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0087 A[EDGE_INSN: B:44:0x0087->B:37:0x0087 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087 A[EDGE_INSN: B:45:0x0087->B:37:0x0087 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] b(java.lang.String r8) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0006
            byte[] r8 = new byte[r0]
            return r8
        L_0x0006:
            byte[] r8 = com.amap.api.mapcore2d.cz.a((java.lang.String) r8)
            int r1 = r8.length
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>(r1)
        L_0x0010:
            if (r0 >= r1) goto L_0x0087
        L_0x0012:
            byte[] r3 = f5895b
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
            if (r0 == r3) goto L_0x0087
        L_0x0024:
            byte[] r5 = f5895b
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
            if (r4 == r3) goto L_0x0087
            int r0 = r0 << 2
            r5 = r4 & 48
            int r5 = r5 >>> 4
            r0 = r0 | r5
            r2.write(r0)
        L_0x003f:
            int r0 = r6 + 1
            byte r5 = r8[r6]
            r6 = 61
            if (r5 != r6) goto L_0x004c
            byte[] r8 = r2.toByteArray()
            return r8
        L_0x004c:
            byte[] r7 = f5895b
            byte r5 = r7[r5]
            if (r0 >= r1) goto L_0x0057
            if (r5 == r3) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r6 = r0
            goto L_0x003f
        L_0x0057:
            if (r5 == r3) goto L_0x0087
            r4 = r4 & 15
            int r4 = r4 << 4
            r7 = r5 & 60
            int r7 = r7 >>> 2
            r4 = r4 | r7
            r2.write(r4)
        L_0x0065:
            int r4 = r0 + 1
            byte r0 = r8[r0]
            if (r0 != r6) goto L_0x0070
            byte[] r8 = r2.toByteArray()
            return r8
        L_0x0070:
            byte[] r7 = f5895b
            byte r0 = r7[r0]
            if (r4 >= r1) goto L_0x007b
            if (r0 == r3) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r0 = r4
            goto L_0x0065
        L_0x007b:
            if (r0 == r3) goto L_0x0087
            r3 = r5 & 3
            int r3 = r3 << 6
            r0 = r0 | r3
            r2.write(r0)
            r0 = r4
            goto L_0x0010
        L_0x0087:
            byte[] r8 = r2.toByteArray()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.cu.b(java.lang.String):byte[]");
    }

    private static String c(byte[] bArr) {
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
                stringBuffer.append(f5894a[b2 >>> 2]);
                stringBuffer.append(f5894a[(b2 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i3 = i2 + 1;
            byte b3 = bArr[i2] & 255;
            if (i3 == length) {
                stringBuffer.append(f5894a[b2 >>> 2]);
                stringBuffer.append(f5894a[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
                stringBuffer.append(f5894a[(b3 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            int i4 = i3 + 1;
            byte b4 = bArr[i3] & 255;
            stringBuffer.append(f5894a[b2 >>> 2]);
            stringBuffer.append(f5894a[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
            stringBuffer.append(f5894a[((b3 & 15) << 2) | ((b4 & 192) >>> 6)]);
            stringBuffer.append(f5894a[b4 & 63]);
            i = i4;
        }
        return stringBuffer.toString();
    }

    private static byte[] b(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(cz.b());
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        try {
            instance.init(1, secretKeySpec, ivParameterSpec);
        } catch (InvalidAlgorithmParameterException unused) {
        }
        return instance.doFinal(bArr2);
    }

    static byte[] a(byte[] bArr, Key key) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        instance.init(1, key);
        return instance.doFinal(bArr);
    }

    static byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return b(bArr, bArr2);
        } catch (Throwable th) {
            dd.a(th, "Encrypt", "aesEncrypt");
            return null;
        }
    }
}
