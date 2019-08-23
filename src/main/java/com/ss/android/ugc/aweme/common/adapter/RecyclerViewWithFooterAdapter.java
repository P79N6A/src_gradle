package com.ss.android.ugc.aweme.common.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class RecyclerViewWithFooterAdapter extends RecyclerView.Adapter {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean mShowFooter = true;

    public abstract int getBasicItemCount();

    public int getBasicItemViewType(int i) {
        return 0;
    }

    public abstract void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i);

    public abstract void onBindFooterViewHolder(RecyclerView.ViewHolder viewHolder);

    public abstract RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i);

    public abstract RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup);

    public void onShowFooterChanged(boolean z) {
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33408, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33408, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mShowFooter) {
            return getBasicItemCount() + 1;
        } else {
            return getBasicItemCount();
        }
    }

    public final int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 33409, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 33409, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (!this.mShowFooter) {
            int i2 = i;
        } else if (i == getBasicItemCount()) {
            return Integer.MIN_VALUE;
        }
        return getBasicItemViewType(i);
    }

    public void setShowFooter(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 33405, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 33405, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z != this.mShowFooter) {
            this.mShowFooter = z;
            onShowFooterChanged(z);
        }
    }

    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, changeQuickRedirect, false, 33407, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, changeQuickRedirect, false, 33407, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (getItemViewType(i) == Integer.MIN_VALUE) {
            onBindFooterViewHolder(viewHolder);
        } else {
            onBindBasicViewHolder(viewHolder, i);
        }
    }

    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, changeQuickRedirect, false, 33406, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, changeQuickRedirect, false, 33406, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (Integer.MIN_VALUE == i) {
            return onCreateFooterViewHolder(viewGroup);
        } else {
            return onCreateBasicViewHolder(viewGroup, i);
        }
    }
}
