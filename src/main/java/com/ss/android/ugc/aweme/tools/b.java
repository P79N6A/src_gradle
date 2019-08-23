package com.ss.android.ugc.aweme.tools;

import android.content.Context;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74645a;

    public static boolean a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f74645a, true, 86940, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f74645a, true, 86940, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (context == null || Build.VERSION.SDK_INT < 17 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        } else {
            return true;
        }
    }
}
