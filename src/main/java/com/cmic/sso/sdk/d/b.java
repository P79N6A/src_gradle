package com.cmic.sso.sdk.d;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f23052a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a(str, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException e2) {
                PrintStream printStream = System.err;
                printStream.println("Error while decoding BASE64: " + e2.toString());
            }
            return byteArray;
        } catch (IOException unused) {
            throw new RuntimeException();
        }
    }

    private static int a(char c2) {
        if (c2 >= 'A' && c2 <= 'Z') {
            return c2 - 'A';
        }
        if (c2 >= 'a' && c2 <= 'z') {
            return (c2 - 'a') + 26;
        }
        if (c2 >= '0' && c2 <= '9') {
            return (c2 - '0') + 26 + 26;
        }
        if (c2 == '+') {
            return 62;
        }
        if (c2 == '/') {
            return 63;
        }
        if (c2 == '=') {
            return 0;
        }
        throw new RuntimeException("unexpected code: " + c2);
    }

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer((bArr.length * 3) / 2);
        int i = length - 3;
        int i2 = 0;
        loop0:
        while (true) {
            int i3 = 0;
            while (i2 <= i) {
                byte b2 = ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8) | (bArr[i2 + 2] & 255);
                stringBuffer.append(f23052a[(b2 >> 18) & 63]);
                stringBuffer.append(f23052a[(b2 >> 12) & 63]);
                stringBuffer.append(f23052a[(b2 >> 6) & 63]);
                stringBuffer.append(f23052a[b2 & 63]);
                i2 += 3;
                int i4 = i3 + 1;
                if (i3 >= 14) {
                    stringBuffer.append(" ");
                } else {
                    i3 = i4;
                }
            }
            break loop0;
        }
        int i5 = length + 0;
        if (i2 == i5 - 2) {
            int i6 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            stringBuffer.append(f23052a[(i6 >> 18) & 63]);
            stringBuffer.append(f23052a[(i6 >> 12) & 63]);
            stringBuffer.append(f23052a[(i6 >> 6) & 63]);
            stringBuffer.append("=");
        } else if (i2 == i5 - 1) {
            int i7 = (bArr[i2] & 255) << 16;
            stringBuffer.append(f23052a[(i7 >> 18) & 63]);
            stringBuffer.append(f23052a[(i7 >> 12) & 63]);
            stringBuffer.append("==");
        }
        return stringBuffer.toString();
    }

    private static void a(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < length && str.charAt(i) <= ' ') {
                i++;
            } else if (i != length) {
                int i2 = i + 2;
                int i3 = i + 3;
                int a2 = (a(str.charAt(i)) << 18) + (a(str.charAt(i + 1)) << 12) + (a(str.charAt(i2)) << 6) + a(str.charAt(i3));
                outputStream.write((a2 >> 16) & 255);
                if (str.charAt(i2) != '=') {
                    outputStream.write((a2 >> 8) & 255);
                    if (str.charAt(i3) != '=') {
                        outputStream.write(a2 & 255);
                        i += 4;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
