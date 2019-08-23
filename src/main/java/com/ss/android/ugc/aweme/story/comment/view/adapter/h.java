package com.ss.android.ugc.aweme.story.comment.view.adapter;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.base.view.a.a;

public final /* synthetic */ class h implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72298a;

    /* renamed from: b  reason: collision with root package name */
    static final View.OnTouchListener f72299b = new h();

    private h() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, motionEvent}, this, f72298a, false, 83008, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent}, this, f72298a, false, 83008, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            a.a(view2, 1.0f, 0.5f);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            a.a(view2, 0.5f, 1.0f);
        }
        return false;
    }
}
