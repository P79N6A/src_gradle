package com.bytedance.ies.dmt.ui.input.indicator;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    EmojiIndicatorAdapter f20422a = new EmojiIndicatorAdapter();

    public final int a() {
        return this.f20422a.f20415a;
    }

    public final void a(int i) {
        this.f20422a.a(i);
    }

    public b(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(this.f20422a);
    }

    public final void a(int i, int i2) {
        this.f20422a.a(i, i2);
    }
}
