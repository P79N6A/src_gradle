package com.ss.android.ugc.aweme.discover.delegate;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.a;
import com.ss.android.ugc.aweme.discover.adapter.BaseCategoryNewViewHolder;
import com.ss.android.ugc.aweme.discover.model.DiscoverItemData;
import java.util.List;

public final class FallbackDelegate extends a<List<DiscoverItemData>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42227a;

    public class FallbackViewHolder extends BaseCategoryNewViewHolder {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f42228b;

        public FallbackViewHolder(View view, RecyclerView recyclerView) {
            super(view, recyclerView);
        }
    }

    public final /* bridge */ /* synthetic */ boolean a(@NonNull Object obj, int i) {
        return false;
    }

    @NonNull
    public final RecyclerView.ViewHolder a(@NonNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f42227a, false, 36197, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f42227a, false, 36197, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        return new FallbackViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.tk, viewGroup2, false), (RecyclerView) viewGroup2);
    }

    public final /* synthetic */ void a(@NonNull Object obj, int i, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull List list) {
        List list2 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f42227a, false, 36198, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f42227a, false, 36198, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        FallbackViewHolder fallbackViewHolder = (FallbackViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, fallbackViewHolder, FallbackViewHolder.f42228b, false, 36199, new Class[]{Integer.TYPE}, Void.TYPE)) {
            FallbackViewHolder fallbackViewHolder2 = fallbackViewHolder;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, fallbackViewHolder2, FallbackViewHolder.f42228b, false, 36199, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        fallbackViewHolder.a(i);
    }
}
