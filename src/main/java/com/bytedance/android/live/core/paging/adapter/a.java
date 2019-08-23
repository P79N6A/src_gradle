package com.bytedance.android.live.core.paging.adapter;

import android.arch.lifecycle.Observer;
import android.arch.paging.PagedList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7916a;

    /* renamed from: b  reason: collision with root package name */
    private final PagingAdapter f7917b;

    a(PagingAdapter pagingAdapter) {
        this.f7917b = pagingAdapter;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7916a, false, 492, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f7916a, false, 492, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f7917b.submitList((PagedList) obj);
    }
}
