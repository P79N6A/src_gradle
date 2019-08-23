package com.ss.android.ugc.aweme.utils;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class ed {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75814a;

    public static View.OnTouchListener a(float f2, float f3) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(1.0f)}, null, f75814a, true, 88581, new Class[]{Float.TYPE, Float.TYPE}, View.OnTouchListener.class)) {
            return a(f2, 1.0f, null);
        }
        return (View.OnTouchListener) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(1.0f)}, null, f75814a, true, 88581, new Class[]{Float.TYPE, Float.TYPE}, View.OnTouchListener.class);
    }

    private static View.OnTouchListener a(float f2, float f3, View view) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), null}, null, f75814a, true, 88582, new Class[]{Float.TYPE, Float.TYPE, View.class}, View.OnTouchListener.class)) {
            return (View.OnTouchListener) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), null}, null, f75814a, true, 88582, new Class[]{Float.TYPE, Float.TYPE, View.class}, View.OnTouchListener.class);
        }
        final float f4 = f2;
        final float f5 = f3;
        return new View.OnTouchListener(null) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75815a;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f75815a, false, 88589, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f75815a, false, 88589, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                }
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            view.setAlpha(f4);
                            if (null != null) {
                                null.setAlpha(f4);
                                break;
                            }
                            break;
                        case 1:
                            break;
                    }
                }
                view.setAlpha(f5);
                if (null != null) {
                    null.setAlpha(f5);
                }
                return false;
            }
        };
    }
}
