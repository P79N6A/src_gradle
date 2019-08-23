package com.ss.android.ugc.aweme.story.friends.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73106a;

    /* renamed from: b  reason: collision with root package name */
    public static long f73107b;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f73106a, true, 84585, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f73106a, true, 84585, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (System.currentTimeMillis() - f73107b <= 500) {
            return false;
        }
        f73107b = System.currentTimeMillis();
        return true;
    }
}
