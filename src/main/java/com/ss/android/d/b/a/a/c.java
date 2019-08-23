package com.ss.android.d.b.a.a;

import android.text.TextUtils;
import android.util.Base64;
import java.security.Key;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static String f28369a;

    public static String a() {
        if (TextUtils.isEmpty(f28369a)) {
            f28369a = a("Ynl0ZWRhbmNl");
        }
        return f28369a;
    }

    static Key a(byte[] bArr) throws Exception {
        return SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(bArr));
    }

    public static String a(String str) {
        try {
            return new String(Base64.decode(str.getBytes("UTF-8"), 2));
        } catch (Exception unused) {
            return "";
        }
    }
}
