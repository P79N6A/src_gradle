package com.ss.android.ugc.aweme.shortvideo.util;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class an {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71111a;

    public static void a(View view, float f2, float f3) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, null, f71111a, true, 81070, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, null, f71111a, true, 81070, new Class[]{View.class, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        view.setAlpha(f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{view.getAlpha(), f3});
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }

    public static void a(View view, float f2, float f3, long j) {
        View view2 = view;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3), new Long(j2)}, null, f71111a, true, 81071, new Class[]{View.class, Float.TYPE, Float.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3), new Long(j2)}, null, f71111a, true, 81071, new Class[]{View.class, Float.TYPE, Float.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        view.setAlpha(f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{view.getAlpha(), f3});
        ofFloat.setDuration(j2);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }
}
