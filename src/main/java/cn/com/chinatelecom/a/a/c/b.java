package cn.com.chinatelecom.a.a.c;

import cn.com.chinatelecom.a.a.e.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f1684a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a(str, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException e2) {
                f.a("Base64Encoder", "Error while decoding BASE64:  decode IOException", e2);
            }
            return byteArray;
        } catch (IOException e3) {
            f.a("Base64Encoder", "decode IOException", e3);
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
