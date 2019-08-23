package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HelperUtils {
    public static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void safeClose(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void safeClose(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static byte[] readStreamToByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static String readStreamToString(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        char[] cArr = new char[1024];
        StringWriter stringWriter = new StringWriter();
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (-1 == read) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, read);
        }
    }

    public static String getFileMD5(File file) {
        byte[] bArr = new byte[1024];
        try {
            if (!file.isFile()) {
                return "";
            }
            MessageDigest instance = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    instance.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return String.format("%1$032x", new Object[]{new BigInteger(1, instance.digest())});
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getMD5(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                stringBuffer.append(Integer.toHexString((b2 & 255) | -256).substring(6));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e2) {
            MLog.i("helper", "getMD5 error", (Throwable) e2);
            return "";
        }
    }

    public static String getUmengMD5(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                stringBuffer.append(Integer.toHexString(b2 & 255));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e2) {
            MLog.i("helper", "getMD5 error", (Throwable) e2);
            return "";
        }
    }

    public static String readFile(File file) {
        FileInputStream fileInputStream;
        try {
            if (!file.exists()) {
                safeClose((InputStream) null);
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                String str = new String(bArr);
                safeClose((InputStream) fileInputStream);
                return str;
            } catch (Throwable th) {
                th = th;
                safeClose((InputStream) fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            safeClose((InputStream) fileInputStream);
            throw th;
        }
    }

    public static String MD5(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes();
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(bytes);
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte valueOf : digest) {
                stringBuffer.append(String.format("%02X", new Object[]{Byte.valueOf(valueOf)}));
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return str.replaceAll("[^[a-z][A-Z][0-9][.][_]]", "");
        }
    }

    public static void writeFile(File file, String str) throws IOException {
        writeFile(file, str.getBytes());
    }

    public static boolean checkStrLen(String str, int i) {
        try {
            if (!TextUtils.isEmpty(str) && str.length() <= i) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void writeFile(File file, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
        } finally {
            safeClose((OutputStream) fileOutputStream);
        }
    }

    public static String subStr(String str, int i) {
        int i2;
        int i3;
        String str2 = "";
        try {
            if (!TextUtils.isEmpty(str)) {
                if (str.length() < i) {
                    i2 = str.length();
                } else {
                    i2 = i;
                }
                String substring = str.substring(0, i2);
                try {
                    int length = substring.getBytes("UTF-8").length;
                    String str3 = substring;
                    int i4 = i;
                    while (length > i) {
                        i4--;
                        try {
                            if (i4 > str.length()) {
                                i3 = str.length();
                            } else {
                                i3 = i4;
                            }
                            str2 = str.substring(0, i3);
                            str3 = str2;
                            length = str2.getBytes("UTF-8").length;
                        } catch (Exception e2) {
                            e = e2;
                            str2 = str3;
                            MLog.e((Throwable) e);
                            return str2;
                        }
                    }
                    return str3;
                } catch (Exception e3) {
                    e = e3;
                    str2 = substring;
                    MLog.e((Throwable) e);
                    return str2;
                }
            }
        } catch (Exception e4) {
            e = e4;
            MLog.e((Throwable) e);
            return str2;
        }
        return str2;
    }
}
