package com.bytedance.frameworks.baselib.network.http.util;

import java.util.Locale;

public final class c implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public final String f19870a;

    /* renamed from: b  reason: collision with root package name */
    protected final String f19871b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19872c;

    /* renamed from: d  reason: collision with root package name */
    public final String f19873d;

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final int hashCode() {
        return f.a(f.a(f.a(17, (Object) this.f19871b), this.f19872c), (Object) this.f19873d);
    }

    public final String toString() {
        a aVar = new a(32);
        aVar.a(this.f19873d);
        aVar.a("://");
        aVar.a(this.f19870a);
        if (this.f19872c != -1) {
            int i = aVar.f19869b + 1;
            if (i > aVar.f19868a.length) {
                aVar.a(i);
            }
            aVar.f19868a[aVar.f19869b] = ':';
            aVar.f19869b = i;
            aVar.a(Integer.toString(this.f19872c));
        }
        return aVar.toString();
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
        if (!this.f19871b.equals(cVar.f19871b) || this.f19872c != cVar.f19872c || !this.f19873d.equals(cVar.f19873d)) {
            return false;
        }
        return true;
    }

    public c(String str, int i, String str2) {
        if (str != null) {
            this.f19870a = str;
            this.f19871b = str.toLowerCase(Locale.ENGLISH);
            if (str2 != null) {
                this.f19873d = str2.toLowerCase(Locale.ENGLISH);
            } else {
                this.f19873d = "http";
            }
            this.f19872c = i;
            return;
        }
        throw new IllegalArgumentException("Host name may not be null");
    }
}
