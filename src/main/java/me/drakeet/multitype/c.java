package me.drakeet.multitype;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public abstract class c<T, VH extends RecyclerView.ViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    public MultiTypeAdapter f83977f;

    /* access modifiers changed from: protected */
    @NonNull
    public abstract VH a(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public abstract void a(@NonNull VH vh, @NonNull T t);

    /* access modifiers changed from: protected */
    public final void b(@NonNull VH vh, @NonNull T t) {
        a(vh, t);
    }
}
