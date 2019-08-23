package com.bytedance.frameworks.baselib.network.http.util;

import com.bytedance.common.utility.StringUtils;
import java.net.URI;
import java.net.URISyntaxException;

public final class i {
    public static URI a(String str) throws RuntimeException {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException unused) {
            try {
                return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused2) {
                return b(str);
            }
        }
    }

    public static URI b(String str) throws RuntimeException {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            int indexOf = str.indexOf("?");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            return URI.create(str);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static URI a(URI uri, c cVar) throws URISyntaxException {
        if (uri == null) {
            throw new IllegalArgumentException("URI may nor be null");
        } else if (cVar != null) {
            return a(cVar.f19873d, cVar.f19870a, cVar.f19872c, uri.getRawPath(), uri.getRawQuery(), uri.getRawFragment());
        } else {
            return a(null, null, -1, uri.getRawPath(), uri.getRawQuery(), uri.getRawFragment());
        }
    }

    public static URI a(String str, String str2, int i, String str3, String str4, String str5) throws URISyntaxException {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            if (str != null) {
                sb.append(str);
                sb.append("://");
            }
            sb.append(str2);
            if (i > 0) {
                sb.append(':');
                sb.append(i);
            }
        }
        if (str3 == null || !str3.startsWith("/")) {
            sb.append('/');
        }
        if (str3 != null) {
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append('?');
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append('#');
            sb.append(str5);
        }
        return new URI(sb.toString());
    }
}
