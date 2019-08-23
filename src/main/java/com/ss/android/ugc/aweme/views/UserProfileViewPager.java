package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class UserProfileViewPager extends RtlViewPager implements p {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f76425e;

    /* renamed from: f  reason: collision with root package name */
    boolean f76426f = true;

    public void setScrollable(boolean z) {
        this.f76426f = z;
    }

    public UserProfileViewPager(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f76425e, false, 89672, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f76425e, false, 89672, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f76426f) {
            return super.dispatchTouchEvent(motionEvent);
        } else {
            return true;
        }
    }

    public UserProfileViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
