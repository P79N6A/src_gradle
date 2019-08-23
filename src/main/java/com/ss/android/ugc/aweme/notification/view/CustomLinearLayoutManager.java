package com.ss.android.ugc.aweme.notification.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class CustomLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58125a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f58126b = true;

    public boolean canScrollHorizontally() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f58125a, false, 63273, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58125a, false, 63273, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f58126b && super.canScrollHorizontally()) {
            z = true;
        }
        return z;
    }

    public boolean canScrollVertically() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f58125a, false, 63272, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58125a, false, 63272, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f58126b && super.canScrollVertically()) {
            z = true;
        }
        return z;
    }

    public CustomLinearLayoutManager(Context context) {
        super(context);
    }
}
