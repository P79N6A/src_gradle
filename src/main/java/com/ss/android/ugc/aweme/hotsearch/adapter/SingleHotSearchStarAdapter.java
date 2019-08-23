package com.ss.android.ugc.aweme.hotsearch.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.hotsearch.a.f;
import com.ss.android.ugc.aweme.hotsearch.b.k;
import com.ss.android.ugc.aweme.hotsearch.viewholder.RankingListStarItemViewHolder;
import com.ss.android.ugc.aweme.hotsearch.viewholder.a;

public class SingleHotSearchStarAdapter extends BaseHotSearchAdapter<k> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f49664f;
    private f<k> g;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object b() {
        if (!PatchProxy.isSupport(new Object[0], this, f49664f, false, 49614, new Class[0], k.class)) {
            return new k();
        }
        return (k) PatchProxy.accessDispatch(new Object[0], this, f49664f, false, 49614, new Class[0], k.class);
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f49664f, false, 49615, new Class[0], Integer.TYPE)) {
            return this.f49653b.size() + 1;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f49664f, false, 49615, new Class[0], Integer.TYPE)).intValue();
    }

    /* access modifiers changed from: package-private */
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, this, f49664f, false, 49613, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return new RankingListStarItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.vm, viewGroup2, false), this.g);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f49664f, false, 49613, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
    }

    public int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f49664f, false, 49616, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f49664f, false, 49616, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i == this.f49653b.size()) {
            return 3;
        } else {
            return 0;
        }
    }

    public SingleHotSearchStarAdapter(Context context, f<k> fVar) {
        super(context);
        this.g = fVar;
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f49664f, false, 49617, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f49664f, false, 49617, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (getItemViewType(i) == 0) {
            a aVar = (a) viewHolder;
            aVar.a_(a(i), i);
            if (this.f49655d) {
                aVar.a(i);
            }
        }
    }
}
