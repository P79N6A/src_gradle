package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.property.e;

public final class cz {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66726a;

    public static boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f66726a, true, 74243, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f66726a, true, 74243, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a.c()) {
            return com.ss.android.ugc.aweme.port.in.a.L.a(e.a.MusicCopyRightGranted);
        }
        if (!a.b()) {
            z = true;
        }
        return z;
    }
}
