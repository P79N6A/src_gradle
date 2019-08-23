package com.bytedance.frameworks.apm.trace;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    int f19660a;

    /* renamed from: b  reason: collision with root package name */
    int f19661b;

    /* renamed from: c  reason: collision with root package name */
    int f19662c;

    /* renamed from: d  reason: collision with root package name */
    int f19663d = 1;

    public final int hashCode() {
        return super.hashCode();
    }

    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.f19662c; i++) {
            stringBuffer.append('.');
        }
        return stringBuffer.toString() + this.f19660a + " " + this.f19663d + " " + this.f19661b;
    }

    public final String toString() {
        return this.f19662c + "," + this.f19660a + "," + this.f19663d + "," + this.f19661b;
    }

    public final void a(long j) {
        this.f19663d++;
        this.f19661b = (int) (((long) this.f19661b) + j);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.f19660a == this.f19660a && fVar.f19662c == this.f19662c) {
                return true;
            }
        }
        return false;
    }

    f(int i, int i2, int i3) {
        this.f19660a = i;
        this.f19661b = i2;
        this.f19662c = i3;
    }
}
