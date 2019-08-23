package com.meizu.cloud.pushsdk.b.c;

import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.io.Closeable;
import java.net.IDN;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f26981a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f26982b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f26983c = Charset.forName("UTF-8");

    /* renamed from: d  reason: collision with root package name */
    public static final TimeZone f26984d = TimeZone.getTimeZone("GMT");

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f26985e = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static int a(String str, int i, int i2) {
        while (i < i2) {
            switch (str.charAt(i)) {
                case 9:
                case 10:
                case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                case 13:
                case ' ':
                    i++;
                default:
                    return i;
            }
        }
        return i2;
    }

    public static int a(String str, int i, int i2, char c2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static String a(String str) {
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !b(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static int b(String str, int i, int i2) {
        int i3 = i2 - 1;
        while (i3 >= i) {
            switch (str.charAt(i3)) {
                case 9:
                case 10:
                case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                case 13:
                case ' ':
                    i3--;
                default:
                    return i3 + 1;
            }
        }
        return i;
    }

    private static boolean b(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }
}
