package com.bytedance.common.utility;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

public class DigestUtils {
    static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String md5Hex(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(bArr);
                    return toHexString(instance.digest());
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public static String toHexString(byte[] bArr) {
        if (bArr != null) {
            return toHexString(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    public static String md5Hex(File file) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            if (instance == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr, 0, 8192);
                if (read > 0) {
                    instance.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return toHexString(instance.digest());
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] hexStringToBytes(String str) throws IllegalArgumentException {
        if (str == null || str.length() % 2 == 1) {
            throw new IllegalArgumentException("hexBinary needs to be even-length: " + str);
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(charArray[i], 16) << 4) + Character.digit(charArray[i + 1], 16));
        }
        return bArr;
    }

    public static String md5Hex(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    return toHexString(instance.digest());
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public static String toHexString(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        } else if (i < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte b2 = bArr[i5 + i] & 255;
                int i6 = i4 + 1;
                cArr[i4] = HEX_CHARS[b2 >> 4];
                i4 = i6 + 1;
                cArr[i6] = HEX_CHARS[b2 & 15];
            }
            return new String(cArr, 0, i3);
        }
    }

    public static String md5Hex(byte[] bArr, int i, int i2) {
        if (bArr != null && i >= 0 && i2 > 0) {
            try {
                if (i + i2 <= bArr.length) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(bArr, i, i2);
                    return toHexString(instance.digest());
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }
}
