package com.ss.android.ugc.aweme.account.base.widget.recyclerview.scrollable;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ScrollableGridLayoutManager extends GridLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31807a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f31808b;

    public boolean canScrollHorizontally() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f31807a, false, 19819, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f31807a, false, 19819, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f31808b && super.canScrollHorizontally()) {
            z = true;
        }
        return z;
    }

    public boolean canScrollVertically() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f31807a, false, 19818, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f31807a, false, 19818, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f31808b && super.canScrollVertically()) {
            z = true;
        }
        return z;
    }

    public ScrollableGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
