package com.bytedance.retrofit2.mime;

import java.io.UnsupportedEncodingException;

public final class f extends TypedByteArray {
    public final String toString() {
        try {
            return "TypedString[" + new String(getBytes(), "UTF-8") + "]";
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("Must be able to decode UTF-8");
        }
    }

    public f(String str) {
        super("text/plain; charset=UTF-8", a(str), new String[0]);
    }

    private static byte[] a(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }
}
