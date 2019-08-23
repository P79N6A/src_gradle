package com.bytedance.ies.uikit.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

public abstract class RecyclerViewWithFooterAdapter extends RecyclerView.Adapter {
    protected boolean mShowFooter = true;

    public abstract int getBasicItemCount();

    public int getBasicItemViewType(int i) {
        return 0;
    }

    public abstract void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i);

    public abstract void onBindFooterViewHolder(RecyclerView.ViewHolder viewHolder);

    public abstract RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i);

    public abstract RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup);

    public int getItemCount() {
        if (this.mShowFooter) {
            return getBasicItemCount() + 1;
        }
        return getBasicItemCount();
    }

    public void setShowFooter(boolean z) {
        this.mShowFooter = z;
    }

    public final int getItemViewType(int i) {
        if (!this.mShowFooter || i != getBasicItemCount()) {
            return getBasicItemViewType(i);
        }
        return Integer.MIN_VALUE;
    }

    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            onBindFooterViewHolder(viewHolder);
        } else {
            onBindBasicViewHolder(viewHolder, i);
        }
    }

    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (Integer.MIN_VALUE == i) {
            return onCreateFooterViewHolder(viewGroup);
        }
        return onCreateBasicViewHolder(viewGroup, i);
    }
}
