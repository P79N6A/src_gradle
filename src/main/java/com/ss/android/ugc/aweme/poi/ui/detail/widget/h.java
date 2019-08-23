package com.ss.android.ugc.aweme.poi.ui.detail.widget;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.support.annotation.RequiresApi;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

@RequiresApi(21)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60792a;

    /* renamed from: b  reason: collision with root package name */
    static final int[] f60793b = {16843848};

    static void a(View view, float f2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, null, f60792a, true, 66597, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, null, f60792a, true, 66597, new Class[]{View.class, Float.TYPE}, Void.TYPE);
            return;
        }
        int integer = view.getResources().getInteger(C0906R.integer.f4441c);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, C0906R.attr.a3r, -2130773094}, ObjectAnimator.ofFloat(view2, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view2, "elevation", new float[]{f2}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view2, "elevation", new float[]{0.0f}).setDuration(0));
        view2.setStateListAnimator(stateListAnimator);
    }
}
