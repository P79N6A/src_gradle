package com.ss.android.ugc.aweme.live.c;

import com.bytedance.android.livesdkapi.host.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53343a;

    public static void a(p pVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{pVar, Byte.valueOf(z ? (byte) 1 : 0)}, null, f53343a, true, 55968, new Class[]{p.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar, Byte.valueOf(z)}, null, f53343a, true, 55968, new Class[]{p.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (pVar != null) {
            pVar.a(z);
        }
    }
}
