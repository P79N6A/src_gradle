package com.bytedance.android.live.uikit.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class RecyclerViewWithFooterAdapter extends RecyclerView.Adapter {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f8592d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8593e = true;

    public abstract int a();

    public int a(int i) {
        return 0;
    }

    public abstract RecyclerView.ViewHolder a(ViewGroup viewGroup);

    public abstract RecyclerView.ViewHolder a(ViewGroup viewGroup, int i);

    public abstract void a(RecyclerView.ViewHolder viewHolder);

    public abstract void a(RecyclerView.ViewHolder viewHolder, int i);

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f8592d, false, 2144, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f8592d, false, 2144, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f8593e) {
            return a() + 1;
        } else {
            return a();
        }
    }

    public final int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8592d, false, 2145, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8592d, false, 2145, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (!this.f8593e) {
            int i2 = i;
        } else if (i == a()) {
            return Integer.MIN_VALUE;
        }
        return a(i);
    }

    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f8592d, false, 2143, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f8592d, false, 2143, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (getItemViewType(i) == Integer.MIN_VALUE) {
            a(viewHolder);
        } else {
            a(viewHolder, i);
        }
    }

    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f8592d, false, 2142, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f8592d, false, 2142, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (Integer.MIN_VALUE == i) {
            return a(viewGroup);
        } else {
            return a(viewGroup, i);
        }
    }
}
