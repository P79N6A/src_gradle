package io.fabric.sdk.android.services.b;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f83160a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f83161b;

    public final int hashCode() {
        int i;
        if (this.f83160a != null) {
            i = this.f83160a.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + (this.f83161b ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f83161b != bVar.f83161b) {
            return false;
        }
        if (this.f83160a == null ? bVar.f83160a == null : this.f83160a.equals(bVar.f83160a)) {
            return true;
        }
        return false;
    }

    b(String str, boolean z) {
        this.f83160a = str;
        this.f83161b = z;
    }
}
