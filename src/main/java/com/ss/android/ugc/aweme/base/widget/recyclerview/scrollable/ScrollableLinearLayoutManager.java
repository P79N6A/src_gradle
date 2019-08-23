package com.ss.android.ugc.aweme.base.widget.recyclerview.scrollable;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ScrollableLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35203a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f35204b;

    public boolean canScrollHorizontally() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f35203a, false, 25615, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f35203a, false, 25615, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f35204b && super.canScrollHorizontally()) {
            z = true;
        }
        return z;
    }

    public boolean canScrollVertically() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f35203a, false, 25614, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f35203a, false, 25614, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f35204b && super.canScrollVertically()) {
            z = true;
        }
        return z;
    }

    public ScrollableLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
