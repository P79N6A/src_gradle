package com.ss.android.http.a;

import com.ss.android.http.a.d.b;
import com.ss.android.http.a.d.d;
import java.util.Locale;

public final class c implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public final String f2465a;

    /* renamed from: b  reason: collision with root package name */
    protected final String f2466b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2467c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2468d;

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final int hashCode() {
        return d.a(d.a(d.a(17, (Object) this.f2466b), this.f2467c), (Object) this.f2468d);
    }

    public final String toString() {
        b bVar = new b(32);
        bVar.a(this.f2468d);
        bVar.a("://");
        bVar.a(this.f2465a);
        if (this.f2467c != -1) {
            bVar.a(':');
            bVar.a(Integer.toString(this.f2467c));
        }
        return bVar.toString();
    }

    public c(String str) {
        this(str, -1, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f2466b.equals(cVar.f2466b) || this.f2467c != cVar.f2467c || !this.f2468d.equals(cVar.f2468d)) {
            return false;
        }
        return true;
    }

    public c(String str, int i, String str2) {
        if (str != null) {
            this.f2465a = str;
            this.f2466b = str.toLowerCase(Locale.ENGLISH);
            if (str2 != null) {
                this.f2468d = str2.toLowerCase(Locale.ENGLISH);
            } else {
                this.f2468d = "http";
            }
            this.f2467c = i;
            return;
        }
        throw new IllegalArgumentException("Host name may not be null");
    }
}
