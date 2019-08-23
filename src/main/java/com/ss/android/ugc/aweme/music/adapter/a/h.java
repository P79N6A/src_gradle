package com.ss.android.ugc.aweme.music.adapter.a;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.a;
import com.ss.android.ugc.aweme.music.adapter.MusicMixAdapter;
import com.ss.android.ugc.aweme.music.adapter.MusicUnitViewHolder;
import com.ss.android.ugc.aweme.music.adapter.f;
import com.ss.android.ugc.aweme.music.adapter.type.d;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

public final class h extends a<List<d>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56282a;

    /* renamed from: b  reason: collision with root package name */
    public String f56283b;

    /* renamed from: c  reason: collision with root package name */
    public f<com.ss.android.ugc.aweme.music.a.f> f56284c;

    /* renamed from: d  reason: collision with root package name */
    public int f56285d = -1;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.music.adapter.d f56286e;

    /* renamed from: f  reason: collision with root package name */
    private int f56287f;
    private MusicMixAdapter.a g;
    private int h;

    public final h a(int i) {
        this.f56287f = i;
        return this;
    }

    @NonNull
    public final RecyclerView.ViewHolder a(@NonNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f56282a, false, 59982, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f56282a, false, 59982, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        MusicUnitViewHolder musicUnitViewHolder = new MusicUnitViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.w_, viewGroup2, false), this.f56286e, this.h, this.g, this.f56284c);
        return musicUnitViewHolder;
    }

    public final /* synthetic */ boolean a(@NonNull Object obj, int i) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f56282a, false, 59981, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f56282a, false, 59981, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        d dVar = (d) list.get(i);
        if (!(dVar instanceof MusicModel) || ((MusicModel) dVar).getDataType() != 1) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void a(@NonNull Object obj, int i, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull List list) {
        int i2 = i;
        List list2 = (List) obj;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f56282a, false, 59983, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f56282a, false, 59983, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        MusicUnitViewHolder musicUnitViewHolder = (MusicUnitViewHolder) viewHolder;
        MusicModel musicModel = (MusicModel) list2.get(i2);
        String str = this.f56283b;
        if (i2 == this.f56285d) {
            z = true;
        }
        musicUnitViewHolder.a(musicModel, str, z, this.f56287f);
    }

    public h(com.ss.android.ugc.aweme.music.adapter.d dVar, int i, MusicMixAdapter.a aVar, f<com.ss.android.ugc.aweme.music.a.f> fVar, int i2) {
        this.f56286e = dVar;
        this.f56287f = i;
        this.g = aVar;
        this.f56284c = fVar;
        this.h = i2;
    }
}
