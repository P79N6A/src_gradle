package com.ss.android.ugc.aweme.h;

import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49617a;

    /* renamed from: b  reason: collision with root package name */
    private final float f49618b = 1.2f;

    /* renamed from: c  reason: collision with root package name */
    private final long f49619c;

    /* renamed from: d  reason: collision with root package name */
    private final View.OnTouchListener f49620d;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f49617a, false, 34625, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f49617a, false, 34625, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    view.animate().scaleX(this.f49618b).scaleY(this.f49618b).setDuration(this.f49619c).start();
                    break;
                case 1:
                    break;
            }
        }
        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(this.f49619c).start();
        if (this.f49620d == null || !this.f49620d.onTouch(view, motionEvent)) {
            return false;
        }
        return true;
    }

    public b(float f2, long j, @Nullable View.OnTouchListener onTouchListener) {
        this.f49619c = j;
        this.f49620d = null;
    }
}
