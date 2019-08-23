package com.xiaomi.push;

import android.os.Bundle;

public class hj extends hh {

    /* renamed from: a  reason: collision with root package name */
    private int f82170a = Integer.MIN_VALUE;

    /* renamed from: a  reason: collision with other field name */
    private a f492a;

    /* renamed from: a  reason: collision with other field name */
    private b f493a = b.available;

    /* renamed from: b  reason: collision with root package name */
    private String f82171b;

    public enum a {
        chat,
        available,
        away,
        xa,
        dnd
    }

    public enum b {
        available,
        unavailable,
        subscribe,
        subscribed,
        unsubscribe,
        unsubscribed,
        error,
        probe
    }

    public hj(Bundle bundle) {
        super(bundle);
        if (bundle.containsKey("ext_pres_type")) {
            this.f493a = b.valueOf(bundle.getString("ext_pres_type"));
        }
        if (bundle.containsKey("ext_pres_status")) {
            this.f82171b = bundle.getString("ext_pres_status");
        }
        if (bundle.containsKey("ext_pres_prio")) {
            this.f82170a = bundle.getInt("ext_pres_prio");
        }
        if (bundle.containsKey("ext_pres_mode")) {
            this.f492a = a.valueOf(bundle.getString("ext_pres_mode"));
        }
    }

    public hj(b bVar) {
        a(bVar);
    }

    public Bundle a() {
        Bundle a2 = super.a();
        if (this.f493a != null) {
            a2.putString("ext_pres_type", this.f493a.toString());
        }
        if (this.f82171b != null) {
            a2.putString("ext_pres_status", this.f82171b);
        }
        if (this.f82170a != Integer.MIN_VALUE) {
            a2.putInt("ext_pres_prio", this.f82170a);
        }
        if (!(this.f492a == null || this.f492a == a.available)) {
            a2.putString("ext_pres_mode", this.f492a.toString());
        }
        return a2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m369a() {
        StringBuilder sb = new StringBuilder();
        sb.append("<presence");
        if (p() != null) {
            sb.append(" xmlns=\"");
            sb.append(p());
            sb.append("\"");
        }
        if (j() != null) {
            sb.append(" id=\"");
            sb.append(j());
            sb.append("\"");
        }
        if (l() != null) {
            sb.append(" to=\"");
            sb.append(hs.a(l()));
            sb.append("\"");
        }
        if (m() != null) {
            sb.append(" from=\"");
            sb.append(hs.a(m()));
            sb.append("\"");
        }
        if (k() != null) {
            sb.append(" chid=\"");
            sb.append(hs.a(k()));
            sb.append("\"");
        }
        if (this.f493a != null) {
            sb.append(" type=\"");
            sb.append(this.f493a);
            sb.append("\"");
        }
        sb.append(">");
        if (this.f82171b != null) {
            sb.append("<status>");
            sb.append(hs.a(this.f82171b));
            sb.append("</status>");
        }
        if (this.f82170a != Integer.MIN_VALUE) {
            sb.append("<priority>");
            sb.append(this.f82170a);
            sb.append("</priority>");
        }
        if (!(this.f492a == null || this.f492a == a.available)) {
            sb.append("<show>");
            sb.append(this.f492a);
            sb.append("</show>");
        }
        sb.append(o());
        hl a2 = a();
        if (a2 != null) {
            sb.append(a2.a());
        }
        sb.append("</presence>");
        return sb.toString();
    }

    public void a(int i) {
        if (i < -128 || i > 128) {
            throw new IllegalArgumentException("Priority value " + i + " is not valid. Valid range is -128 through 128.");
        }
        this.f82170a = i;
    }

    public void a(a aVar) {
        this.f492a = aVar;
    }

    public void a(b bVar) {
        if (bVar != null) {
            this.f493a = bVar;
            return;
        }
        throw new NullPointerException("Type cannot be null");
    }

    public void a(String str) {
        this.f82171b = str;
    }
}
