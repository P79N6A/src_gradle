package com.bytedance.ttnet.hostmonitor;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f22637a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22638b;

    public final int hashCode() {
        return (this.f22637a.hashCode() * 31) + this.f22638b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f22638b != cVar.f22638b || !this.f22637a.equals(cVar.f22637a)) {
            return false;
        }
        return true;
    }

    public c(String str, int i) {
        this.f22637a = str;
        this.f22638b = i;
    }
}
