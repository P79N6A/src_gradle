package com.ss.android.ugc.aweme.story.base.view.viewpager.transforms;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class NoScrollTransformer implements ViewPager.PageTransformer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72124a;

    public void transformPage(View view, float f2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, f72124a, false, 82694, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, f72124a, false, 82694, new Class[]{View.class, Float.TYPE}, Void.TYPE);
            return;
        }
        view.getWidth();
        int height = view.getHeight();
        float f3 = 0.0f;
        if (0.0f <= f2 && f2 <= 1.0f) {
            f3 = 1.0f - f2;
        } else if (-1.0f < f2 && f2 < 0.0f) {
            f3 = f2 + 1.0f;
        }
        view2.setAlpha(f3);
        view2.setTranslationY(((float) (-height)) * f2);
    }
}
