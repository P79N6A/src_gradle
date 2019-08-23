package com.ss.android.ugc.aweme.im.sdk.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

public class b implements v, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51717a;

    /* renamed from: f  reason: collision with root package name */
    private static final z f51718f = new z(30062);

    /* renamed from: b  reason: collision with root package name */
    public int f51719b;

    /* renamed from: c  reason: collision with root package name */
    public int f51720c;

    /* renamed from: d  reason: collision with root package name */
    public int f51721d;

    /* renamed from: e  reason: collision with root package name */
    public String f51722e = "";
    private boolean g;
    private CRC32 h = new CRC32();

    public final z e() {
        return f51718f;
    }

    private boolean f() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f51717a, false, 54217, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f51717a, false, 54217, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f51722e.length() != 0) {
            z = true;
        }
        return z;
    }

    private boolean g() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f51717a, false, 54220, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f51717a, false, 54220, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.g && !f()) {
            z = true;
        }
        return z;
    }

    public final byte[] a() {
        if (!PatchProxy.isSupport(new Object[0], this, f51717a, false, 54215, new Class[0], byte[].class)) {
            return c();
        }
        return (byte[]) PatchProxy.accessDispatch(new Object[0], this, f51717a, false, 54215, new Class[0], byte[].class);
    }

    public final z b() {
        if (!PatchProxy.isSupport(new Object[0], this, f51717a, false, 54213, new Class[0], z.class)) {
            return d();
        }
        return (z) PatchProxy.accessDispatch(new Object[0], this, f51717a, false, 54213, new Class[0], z.class);
    }

    public Object clone() {
        if (PatchProxy.isSupport(new Object[0], this, f51717a, false, 54223, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f51717a, false, 54223, new Class[0], Object.class);
        }
        try {
            b bVar = (b) super.clone();
            bVar.h = new CRC32();
            return bVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final z d() {
        if (!PatchProxy.isSupport(new Object[0], this, f51717a, false, 54212, new Class[0], z.class)) {
            return new z(this.f51722e.getBytes().length + 14);
        }
        return (z) PatchProxy.accessDispatch(new Object[0], this, f51717a, false, 54212, new Class[0], z.class);
    }

    public final byte[] c() {
        if (PatchProxy.isSupport(new Object[0], this, f51717a, false, 54214, new Class[0], byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[0], this, f51717a, false, 54214, new Class[0], byte[].class);
        }
        byte[] bArr = new byte[(d().f51820b - 4)];
        System.arraycopy(z.a(this.f51719b), 0, bArr, 0, 2);
        byte[] bytes = this.f51722e.getBytes();
        System.arraycopy(x.a((long) bytes.length), 0, bArr, 2, 4);
        System.arraycopy(z.a(this.f51720c), 0, bArr, 6, 2);
        System.arraycopy(z.a(this.f51721d), 0, bArr, 8, 2);
        System.arraycopy(bytes, 0, bArr, 10, bytes.length);
        this.h.reset();
        this.h.update(bArr);
        long value = this.h.getValue();
        byte[] bArr2 = new byte[(bArr.length + 4)];
        System.arraycopy(x.a(value), 0, bArr2, 0, 4);
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        return bArr2;
    }

    private int a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f51717a, false, 54222, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f51717a, false, 54222, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int i2 = 32768;
        if (f()) {
            i2 = 40960;
        } else if (g()) {
            i2 = 16384;
        }
        return i2 | (i & 4095);
    }

    public final void a(byte[] bArr, int i, int i2) throws ZipException {
        boolean z;
        Object obj = bArr;
        if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51717a, false, 54221, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51717a, false, 54221, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        long b2 = x.b(bArr, i);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i + 4, bArr2, 0, i3);
        this.h.reset();
        this.h.update(bArr2);
        if (b2 == this.h.getValue()) {
            int a2 = z.a(bArr2, 0);
            byte[] bArr3 = new byte[((int) x.b(bArr2, 2))];
            this.f51720c = z.a(bArr2, 6);
            this.f51721d = z.a(bArr2, 8);
            if (bArr3.length == 0) {
                this.f51722e = "";
            } else {
                System.arraycopy(bArr2, 10, bArr3, 0, bArr3.length);
                this.f51722e = new String(bArr3);
            }
            if ((a2 & 16384) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f51717a, false, 54219, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f51717a, false, 54219, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else {
                this.g = z;
                this.f51719b = a(this.f51719b);
            }
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(a2)}, this, f51717a, false, 54218, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(a2)}, this, f51717a, false, 54218, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f51719b = a(a2);
            return;
        }
        throw new ZipException("bad CRC checksum " + Long.toHexString(b2) + " instead of " + Long.toHexString(r4));
    }
}
