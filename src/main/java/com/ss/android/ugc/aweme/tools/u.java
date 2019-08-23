package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class u implements bc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74939a;

    /* renamed from: b  reason: collision with root package name */
    public int f74940b;

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74939a, false, 86961, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74939a, false, 86961, new Class[0], String.class);
        }
        return "FlashChangeEvent{mode=" + this.f74940b + '}';
    }

    public u(int i) {
        this.f74940b = i;
    }
}
