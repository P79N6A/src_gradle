package com.ss.android.http.a.b;

import com.ss.android.http.a.b;
import com.ss.android.http.a.f;

public final class a implements com.ss.android.http.a.a, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private final String f29131a;

    /* renamed from: b  reason: collision with root package name */
    private final String f29132b;

    public final String a() {
        return this.f29131a;
    }

    public final String b() {
        return this.f29132b;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final String toString() {
        return d.f29138a.a(null, this).toString();
    }

    public final b[] c() throws f {
        if (this.f29132b == null) {
            return new b[0];
        }
        String str = this.f29132b;
        if (str != null) {
            c cVar = c.f29136a;
            com.ss.android.http.a.d.b bVar = new com.ss.android.http.a.d.b(str.length());
            bVar.a(str);
            return cVar.a(bVar, new h(0, str.length()));
        }
        throw new IllegalArgumentException("Value to parse may not be null");
    }

    public a(String str, String str2) {
        if (str != null) {
            this.f29131a = str;
            this.f29132b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
