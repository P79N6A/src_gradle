package com.ss.android.ugc.aweme.shortvideo.mvtemplate.viewpager;

import android.os.Build;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ScaleAlphaPageTransformer implements ViewPager.PageTransformer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68774a;

    public void transformPage(View view, float f2) {
        float f3;
        float f4;
        float f5;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, f68774a, false, 78168, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, f68774a, false, 78168, new Class[]{View.class, Float.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, f68774a, false, 78169, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, f68774a, false, 78169, new Class[]{View.class, Float.TYPE}, Void.TYPE);
            return;
        }
        if (f2 < -1.0f) {
            f3 = -1.0f;
        } else if (f2 > 1.0f) {
            f3 = 1.0f;
        } else {
            f3 = f2;
        }
        if (f3 < 0.0f) {
            f4 = f3 + 1.0f;
        } else {
            f4 = 1.0f - f3;
        }
        float f6 = (f4 * 0.100000024f) + 0.9f;
        view2.setScaleX(f6);
        view2.setScaleY(f6);
        if (f3 < 0.0f) {
            f5 = f3 + 1.0f;
        } else {
            f5 = 1.0f - f3;
        }
        view2.setAlpha((f5 * 0.39999998f) + 0.6f);
        if (Build.VERSION.SDK_INT < 19) {
            view.getParent().requestLayout();
        }
    }
}
