package com.ss.android.ugc.aweme.story.base.view.viewpager.transforms;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class CubeInTransformer extends ABaseTransformer {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f72120b;

    public final boolean a() {
        return true;
    }

    public final void a(View view, float f2) {
        float f3;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, f72120b, false, 82691, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, f72120b, false, 82691, new Class[]{View.class, Float.TYPE}, Void.TYPE);
            return;
        }
        if (f2 > 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (float) view.getWidth();
        }
        view2.setPivotX(f3);
        view2.setPivotY(0.0f);
        view2.setRotationY(f2 * -90.0f);
    }
}
