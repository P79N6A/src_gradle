package com.ss.android.ugc.aweme.story.base.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71959a;

    public static Activity a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f71959a, true, 82338, new Class[]{Context.class}, Activity.class)) {
            return (Activity) PatchProxy.accessDispatch(new Object[]{context}, null, f71959a, true, 82338, new Class[]{Context.class}, Activity.class);
        }
        for (Context context2 = context; context2 != null; context2 = ((ContextWrapper) context2).getBaseContext()) {
            if (context2 instanceof Activity) {
                return (Activity) context2;
            }
            if (!(context2 instanceof ContextWrapper)) {
                return null;
            }
        }
        return null;
    }

    public static void a(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, null, f71959a, true, 82342, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, null, f71959a, true, 82342, new Class[]{Activity.class}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 21) {
            Window window = activity.getWindow();
            window.clearFlags(67108864);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        } else {
            if (Build.VERSION.SDK_INT >= 19) {
                activity.getWindow().addFlags(67108864);
            }
        }
    }
}
