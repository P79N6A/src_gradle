package com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;

public interface c<VH extends RecyclerView.ViewHolder> {
    long a(int i);

    VH a(ViewGroup viewGroup);

    void a(VH vh, int i);

    int getItemCount();
}
