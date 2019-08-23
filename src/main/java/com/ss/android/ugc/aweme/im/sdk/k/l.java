package com.ss.android.ugc.aweme.im.sdk.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class l implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51751a;

    /* renamed from: b  reason: collision with root package name */
    private static final z f51752b = new z(44225);

    /* renamed from: c  reason: collision with root package name */
    private byte[] f51753c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f51754d;

    public final z e() {
        return f51752b;
    }

    public final byte[] a() {
        if (PatchProxy.isSupport(new Object[0], this, f51751a, false, 54251, new Class[0], byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[0], this, f51751a, false, 54251, new Class[0], byte[].class);
        } else if (this.f51754d == null) {
            return c();
        } else {
            return aa.a(this.f51754d);
        }
    }

    public final z b() {
        if (PatchProxy.isSupport(new Object[0], this, f51751a, false, 54249, new Class[0], z.class)) {
            return (z) PatchProxy.accessDispatch(new Object[0], this, f51751a, false, 54249, new Class[0], z.class);
        } else if (this.f51754d == null) {
            return d();
        } else {
            return new z(this.f51754d.length);
        }
    }

    public final byte[] c() {
        if (!PatchProxy.isSupport(new Object[0], this, f51751a, false, 54250, new Class[0], byte[].class)) {
            return aa.a(this.f51753c);
        }
        return (byte[]) PatchProxy.accessDispatch(new Object[0], this, f51751a, false, 54250, new Class[0], byte[].class);
    }

    public final z d() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f51751a, false, 54248, new Class[0], z.class)) {
            return (z) PatchProxy.accessDispatch(new Object[0], this, f51751a, false, 54248, new Class[0], z.class);
        }
        if (this.f51753c != null) {
            i = this.f51753c.length;
        }
        return new z(i);
    }

    public final void a(byte[] bArr, int i, int i2) {
        Object obj = bArr;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51751a, false, 54252, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51751a, false, 54252, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f51753c = new byte[i3];
        System.arraycopy(bArr, i, this.f51753c, 0, i3);
    }

    public final void b(byte[] bArr, int i, int i2) {
        Object obj = bArr;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51751a, false, 54253, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51751a, false, 54253, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f51754d = new byte[i3];
        System.arraycopy(bArr, i, this.f51754d, 0, i3);
        if (this.f51753c == null) {
            a(bArr, i, i2);
        }
    }
}
