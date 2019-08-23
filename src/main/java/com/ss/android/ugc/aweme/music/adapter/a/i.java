package com.ss.android.ugc.aweme.music.adapter.a;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.a;
import com.ss.android.ugc.aweme.music.adapter.ShowLessViewHolder;
import com.ss.android.ugc.aweme.music.adapter.b;
import com.ss.android.ugc.aweme.music.adapter.type.d;
import com.ss.android.ugc.aweme.music.adapter.type.f;
import java.util.List;

public final class i extends a<List<d>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56288a;

    /* renamed from: b  reason: collision with root package name */
    private b f56289b;

    public final /* bridge */ /* synthetic */ void a(@NonNull Object obj, int i, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull List list) {
    }

    public i(b bVar) {
        this.f56289b = bVar;
    }

    @NonNull
    public final RecyclerView.ViewHolder a(@NonNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, this, f56288a, false, 59985, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return new ShowLessViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.xy, viewGroup2, false), this.f56289b);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f56288a, false, 59985, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
    }

    public final /* synthetic */ boolean a(@NonNull Object obj, int i) {
        List list = (List) obj;
        if (!PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f56288a, false, 59984, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return list.get(i) instanceof f;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f56288a, false, 59984, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }
}
