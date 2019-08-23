package org.greenrobot.eventbus;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    final Object f84150a;

    /* renamed from: b  reason: collision with root package name */
    final n f84151b;

    /* renamed from: c  reason: collision with root package name */
    volatile boolean f84152c = true;

    public final int hashCode() {
        return this.f84150a.hashCode() + this.f84151b.f84138f.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f84150a != pVar.f84150a || !this.f84151b.equals(pVar.f84151b)) {
            return false;
        }
        return true;
    }

    p(Object obj, n nVar) {
        this.f84150a = obj;
        this.f84151b = nVar;
    }
}
