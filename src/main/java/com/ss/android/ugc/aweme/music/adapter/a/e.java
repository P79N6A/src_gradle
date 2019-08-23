package com.ss.android.ugc.aweme.music.adapter.a;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.a;
import com.ss.android.ugc.aweme.music.adapter.FavoriteEmptyViewHolder;
import com.ss.android.ugc.aweme.music.adapter.type.c;
import com.ss.android.ugc.aweme.music.adapter.type.d;
import java.util.List;

public final class e extends a<List<d>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56279a;

    public final /* bridge */ /* synthetic */ void a(@NonNull Object obj, int i, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull List list) {
    }

    @NonNull
    public final RecyclerView.ViewHolder a(@NonNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, this, f56279a, false, 59972, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return new FavoriteEmptyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.xu, viewGroup2, false));
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f56279a, false, 59972, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
    }

    public final /* synthetic */ boolean a(@NonNull Object obj, int i) {
        List list = (List) obj;
        if (!PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f56279a, false, 59971, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return list.get(i) instanceof c;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f56279a, false, 59971, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }
}
