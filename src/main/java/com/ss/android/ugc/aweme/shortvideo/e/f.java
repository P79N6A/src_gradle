package com.ss.android.ugc.aweme.shortvideo.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.ea;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66819a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f66820b;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f66819a, true, 75292, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f66819a, true, 75292, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!a.L.a(e.a.LongVideoPermitted) || a.L.c(e.a.LongVideoThreshold) <= ea.f66827f) {
            return false;
        }
        return true;
    }
}
