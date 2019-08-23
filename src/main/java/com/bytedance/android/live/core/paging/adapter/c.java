package com.bytedance.android.live.core.paging.adapter;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7920a;

    /* renamed from: b  reason: collision with root package name */
    private final PagingAdapter f7921b;

    c(PagingAdapter pagingAdapter) {
        this.f7921b = pagingAdapter;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7920a, false, 494, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f7920a, false, 494, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        PagingAdapter pagingAdapter = this.f7921b;
        Boolean bool = (Boolean) obj;
        boolean z = bool != null && !bool.booleanValue();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, pagingAdapter, PagingAdapter.f7898b, false, 484, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, pagingAdapter, PagingAdapter.f7898b, false, 484, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (pagingAdapter.f7903f == z || pagingAdapter.h) {
            pagingAdapter.f7903f = z;
        } else {
            pagingAdapter.f7903f = z;
            pagingAdapter.notifyDataSetChanged();
        }
    }
}
