package com.bytedance.sdk.account.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f22526a;

    /* renamed from: b  reason: collision with root package name */
    public String f22527b;

    public f() {
        this.f22526a = new HashMap();
        this.f22527b = null;
    }

    public final String toString() {
        String str;
        if (this.f22526a.isEmpty()) {
            return this.f22527b;
        }
        Map<String, String> map = this.f22526a;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            String b2 = b((String) next.getKey(), "UTF-8");
            String str2 = (String) next.getValue();
            if (str2 != null) {
                str = b(str2, "UTF-8");
            } else {
                str = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(b2);
            sb.append("=");
            sb.append(str);
        }
        String sb2 = sb.toString();
        if (this.f22527b == null || this.f22527b.length() == 0) {
            return sb2;
        }
        if (this.f22527b.indexOf(63) >= 0) {
            return this.f22527b + "&" + sb2;
        }
        return this.f22527b + "?" + sb2;
    }

    public f(String str) {
        this.f22526a = new HashMap();
        this.f22527b = str;
    }

    public final void a(String str, int i) {
        this.f22526a.put(str, "362");
    }

    public final void a(String str, String str2) {
        this.f22526a.put(str, str2);
    }

    private static String b(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
