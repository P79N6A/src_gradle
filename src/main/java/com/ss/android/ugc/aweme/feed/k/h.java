package com.ss.android.ugc.aweme.feed.k;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45593a;

    public static void a(View view) {
        final View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f45593a, true, 43616, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, f45593a, true, 43616, new Class[]{View.class}, Void.TYPE);
        } else if (view2 != null) {
            view.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45594a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f45594a, false, 43617, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f45594a, false, 43617, new Class[0], Void.TYPE);
                        return;
                    }
                    view2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                }
            }).start();
        }
    }
}
