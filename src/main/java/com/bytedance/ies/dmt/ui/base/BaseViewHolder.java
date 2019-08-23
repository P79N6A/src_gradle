package com.bytedance.ies.dmt.ui.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.ies.dmt.ui.e.b;

public class BaseViewHolder<DATA> extends RecyclerView.ViewHolder {
    /* access modifiers changed from: protected */
    public void a() {
    }

    public void a(DATA data) {
    }

    /* access modifiers changed from: protected */
    public void b() {
        b.a(this.itemView);
    }

    public BaseViewHolder(View view) {
        super(view);
        a();
        b();
    }
}
