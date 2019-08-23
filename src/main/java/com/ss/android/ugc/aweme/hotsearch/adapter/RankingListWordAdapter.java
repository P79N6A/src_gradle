package com.ss.android.ugc.aweme.hotsearch.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.hotsearch.a.f;
import com.ss.android.ugc.aweme.hotsearch.viewholder.RankingListWordItemViewHolder;

public class RankingListWordAdapter extends BaseHotSearchAdapter<HotSearchItem> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f49662f;
    private f<HotSearchItem> g;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object b() {
        if (!PatchProxy.isSupport(new Object[0], this, f49662f, false, 49607, new Class[0], HotSearchItem.class)) {
            return new HotSearchItem();
        }
        return (HotSearchItem) PatchProxy.accessDispatch(new Object[0], this, f49662f, false, 49607, new Class[0], HotSearchItem.class);
    }

    /* access modifiers changed from: package-private */
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, this, f49662f, false, 49606, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return new RankingListWordItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.vk, viewGroup2, false), this.g);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f49662f, false, 49606, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
    }

    public RankingListWordAdapter(Context context, f<HotSearchItem> fVar) {
        super(context);
        this.g = fVar;
    }
}
