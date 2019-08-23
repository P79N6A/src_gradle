package com.ss.android.ugc.aweme.main.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lego.lazy.LazyViewPager;
import com.ss.android.ugc.aweme.profile.a;
import java.lang.reflect.Field;

public class HomeViewPager extends LazyViewPager {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f54378b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f54379c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f54380d;

    /* renamed from: e  reason: collision with root package name */
    private float f54381e;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f54378b, false, 57745, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54378b, false, 57745, new Class[0], Void.TYPE);
            return;
        }
        try {
            Field declaredField = Class.forName("android.support.v4.view.ViewPager").getDeclaredField("mDefaultGutterSize");
            declaredField.setAccessible(true);
            declaredField.setInt(this, 0);
        } catch (Exception unused) {
        }
    }

    public void setCanScroll(boolean z) {
        this.f54379c = z;
    }

    public HomeViewPager(@NonNull Context context) {
        super(context);
        a();
    }

    private boolean a(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f54378b, false, 57743, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f54378b, false, 57743, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f54380d = false;
            this.f54381e = motionEvent.getX();
        } else if (actionMasked == 2) {
            float x = motionEvent.getX();
            this.f54381e = x;
            if (x - this.f54381e > 0.0f) {
                this.f54380d = true;
            }
            if (!this.f54380d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean canScrollHorizontally(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f54378b, false, 57744, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f54378b, false, 57744, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (super.canScrollHorizontally(i) || getCurrentItem() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f54378b, false, 57742, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f54378b, false, 57742, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!a.a(motionEvent2, getContext()) && this.f54379c && ((!a(motionEvent) || getCurrentItem() == 0) && super.onInterceptTouchEvent(motionEvent))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f54378b, false, 57741, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f54378b, false, 57741, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.f54379c || ((a(motionEvent) && getCurrentItem() != 0) || !super.onTouchEvent(motionEvent))) {
            return false;
        } else {
            return true;
        }
    }

    public HomeViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public int getChildDrawingOrder(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f54378b, false, 57746, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f54378b, false, 57746, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        try {
            return super.getChildDrawingOrder(i, i2);
        } catch (IndexOutOfBoundsException unused) {
            return i2;
        }
    }
}
