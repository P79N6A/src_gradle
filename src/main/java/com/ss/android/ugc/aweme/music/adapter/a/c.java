package com.ss.android.ugc.aweme.music.adapter.a;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.a;
import com.ss.android.ugc.aweme.music.adapter.MusicCollectionViewHolder;
import com.ss.android.ugc.aweme.music.adapter.type.d;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import java.util.List;

public final class c extends a<List<d>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56275a;

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.music.adapter.a f56276b;

    public c(com.ss.android.ugc.aweme.music.adapter.a aVar) {
        this.f56276b = aVar;
    }

    @NonNull
    public final RecyclerView.ViewHolder a(@NonNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, this, f56275a, false, 59966, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return new MusicCollectionViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.xt, viewGroup2, false), this.f56276b);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f56275a, false, 59966, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
    }

    public final /* synthetic */ boolean a(@NonNull Object obj, int i) {
        List list = (List) obj;
        if (!PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f56275a, false, 59965, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return list.get(i) instanceof MusicCollectionItem;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f56275a, false, 59965, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final /* synthetic */ void a(@NonNull Object obj, int i, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull List list) {
        List list2 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f56275a, false, 59967, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f56275a, false, 59967, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        MusicCollectionViewHolder musicCollectionViewHolder = (MusicCollectionViewHolder) viewHolder;
        MusicCollectionItem musicCollectionItem = (MusicCollectionItem) list2.get(i);
        if (PatchProxy.isSupport(new Object[]{musicCollectionItem}, musicCollectionViewHolder, MusicCollectionViewHolder.f56181a, false, 59873, new Class[]{MusicCollectionItem.class}, Void.TYPE)) {
            MusicCollectionViewHolder musicCollectionViewHolder2 = musicCollectionViewHolder;
            PatchProxy.accessDispatch(new Object[]{musicCollectionItem}, musicCollectionViewHolder2, MusicCollectionViewHolder.f56181a, false, 59873, new Class[]{MusicCollectionItem.class}, Void.TYPE);
            return;
        }
        musicCollectionViewHolder.f56183c = false;
        musicCollectionViewHolder.f56182b = musicCollectionItem;
        if (musicCollectionViewHolder.f56182b != null) {
            musicCollectionViewHolder.mNameView.setTextColor(musicCollectionViewHolder.itemView.getResources().getColor(C0906R.color.p9));
            musicCollectionViewHolder.mNameView.setText(musicCollectionViewHolder.f56182b.mcName);
            musicCollectionViewHolder.itemView.setBackgroundColor(musicCollectionViewHolder.itemView.getResources().getColor(C0906R.color.anp));
            com.ss.android.ugc.aweme.base.c.b(musicCollectionViewHolder.mCoverView, musicCollectionViewHolder.f56182b.awemeCover);
            musicCollectionViewHolder.mCoverView.setRotation(0.0f);
        }
    }
}
