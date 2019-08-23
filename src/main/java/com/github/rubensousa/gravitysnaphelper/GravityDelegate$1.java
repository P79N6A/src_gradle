package com.github.rubensousa.gravitysnaphelper;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

class GravityDelegate$1 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f24389a;

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (i == 2) {
            this.f24389a.f24395d = false;
        }
        if (i == 0 && this.f24389a.f24395d && this.f24389a.f24394c != null) {
            a aVar = this.f24389a;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                if (aVar.f24392a == 8388611 || aVar.f24392a == 48) {
                    ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
                } else if (aVar.f24392a == 8388613 || aVar.f24392a == 80) {
                    ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
                }
            }
            this.f24389a.f24395d = false;
        }
    }
}
