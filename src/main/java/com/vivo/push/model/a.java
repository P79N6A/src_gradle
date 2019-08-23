package com.vivo.push.model;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private String f81606a;

    /* renamed from: b  reason: collision with root package name */
    private String f81607b;

    public final String a() {
        return this.f81606a;
    }

    public final String b() {
        return this.f81607b;
    }

    public final int hashCode() {
        int i;
        if (this.f81606a == null) {
            i = 0;
        } else {
            i = this.f81606a.hashCode();
        }
        return i + 31;
    }

    public final String toString() {
        return "ConfigItem{mKey='" + this.f81606a + '\'' + ", mValue='" + this.f81607b + '\'' + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f81606a == null) {
            if (aVar.f81606a != null) {
                return false;
            }
        } else if (!this.f81606a.equals(aVar.f81606a)) {
            return false;
        }
        return true;
    }

    public a(String str, String str2) {
        this.f81606a = str;
        this.f81607b = str2;
    }
}
