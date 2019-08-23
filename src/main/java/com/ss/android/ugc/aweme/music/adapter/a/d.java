package com.ss.android.ugc.aweme.music.adapter.a;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.common.adapter.a;
import com.ss.android.ugc.aweme.music.adapter.MusicCollectionViewHolder;
import com.ss.android.ugc.aweme.music.adapter.type.e;
import java.util.List;

public final class d extends a<List<com.ss.android.ugc.aweme.music.adapter.type.d>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56277a;

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.music.adapter.a f56278b;

    public d(com.ss.android.ugc.aweme.music.adapter.a aVar) {
        this.f56278b = aVar;
    }

    @NonNull
    public final RecyclerView.ViewHolder a(@NonNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, this, f56277a, false, 59969, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return new MusicCollectionViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.xt, viewGroup2, false), this.f56278b);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f56277a, false, 59969, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
    }

    public final /* synthetic */ boolean a(@NonNull Object obj, int i) {
        List list = (List) obj;
        if (!PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f56277a, false, 59968, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return list.get(i) instanceof e;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f56277a, false, 59968, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final /* synthetic */ void a(@NonNull Object obj, int i, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull List list) {
        List list2 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f56277a, false, 59970, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f56277a, false, 59970, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        MusicCollectionViewHolder musicCollectionViewHolder = (MusicCollectionViewHolder) viewHolder;
        int i2 = ((e) list2.get(i)).f56293a;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, musicCollectionViewHolder, MusicCollectionViewHolder.f56181a, false, 59872, new Class[]{Integer.TYPE}, Void.TYPE)) {
            MusicCollectionViewHolder musicCollectionViewHolder2 = musicCollectionViewHolder;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, musicCollectionViewHolder2, MusicCollectionViewHolder.f56181a, false, 59872, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 <= 0) {
            musicCollectionViewHolder.itemView.setVisibility(8);
        } else {
            musicCollectionViewHolder.itemView.setVisibility(0);
            musicCollectionViewHolder.f56182b = null;
            musicCollectionViewHolder.f56183c = true;
            musicCollectionViewHolder.mNameView.setTextColor(musicCollectionViewHolder.itemView.getResources().getColor(C0906R.color.ans));
            musicCollectionViewHolder.mNameView.setText(musicCollectionViewHolder.itemView.getResources().getString(C0906R.string.bca));
            musicCollectionViewHolder.itemView.setBackgroundColor(musicCollectionViewHolder.itemView.getResources().getColor(C0906R.color.anp));
            ((GenericDraweeHierarchy) musicCollectionViewHolder.mCoverView.getHierarchy()).setActualImageScaleType(ScalingUtils.ScaleType.FIT_CENTER);
            c.a(musicCollectionViewHolder.mCoverView, 2130839700);
        }
    }
}
