package com.ss.android.ugc.aweme.shortvideo.mvtemplate;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68717a;

    /* renamed from: b  reason: collision with root package name */
    private final MvTemplateView f68718b;

    g(MvTemplateView mvTemplateView) {
        this.f68718b = mvTemplateView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (!PatchProxy.isSupport(new Object[]{view, motionEvent2}, this, f68717a, false, 77890, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return this.f68718b.n.dispatchTouchEvent(motionEvent2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent2}, this, f68717a, false, 77890, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }
}
