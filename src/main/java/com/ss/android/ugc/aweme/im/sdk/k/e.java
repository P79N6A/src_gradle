package com.ss.android.ugc.aweme.im.sdk.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class e implements s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51729a;

    /* renamed from: b  reason: collision with root package name */
    private final String f51730b;

    public final boolean a(String str) {
        return true;
    }

    public e() {
    }

    public e(String str) {
        this.f51730b = str;
    }

    public final String a(byte[] bArr) throws IOException {
        if (PatchProxy.isSupport(new Object[]{bArr}, this, f51729a, false, 54232, new Class[]{byte[].class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{bArr}, this, f51729a, false, 54232, new Class[]{byte[].class}, String.class);
        } else if (this.f51730b == null) {
            return new String(bArr);
        } else {
            return new String(bArr, this.f51730b);
        }
    }

    public final ByteBuffer b(String str) throws IOException {
        if (PatchProxy.isSupport(new Object[]{str}, this, f51729a, false, 54231, new Class[]{String.class}, ByteBuffer.class)) {
            return (ByteBuffer) PatchProxy.accessDispatch(new Object[]{str}, this, f51729a, false, 54231, new Class[]{String.class}, ByteBuffer.class);
        } else if (this.f51730b == null) {
            return ByteBuffer.wrap(str.getBytes());
        } else {
            return ByteBuffer.wrap(str.getBytes(this.f51730b));
        }
    }
}
