package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class h extends HorizontalScrollView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76465a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f76466b = true;

    public final void setScrollable(boolean z) {
        this.f76466b = z;
    }

    public h(Context context) {
        super(context);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f76465a, false, 89483, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f76465a, false, 89483, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f76466b) {
            return super.onInterceptTouchEvent(motionEvent);
        } else {
            return false;
        }
    }
}
