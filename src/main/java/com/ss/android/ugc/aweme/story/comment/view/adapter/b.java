package com.ss.android.ugc.aweme.story.comment.view.adapter;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72284a;

    /* renamed from: b  reason: collision with root package name */
    static final View.OnTouchListener f72285b = new b();

    private b() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, motionEvent}, this, f72284a, false, 82985, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent}, this, f72284a, false, 82985, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            view2.setBackgroundColor(Color.parseColor("#0f161823"));
        } else if (motionEvent.getAction() == 3) {
            view2.setBackgroundColor(Color.parseColor("#00000000"));
        } else if (motionEvent.getAction() == 1) {
            view2.setBackgroundColor(Color.parseColor("#00000000"));
        }
        return false;
    }
}
