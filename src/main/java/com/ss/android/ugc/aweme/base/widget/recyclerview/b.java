package com.ss.android.ugc.aweme.base.widget.recyclerview;

import android.support.v4.view.ViewCompat;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35200a;

    public static void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f35200a, true, 25602, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, f35200a, true, 25602, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ViewCompat.setAlpha(view2, 1.0f);
        ViewCompat.setScaleY(view2, 1.0f);
        ViewCompat.setScaleX(view2, 1.0f);
        ViewCompat.setTranslationY(view2, 0.0f);
        ViewCompat.setTranslationX(view2, 0.0f);
        ViewCompat.setTranslationZ(view2, 0.0f);
        ViewCompat.setRotation(view2, 0.0f);
        ViewCompat.setRotationY(view2, 0.0f);
        ViewCompat.setRotationX(view2, 0.0f);
        ViewCompat.setPivotY(view2, (float) (view.getMeasuredHeight() / 2));
        ViewCompat.setPivotX(view2, (float) (view.getMeasuredWidth() / 2));
        ViewCompat.animate(view).setInterpolator(null).setStartDelay(0);
    }
}
