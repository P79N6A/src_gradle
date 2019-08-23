package com.ss.android.ugc.aweme.poi.ui.detail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout;

public class f<V extends View> extends CoordinatorLayout.b<V> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mTempLeftRightOffset;
    private int mTempTopBottomOffset;
    private g mViewOffsetHelper;

    public f() {
    }

    public int getLeftAndRightOffset() {
        if (this.mViewOffsetHelper != null) {
            return this.mViewOffsetHelper.f60791f;
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        if (this.mViewOffsetHelper != null) {
            return this.mViewOffsetHelper.f60790e;
        }
        return 0;
    }

    public boolean setLeftAndRightOffset(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 66590, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 66590, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.mViewOffsetHelper != null) {
            return this.mViewOffsetHelper.b(i);
        } else {
            this.mTempLeftRightOffset = i;
            return false;
        }
    }

    public boolean setTopAndBottomOffset(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 66589, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 66589, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.mViewOffsetHelper != null) {
            return this.mViewOffsetHelper.a(i);
        } else {
            this.mTempTopBottomOffset = i;
            return false;
        }
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void layoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v, Integer.valueOf(i)}, this, changeQuickRedirect, false, 66588, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v, Integer.valueOf(i)}, this, changeQuickRedirect, false, 66588, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        coordinatorLayout.a((View) v, i);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        V v2 = v;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout, v2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 66587, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout, v2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 66587, new Class[]{CoordinatorLayout.class, View.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        layoutChild(coordinatorLayout, v, i);
        if (this.mViewOffsetHelper == null) {
            this.mViewOffsetHelper = new g(v2);
        }
        g gVar = this.mViewOffsetHelper;
        if (PatchProxy.isSupport(new Object[0], gVar, g.f60786a, false, 66591, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], gVar, g.f60786a, false, 66591, new Class[0], Void.TYPE);
        } else {
            gVar.f60788c = gVar.f60787b.getTop();
            gVar.f60789d = gVar.f60787b.getLeft();
            gVar.a();
        }
        if (this.mTempTopBottomOffset != 0) {
            this.mViewOffsetHelper.a(this.mTempTopBottomOffset);
            this.mTempTopBottomOffset = 0;
        }
        if (this.mTempLeftRightOffset != 0) {
            this.mViewOffsetHelper.b(this.mTempLeftRightOffset);
            this.mTempLeftRightOffset = 0;
        }
        return true;
    }
}
