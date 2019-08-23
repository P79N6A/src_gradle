package com.bytedance.android.live.core.paging.adapter;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7922a;

    /* renamed from: b  reason: collision with root package name */
    private final PagingAdapter f7923b;

    d(PagingAdapter pagingAdapter) {
        this.f7923b = pagingAdapter;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7922a, false, 495, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f7922a, false, 495, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        PagingAdapter pagingAdapter = this.f7923b;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : 0)}, pagingAdapter, PagingAdapter.f7898b, false, 486, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PagingAdapter pagingAdapter2 = pagingAdapter;
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(booleanValue)}, pagingAdapter2, PagingAdapter.f7898b, false, 486, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (pagingAdapter.h != booleanValue) {
                pagingAdapter.h = booleanValue;
                pagingAdapter.notifyDataSetChanged();
            }
        }
    }
}
