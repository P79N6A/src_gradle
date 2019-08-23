package com.ss.android.ugc.aweme.profile.ui;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class dr implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62694a;

    /* renamed from: b  reason: collision with root package name */
    private final dq f62695b;

    dr(dq dqVar) {
        this.f62695b = dqVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f62694a, false, 69036, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f62694a, false, 69036, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        dq dqVar = this.f62695b;
        if (motionEvent.getAction() == 0) {
            dqVar.i();
        }
        return false;
    }
}
