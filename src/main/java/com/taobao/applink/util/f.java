package com.taobao.applink.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

public class f {
    public static int a(int i) {
        return i;
    }

    public static String a() {
        return "UTF-8";
    }

    private static String a(InputStream inputStream, String str) throws UnsupportedEncodingException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return new String(byteArrayOutputStream.toByteArray(), str);
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public static String a(String str) {
        try {
            HttpURLConnection b2 = b(str);
            c(b2.getResponseCode());
            return a(b2.getInputStream(), a());
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int b(int i) {
        return i;
    }

    private static HttpURLConnection b(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(a(5000));
            httpURLConnection.setReadTimeout(b(5000));
            return httpURLConnection;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void c(int i) {
        if (i != 200) {
            throw new RuntimeException("http request exception, response code: " + i);
        }
    }
}
