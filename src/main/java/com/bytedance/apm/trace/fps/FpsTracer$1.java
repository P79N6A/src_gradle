package com.bytedance.apm.trace.fps;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

class FpsTracer$1 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f19075a;

    public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (i != 0) {
            this.f19075a.a();
        } else {
            this.f19075a.b();
        }
    }
}
