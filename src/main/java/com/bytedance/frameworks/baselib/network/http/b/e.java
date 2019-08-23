package com.bytedance.frameworks.baselib.network.http.b;

import com.taobao.android.dexposed.ClassUtils;
import java.net.URI;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class e implements Cloneable {
    private static final Set<String> m;
    private static Pattern n;
    private static Pattern o;
    private static final ThreadLocal<DateFormat> p = new ThreadLocal<DateFormat>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    };
    private static final String[] q = {"EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};

    /* renamed from: a  reason: collision with root package name */
    public String f19748a;

    /* renamed from: b  reason: collision with root package name */
    public String f19749b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f19750c;

    /* renamed from: d  reason: collision with root package name */
    public String f19751d;

    /* renamed from: e  reason: collision with root package name */
    public long f19752e = -1;

    /* renamed from: f  reason: collision with root package name */
    public final String f19753f;
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public String k;
    public int l = 1;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f19754a;

        /* renamed from: b  reason: collision with root package name */
        boolean f19755b;

        /* renamed from: c  reason: collision with root package name */
        boolean f19756c;

        /* renamed from: d  reason: collision with root package name */
        private final String f19757d;

        /* renamed from: e  reason: collision with root package name */
        private final String f19758e;

        /* renamed from: f  reason: collision with root package name */
        private int f19759f;

        private void c() {
            while (this.f19759f < this.f19757d.length() && " \t".indexOf(this.f19757d.charAt(this.f19759f)) != -1) {
                this.f19759f++;
            }
        }

        private boolean b() {
            c();
            if (this.f19759f >= this.f19757d.length() || this.f19757d.charAt(this.f19759f) != '=') {
                return false;
            }
            this.f19759f++;
            return true;
        }

        public final List<e> a() {
            int i;
            String str;
            String str2;
            ArrayList arrayList = new ArrayList(2);
            if (this.f19758e.startsWith("set-cookie2:")) {
                this.f19759f += 12;
                this.f19756c = true;
                i = 0;
            } else {
                if (this.f19758e.startsWith("set-cookie:")) {
                    this.f19759f += 11;
                }
                i = 1;
            }
            while (true) {
                String a2 = a(false);
                if (a2 == null) {
                    if (!arrayList.isEmpty()) {
                        return arrayList;
                    }
                    throw new IllegalArgumentException("No cookies in " + this.f19757d);
                } else if (b()) {
                    if (i != 0) {
                        str = ";";
                    } else {
                        str = ",;";
                    }
                    e eVar = new e(a2, a(str));
                    eVar.l = i ^ 1;
                    arrayList.add(eVar);
                    while (true) {
                        c();
                        if (this.f19759f == this.f19757d.length()) {
                            break;
                        } else if (this.f19757d.charAt(this.f19759f) == ',') {
                            this.f19759f++;
                            break;
                        } else {
                            if (this.f19757d.charAt(this.f19759f) == ';') {
                                this.f19759f++;
                            }
                            String a3 = a(true);
                            if (a3 != null) {
                                if (i != 0 || "expires".equals(a3) || "port".equals(a3)) {
                                    str2 = ";";
                                } else {
                                    str2 = ";,";
                                }
                                String str3 = null;
                                if (b()) {
                                    str3 = a(str2);
                                }
                                a(eVar, a3, str3);
                            }
                        }
                    }
                    if (this.f19754a) {
                        eVar.l = 0;
                    } else if (this.f19755b) {
                        eVar.l = 1;
                    }
                } else {
                    throw new IllegalArgumentException("Expected '=' after " + a2 + " in " + this.f19757d);
                }
            }
        }

        a(String str) {
            this.f19757d = str;
            this.f19758e = str.toLowerCase(Locale.US);
        }

        private String a(String str) {
            c();
            int b2 = b(str);
            String substring = this.f19757d.substring(this.f19759f, b2);
            this.f19759f = b2;
            return substring;
        }

        private String a(boolean z) {
            String str;
            String str2;
            c();
            int b2 = b(",;= \t");
            if (z) {
                str = this.f19758e;
            } else {
                str = this.f19757d;
            }
            if (this.f19759f < b2) {
                str2 = str.substring(this.f19759f, b2);
            } else {
                str2 = null;
            }
            this.f19759f = b2;
            return str2;
        }

        private int b(String str) {
            for (int i = this.f19759f; i < this.f19757d.length(); i++) {
                if (str.indexOf(this.f19757d.charAt(i)) != -1) {
                    return i;
                }
            }
            return this.f19757d.length();
        }

        private void a(e eVar, String str, String str2) {
            if (str.equals("comment") && eVar.f19748a == null) {
                eVar.f19748a = str2;
            } else if (str.equals("commenturl") && eVar.f19749b == null) {
                eVar.f19749b = str2;
            } else if (str.equals("discard")) {
                eVar.f19750c = true;
            } else if (!str.equals("domain") || eVar.f19751d != null) {
                if (str.equals("expires")) {
                    this.f19754a = true;
                    if (eVar.f19752e == -1) {
                        Date b2 = e.b(str2);
                        if (b2 != null) {
                            eVar.a(b2);
                        } else {
                            eVar.f19752e = 0;
                        }
                    }
                } else if (str.equals("max-age") && eVar.f19752e == -1) {
                    try {
                        long parseLong = Long.parseLong(str2);
                        this.f19755b = true;
                        eVar.f19752e = parseLong;
                    } catch (NumberFormatException unused) {
                        throw new IllegalArgumentException("Invalid max-age: " + str2);
                    }
                } else if (str.equals("path") && eVar.g == null) {
                    eVar.g = str2;
                } else if (str.equals("port") && eVar.h == null) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    eVar.h = str2;
                } else if (str.equals("secure")) {
                    eVar.i = true;
                } else if (str.equals("httponly")) {
                    eVar.j = true;
                } else if (str.equals("version") && !this.f19756c) {
                    eVar.l = Integer.parseInt(str2);
                }
            } else {
                eVar.f19751d = str2;
            }
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.f19753f.toLowerCase(Locale.US).hashCode();
        int i3 = 0;
        if (this.f19751d == null) {
            i2 = 0;
        } else {
            i2 = this.f19751d.toLowerCase(Locale.US).hashCode();
        }
        int i4 = hashCode + i2;
        if (this.g != null) {
            i3 = this.g.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        if (this.l == 0) {
            return this.f19753f + "=" + this.k;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19753f);
        sb.append("=\"");
        sb.append(this.k);
        sb.append("\"");
        a(sb, "Path", this.g);
        a(sb, "Domain", this.f19751d);
        a(sb, "Port", this.h);
        return sb.toString();
    }

    static {
        HashSet hashSet = new HashSet();
        m = hashSet;
        hashSet.add("comment");
        m.add("commenturl");
        m.add("discard");
        m.add("domain");
        m.add("expires");
        m.add("httponly");
        m.add("max-age");
        m.add("path");
        m.add("port");
        m.add("secure");
        m.add("version");
        n = null;
        o = null;
        try {
            n = Pattern.compile("(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])", 2);
            o = Pattern.compile("([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}", 2);
        } catch (PatternSyntaxException unused) {
        }
    }

    public final boolean a() {
        boolean z = false;
        if (this.f19752e == -1) {
            return false;
        }
        if (this.f19752e <= 0) {
            z = true;
        }
        return z;
    }

    public final void a(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = str.toLowerCase(Locale.US);
        }
        this.f19751d = str2;
    }

    private static String c(String str) {
        if (str == null) {
            return "/";
        }
        if (str.endsWith("/")) {
            return str;
        }
        return str + "/";
    }

    private static boolean e(String str) {
        try {
            if (n.matcher(str).matches() || o.matcher(str).matches()) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static Date b(String str) {
        try {
            return p.get().parse(str);
        } catch (ParseException unused) {
            String[] strArr = q;
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                try {
                    return new SimpleDateFormat(strArr[i2], Locale.US).parse(str);
                } catch (ParseException unused2) {
                    i2++;
                }
            }
            return null;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f19753f.equalsIgnoreCase(eVar.f19753f) && (this.f19751d == null ? eVar.f19751d == null : this.f19751d.equalsIgnoreCase(eVar.f19751d))) {
            String str = this.g;
            String str2 = eVar.g;
            if (str != null) {
                z = str.equals(str2);
            } else if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static boolean d(String str) {
        boolean z;
        if (str.length() == 0 || str.startsWith(ClassUtils.INNER_CLASS_SEPARATOR) || m.contains(str.toLowerCase(Locale.US))) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return z;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 0 || charAt >= 127 || charAt == ';' || charAt == ',' || (Character.isWhitespace(charAt) && charAt != ' ')) {
                return false;
            }
        }
        return z;
    }

    public final void a(Date date) {
        this.f19752e = (date.getTime() - System.currentTimeMillis()) / 1000;
    }

    public e(String str, String str2) {
        String trim = str.trim();
        if (d(trim)) {
            this.f19753f = trim;
            this.k = str2;
            return;
        }
        throw new IllegalArgumentException("Invalid name: " + str);
    }

    public static boolean a(e eVar, URI uri) {
        return c(uri.getPath()).startsWith(c(eVar.g));
    }

    private static boolean a(String str, int i2) {
        int indexOf = str.indexOf(46, i2 + 1);
        if (indexOf == -1 || indexOf >= str.length() - 1) {
            return false;
        }
        return true;
    }

    public static boolean b(e eVar, URI uri) {
        if (eVar.h == null) {
            return true;
        }
        return Arrays.asList(eVar.h.split(",")).contains(Integer.toString(h.getEffectivePort(uri.getScheme(), uri.getPort())));
    }

    public static boolean a(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        String lowerCase2 = str.toLowerCase(Locale.US);
        if (lowerCase.equals(lowerCase2) && (a(lowerCase, 0) || e(lowerCase))) {
            return true;
        }
        if (!a(lowerCase, 0)) {
            return lowerCase2.equals(".local");
        }
        if (lowerCase2.length() == lowerCase.length() + 1 && lowerCase2.startsWith(ClassUtils.PACKAGE_SEPARATOR) && lowerCase2.endsWith(lowerCase) && a(lowerCase2, 1)) {
            return true;
        }
        if (lowerCase.length() <= lowerCase2.length() || !lowerCase.endsWith(lowerCase2) || ((!lowerCase2.startsWith(ClassUtils.PACKAGE_SEPARATOR) || !a(lowerCase2, 1)) && !lowerCase2.equals(".local"))) {
            return false;
        }
        return true;
    }

    private static void a(StringBuilder sb, String str, String str2) {
        if (str2 != null && sb != null) {
            sb.append(";$");
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append("\"");
        }
    }
}
