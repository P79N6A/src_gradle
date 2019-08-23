package com.bytedance.frameworks.baselib.network.http.d;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f19849b = Pattern.compile("\\s*([\\w\\-]+)\\s*(=)?\\s*(\\d+|\\\"([^\"\\\\]*(\\\\.[^\"\\\\]*)*)+\\\")?\\s*");

    /* renamed from: a  reason: collision with root package name */
    public HashMap<C0161a, String> f19850a = new HashMap<>();

    /* renamed from: com.bytedance.frameworks.baselib.network.http.d.a$a  reason: collision with other inner class name */
    public enum C0161a {
        MAXAGE,
        MAXSTALE,
        MINFRESH,
        NOCACHE,
        NOSTORE,
        NOTRANSFORM,
        ONLYIFCACHED,
        MUSTREVALIDATE,
        PRIVATE,
        PROXYREVALIDATE,
        PUBLIC,
        SMAXAGE,
        UNKNOWN;

        public static C0161a select(String str) {
            try {
                return valueOf(str.toUpperCase().replaceAll("-", ""));
            } catch (Exception unused) {
                return UNKNOWN;
            }
        }
    }

    public a(String str) {
        Matcher matcher = f19849b.matcher(str);
        while (matcher.find()) {
            C0161a select = C0161a.select(matcher.group(1));
            if (select != C0161a.UNKNOWN) {
                this.f19850a.put(select, matcher.group(3));
            }
        }
    }
}
