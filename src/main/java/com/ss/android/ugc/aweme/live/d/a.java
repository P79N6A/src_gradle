package com.ss.android.ugc.aweme.live.d;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53358a;

    public static void a(View view, Rect rect, Runnable runnable, View... viewArr) {
        View view2 = view;
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{view2, rect, runnable2, viewArr}, null, f53358a, true, 55978, new Class[]{View.class, Rect.class, Runnable.class, View[].class}, Void.TYPE)) {
            Object[] objArr = {view2, rect, runnable2, viewArr};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f53358a, true, 55978, new Class[]{View.class, Rect.class, Runnable.class, View[].class}, Void.TYPE);
        } else if (view2 == null) {
            runnable.run();
        } else {
            view2.setPivotX((float) rect.centerX());
            view2.setPivotY((float) rect.centerY());
            view.animate().scaleX(0.0f).scaleY(0.0f).setDuration(200).setInterpolator(new DecelerateInterpolator()).withEndAction(runnable2).start();
        }
    }
}
