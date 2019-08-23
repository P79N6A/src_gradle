package com.umeng.commonsdk.statistics.common;

import com.google.a.a.a.a.a.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class DataHelper {
    public static long ENVELOPE_ENTITY_RAW_LENGTH_MAX = 2097152;
    public static long ENVELOPE_EXTRA_LENGTH = 1024;
    public static long ENVELOPE_LENGTH_MAX = 204800;
    private static final byte[] iv = {10, 1, 11, 5, 4, 15, 7, 9, 23, 3, 1, 6, 8, 12, 13, 91};

    public static boolean largeThanMaxSize(long j, long j2) {
        return j > j2;
    }

    public static String assembleStatelessURL(String str) {
        return "https://" + str;
    }

    public static String assembleURL(String str) {
        return "https://" + str + "/unify_logs";
    }

    public static String encryptBySHA1(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            instance.update(bytes);
            return bytes2Hex(instance.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] hash(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(bArr);
            return instance.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    static String bytes2Hex(byte[] bArr) {
        String str = "";
        for (byte b2 : bArr) {
            if (Integer.toHexString(b2 & 255).length() == 1) {
                str = str + PushConstants.PUSH_TYPE_NOTIFY;
            }
            str = str + r2;
        }
        return str;
    }

    public static String convertExceptionToString(Throwable th) {
        String str;
        if (th == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            a.a(th, printWriter);
            for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                a.a(cause, printWriter);
            }
            str = stringWriter.toString();
            try {
                printWriter.close();
                stringWriter.close();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = null;
        }
        return str;
    }

    public static byte[] reverseHexString(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length % 2 != 0) {
            return null;
        }
        byte[] bArr = new byte[(length / 2)];
        int i = 0;
        while (i < length) {
            int i2 = i + 2;
            bArr[i / 2] = (byte) Integer.valueOf(str.substring(i, i2), 16).intValue();
            i = i2;
        }
        return bArr;
    }

    public static String toHexString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte valueOf : bArr) {
            stringBuffer.append(String.format("%02X", new Object[]{Byte.valueOf(valueOf)}));
        }
        return stringBuffer.toString().toLowerCase(Locale.US);
    }

    public static byte[] decrypt(byte[] bArr, byte[] bArr2) throws Exception {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
        instance.init(2, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(iv));
        return instance.doFinal(bArr);
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2) throws Exception {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
        instance.init(1, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(iv));
        return instance.doFinal(bArr);
    }

    public static int random(int i, String str) {
        if (((double) new Random().nextFloat()) < 0.001d) {
            int i2 = 0;
            if (str == null) {
                MLog.e("--->", "null signature..");
            }
            try {
                i2 = Integer.parseInt(str.substring(9, 11), 16);
            } catch (Exception unused) {
            }
            return (i2 | SearchJediMixFeedAdapter.f42517f) * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        }
        int nextInt = new Random().nextInt(i);
        if (nextInt > 255000 || nextInt < 128000) {
            return nextInt;
        }
        return 127000;
    }
}
