package com.ss.android.ugc.aweme.main.base;

import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.e;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54429a;

    public interface a {
        e getHelper();
    }

    public static e a(FragmentActivity fragmentActivity) {
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity}, null, f54429a, true, 57788, new Class[]{FragmentActivity.class}, e.class)) {
            return ((a) fragmentActivity).getHelper();
        }
        return (e) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, null, f54429a, true, 57788, new Class[]{FragmentActivity.class}, e.class);
    }
}
