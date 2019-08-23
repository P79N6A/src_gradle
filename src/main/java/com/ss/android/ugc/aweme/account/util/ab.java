package com.ss.android.ugc.aweme.account.util;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33075a;

    public static void a(View view, int i, int i2, float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Float.valueOf(f3)}, null, f33075a, true, 21459, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Float.valueOf(f3)}, null, f33075a, true, 21459, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
        } else if (view != null && view.getParent() != null) {
            final View view2 = view;
            final int i3 = i;
            final int i4 = i2;
            final float f4 = f2;
            final float f5 = f3;
            AnonymousClass1 r0 = new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33076a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f33076a, false, 21460, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f33076a, false, 21460, new Class[0], Void.TYPE);
                        return;
                    }
                    Rect rect = new Rect();
                    view2.setEnabled(true);
                    view2.getHitRect(rect);
                    rect.top -= i3;
                    rect.bottom += i4;
                    rect.left = (int) (((float) rect.left) - f4);
                    rect.right = (int) (((float) rect.right) + f5);
                    TouchDelegate touchDelegate = new TouchDelegate(rect, view2);
                    if (View.class.isInstance(view2.getParent())) {
                        ((View) view2.getParent()).setTouchDelegate(touchDelegate);
                    }
                }
            };
            ((View) view.getParent()).post(r0);
        }
    }
}
