package com.ss.android.ugc.aweme.im.sdk.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.zip.ZipException;

public abstract class a implements v {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51711a;

    /* renamed from: b  reason: collision with root package name */
    public long f51712b;

    /* renamed from: c  reason: collision with root package name */
    byte[] f51713c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f51714d;

    public final byte[] a() {
        if (PatchProxy.isSupport(new Object[0], this, f51711a, false, 54207, new Class[0], byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[0], this, f51711a, false, 54207, new Class[0], byte[].class);
        }
        if (this.f51714d == null) {
            f();
        }
        byte[] bArr = null;
        if (this.f51714d != null) {
            bArr = new byte[this.f51714d.length];
            System.arraycopy(this.f51714d, 0, bArr, 0, bArr.length);
        }
        return bArr;
    }

    public final z b() {
        if (PatchProxy.isSupport(new Object[0], this, f51711a, false, 54208, new Class[0], z.class)) {
            return (z) PatchProxy.accessDispatch(new Object[0], this, f51711a, false, 54208, new Class[0], z.class);
        }
        if (this.f51714d == null) {
            f();
        }
        return new z(this.f51714d.length);
    }

    public final byte[] c() {
        if (!PatchProxy.isSupport(new Object[0], this, f51711a, false, 54209, new Class[0], byte[].class)) {
            return a();
        }
        return (byte[]) PatchProxy.accessDispatch(new Object[0], this, f51711a, false, 54209, new Class[0], byte[].class);
    }

    public final z d() {
        if (!PatchProxy.isSupport(new Object[0], this, f51711a, false, 54210, new Class[0], z.class)) {
            return b();
        }
        return (z) PatchProxy.accessDispatch(new Object[0], this, f51711a, false, 54210, new Class[0], z.class);
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f51711a, false, 54204, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51711a, false, 54204, new Class[0], Void.TYPE);
        } else if (this.f51713c != null) {
            this.f51714d = new byte[(this.f51713c.length + 5)];
            this.f51714d[0] = 1;
            System.arraycopy(x.a(this.f51712b), 0, this.f51714d, 1, 4);
            System.arraycopy(this.f51713c, 0, this.f51714d, 5, this.f51713c.length);
        }
    }

    public final void a(byte[] bArr, int i, int i2) throws ZipException {
        byte[] bArr2 = bArr;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{bArr2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51711a, false, 54211, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bArr2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51711a, false, 54211, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i3 >= 5) {
            if (bArr2[i] == 1) {
                this.f51712b = x.b(bArr, i + 1);
                int i4 = i3 - 5;
                this.f51713c = new byte[i4];
                System.arraycopy(bArr, i + 5, this.f51713c, 0, i4);
                this.f51714d = null;
                return;
            }
            throw new ZipException("Unsupported version [" + r1 + "] for UniCode path extra data.");
        } else {
            throw new ZipException("UniCode path extra data must have at least 5 bytes.");
        }
    }
}
