package com.xiaomi.push;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

public class hf extends hh {

    /* renamed from: a  reason: collision with root package name */
    private a f82152a = a.f82153a;

    /* renamed from: a  reason: collision with other field name */
    private final Map<String, String> f484a = new HashMap();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f82153a = new a("get");

        /* renamed from: b  reason: collision with root package name */
        public static final a f82154b = new a("set");

        /* renamed from: c  reason: collision with root package name */
        public static final a f82155c = new a("result");

        /* renamed from: d  reason: collision with root package name */
        public static final a f82156d = new a("error");

        /* renamed from: e  reason: collision with root package name */
        public static final a f82157e = new a("command");

        /* renamed from: a  reason: collision with other field name */
        private String f485a;

        private a(String str) {
            this.f485a = str;
        }

        public static a a(String str) {
            if (str == null) {
                return null;
            }
            String lowerCase = str.toLowerCase();
            if (f82153a.toString().equals(lowerCase)) {
                return f82153a;
            }
            if (f82154b.toString().equals(lowerCase)) {
                return f82154b;
            }
            if (f82156d.toString().equals(lowerCase)) {
                return f82156d;
            }
            if (f82155c.toString().equals(lowerCase)) {
                return f82155c;
            }
            if (f82157e.toString().equals(lowerCase)) {
                return f82157e;
            }
            return null;
        }

        public String toString() {
            return this.f485a;
        }
    }

    public hf() {
    }

    public hf(Bundle bundle) {
        super(bundle);
        if (bundle.containsKey("ext_iq_type")) {
            this.f82152a = a.a(bundle.getString("ext_iq_type"));
        }
    }

    public Bundle a() {
        Bundle a2 = super.a();
        if (this.f82152a != null) {
            a2.putString("ext_iq_type", this.f82152a.toString());
        }
        return a2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public a m362a() {
        return this.f82152a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m363a() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("<iq ");
        if (j() != null) {
            sb.append("id=\"" + j() + "\" ");
        }
        if (l() != null) {
            sb.append("to=\"");
            sb.append(hs.a(l()));
            sb.append("\" ");
        }
        if (m() != null) {
            sb.append("from=\"");
            sb.append(hs.a(m()));
            sb.append("\" ");
        }
        if (k() != null) {
            sb.append("chid=\"");
            sb.append(hs.a(k()));
            sb.append("\" ");
        }
        for (Map.Entry next : this.f484a.entrySet()) {
            sb.append(hs.a((String) next.getKey()));
            sb.append("=\"");
            sb.append(hs.a((String) next.getValue()));
            sb.append("\" ");
        }
        if (this.f82152a == null) {
            str = "type=\"get\">";
        } else {
            sb.append("type=\"");
            sb.append(a());
            str = "\">";
        }
        sb.append(str);
        String b2 = b();
        if (b2 != null) {
            sb.append(b2);
        }
        sb.append(o());
        hl a2 = a();
        if (a2 != null) {
            sb.append(a2.a());
        }
        sb.append("</iq>");
        return sb.toString();
    }

    public void a(a aVar) {
        if (aVar == null) {
            this.f82152a = a.f82153a;
        } else {
            this.f82152a = aVar;
        }
    }

    public void a(Map<String, String> map) {
        synchronized (this) {
            this.f484a.putAll(map);
        }
    }

    public String b() {
        return null;
    }
}
