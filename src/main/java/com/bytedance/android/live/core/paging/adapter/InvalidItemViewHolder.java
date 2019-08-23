package com.bytedance.android.live.core.paging.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class InvalidItemViewHolder extends BaseViewHolder<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7896a;

    /* renamed from: d  reason: collision with root package name */
    private ViewGroup f7897d;

    public InvalidItemViewHolder(ViewGroup viewGroup) {
        super(new View(viewGroup.getContext()));
        this.f7897d = viewGroup;
    }

    public final void a(Object obj, int i) {
        if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(i)}, this, f7896a, false, 459, new Class[]{Object.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i)}, this, f7896a, false, 459, new Class[]{Object.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.itemView.setLayoutParams(new RecyclerView.LayoutParams(this.f7897d.getMeasuredWidth(), 1));
    }
}
