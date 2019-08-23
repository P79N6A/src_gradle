package com.bytedance.android.livesdk.common;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class AbsViewHolder extends RecyclerView.ViewHolder {
    protected int j = 0;

    public abstract <T> void a(T t);

    public AbsViewHolder(View view, int i) {
        super(view);
    }
}
