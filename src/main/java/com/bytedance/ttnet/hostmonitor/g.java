package com.bytedance.ttnet.hostmonitor;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f22654a;

    /* renamed from: b  reason: collision with root package name */
    public a f22655b;

    public g() {
        this.f22654a = true;
        this.f22655b = a.NONE;
    }

    public final int hashCode() {
        return ((this.f22654a ? 1 : 0) * true) + this.f22655b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f22654a == gVar.f22654a && this.f22655b == gVar.f22655b) {
            return true;
        }
        return false;
    }

    public g(boolean z, a aVar) {
        this.f22654a = z;
        this.f22655b = aVar;
    }
}
