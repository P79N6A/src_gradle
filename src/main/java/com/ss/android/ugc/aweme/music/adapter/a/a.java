package com.ss.android.ugc.aweme.music.adapter.a;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.music.adapter.MusicMixAdapter;
import com.ss.android.ugc.aweme.music.adapter.MusicUnitViewHolder;
import com.ss.android.ugc.aweme.music.adapter.f;
import com.ss.android.ugc.aweme.music.adapter.type.d;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import java.util.Map;

public final class a extends com.ss.android.ugc.aweme.common.adapter.a<List<d>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56267a;

    /* renamed from: b  reason: collision with root package name */
    public String f56268b;

    /* renamed from: c  reason: collision with root package name */
    public f<com.ss.android.ugc.aweme.music.a.f> f56269c;

    /* renamed from: d  reason: collision with root package name */
    public int f56270d = -1;

    /* renamed from: e  reason: collision with root package name */
    private MusicUnitViewHolder f56271e;

    /* renamed from: f  reason: collision with root package name */
    private com.ss.android.ugc.aweme.music.adapter.d f56272f;
    private int g;
    private MusicMixAdapter.a h;
    private int i;

    public final a a(int i2) {
        this.g = i2;
        return this;
    }

    @NonNull
    public final RecyclerView.ViewHolder a(@NonNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f56267a, false, 59960, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f56267a, false, 59960, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        MusicUnitViewHolder musicUnitViewHolder = new MusicUnitViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.w_, viewGroup2, false), this.f56272f, this.i, this.h, this.f56269c);
        return musicUnitViewHolder;
    }

    public final /* synthetic */ boolean a(@NonNull Object obj, int i2) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i2)}, this, f56267a, false, 59959, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i2)}, this, f56267a, false, 59959, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        d dVar = (d) list.get(i2);
        if (!(dVar instanceof MusicModel) || ((MusicModel) dVar).getDataType() != 0) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void a(@NonNull Object obj, int i2, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull List list) {
        int i3 = i2;
        List list2 = (List) obj;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i2), viewHolder, list}, this, f56267a, false, 59961, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i2), viewHolder, list}, this, f56267a, false, 59961, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        this.f56271e = (MusicUnitViewHolder) viewHolder;
        MusicUnitViewHolder musicUnitViewHolder = this.f56271e;
        MusicModel musicModel = (MusicModel) list2.get(i3);
        String str = this.f56268b;
        if (this.f56270d == i3) {
            z = true;
        }
        musicUnitViewHolder.a(musicModel, str, z, this.g);
        r.a("show_music", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("music_id", ((MusicModel) list2.get(i3)).getMusicId()).a("enter_from", "challenge_bonding").f34114b);
    }

    public a(com.ss.android.ugc.aweme.music.adapter.d dVar, int i2, MusicMixAdapter.a aVar, f<com.ss.android.ugc.aweme.music.a.f> fVar, int i3) {
        this.f56272f = dVar;
        this.g = i2;
        this.h = aVar;
        this.f56269c = fVar;
        this.i = i3;
    }
}
