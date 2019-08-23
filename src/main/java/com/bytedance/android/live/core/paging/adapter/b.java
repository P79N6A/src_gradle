package com.bytedance.android.live.core.paging.adapter;

import android.arch.lifecycle.Observer;
import com.bytedance.android.live.core.network.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7918a;

    /* renamed from: b  reason: collision with root package name */
    private final PagingAdapter f7919b;

    b(PagingAdapter pagingAdapter) {
        this.f7919b = pagingAdapter;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7918a, false, 493, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f7918a, false, 493, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f7919b.a((d) obj);
    }
}
