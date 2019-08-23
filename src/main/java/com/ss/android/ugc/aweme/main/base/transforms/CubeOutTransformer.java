package com.ss.android.ugc.aweme.main.base.transforms;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class CubeOutTransformer extends ABaseTransformer {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f54566b;

    /* renamed from: c  reason: collision with root package name */
    private final int f54567c;

    public final boolean a() {
        return true;
    }

    public CubeOutTransformer() {
        this(20);
    }

    private CubeOutTransformer(int i) {
        this.f54567c = 20;
    }

    public final void a(View view, float f2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, f54566b, false, 57948, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, f54566b, false, 57948, new Class[]{View.class, Float.TYPE}, Void.TYPE);
            return;
        }
        view2.setCameraDistance((float) (view.getWidth() * this.f54567c));
        float f3 = 0.0f;
        if (f2 < 0.0f) {
            f3 = (float) view.getWidth();
        }
        view2.setPivotX(f3);
        view2.setPivotY(((float) view.getHeight()) * 0.5f);
        view2.setRotationY(f2 * 90.0f);
    }
}
