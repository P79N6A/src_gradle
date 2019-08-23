package com.ss.android.ugc.aweme.main;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.util.an;

public final /* synthetic */ class ag implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54325a;

    /* renamed from: b  reason: collision with root package name */
    private final View f54326b;

    ag(View view) {
        this.f54326b = view;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f54325a, false, 57339, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f54325a, false, 57339, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        View view2 = this.f54326b;
        switch (motionEvent.getAction()) {
            case 0:
                an.a(view2, 1.0f, 0.5f, 200);
                break;
            case 1:
                an.a(view2, 0.5f, 1.0f, 200);
                break;
        }
        return false;
    }
}
