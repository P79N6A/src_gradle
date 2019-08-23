package com.bytedance.android.live.core.widget.simple;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class a<F extends T, T> extends b<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8368a;

    public abstract int a();

    public void a(SimpleViewHolder simpleViewHolder, F f2) {
    }

    public abstract void a(SimpleViewHolder simpleViewHolder, F f2, int i);

    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, this, f8368a, false, 1537, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return new SimpleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(a(), viewGroup2, false));
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f8368a, false, 1537, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
    }
}
