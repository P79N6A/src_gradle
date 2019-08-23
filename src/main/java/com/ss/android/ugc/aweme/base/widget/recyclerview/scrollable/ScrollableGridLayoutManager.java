package com.ss.android.ugc.aweme.base.widget.recyclerview.scrollable;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ScrollableGridLayoutManager extends GridLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35201a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f35202b;

    public boolean canScrollHorizontally() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f35201a, false, 25613, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f35201a, false, 25613, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f35202b && super.canScrollHorizontally()) {
            z = true;
        }
        return z;
    }

    public boolean canScrollVertically() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f35201a, false, 25612, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f35201a, false, 25612, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f35202b && super.canScrollVertically()) {
            z = true;
        }
        return z;
    }

    public ScrollableGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
