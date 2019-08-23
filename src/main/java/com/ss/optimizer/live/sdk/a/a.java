package com.ss.optimizer.live.sdk.a;

import android.text.TextUtils;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f78385a;

    /* renamed from: b  reason: collision with root package name */
    public final b f78386b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Pair<String, String>> f78387c;

    a(c cVar) {
        this.f78385a = cVar.f78395b;
        this.f78386b = cVar.f78396c;
        this.f78387c = cVar.f78397d;
    }

    private static String a(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String a(String str, List<Pair<String, String>> list) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) >= 0) {
            sb.append("&");
        } else if (list.size() > 0) {
            sb.append("?");
        }
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append("&");
            }
            Pair pair = list.get(i);
            sb.append((String) pair.first);
            sb.append('=');
            sb.append(a((String) pair.second, "UTF-8"));
        }
        return sb.toString();
    }
}
