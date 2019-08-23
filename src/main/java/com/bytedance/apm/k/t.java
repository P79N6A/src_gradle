package com.bytedance.apm.k;

import android.text.TextUtils;
import com.bytedance.apm.d;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public final class t {
    private static String a(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            d.a().a(e2, "UrlUtils: encode");
            throw new IllegalArgumentException(e2);
        }
    }

    public static String a(String str, Map<String, String> map) {
        String str2;
        if (TextUtils.isDigitsOnly(str) || map == null || map.isEmpty()) {
            return str;
        }
        if (str.indexOf("?") < 0) {
            str = str + "?";
        }
        if (str.endsWith("?")) {
            str2 = str + a("sdk_version", "UTF-8") + "=" + a("400", "UTF-8");
        } else {
            str2 = str + "&" + a("sdk_version", "UTF-8") + "=" + a("400", "UTF-8");
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry key : map.entrySet()) {
                if (map.get(key.getKey()) != null) {
                    if (str2.endsWith("?")) {
                        str2 = str2 + a(key.getKey().toString(), "UTF-8") + "=" + a(map.get(key.getKey()).toString(), "UTF-8");
                    } else {
                        str2 = str2 + "&" + a(key.getKey().toString(), "UTF-8") + "=" + a(map.get(key.getKey()).toString(), "UTF-8");
                    }
                }
            }
        }
        return str2;
    }
}
