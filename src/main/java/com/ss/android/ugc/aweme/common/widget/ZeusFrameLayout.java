package com.ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ZeusFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40513a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f40514b;

    public ZeusFrameLayout(Context context) {
        super(context);
    }

    public void setInterruptAll(boolean z) {
        this.f40514b = z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f40513a, false, 33875, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f40513a, false, 33875, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f40514b || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        } else {
            return false;
        }
    }

    public ZeusFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ZeusFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
