package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;

public final class ay implements bf {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65759a;

    ay() {
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f65759a, false, 74059, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65759a, false, 74059, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a.L.a(e.a.DurationMode)) {
            a.L.a(e.a.DurationMode, false);
        }
        return a.L.a(e.a.DurationMode);
    }
}
