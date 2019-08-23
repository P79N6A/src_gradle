package com.ss.android.ugc.aweme.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.video.local.h;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76115a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f76116b;

    public static void a() {
        f76116b = false;
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f76115a, true, 88935, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f76115a, true, 88935, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return h.a();
    }
}
