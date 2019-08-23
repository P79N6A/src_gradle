package com.bytedance.android.live.core.utils;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class z implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8334a;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, motionEvent}, this, f8334a, false, 1212, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent}, this, f8334a, false, 1212, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            view2.setScaleX(0.96f);
            view2.setScaleY(0.96f);
            view2.setAlpha(0.64f);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            view2.setAlpha(1.0f);
        }
        return false;
    }
}
