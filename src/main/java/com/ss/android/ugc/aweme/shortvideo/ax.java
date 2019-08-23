package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;

public final class ax implements fj {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65758a;

    ax() {
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f65758a, false, 74058, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65758a, false, 74058, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a.L.b(e.a.BeautyModel) > 0) {
            z = true;
        }
        return z;
    }
}
