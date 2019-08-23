package com.ss.android.ugc.aweme.story.feed.jedi;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a extends com.ss.android.ugc.aweme.story.base.jedi.a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f72611b;

    /* renamed from: c  reason: collision with root package name */
    private final int f72612c;

    public final boolean a() {
        return true;
    }

    public a() {
        this(20);
    }

    private a(int i) {
        this.f72612c = 20;
    }

    public final void a(View view, float f2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, f72611b, false, 83219, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, f72611b, false, 83219, new Class[]{View.class, Float.TYPE}, Void.TYPE);
            return;
        }
        view2.setCameraDistance((float) (view.getWidth() * this.f72612c));
        float f3 = 0.0f;
        if (f2 < 0.0f) {
            f3 = (float) view.getWidth();
        }
        view2.setPivotX(f3);
        view2.setPivotY(((float) view.getHeight()) * 0.5f);
        view2.setRotationY(90.0f * f2);
        view2.setAlpha(1.0f - Math.abs(f2));
    }
}
