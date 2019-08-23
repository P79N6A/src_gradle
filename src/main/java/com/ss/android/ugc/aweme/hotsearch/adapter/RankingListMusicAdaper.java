package com.ss.android.ugc.aweme.hotsearch.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.model.HotSearchMusicItem;
import com.ss.android.ugc.aweme.hotsearch.a.f;
import com.ss.android.ugc.aweme.hotsearch.d.c;
import com.ss.android.ugc.aweme.hotsearch.viewholder.RankingListMusicItemViewHolder;
import com.ss.android.ugc.aweme.music.model.Music;

public class RankingListMusicAdaper extends BaseHotSearchAdapter<HotSearchMusicItem> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f49660f;
    private f<Music> g;
    private c.b h;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object b() {
        if (!PatchProxy.isSupport(new Object[0], this, f49660f, false, 49601, new Class[0], HotSearchMusicItem.class)) {
            return new HotSearchMusicItem();
        }
        return (HotSearchMusicItem) PatchProxy.accessDispatch(new Object[0], this, f49660f, false, 49601, new Class[0], HotSearchMusicItem.class);
    }

    /* access modifiers changed from: package-private */
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup}, this, f49660f, false, 49600, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return new RankingListMusicItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.vl, viewGroup, false), this.g, this.h);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f49660f, false, 49600, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
    }

    public RankingListMusicAdaper(Context context, f<Music> fVar, c.b bVar) {
        super(context);
        this.g = fVar;
        this.h = bVar;
    }
}
