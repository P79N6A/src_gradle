package com.ss.android.ugc.aweme.base.utils;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class w implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35060a;

    /* renamed from: b  reason: collision with root package name */
    static final View.OnTouchListener f35061b = new w();

    private w() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, motionEvent}, this, f35060a, false, 25340, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent}, this, f35060a, false, 25340, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    view2.setScaleX(0.8f);
                    view2.setScaleY(0.8f);
                    break;
                case 1:
                    break;
            }
        }
        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(40).start();
        return false;
    }
}
