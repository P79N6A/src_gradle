package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.port.internal.m;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.e;

public final class ci implements bf {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66011a;

    ci() {
    }

    public final boolean a() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f66011a, false, 74213, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f66011a, false, 74213, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a.M.a(a.C0682a.RememberLastRecordDuration)) {
            m mVar = (m) com.ss.android.ugc.aweme.common.g.a.a(com.ss.android.ugc.aweme.framework.e.a.a(), m.class);
            boolean a2 = com.ss.android.ugc.aweme.port.in.a.L.a(e.a.DurationMode);
            if (mVar == null || !mVar.b(false)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return a2;
            }
            if (!a2) {
                if (mVar != null) {
                    mVar.c(true);
                }
                return false;
            }
            com.ss.android.ugc.aweme.port.in.a.L.a(e.a.DurationMode, com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.LongVideoDefaultUseLong));
        } else {
            com.ss.android.ugc.aweme.port.in.a.L.a(e.a.DurationMode, false);
        }
        return com.ss.android.ugc.aweme.port.in.a.L.a(e.a.DurationMode);
    }
}
