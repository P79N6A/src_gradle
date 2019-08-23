package com.xiaomi.push;

import android.os.Bundle;
import android.text.TextUtils;

public class hg extends hh {

    /* renamed from: a  reason: collision with root package name */
    private boolean f82158a;

    /* renamed from: b  reason: collision with root package name */
    private String f82159b;

    /* renamed from: b  reason: collision with other field name */
    private boolean f486b;

    /* renamed from: c  reason: collision with root package name */
    private String f82160c;

    /* renamed from: d  reason: collision with root package name */
    private String f82161d;

    /* renamed from: e  reason: collision with root package name */
    private String f82162e;

    /* renamed from: f  reason: collision with root package name */
    private String f82163f;
    private String g;
    private String h;
    private String i = "";
    private String j = "";
    private String k = "";
    private String l = "";

    public hg() {
    }

    public hg(Bundle bundle) {
        super(bundle);
        this.f82159b = bundle.getString("ext_msg_type");
        this.f82161d = bundle.getString("ext_msg_lang");
        this.f82160c = bundle.getString("ext_msg_thread");
        this.f82162e = bundle.getString("ext_msg_sub");
        this.f82163f = bundle.getString("ext_msg_body");
        this.g = bundle.getString("ext_body_encode");
        this.h = bundle.getString("ext_msg_appid");
        this.f82158a = bundle.getBoolean("ext_msg_trans", false);
        this.f486b = bundle.getBoolean("ext_msg_encrypt", false);
        this.i = bundle.getString("ext_msg_seq");
        this.j = bundle.getString("ext_msg_mseq");
        this.k = bundle.getString("ext_msg_fseq");
        this.l = bundle.getString("ext_msg_status");
    }

    public Bundle a() {
        Bundle a2 = super.a();
        if (!TextUtils.isEmpty(this.f82159b)) {
            a2.putString("ext_msg_type", this.f82159b);
        }
        if (this.f82161d != null) {
            a2.putString("ext_msg_lang", this.f82161d);
        }
        if (this.f82162e != null) {
            a2.putString("ext_msg_sub", this.f82162e);
        }
        if (this.f82163f != null) {
            a2.putString("ext_msg_body", this.f82163f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            a2.putString("ext_body_encode", this.g);
        }
        if (this.f82160c != null) {
            a2.putString("ext_msg_thread", this.f82160c);
        }
        if (this.h != null) {
            a2.putString("ext_msg_appid", this.h);
        }
        if (this.f82158a) {
            a2.putBoolean("ext_msg_trans", true);
        }
        if (!TextUtils.isEmpty(this.i)) {
            a2.putString("ext_msg_seq", this.i);
        }
        if (!TextUtils.isEmpty(this.j)) {
            a2.putString("ext_msg_mseq", this.j);
        }
        if (!TextUtils.isEmpty(this.k)) {
            a2.putString("ext_msg_fseq", this.k);
        }
        if (this.f486b) {
            a2.putBoolean("ext_msg_encrypt", true);
        }
        if (!TextUtils.isEmpty(this.l)) {
            a2.putString("ext_msg_status", this.l);
        }
        return a2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m364a() {
        StringBuilder sb = new StringBuilder();
        sb.append("<message");
        if (p() != null) {
            sb.append(" xmlns=\"");
            sb.append(p());
            sb.append("\"");
        }
        if (this.f82161d != null) {
            sb.append(" xml:lang=\"");
            sb.append(h());
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
        if (!TextUtils.isEmpty(d())) {
            sb.append(" seq=\"");
            sb.append(d());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(e())) {
            sb.append(" mseq=\"");
            sb.append(e());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(f())) {
            sb.append(" fseq=\"");
            sb.append(f());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(g())) {
            sb.append(" status=\"");
            sb.append(g());
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
        if (this.f82158a) {
            sb.append(" transient=\"true\"");
        }
        if (!TextUtils.isEmpty(this.h)) {
            sb.append(" appid=\"");
            sb.append(c());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(this.f82159b)) {
            sb.append(" type=\"");
            sb.append(this.f82159b);
            sb.append("\"");
        }
        if (this.f486b) {
            sb.append(" s=\"1\"");
        }
        sb.append(">");
        if (this.f82162e != null) {
            sb.append("<subject>");
            sb.append(hs.a(this.f82162e));
            sb.append("</subject>");
        }
        if (this.f82163f != null) {
            sb.append("<body");
            if (!TextUtils.isEmpty(this.g)) {
                sb.append(" encode=\"");
                sb.append(this.g);
                sb.append("\"");
            }
            sb.append(">");
            sb.append(hs.a(this.f82163f));
            sb.append("</body>");
        }
        if (this.f82160c != null) {
            sb.append("<thread>");
            sb.append(this.f82160c);
            sb.append("</thread>");
        }
        if ("error".equalsIgnoreCase(this.f82159b)) {
            hl a2 = a();
            if (a2 != null) {
                sb.append(a2.a());
            }
        }
        sb.append(o());
        sb.append("</message>");
        return sb.toString();
    }

    public void a(String str) {
        this.h = str;
    }

    public void a(String str, String str2) {
        this.f82163f = str;
        this.g = str2;
    }

    public void a(boolean z) {
        this.f82158a = z;
    }

    public String b() {
        return this.f82159b;
    }

    public void b(String str) {
        this.i = str;
    }

    public void b(boolean z) {
        this.f486b = z;
    }

    public String c() {
        return this.h;
    }

    public void c(String str) {
        this.j = str;
    }

    public String d() {
        return this.i;
    }

    public void d(String str) {
        this.k = str;
    }

    public String e() {
        return this.j;
    }

    public void e(String str) {
        this.l = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            hg hgVar = (hg) obj;
            if (!super.equals(hgVar)) {
                return false;
            }
            if (this.f82163f != null) {
                if (!this.f82163f.equals(hgVar.f82163f)) {
                    return false;
                }
            } else if (hgVar.f82163f != null) {
                return false;
            }
            if (this.f82161d != null) {
                if (!this.f82161d.equals(hgVar.f82161d)) {
                    return false;
                }
            } else if (hgVar.f82161d != null) {
                return false;
            }
            if (this.f82162e != null) {
                if (!this.f82162e.equals(hgVar.f82162e)) {
                    return false;
                }
            } else if (hgVar.f82162e != null) {
                return false;
            }
            if (this.f82160c != null) {
                if (!this.f82160c.equals(hgVar.f82160c)) {
                    return false;
                }
            } else if (hgVar.f82160c != null) {
                return false;
            }
            if (this.f82159b != hgVar.f82159b) {
                return false;
            }
        }
        return true;
    }

    public String f() {
        return this.k;
    }

    public void f(String str) {
        this.f82159b = str;
    }

    public String g() {
        return this.l;
    }

    public void g(String str) {
        this.f82162e = str;
    }

    public String h() {
        return this.f82161d;
    }

    public void h(String str) {
        this.f82163f = str;
    }

    public int hashCode() {
        int i2 = 0;
        int hashCode = this.f82159b != null ? this.f82159b.hashCode() : 0;
        int hashCode2 = this.f82163f != null ? this.f82163f.hashCode() : 0;
        int hashCode3 = this.f82160c != null ? this.f82160c.hashCode() : 0;
        int hashCode4 = this.f82161d != null ? this.f82161d.hashCode() : 0;
        if (this.f82162e != null) {
            i2 = this.f82162e.hashCode();
        }
        return ((hashCode4 + ((hashCode3 + ((hashCode2 + (hashCode * 31)) * 31)) * 31)) * 31) + i2;
    }

    public void i(String str) {
        this.f82160c = str;
    }

    public void j(String str) {
        this.f82161d = str;
    }
}
