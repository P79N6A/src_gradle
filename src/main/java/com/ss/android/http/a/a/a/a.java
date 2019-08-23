package com.ss.android.http.a.a.a;

import com.ss.android.http.a.c;
import java.net.URI;
import java.net.URISyntaxException;

public final class a {
    public static URI a(URI uri, c cVar) throws URISyntaxException {
        return a(uri, cVar, false);
    }

    private static URI a(URI uri, c cVar, boolean z) throws URISyntaxException {
        if (uri == null) {
            throw new IllegalArgumentException("URI may nor be null");
        } else if (cVar != null) {
            return a(cVar.f2468d, cVar.f2465a, cVar.f2467c, uri.getRawPath(), uri.getRawQuery(), uri.getRawFragment());
        } else {
            return a(null, null, -1, uri.getRawPath(), uri.getRawQuery(), uri.getRawFragment());
        }
    }

    private static URI a(String str, String str2, int i, String str3, String str4, String str5) throws URISyntaxException {
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
