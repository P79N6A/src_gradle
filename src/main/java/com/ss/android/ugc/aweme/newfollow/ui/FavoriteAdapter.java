package com.ss.android.ugc.aweme.newfollow.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

public class FavoriteAdapter extends RecyclerView.Adapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57199a;

    /* renamed from: b  reason: collision with root package name */
    protected List<Aweme> f57200b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    protected a f57201c;

    public interface a {
        void a(View view, Aweme aweme, int i);
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f57199a, false, 61453, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f57199a, false, 61453, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f57200b == null) {
            return 0;
        } else {
            return this.f57200b.size();
        }
    }

    public FavoriteAdapter(a aVar) {
        this.f57201c = aVar;
    }

    public final void a(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f57199a, false, 61455, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f57199a, false, 61455, new Class[]{List.class}, Void.TYPE);
        } else if (list != null) {
            this.f57200b.clear();
            if (list.size() > 8) {
                for (Aweme add : list) {
                    this.f57200b.add(add);
                }
            } else {
                this.f57200b.addAll(list);
            }
            notifyDataSetChanged();
        }
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f57199a, false, 61451, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new FavoriteViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.u5, viewGroup2, false), this.f57201c);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f57199a, false, 61451, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        Aweme aweme;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f57199a, false, 61452, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f57199a, false, 61452, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        FavoriteViewHolder favoriteViewHolder = (FavoriteViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57199a, false, 61454, new Class[]{Integer.TYPE}, Aweme.class)) {
            aweme = (Aweme) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57199a, false, 61454, new Class[]{Integer.TYPE}, Aweme.class);
        } else {
            aweme = this.f57200b.get(i2);
        }
        favoriteViewHolder.a(aweme, i2);
    }
}
