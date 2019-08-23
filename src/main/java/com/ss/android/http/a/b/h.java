package com.ss.android.http.a.b;

import com.ss.android.http.a.d.b;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f29141a;

    /* renamed from: b  reason: collision with root package name */
    public final int f29142b;

    /* renamed from: c  reason: collision with root package name */
    public int f29143c;

    public final boolean a() {
        if (this.f29143c >= this.f29142b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        b bVar = new b(16);
        bVar.a('[');
        bVar.a(Integer.toString(this.f29141a));
        bVar.a('>');
        bVar.a(Integer.toString(this.f29143c));
        bVar.a('>');
        bVar.a(Integer.toString(this.f29142b));
        bVar.a(']');
        return bVar.toString();
    }

    public final void a(int i) {
        if (i < this.f29141a) {
            throw new IndexOutOfBoundsException();
        } else if (i <= this.f29142b) {
            this.f29143c = i;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public h(int i, int i2) {
        if (i2 >= 0) {
            this.f29141a = 0;
            this.f29142b = i2;
            this.f29143c = 0;
            return;
        }
        throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
    }
}
