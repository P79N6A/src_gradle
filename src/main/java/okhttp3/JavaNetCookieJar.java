package okhttp3;

import com.taobao.android.dexposed.ClassUtils;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import okhttp3.Cookie;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

public final class JavaNetCookieJar implements CookieJar {
    private final CookieHandler cookieHandler;

    public JavaNetCookieJar(CookieHandler cookieHandler2) {
        this.cookieHandler = cookieHandler2;
    }

    public final List<Cookie> loadForRequest(HttpUrl httpUrl) {
        try {
            ArrayList arrayList = null;
            for (Map.Entry next : this.cookieHandler.get(httpUrl.uri(), Collections.emptyMap()).entrySet()) {
                String str = (String) next.getKey();
                if (("Cookie".equalsIgnoreCase(str) || "Cookie2".equalsIgnoreCase(str)) && !((List) next.getValue()).isEmpty()) {
                    for (String str2 : (List) next.getValue()) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.addAll(decodeHeaderAsJavaNetCookies(httpUrl, str2));
                    }
                }
            }
            if (arrayList != null) {
                return Collections.unmodifiableList(arrayList);
            }
            return Collections.emptyList();
        } catch (IOException e2) {
            Platform platform = Platform.get();
            platform.log(5, "Loading cookies failed for " + httpUrl.resolve("/..."), e2);
            return Collections.emptyList();
        }
    }

    private List<Cookie> decodeHeaderAsJavaNetCookies(HttpUrl httpUrl, String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int delimiterOffset = Util.delimiterOffset(str, i, length, ";,");
            int delimiterOffset2 = Util.delimiterOffset(str, i, delimiterOffset, '=');
            String trimSubstring = Util.trimSubstring(str, i, delimiterOffset2);
            if (!trimSubstring.startsWith(ClassUtils.INNER_CLASS_SEPARATOR)) {
                if (delimiterOffset2 < delimiterOffset) {
                    str2 = Util.trimSubstring(str, delimiterOffset2 + 1, delimiterOffset);
                } else {
                    str2 = "";
                }
                if (str2.startsWith("\"") && str2.endsWith("\"")) {
                    str2 = str2.substring(1, str2.length() - 1);
                }
                arrayList.add(new Cookie.Builder().name(trimSubstring).value(str2).domain(httpUrl.host()).build());
            }
            i = delimiterOffset + 1;
        }
        return arrayList;
    }

    public final void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        if (this.cookieHandler != null) {
            ArrayList arrayList = new ArrayList();
            for (Cookie cookie : list) {
                arrayList.add(cookie.toString(true));
            }
            try {
                this.cookieHandler.put(httpUrl.uri(), Collections.singletonMap("Set-Cookie", arrayList));
            } catch (IOException e2) {
                Platform platform = Platform.get();
                platform.log(5, "Saving cookies failed for " + httpUrl.resolve("/..."), e2);
            }
        }
    }
}