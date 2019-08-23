package com.bytedance.frameworks.baselib.a;

import android.content.Context;
import java.io.UnsupportedEncodingException;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static b f2112a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2113b;

    public interface b {
        boolean a(Context context);
    }

    public static class a implements b {
        public final boolean a(Context context) {
            return false;
        }
    }

    public static void a(b bVar) {
        if (!f2113b) {
            f2112a = bVar;
            f2113b = true;
        }
    }

    public static byte[] a(String str) {
        byte[] bArr;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    bArr = str.getBytes("UTF-8");
                    return bArr;
                }
            } catch (UnsupportedEncodingException unused) {
                return str.getBytes();
            }
        }
        bArr = null;
        return bArr;
    }
}
