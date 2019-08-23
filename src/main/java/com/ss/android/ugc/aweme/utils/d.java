package com.ss.android.ugc.aweme.utils;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75726a;

    /* renamed from: b  reason: collision with root package name */
    private final View f75727b;

    /* renamed from: c  reason: collision with root package name */
    private final float f75728c;

    d(View view, float f2) {
        this.f75727b = view;
        this.f75728c = f2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f75726a, false, 87862, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f75726a, false, 87862, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        View view2 = this.f75727b;
        float f2 = this.f75728c;
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    view2.animate().alpha(f2).setDuration(150).start();
                    break;
                case 1:
                    break;
            }
        }
        view2.animate().alpha(f2).setDuration(150).start();
        return false;
    }
}
