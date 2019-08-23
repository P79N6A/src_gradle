package com.ss.android.ugc.aweme.commerce.preview.refresh;

import android.graphics.PointF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37629a;

    /* renamed from: b  reason: collision with root package name */
    public int f37630b;

    /* renamed from: c  reason: collision with root package name */
    PointF f37631c = new PointF();

    /* renamed from: d  reason: collision with root package name */
    public float f37632d;

    /* renamed from: e  reason: collision with root package name */
    public float f37633e;

    /* renamed from: f  reason: collision with root package name */
    public int f37634f = 0;
    public int g = 0;
    public int h;
    int i = 0;
    public float j = 1.2f;
    public float k = 1.7f;
    public boolean l = false;
    public int m = -1;
    private int n = 0;

    public static boolean c(int i2) {
        return i2 < 0;
    }

    public final void a() {
        this.n = this.f37634f;
    }

    public final boolean h() {
        if (this.f37634f == 0) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f37634f >= this.n) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f37634f > 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (this.f37634f >= this.f37630b) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (this.f37634f != this.i) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if (this.g >= this.f37630b || this.f37634f < this.f37630b) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        if (this.g >= this.h || this.f37634f < this.h) {
            return false;
        }
        return true;
    }

    public final int l() {
        if (this.m >= 0) {
            return this.m;
        }
        return this.h;
    }

    public final boolean d() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f37629a, false, 29166, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f37629a, false, 29166, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.g == 0 && c()) {
            z = true;
        }
        return z;
    }

    public final boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f37629a, false, 29167, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f37629a, false, 29167, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.g != 0 && h()) {
            z = true;
        }
        return z;
    }

    public final boolean k() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f37629a, false, 29168, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f37629a, false, 29168, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f37634f > l()) {
            z = true;
        }
        return z;
    }

    public final boolean b(int i2) {
        if (this.f37634f == i2) {
            return true;
        }
        return false;
    }

    public final void a(float f2) {
        this.j = f2;
        this.f37630b = (int) (((float) this.h) * f2);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f37629a, false, 29164, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f37629a, false, 29164, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g = this.f37634f;
        this.f37634f = i2;
    }
}
