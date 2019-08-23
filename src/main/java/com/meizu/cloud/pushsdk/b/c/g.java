package com.meizu.cloud.pushsdk.b.c;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f26936a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f26937b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: c  reason: collision with root package name */
    private final String f26938c;

    /* renamed from: d  reason: collision with root package name */
    private final String f26939d;

    /* renamed from: e  reason: collision with root package name */
    private final String f26940e;

    /* renamed from: f  reason: collision with root package name */
    private final String f26941f;

    private g(String str, String str2, String str3, String str4) {
        this.f26938c = str;
        this.f26939d = str2;
        this.f26940e = str3;
        this.f26941f = str4;
    }

    public static g a(String str) {
        Matcher matcher = f26936a.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String lowerCase = matcher.group(1).toLowerCase(Locale.US);
        String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
        Matcher matcher2 = f26937b.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group = matcher2.group(1);
            if (group != null && group.equalsIgnoreCase("charset")) {
                String group2 = matcher2.group(2) != null ? matcher2.group(2) : matcher2.group(3);
                if (str2 == null || group2.equalsIgnoreCase(str2)) {
                    str2 = group2;
                } else {
                    throw new IllegalArgumentException("Multiple different charsets: " + str);
                }
            }
        }
        return new g(str, lowerCase, lowerCase2, str2);
    }

    public String a() {
        return this.f26939d;
    }

    public Charset b() {
        if (this.f26941f != null) {
            return Charset.forName(this.f26941f);
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && ((g) obj).f26938c.equals(this.f26938c);
    }

    public int hashCode() {
        return this.f26938c.hashCode();
    }

    public String toString() {
        return this.f26938c;
    }
}
