package com.cmic.sso.sdk.d;

import java.util.Locale;

public class p {
    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            stringBuffer.append(String.format("%02x", new Object[]{Integer.valueOf(b2 & 255)}));
        }
        return stringBuffer.toString().toUpperCase(Locale.getDefault());
    }
}
