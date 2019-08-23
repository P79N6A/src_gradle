package com.ss.android.ugc.aweme.common.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;

public abstract class a<T> {
    @NonNull
    public abstract RecyclerView.ViewHolder a(@NonNull ViewGroup viewGroup);

    public void a(@NonNull RecyclerView.ViewHolder viewHolder) {
    }

    public void a(RecyclerView recyclerView) {
    }

    public abstract void a(@NonNull T t, int i, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull List<Object> list);

    public abstract boolean a(@NonNull T t, int i);

    public void b(RecyclerView.ViewHolder viewHolder) {
    }

    public void b(RecyclerView recyclerView) {
    }
}
