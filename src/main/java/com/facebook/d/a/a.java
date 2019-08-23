package com.facebook.d.a;

import com.taobao.android.dexposed.ClassUtils;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;

public final class a {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    byte[] f23556a;

    /* renamed from: b  reason: collision with root package name */
    int f23557b;

    /* renamed from: c  reason: collision with root package name */
    int f23558c;

    /* renamed from: d  reason: collision with root package name */
    char f23559d;

    /* renamed from: e  reason: collision with root package name */
    boolean f23560e;

    a() {
    }

    private void d() {
        if (!this.f23560e) {
            throw new IllegalStateException("Must call useDelimiter first");
        }
    }

    public final void c() throws NoSuchElementException {
        a();
        d();
        e();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.f23556a == null) {
            throw new IllegalStateException("Must call reset first");
        }
    }

    public final int b() throws NoSuchElementException {
        a();
        d();
        int i = this.f23557b;
        int e2 = e();
        byte[] bArr = this.f23556a;
        int i2 = e2 + i;
        int i3 = 0;
        while (i < i2) {
            int i4 = i + 1;
            int i5 = bArr[i] - 48;
            if (i5 < 0 || i5 > 9) {
                throw new NumberFormatException("Invalid int in buffer at " + (i4 - 1) + ClassUtils.PACKAGE_SEPARATOR);
            }
            i3 = (i3 * 10) + i5;
            i = i4;
        }
        return i3;
    }

    private int e() throws NoSuchElementException {
        a();
        d();
        if (this.f23558c > this.f23557b) {
            int a2 = a(this.f23556a, this.f23557b, this.f23558c, this.f23559d);
            if (a2 == -1) {
                int i = this.f23558c - this.f23557b;
                this.f23557b = this.f23558c;
                return i;
            }
            int i2 = a2 - this.f23557b;
            this.f23557b = a2 + 1;
            return i2;
        }
        throw new NoSuchElementException("Reading past end of input stream at " + this.f23557b + ClassUtils.PACKAGE_SEPARATOR);
    }

    public final boolean a(String str) throws NoSuchElementException {
        int i = this.f23557b;
        if (str.length() != e()) {
            return false;
        }
        int i2 = i;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) != this.f23556a[i2]) {
                return false;
            }
            i2++;
        }
        return true;
    }

    private static int a(byte[] bArr, int i, int i2, char c2) {
        while (i < i2) {
            if (bArr[i] == c2) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
