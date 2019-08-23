package com.ss.android.ugc.aweme.ug;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75170a;

    public static void a(Runnable runnable) {
        if (PatchProxy.isSupport(new Object[]{runnable}, null, f75170a, true, 87342, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable}, null, f75170a, true, 87342, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        AbTestManager.a();
        com.ss.android.b.a.a.a.a(runnable);
    }
}
