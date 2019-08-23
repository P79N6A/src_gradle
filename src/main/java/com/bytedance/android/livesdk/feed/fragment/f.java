package com.bytedance.android.livesdk.feed.fragment;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14144a;

    /* renamed from: b  reason: collision with root package name */
    static final Observer f14145b = new f();

    private f() {
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14144a, false, 8640, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14144a, false, 8640, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
