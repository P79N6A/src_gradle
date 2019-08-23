package me.drakeet.multitype;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;

public class MultiTypeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public List<?> f83975b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public i f83976c;

    public MultiTypeAdapter() {
        this(Collections.emptyList());
    }

    public final int getItemCount() {
        return this.f83975b.size();
    }

    public void a(@NonNull List<?> list) {
        this.f83975b = list;
    }

    public final void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        a(viewHolder);
    }

    public final void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        a(viewHolder);
    }

    public final void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
        a(viewHolder);
    }

    private void b(@NonNull Class<?> cls) {
        this.f83976c.a(cls);
    }

    public final boolean onFailedToRecycleView(@NonNull RecyclerView.ViewHolder viewHolder) {
        a(viewHolder);
        return false;
    }

    private MultiTypeAdapter(@NonNull List<?> list) {
        this(list, new e());
    }

    @NonNull
    private c a(@NonNull RecyclerView.ViewHolder viewHolder) {
        return this.f83976c.a(viewHolder.getItemViewType());
    }

    @CheckResult
    public final <T> h<T> a(@NonNull Class<? extends T> cls) {
        b(cls);
        return new f(this, cls);
    }

    public final long getItemId(int i) {
        this.f83975b.get(i);
        this.f83976c.a(getItemViewType(i));
        return -1;
    }

    public final int getItemViewType(int i) {
        Object obj = this.f83975b.get(i);
        int b2 = this.f83976c.b(obj.getClass());
        if (b2 != -1) {
            return b2 + this.f83976c.b(b2).a(obj);
        }
        throw new a(obj.getClass());
    }

    @Deprecated
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        throw new IllegalAccessError("You should not call this method. Call RecyclerView.Adapter#onBindViewHolder(holder, position, payloads) instead.");
    }

    private MultiTypeAdapter(@NonNull List<?> list, @NonNull i iVar) {
        this.f83975b = list;
        this.f83976c = iVar;
    }

    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        c a2 = this.f83976c.a(i);
        a2.f83977f = this;
        return a2.a(from, viewGroup);
    }

    public final <T> void a(@NonNull Class<? extends T> cls, @NonNull c<T, ?> cVar) {
        b(cls);
        this.f83976c.a(cls, cVar, new b());
    }

    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        this.f83976c.a(viewHolder.getItemViewType()).b(viewHolder, this.f83975b.get(i));
    }
}
