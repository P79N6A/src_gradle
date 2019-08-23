package com.ss.android.ugc.aweme.main.base.transforms;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class RotateUpTransformer extends ABaseTransformer {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f54569b;

    public final boolean a() {
        return true;
    }

    public final void a(View view, float f2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, f54569b, false, 57950, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, f54569b, false, 57950, new Class[]{View.class, Float.TYPE}, Void.TYPE);
            return;
        }
        view2.setPivotX(((float) view.getWidth()) * 0.5f);
        view2.setPivotY(0.0f);
        view2.setTranslationX(0.0f);
        view2.setRotation(-15.0f * f2);
    }
}
