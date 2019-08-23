package com.ss.android.ugc.aweme.profile.ui.header;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ah implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62847a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f62848b;

    ah(aa aaVar) {
        this.f62848b = aaVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (!PatchProxy.isSupport(new Object[]{view, motionEvent2}, this, f62847a, false, 69593, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return this.f62848b.a(motionEvent2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent2}, this, f62847a, false, 69593, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }
}
