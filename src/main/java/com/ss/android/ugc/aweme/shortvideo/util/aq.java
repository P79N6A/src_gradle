package com.ss.android.ugc.aweme.shortvideo.util;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class aq {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71117a;

    public static int a(Context context, View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{context, view2}, null, f71117a, true, 81079, new Class[]{Context.class, View.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, view2}, null, f71117a, true, 81079, new Class[]{Context.class, View.class}, Integer.TYPE)).intValue();
        }
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        return -(iArr[0] + view.getWidth());
    }

    public static void a(View view, float f2, float f3, long j) {
        View view2 = view;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3), new Long(j2)}, null, f71117a, true, 81078, new Class[]{View.class, Float.TYPE, Float.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3), new Long(j2)}, null, f71117a, true, 81078, new Class[]{View.class, Float.TYPE, Float.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "translationX", new float[]{f2, f3});
        ofFloat.setDuration(j2);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }
}
