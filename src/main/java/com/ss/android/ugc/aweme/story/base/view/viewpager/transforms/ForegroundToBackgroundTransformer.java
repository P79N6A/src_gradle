package com.ss.android.ugc.aweme.story.base.view.viewpager.transforms;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ForegroundToBackgroundTransformer extends ABaseTransformer {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f72123b;

    public final boolean a() {
        return true;
    }

    public final void a(View view, float f2) {
        View view2 = view;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, f72123b, false, 82693, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, f72123b, false, 82693, new Class[]{View.class, Float.TYPE}, Void.TYPE);
            return;
        }
        if (f2 < 0.0f) {
            z = true;
        }
        float height = (float) view.getHeight();
        float width = (float) view.getWidth();
        float f3 = 1.0f;
        if (!(((double) Math.abs(f2)) == 0.0d || ((double) Math.abs(f2)) == 1.0d)) {
            f3 = z ? a(Math.abs((f2 / 20.0f) + 1.0f), 0.92f) : a(Math.abs(1.0f - (f2 / 20.0f)), 0.92f);
        }
        view2.setScaleX(f3);
        view2.setScaleY(f3);
        view2.setPivotX(width * 0.5f);
        view2.setPivotY(height * 0.5f);
    }
}
