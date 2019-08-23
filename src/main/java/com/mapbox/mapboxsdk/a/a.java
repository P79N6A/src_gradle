package com.mapbox.mapboxsdk.a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f26381a;

    /* renamed from: b  reason: collision with root package name */
    public String f26382b;

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.f26381a != null) {
            i = this.f26381a.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (this.f26382b != null) {
            i2 = this.f26382b.hashCode();
        }
        return i3 + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f26381a == null ? aVar.f26381a != null : !this.f26381a.equals(aVar.f26381a)) {
            return false;
        }
        if (this.f26382b != null) {
            return this.f26382b.equals(aVar.f26382b);
        }
        if (aVar.f26382b == null) {
            return true;
        }
        return false;
    }

    a(String str, String str2) {
        this.f26381a = str;
        this.f26382b = str2;
    }
}
