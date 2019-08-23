package com.ss.android.ugc.aweme.discover.delegate;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.a;
import com.ss.android.ugc.aweme.discover.adapter.HotVideoViewHolder;
import com.ss.android.ugc.aweme.discover.model.DiscoverItemData;
import java.util.List;

public final class e extends a<List<DiscoverItemData>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42274a;

    @NonNull
    public final RecyclerView.ViewHolder a(@NonNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f42274a, false, 36201, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f42274a, false, 36201, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, null, HotVideoViewHolder.f41660a, true, 35641, new Class[]{ViewGroup.class}, HotVideoViewHolder.class)) {
            return new HotVideoViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a17, viewGroup2, false));
        }
        return (HotVideoViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, null, HotVideoViewHolder.f41660a, true, 35641, new Class[]{ViewGroup.class}, HotVideoViewHolder.class);
    }

    public final /* synthetic */ boolean a(@NonNull Object obj, int i) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f42274a, false, 36200, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f42274a, false, 36200, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (((DiscoverItemData) list.get(i)).getType() == 3) {
            return true;
        } else {
            return false;
        }
    }

    public final /* synthetic */ void a(@NonNull Object obj, int i, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull List list) {
        List list2 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f42274a, false, 36202, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f42274a, false, 36202, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        ((HotVideoViewHolder) viewHolder).a(((DiscoverItemData) list2.get(i)).getHotSearchVideos());
    }
}
