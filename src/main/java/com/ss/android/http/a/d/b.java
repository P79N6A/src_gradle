package com.ss.android.http.a.d;

import com.ss.android.http.a.c.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public char[] f29146a;

    /* renamed from: b  reason: collision with root package name */
    public int f29147b;

    public final String toString() {
        return new String(this.f29146a, 0, this.f29147b);
    }

    public final char b(int i) {
        return this.f29146a[i];
    }

    public b(int i) {
        if (i >= 0) {
            this.f29146a = new char[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    public final void a(char c2) {
        int i = this.f29147b + 1;
        if (i > this.f29146a.length) {
            a(i);
        }
        this.f29146a[this.f29147b] = c2;
        this.f29147b = i;
    }

    public void a(int i) {
        char[] cArr = new char[Math.max(this.f29146a.length << 1, i)];
        System.arraycopy(this.f29146a, 0, cArr, 0, this.f29147b);
        this.f29146a = cArr;
    }

    public final void a(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.f29147b + length;
        if (i > this.f29146a.length) {
            a(i);
        }
        str.getChars(0, length, this.f29146a, this.f29147b);
        this.f29147b = i;
    }

    public final String a(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 > this.f29147b) {
            throw new IndexOutOfBoundsException();
        } else if (i <= i2) {
            return new String(this.f29146a, i, i2 - i);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public final String b(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 > this.f29147b) {
            throw new IndexOutOfBoundsException();
        } else if (i <= i2) {
            while (i < i2 && a.a(this.f29146a[i])) {
                i++;
            }
            while (i2 > i && a.a(this.f29146a[i2 - 1])) {
                i2--;
            }
            return new String(this.f29146a, i, i2 - i);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
