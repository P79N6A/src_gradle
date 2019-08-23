package com.ss.android.ugc.aweme.profile;

import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61557a;

    /* renamed from: b  reason: collision with root package name */
    private static WeakReference<Fragment> f61558b = new WeakReference<>(null);

    public static void a(Fragment fragment) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2}, null, f61557a, true, 67272, new Class[]{Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2}, null, f61557a, true, 67272, new Class[]{Fragment.class}, Void.TYPE);
            return;
        }
        f61558b = new WeakReference<>(fragment2);
    }
}
