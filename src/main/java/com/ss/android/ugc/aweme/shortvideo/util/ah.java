package com.ss.android.ugc.aweme.shortvideo.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.q.c;

public final class ah {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71104a;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f71104a, true, 81039, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f71104a, true, 81039, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return c.a(k.a(), "sp_upload_red_point", 0).getBoolean("show_upload_red_point", true);
    }
}
