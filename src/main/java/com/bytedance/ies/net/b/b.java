package com.bytedance.ies.net.b;

import android.text.TextUtils;
import com.bytedance.common.utility.Lists;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

public final class b implements CookieJar {

    /* renamed from: a  reason: collision with root package name */
    private CookieHandler f20847a;

    /* renamed from: b  reason: collision with root package name */
    private Pattern f20848b = Pattern.compile("(?<=Domain=)([^;]*)", 2);

    public b(CookieHandler cookieHandler) {
        this.f20847a = cookieHandler;
    }

    public final List<Cookie> loadForRequest(HttpUrl httpUrl) {
        if (httpUrl == null) {
            return Collections.emptyList();
        }
        try {
            Map<String, List<String>> map = this.f20847a.get(httpUrl.uri(), Collections.emptyMap());
            if (map == null || map.isEmpty()) {
                return Collections.emptyList();
            }
            ArrayList arrayList = null;
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                if (("Cookie".equalsIgnoreCase(str) || "Cookie2".equalsIgnoreCase(str)) && next.getValue() != null && !((List) next.getValue()).isEmpty()) {
                    for (String str2 : (List) next.getValue()) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.addAll(a(httpUrl, str2));
                    }
                }
            }
            if (arrayList != null) {
                return Collections.unmodifiableList(arrayList);
            }
            return Collections.emptyList();
        } catch (IOException unused) {
            return Collections.emptyList();
        }
    }

    private static List<Cookie> a(HttpUrl httpUrl, String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String[] split = str.split(";");
        for (String parse : split) {
            Cookie parse2 = Cookie.parse(httpUrl, parse);
            if (parse2 != null) {
                arrayList.add(parse2);
            }
        }
        return arrayList;
    }

    public final void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        if (httpUrl != null && !Lists.isEmpty(list)) {
            ArrayList arrayList = new ArrayList();
            for (Cookie cookie : list) {
                arrayList.add(cookie.toString());
            }
            try {
                this.f20847a.put(httpUrl.uri(), Collections.singletonMap("Set-Cookie", arrayList));
            } catch (IOException unused) {
            }
        }
    }
}
