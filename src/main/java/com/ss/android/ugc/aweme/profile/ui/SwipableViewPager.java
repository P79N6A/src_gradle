package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.views.UserProfileViewPager;

public class SwipableViewPager extends UserProfileViewPager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62360a;

    /* renamed from: b  reason: collision with root package name */
    boolean f62361b = true;

    public SwipableViewPager(@NonNull Context context) {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f62360a, false, 69052, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f62360a, false, 69052, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.f62361b || !super.onTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public SwipableViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
