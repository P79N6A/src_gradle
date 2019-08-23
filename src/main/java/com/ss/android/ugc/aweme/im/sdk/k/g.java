package com.ss.android.ugc.aweme.im.sdk.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.zip.ZipException;

public final class g implements v {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51736a;

    /* renamed from: b  reason: collision with root package name */
    private static final z f51737b = new z(51966);

    /* renamed from: c  reason: collision with root package name */
    private static final z f51738c = new z(0);

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f51739d = new byte[0];

    /* renamed from: e  reason: collision with root package name */
    private static final g f51740e = new g();

    public final byte[] a() {
        return f51739d;
    }

    public final z b() {
        return f51738c;
    }

    public final byte[] c() {
        return f51739d;
    }

    public final z d() {
        return f51738c;
    }

    public final z e() {
        return f51737b;
    }

    public final void a(byte[] bArr, int i, int i2) throws ZipException {
        if (PatchProxy.isSupport(new Object[]{bArr, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51736a, false, 54237, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bArr, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51736a, false, 54237, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i2 != 0) {
            throw new ZipException("JarMarker doesn't expect any data");
        }
    }
}
