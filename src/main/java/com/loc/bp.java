package com.loc;

import java.util.Locale;
import org.json.JSONObject;

public final class bp {

    /* renamed from: a  reason: collision with root package name */
    public int f25557a;

    /* renamed from: b  reason: collision with root package name */
    public int f25558b;

    /* renamed from: c  reason: collision with root package name */
    public int f25559c;

    /* renamed from: d  reason: collision with root package name */
    public int f25560d;

    /* renamed from: e  reason: collision with root package name */
    public int f25561e;

    /* renamed from: f  reason: collision with root package name */
    public int f25562f;
    public int g;
    public int h;
    public int i;
    public int j = -113;
    public int k;
    public short l;
    public long m;
    public boolean n;
    public boolean o = true;

    public bp(int i2, boolean z) {
        this.k = i2;
        this.n = z;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.k);
            jSONObject.put("registered", this.n);
            jSONObject.put("mcc", this.f25557a);
            jSONObject.put("mnc", this.f25558b);
            jSONObject.put("lac", this.f25559c);
            jSONObject.put("cid", this.f25560d);
            jSONObject.put("sid", this.g);
            jSONObject.put("nid", this.h);
            jSONObject.put("bid", this.i);
            jSONObject.put("sig", this.j);
        } catch (Throwable th) {
            ce.a(th, "cgi", "toJson");
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof bp)) {
            bp bpVar = (bp) obj;
            switch (bpVar.k) {
                case 1:
                    if (this.k == 1 && bpVar.f25559c == this.f25559c && bpVar.f25560d == this.f25560d && bpVar.f25558b == this.f25558b) {
                        return true;
                    }
                    break;
                case 2:
                    return this.k == 2 && bpVar.i == this.i && bpVar.h == this.h && bpVar.g == this.g;
                case 3:
                    return this.k == 3 && bpVar.f25559c == this.f25559c && bpVar.f25560d == this.f25560d && bpVar.f25558b == this.f25558b;
                case 4:
                    return this.k == 4 && bpVar.f25559c == this.f25559c && bpVar.f25560d == this.f25560d && bpVar.f25558b == this.f25558b;
                default:
                    return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i2;
        int hashCode2 = String.valueOf(this.k).hashCode();
        if (this.k == 2) {
            hashCode = String.valueOf(this.i).hashCode() + String.valueOf(this.h).hashCode();
            i2 = this.g;
        } else {
            hashCode = String.valueOf(this.f25559c).hashCode() + String.valueOf(this.f25560d).hashCode();
            i2 = this.f25558b;
        }
        return hashCode2 + hashCode + String.valueOf(i2).hashCode();
    }

    public final String toString() {
        Object[] objArr;
        String str;
        Locale locale;
        switch (this.k) {
            case 1:
                locale = Locale.CHINA;
                str = "GSM lac=%d, cid=%d, mnc=%s, valid=%b, sig=%d, age=%d, reg=%b";
                objArr = new Object[]{Integer.valueOf(this.f25559c), Integer.valueOf(this.f25560d), Integer.valueOf(this.f25558b), Boolean.valueOf(this.o), Integer.valueOf(this.j), Short.valueOf(this.l), Boolean.valueOf(this.n)};
                break;
            case 2:
                locale = Locale.CHINA;
                str = "CDMA bid=%d, nid=%d, sid=%d, valid=%b, sig=%d, age=%d, reg=%b";
                objArr = new Object[]{Integer.valueOf(this.i), Integer.valueOf(this.h), Integer.valueOf(this.g), Boolean.valueOf(this.o), Integer.valueOf(this.j), Short.valueOf(this.l), Boolean.valueOf(this.n)};
                break;
            case 3:
                locale = Locale.CHINA;
                str = "LTE lac=%d, cid=%d, mnc=%s, valid=%b, sig=%d, age=%d, reg=%b";
                objArr = new Object[]{Integer.valueOf(this.f25559c), Integer.valueOf(this.f25560d), Integer.valueOf(this.f25558b), Boolean.valueOf(this.o), Integer.valueOf(this.j), Short.valueOf(this.l), Boolean.valueOf(this.n)};
                break;
            case 4:
                locale = Locale.CHINA;
                str = "WCDMA lac=%d, cid=%d, mnc=%s, valid=%b, sig=%d, age=%d, reg=%b";
                objArr = new Object[]{Integer.valueOf(this.f25559c), Integer.valueOf(this.f25560d), Integer.valueOf(this.f25558b), Boolean.valueOf(this.o), Integer.valueOf(this.j), Short.valueOf(this.l), Boolean.valueOf(this.n)};
                break;
            default:
                return "unknown";
        }
        return String.format(locale, str, objArr);
    }
}
