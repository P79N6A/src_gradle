package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hl {

    /* renamed from: a  reason: collision with root package name */
    private int f82184a;

    /* renamed from: a  reason: collision with other field name */
    private String f496a;

    /* renamed from: a  reason: collision with other field name */
    private List<he> f497a;

    /* renamed from: b  reason: collision with root package name */
    private String f82185b;

    /* renamed from: c  reason: collision with root package name */
    private String f82186c;

    /* renamed from: d  reason: collision with root package name */
    private String f82187d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f82188a = new a("internal-server-error");

        /* renamed from: b  reason: collision with root package name */
        public static final a f82189b = new a("forbidden");

        /* renamed from: c  reason: collision with root package name */
        public static final a f82190c = new a("bad-request");

        /* renamed from: d  reason: collision with root package name */
        public static final a f82191d = new a("conflict");

        /* renamed from: e  reason: collision with root package name */
        public static final a f82192e = new a("feature-not-implemented");

        /* renamed from: f  reason: collision with root package name */
        public static final a f82193f = new a("gone");
        public static final a g = new a("item-not-found");
        public static final a h = new a("jid-malformed");
        public static final a i = new a("not-acceptable");
        public static final a j = new a("not-allowed");
        public static final a k = new a("not-authorized");
        public static final a l = new a("payment-required");
        public static final a m = new a("recipient-unavailable");
        public static final a n = new a("redirect");
        public static final a o = new a("registration-required");
        public static final a p = new a("remote-server-error");
        public static final a q = new a("remote-server-not-found");
        public static final a r = new a("remote-server-timeout");
        public static final a s = new a("resource-constraint");
        public static final a t = new a("service-unavailable");
        public static final a u = new a("subscription-required");
        public static final a v = new a("undefined-condition");
        public static final a w = new a("unexpected-request");
        public static final a x = new a("request-timeout");
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with other field name */
        public String f498a;

        public a(String str) {
            this.f498a = str;
        }

        public String toString() {
            return this.f498a;
        }
    }

    public hl(int i, String str, String str2, String str3, String str4, List<he> list) {
        this.f82184a = i;
        this.f496a = str;
        this.f82186c = str2;
        this.f82185b = str3;
        this.f82187d = str4;
        this.f497a = list;
    }

    public hl(Bundle bundle) {
        this.f82184a = bundle.getInt("ext_err_code");
        if (bundle.containsKey("ext_err_type")) {
            this.f496a = bundle.getString("ext_err_type");
        }
        this.f82185b = bundle.getString("ext_err_cond");
        this.f82186c = bundle.getString("ext_err_reason");
        this.f82187d = bundle.getString("ext_err_msg");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f497a = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                he a2 = he.a((Bundle) parcelable);
                if (a2 != null) {
                    this.f497a.add(a2);
                }
            }
        }
    }

    public hl(a aVar) {
        a(aVar);
        this.f82187d = null;
    }

    private void a(a aVar) {
        this.f82185b = aVar.f498a;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (this.f496a != null) {
            bundle.putString("ext_err_type", this.f496a);
        }
        bundle.putInt("ext_err_code", this.f82184a);
        if (this.f82186c != null) {
            bundle.putString("ext_err_reason", this.f82186c);
        }
        if (this.f82185b != null) {
            bundle.putString("ext_err_cond", this.f82185b);
        }
        if (this.f82187d != null) {
            bundle.putString("ext_err_msg", this.f82187d);
        }
        if (this.f497a != null) {
            Bundle[] bundleArr = new Bundle[this.f497a.size()];
            int i = 0;
            for (he a2 : this.f497a) {
                Bundle a3 = a2.a();
                if (a3 != null) {
                    bundleArr[i] = a3;
                    i++;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m370a() {
        StringBuilder sb = new StringBuilder();
        sb.append("<error code=\"");
        sb.append(this.f82184a);
        sb.append("\"");
        if (this.f496a != null) {
            sb.append(" type=\"");
            sb.append(this.f496a);
            sb.append("\"");
        }
        if (this.f82186c != null) {
            sb.append(" reason=\"");
            sb.append(this.f82186c);
            sb.append("\"");
        }
        sb.append(">");
        if (this.f82185b != null) {
            sb.append("<");
            sb.append(this.f82185b);
            sb.append(" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\"/>");
        }
        if (this.f82187d != null) {
            sb.append("<text xml:lang=\"en\" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\">");
            sb.append(this.f82187d);
            sb.append("</text>");
        }
        for (hi d2 : a()) {
            sb.append(d2.d());
        }
        sb.append("</error>");
        return sb.toString();
    }

    /* renamed from: a  reason: collision with other method in class */
    public List<he> m371a() {
        List<he> emptyList;
        synchronized (this) {
            emptyList = this.f497a == null ? Collections.emptyList() : Collections.unmodifiableList(this.f497a);
        }
        return emptyList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f82185b != null) {
            sb.append(this.f82185b);
        }
        sb.append("(");
        sb.append(this.f82184a);
        sb.append(")");
        if (this.f82187d != null) {
            sb.append(" ");
            sb.append(this.f82187d);
        }
        return sb.toString();
    }
}
