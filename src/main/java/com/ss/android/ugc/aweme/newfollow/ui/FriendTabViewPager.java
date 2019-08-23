package com.ss.android.ugc.aweme.newfollow.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.ies.uikit.viewpager.SSViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.base.TabChangeManager;

public class FriendTabViewPager extends SSViewPager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57255a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f57256b = true;

    public void setCanScroll(boolean z) {
        this.f57256b = z;
    }

    public FriendTabViewPager(@NonNull Context context) {
        super(context);
    }

    public boolean canScrollHorizontally(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57255a, false, 61616, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57255a, false, 61616, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.equals(TabChangeManager.a((FragmentActivity) getContext()).f54419e, "HOME")) {
            return false;
        } else {
            return super.canScrollHorizontally(i);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f57255a, false, 61615, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f57255a, false, 61615, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.f57256b || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f57255a, false, 61614, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f57255a, false, 61614, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.f57256b || !super.onTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public FriendTabViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getChildDrawingOrder(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f57255a, false, 61617, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f57255a, false, 61617, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        try {
            return super.getChildDrawingOrder(i, i2);
        } catch (IndexOutOfBoundsException unused) {
            return i2;
        }
    }
}
