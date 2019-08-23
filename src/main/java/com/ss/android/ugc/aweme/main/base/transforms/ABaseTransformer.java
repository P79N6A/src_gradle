package com.ss.android.ugc.aweme.main.base.transforms;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class ABaseTransformer implements ViewPager.PageTransformer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54564a;

    public static final float a(float f2, float f3) {
        if (f2 < 0.92f) {
            return 0.92f;
        }
        return f2;
    }

    public abstract void a(View view, float f2);

    public boolean a() {
        return false;
    }

    public void transformPage(View view, float f2) {
        float f3;
        float f4;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, f54564a, false, 57945, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, f54564a, false, 57945, new Class[]{View.class, Float.TYPE}, Void.TYPE);
            return;
        }
        float f5 = 1.0f;
        if (f2 < -1.0f) {
            f3 = -1.0f;
        } else if (f2 > 1.0f) {
            f3 = 1.0f;
        } else {
            f3 = f2;
        }
        try {
            if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f3)}, this, f54564a, false, 57946, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f3)}, this, f54564a, false, 57946, new Class[]{View.class, Float.TYPE}, Void.TYPE);
            } else {
                float width = (float) view.getWidth();
                view2.setRotationX(0.0f);
                view2.setRotationY(0.0f);
                view2.setRotation(0.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setPivotX(0.0f);
                view2.setPivotY(0.0f);
                view2.setTranslationY(0.0f);
                if (a()) {
                    f4 = 0.0f;
                } else {
                    f4 = (-width) * f3;
                }
                view2.setTranslationX(f4);
                if (f3 <= -1.0f || f3 >= 1.0f) {
                    f5 = 0.0f;
                }
                view2.setAlpha(f5);
                view2.setEnabled(false);
            }
            try {
                a(view2, f3);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
