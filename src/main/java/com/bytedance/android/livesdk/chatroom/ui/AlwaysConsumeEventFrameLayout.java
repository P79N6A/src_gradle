package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class AlwaysConsumeEventFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11491a;

    public AlwaysConsumeEventFrameLayout(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f11491a, false, 5640, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f11491a, false, 5640, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        requestDisallowInterceptTouchEvent(true);
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public AlwaysConsumeEventFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AlwaysConsumeEventFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @RequiresApi(api = 21)
    public AlwaysConsumeEventFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
