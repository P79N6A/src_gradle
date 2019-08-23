package com.ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.widget.PullUpLayout;

public class BodyDancePullLayout extends PullUpLayout {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f71314d;

    /* renamed from: e  reason: collision with root package name */
    private float f71315e;

    public BodyDancePullLayout(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f71314d, false, 81278, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f71314d, false, 81278, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            this.f71315e = motionEvent.getY();
        } else if (motionEvent.getAction() != 2 || Math.abs(this.f71315e - motionEvent.getY()) <= ((float) ViewConfiguration.get(getContext()).getScaledTouchSlop())) {
            return false;
        } else {
            return true;
        }
        return false;
    }

    public BodyDancePullLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BodyDancePullLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
