package com.ss.android.http.a.b;

import com.ss.android.http.a.d;
import com.ss.android.http.a.d.b;

public final class e implements d, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private final String f29139a;

    /* renamed from: b  reason: collision with root package name */
    private final String f29140b;

    public final String a() {
        return this.f29139a;
    }

    public final String b() {
        return this.f29140b;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final int hashCode() {
        return com.ss.android.http.a.d.d.a(com.ss.android.http.a.d.d.a(17, (Object) this.f29139a), (Object) this.f29140b);
    }

    public final String toString() {
        int length = this.f29139a.length();
        if (this.f29140b != null) {
            length += this.f29140b.length() + 1;
        }
        b bVar = new b(length);
        bVar.a(this.f29139a);
        if (this.f29140b != null) {
            bVar.a("=");
            bVar.a(this.f29140b);
        }
        return bVar.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f29139a.equals(eVar.f29139a) || !com.ss.android.http.a.d.d.a((Object) this.f29140b, (Object) eVar.f29140b)) {
            return false;
        }
        return true;
    }

    public e(String str, String str2) {
        if (str != null) {
            this.f29139a = str;
            this.f29140b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
