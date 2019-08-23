package com.cmic.sso.sdk.d;

import com.cmic.sso.sdk.auth.TokenListener;
import java.util.concurrent.ConcurrentHashMap;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, TokenListener> f23070a = new ConcurrentHashMap<>();

    public static boolean a() {
        return f23070a.isEmpty();
    }

    public static void b(String str) {
        f23070a.remove(str);
    }

    public static TokenListener c(String str) {
        return f23070a.get(str);
    }

    public static boolean a(String str) {
        if (!f23070a.containsKey(str)) {
            return true;
        }
        return false;
    }

    public static void a(String str, TokenListener tokenListener) {
        f23070a.put(str, tokenListener);
    }
}
