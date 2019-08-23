package com.bytedance.android.live.core.paging.adapter;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7924a;

    /* renamed from: b  reason: collision with root package name */
    private final PagingAdapter f7925b;

    e(PagingAdapter pagingAdapter) {
        this.f7925b = pagingAdapter;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7924a, false, 496, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f7924a, false, 496, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        PagingAdapter pagingAdapter = this.f7925b;
        Integer num = (Integer) obj;
        if (num != null && num.intValue() >= 0 && num.intValue() < pagingAdapter.getItemCount()) {
            pagingAdapter.notifyItemChanged(num.intValue());
        }
    }
}
