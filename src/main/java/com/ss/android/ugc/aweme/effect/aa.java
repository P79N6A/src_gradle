package com.ss.android.ugc.aweme.effect;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class aa implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43676a;

    /* renamed from: b  reason: collision with root package name */
    public static final View.OnTouchListener f43677b = new aa();

    private aa() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f43676a, false, 38728, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return true;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f43676a, false, 38728, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }
}
