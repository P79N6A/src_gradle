package com.loc;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class bt {

    /* renamed from: a  reason: collision with root package name */
    static final IvParameterSpec f25583a = new IvParameterSpec(f25585c);

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f25584b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f25585c = {0, 1, 1, 2, 3, 5, 8, 13, 8, 7, 6, 5, 4, 3, 2, 1};

    public static String a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    String a2 = a("SHA1", str);
                    return a("MD5", a2 + str);
                }
            } catch (Throwable th) {
                ce.a(th, "Encrypt", "generatorKey");
            }
        }
        return null;
    }

    public static String a(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        try {
            byte[] a2 = de.a(str2.getBytes("UTF-8"), str);
            int length = a2.length;
            StringBuilder sb = new StringBuilder(length * 2);
            for (int i = 0; i < length; i++) {
                sb.append(f25584b[(a2[i] >> 4) & 15]);
                sb.append(f25584b[a2[i] & 15]);
            }
            return sb.toString();
        } catch (Throwable th) {
            ce.a(th, "Encrypt", "encode");
            return null;
        }
    }

    public static byte[] a(byte[] bArr) {
        int i = 0;
        try {
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[(bArr.length - 16)];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            System.arraycopy(bArr, 16, bArr3, 0, bArr.length - 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec(di.b()));
            return instance.doFinal(bArr3);
        } catch (Throwable th) {
            if (bArr != null) {
                i = bArr.length;
            }
            ce.a(th, "Encrypt", "decryptRsponse length = ".concat(String.valueOf(i)));
            return null;
        }
    }

    public static synchronized byte[] a(byte[] bArr, String str) throws Exception {
        byte[] byteArray;
        synchronized (bt.class) {
            PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(dd.b(str)));
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, generatePrivate);
            int length = bArr.length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = length - i;
                if (i3 > 0) {
                    byte[] doFinal = i3 > 245 ? instance.doFinal(bArr, i, 245) : instance.doFinal(bArr, i, i3);
                    byteArrayOutputStream.write(doFinal, 0, doFinal.length);
                    i2++;
                    i = i2 * 245;
                } else {
                    byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                }
            }
        }
        return byteArray;
    }

    private static SecretKeySpec b(String str) {
        byte[] bArr;
        if (str == null) {
            str = "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        while (true) {
            stringBuffer.append(str);
            if (stringBuffer.length() >= 16) {
                break;
            }
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        if (stringBuffer.length() > 16) {
            stringBuffer.setLength(16);
        }
        try {
            bArr = stringBuffer.toString().getBytes("UTF-8");
        } catch (Throwable th) {
            ce.a(th, "Encrypt", "createKey");
            bArr = null;
        }
        return new SecretKeySpec(bArr, "AES");
    }

    public static synchronized byte[] b(byte[] bArr, String str) throws Exception {
        byte[] byteArray;
        synchronized (bt.class) {
            PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(dd.b(str)));
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(2, generatePrivate);
            int length = bArr.length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = length - i;
                if (i3 > 0) {
                    byte[] doFinal = i3 > 256 ? instance.doFinal(bArr, i, 256) : instance.doFinal(bArr, i, i3);
                    byteArrayOutputStream.write(doFinal, 0, doFinal.length);
                    i2++;
                    i = i2 * 256;
                } else {
                    byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                }
            }
        }
        return byteArray;
    }

    public static byte[] c(byte[] bArr, String str) {
        try {
            SecretKeySpec b2 = b(str);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(di.b());
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, b2, ivParameterSpec);
            return instance.doFinal(bArr);
        } catch (Throwable th) {
            ce.a(th, "Encrypt", "aesEncrypt");
            return null;
        }
    }

    public static byte[] d(byte[] bArr, String str) {
        try {
            SecretKeySpec b2 = b(str);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(di.b());
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, b2, ivParameterSpec);
            return instance.doFinal(bArr);
        } catch (Throwable th) {
            ce.a(th, "Encrypt", "aesDecrypt");
            return null;
        }
    }
}
