package com.alipay.b.b.a.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;

public final class v extends aa {

    /* renamed from: a  reason: collision with root package name */
    public String f5295a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f5296b;

    /* renamed from: c  reason: collision with root package name */
    public String f5297c = "application/x-www-form-urlencoded";

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<Header> f5298d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f5299e;
    private Map<String, String> h = new HashMap();

    public v(String str) {
        this.f5295a = str;
    }

    public final String a(String str) {
        if (this.h == null) {
            return null;
        }
        return this.h.get(str);
    }

    public final void a(String str, String str2) {
        if (this.h == null) {
            this.h = new HashMap();
        }
        this.h.put(str, str2);
    }

    public final void a(Header header) {
        this.f5298d.add(header);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f5296b == null) {
            if (vVar.f5296b != null) {
                return false;
            }
        } else if (!this.f5296b.equals(vVar.f5296b)) {
            return false;
        }
        if (this.f5295a == null) {
            if (vVar.f5295a != null) {
                return false;
            }
        } else if (!this.f5295a.equals(vVar.f5295a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.h == null || !this.h.containsKey("id")) ? 1 : this.h.get("id").hashCode() + 31) * 31) + (this.f5295a == null ? 0 : this.f5295a.hashCode());
    }

    public final String toString() {
        return String.format("Url : %s,HttpHeader: %s", new Object[]{this.f5295a, this.f5298d});
    }
}
