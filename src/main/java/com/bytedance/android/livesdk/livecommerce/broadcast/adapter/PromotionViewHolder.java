package com.bytedance.android.livesdk.livecommerce.broadcast.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.android.livesdk.livecommerce.c.f;

public abstract class PromotionViewHolder extends RecyclerView.ViewHolder {
    public abstract void a(f fVar, int i, boolean z);

    public PromotionViewHolder(@NonNull View view) {
        super(view);
    }
}
