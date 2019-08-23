package com.ss.android.ugc.aweme.h;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49613a;

    /* renamed from: b  reason: collision with root package name */
    public View.OnTouchListener f49614b;

    /* renamed from: c  reason: collision with root package name */
    private final float f49615c = 0.5f;

    /* renamed from: d  reason: collision with root package name */
    private final long f49616d;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f49613a, false, 34624, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f49613a, false, 34624, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    view.animate().alpha(this.f49615c).setDuration(this.f49616d).start();
                    break;
                case 1:
                    break;
            }
        }
        view.animate().alpha(1.0f).setDuration(this.f49616d).start();
        if (this.f49614b == null || !this.f49614b.onTouch(view, motionEvent)) {
            return false;
        }
        return true;
    }

    public a(float f2, long j, View.OnTouchListener onTouchListener) {
        this.f49616d = j;
        this.f49614b = onTouchListener;
    }
}
