package com.ss.android.ugc.aweme.shortvideo.util;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class ao {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71112a;

    public static void a(View view, float f2) {
        final View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(0.5f)}, null, f71112a, true, 81073, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(0.5f)}, null, f71112a, true, 81073, new Class[]{View.class, Float.TYPE}, Void.TYPE);
        } else if (view2 != null) {
            view2.setOnTouchListener(new View.OnTouchListener(0.5f) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f71113a;

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f71113a, false, 81074, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f71113a, false, 81074, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                    }
                    if (motionEvent.getAction() == 0) {
                        an.a(view2, 1.0f, 0.5f);
                    } else if (motionEvent.getAction() == 1) {
                        an.a(view2, 0.5f, 1.0f);
                    }
                    return false;
                }
            });
        }
    }
}
