package com.bytedance.android.live.uikit.d;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8498a;

    @TargetApi(17)
    public static boolean a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f8498a, true, 2470, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f8498a, true, 2470, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (context == null || Build.VERSION.SDK_INT <= 16) {
            return false;
        } else {
            if (context.getResources().getConfiguration().locale.getLanguage().equals("ar") || context.getResources().getConfiguration().getLayoutDirection() == 1) {
                return true;
            }
            return false;
        }
    }
}
