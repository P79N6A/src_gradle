package com.ss.android.ugc.aweme.story.base.view.a;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72014a;

    public static void a(View view, float f2, float f3) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, null, f72014a, true, 82560, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, null, f72014a, true, 82560, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        view.clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{view.getAlpha(), f3});
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }

    public static void a(View view, float f2, float f3, long j) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3), 200L}, null, f72014a, true, 82561, new Class[]{View.class, Float.TYPE, Float.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3), 200L}, null, f72014a, true, 82561, new Class[]{View.class, Float.TYPE, Float.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        view.clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{view.getAlpha(), f3});
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }
}
