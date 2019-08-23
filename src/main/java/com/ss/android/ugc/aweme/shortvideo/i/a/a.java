package com.ss.android.ugc.aweme.shortvideo.i.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.video.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68185a;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f68185a, true, 78311, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f68185a, true, 78311, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!b.h()) {
            com.bytedance.ies.dmt.ui.d.a.b(d.a(), (int) C0906R.string.c1x).a();
            return false;
        } else if (b.i() >= 20971520) {
            return true;
        } else {
            com.bytedance.ies.dmt.ui.d.a.b(d.a(), (int) C0906R.string.c1y).a();
            return false;
        }
    }
}
