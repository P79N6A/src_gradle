package com.ss.android.ugc.aweme.newfollow.util;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57402a;

    public static void a(View view) {
        final View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f57402a, true, 61866, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, f57402a, true, 61866, new Class[]{View.class}, Void.TYPE);
        } else if (view2 != null) {
            view.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57403a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f57403a, false, 61868, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57403a, false, 61868, new Class[0], Void.TYPE);
                        return;
                    }
                    view2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                }
            }).start();
        }
    }
}
