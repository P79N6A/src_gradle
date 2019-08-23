package com.toutiao.proxyserver;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.k;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class t {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80252a;

    /* renamed from: b  reason: collision with root package name */
    public final b f80253b;

    /* renamed from: c  reason: collision with root package name */
    public final List<com.toutiao.proxyserver.net.c> f80254c;

    /* renamed from: d  reason: collision with root package name */
    public final a f80255d;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f80256a;

        /* renamed from: b  reason: collision with root package name */
        final int f80257b;

        /* renamed from: c  reason: collision with root package name */
        final String f80258c;

        /* renamed from: d  reason: collision with root package name */
        final String f80259d;

        /* renamed from: e  reason: collision with root package name */
        final int f80260e;

        /* renamed from: f  reason: collision with root package name */
        final int f80261f;
        final String g;
        final List<String> h;

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f80256a, false, 91763, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f80256a, false, 91763, new Class[0], String.class);
            }
            return "Extra{flag=" + this.f80257b + ", rawKey='" + this.f80258c + '\'' + ", key='" + this.f80259d + '\'' + ", from=" + this.f80260e + ", to=" + this.f80261f + ", urls=" + this.h + '}';
        }

        static a a(b bVar, List<com.toutiao.proxyserver.net.c> list) throws c {
            b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{bVar2, list}, null, f80256a, true, 91762, new Class[]{b.class, List.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{bVar2, list}, null, f80256a, true, 91762, new Class[]{b.class, List.class}, a.class);
            }
            int indexOf = bVar2.f80264c.indexOf("?");
            if (indexOf != -1) {
                ArrayList arrayList = new ArrayList();
                String str = null;
                String str2 = null;
                int i = 0;
                for (String split : bVar2.f80264c.substring(indexOf + 1).split("&")) {
                    String[] split2 = split.split("=");
                    if (split2.length == 2) {
                        if ("rk".equals(split2[0])) {
                            str = Uri.decode(split2[1]);
                        } else if (k.f55809b.equals(split2[0])) {
                            str2 = split2[1];
                        } else if (split2[0].startsWith("u")) {
                            arrayList.add(Uri.decode(split2[1]));
                        } else if ("f".equals(split2[0]) && com.toutiao.proxyserver.f.c.b(split2[1]) == 1) {
                            i = 1;
                        }
                    }
                }
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    throw new c();
                }
                String str3 = null;
                int i2 = 0;
                int i3 = 0;
                for (com.toutiao.proxyserver.net.c next : list) {
                    if (next != null && "Range".equalsIgnoreCase(next.f80143b)) {
                        int indexOf2 = next.f80144c.indexOf("=");
                        if (indexOf2 == -1) {
                            throw new c();
                        } else if ("bytes".equalsIgnoreCase(next.f80144c.substring(0, indexOf2).trim())) {
                            String substring = next.f80144c.substring(indexOf2 + 1);
                            if (!substring.contains(",")) {
                                int indexOf3 = substring.indexOf("-");
                                if (indexOf3 != -1) {
                                    String trim = substring.substring(0, indexOf3).trim();
                                    String trim2 = substring.substring(indexOf3 + 1).trim();
                                    try {
                                        if (trim.length() > 0) {
                                            i2 = Integer.parseInt(trim);
                                        }
                                        int i4 = i2;
                                        if (trim2.length() > 0) {
                                            int parseInt = Integer.parseInt(trim2);
                                            if (i4 <= parseInt) {
                                                i3 = parseInt;
                                            } else {
                                                throw new c();
                                            }
                                        }
                                        str3 = next.f80144c;
                                        i2 = i4;
                                    } catch (NumberFormatException unused) {
                                        throw new c();
                                    }
                                } else {
                                    throw new c();
                                }
                            } else {
                                throw new c();
                            }
                        } else {
                            throw new c();
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    a aVar = new a(i, str, str2, i2, i3, str3, arrayList);
                    return aVar;
                }
                throw new c();
            }
            throw new c();
        }

        private a(int i, String str, String str2, int i2, int i3, String str3, List<String> list) {
            this.f80257b = i;
            this.f80258c = str;
            this.f80259d = str2;
            this.f80260e = i2;
            this.f80261f = i3;
            this.g = str3;
            this.h = list;
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f80262a;

        /* renamed from: b  reason: collision with root package name */
        final String f80263b;

        /* renamed from: c  reason: collision with root package name */
        final String f80264c;

        /* renamed from: d  reason: collision with root package name */
        final String f80265d;

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f80262a, false, 91765, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f80262a, false, 91765, new Class[0], String.class);
            }
            return "RequestLine{method='" + this.f80263b + '\'' + ", path='" + this.f80264c + '\'' + ", version='" + this.f80265d + '\'' + '}';
        }

        b(String str, String str2, String str3) {
            this.f80263b = str;
            this.f80264c = str2;
            this.f80265d = str3;
        }
    }

    static final class c extends Exception {
        c() {
        }
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f80252a, false, 91761, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f80252a, false, 91761, new Class[0], String.class);
        }
        return "Request{requestLine=" + this.f80253b + ", headers=" + this.f80254c + ", extra=" + this.f80255d + '}';
    }

    public static t a(InputStream inputStream) throws IOException, c {
        com.toutiao.proxyserver.net.c cVar;
        InputStream inputStream2 = inputStream;
        if (PatchProxy.isSupport(new Object[]{inputStream2}, null, f80252a, true, 91758, new Class[]{InputStream.class}, t.class)) {
            return (t) PatchProxy.accessDispatch(new Object[]{inputStream2}, null, f80252a, true, 91758, new Class[]{InputStream.class}, t.class);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, com.toutiao.proxyserver.f.c.f80073b));
        b bVar = null;
        ArrayList arrayList = new ArrayList();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (!TextUtils.isEmpty(readLine)) {
                String trim = readLine.trim();
                if (bVar == null) {
                    if (PatchProxy.isSupport(new Object[]{trim}, null, b.f80262a, true, 91764, new Class[]{String.class}, b.class)) {
                        bVar = (b) PatchProxy.accessDispatch(new Object[]{trim}, null, b.f80262a, true, 91764, new Class[]{String.class}, b.class);
                    } else {
                        int indexOf = trim.indexOf(32);
                        if (indexOf != -1) {
                            int lastIndexOf = trim.lastIndexOf(32);
                            if (lastIndexOf > indexOf) {
                                String trim2 = trim.substring(0, indexOf).trim();
                                String trim3 = trim.substring(indexOf + 1, lastIndexOf).trim();
                                String trim4 = trim.substring(lastIndexOf + 1).trim();
                                if (trim2.length() != 0 && trim3.length() != 0 && trim4.length() != 0) {
                                    bVar = new b(trim2, trim3, trim4);
                                }
                            } else {
                                throw new c();
                            }
                        } else {
                            throw new c();
                        }
                    }
                } else {
                    try {
                        if (PatchProxy.isSupport(new Object[]{trim}, null, com.toutiao.proxyserver.net.c.f80142a, true, 91813, new Class[]{String.class}, com.toutiao.proxyserver.net.c.class)) {
                            cVar = (com.toutiao.proxyserver.net.c) PatchProxy.accessDispatch(new Object[]{trim}, null, com.toutiao.proxyserver.net.c.f80142a, true, 91813, new Class[]{String.class}, com.toutiao.proxyserver.net.c.class);
                        } else {
                            int indexOf2 = trim.indexOf(":");
                            if (indexOf2 != -1) {
                                cVar = new com.toutiao.proxyserver.net.c(trim.substring(0, indexOf2), trim.substring(indexOf2 + 1));
                            } else {
                                throw new IllegalArgumentException("request header format error, header: " + trim);
                            }
                        }
                        arrayList.add(cVar);
                    } catch (IllegalArgumentException unused) {
                        throw new c();
                    }
                }
            } else if (bVar != null) {
                return new t(bVar, arrayList, a.a(bVar, arrayList));
            } else {
                throw new c();
            }
        }
        throw new c();
    }

    private t(b bVar, List<com.toutiao.proxyserver.net.c> list, a aVar) {
        this.f80253b = bVar;
        this.f80254c = list;
        this.f80255d = aVar;
    }

    public static String a(String str, String str2, List<String> list) {
        String str3 = str;
        String str4 = str2;
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str3, str4, list2}, null, f80252a, true, 91759, new Class[]{String.class, String.class, List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3, str4, list2}, null, f80252a, true, 91759, new Class[]{String.class, String.class, List.class}, String.class);
        }
        StringBuilder sb = new StringBuilder(512);
        String str5 = null;
        do {
            if (str5 != null) {
                if (list.size() == 1) {
                    return null;
                }
                list2.remove(list.size() - 1);
            }
            str5 = a(sb, str3, str4, list2);
        } while (str5.length() > 3072);
        return str5;
    }

    private static String a(StringBuilder sb, String str, String str2, List<String> list) {
        StringBuilder sb2 = sb;
        String str3 = str2;
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{sb2, str, str3, list2}, null, f80252a, true, 91760, new Class[]{StringBuilder.class, String.class, String.class, List.class}, String.class)) {
            Object[] objArr = {sb2, str, str3, list2};
            return (String) PatchProxy.accessDispatch(objArr, null, f80252a, true, 91760, new Class[]{StringBuilder.class, String.class, String.class, List.class}, String.class);
        }
        sb2.delete(0, sb.length());
        sb2.append("rk=");
        sb2.append(Uri.encode(str));
        sb2.append("&k");
        sb2.append("=");
        sb2.append(str3);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb2.append("&u");
            sb2.append(i);
            sb2.append("=");
            sb2.append(Uri.encode(list2.get(i)));
        }
        return sb.toString();
    }
}
