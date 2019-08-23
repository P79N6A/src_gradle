package com.ss.android.ugc.aweme.hotsearch.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
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
import com.ss.android.ugc.aweme.hotsearch.viewholder.a;
import com.ss.android.ugc.aweme.music.model.Music;

public class SingleHotSearchMusicAdapter extends BaseHotSearchAdapter<HotSearchMusicItem> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f49663f;
    private f<Music> g;
    private c.b h;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object b() {
        if (!PatchProxy.isSupport(new Object[0], this, f49663f, false, 49609, new Class[0], HotSearchMusicItem.class)) {
            return new HotSearchMusicItem();
        }
        return (HotSearchMusicItem) PatchProxy.accessDispatch(new Object[0], this, f49663f, false, 49609, new Class[0], HotSearchMusicItem.class);
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f49663f, false, 49610, new Class[0], Integer.TYPE)) {
            return this.f49653b.size() + 1;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f49663f, false, 49610, new Class[0], Integer.TYPE)).intValue();
    }

    /* access modifiers changed from: package-private */
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup}, this, f49663f, false, 49608, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return new RankingListMusicItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.vl, viewGroup, false), this.g, this.h);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f49663f, false, 49608, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
    }

    public int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f49663f, false, 49611, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f49663f, false, 49611, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i == this.f49653b.size()) {
            return 3;
        } else {
            return 0;
        }
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f49663f, false, 49612, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f49663f, false, 49612, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
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

    public SingleHotSearchMusicAdapter(Context context, f<Music> fVar, c.b bVar) {
        super(context);
        this.g = fVar;
        this.h = bVar;
    }
}
