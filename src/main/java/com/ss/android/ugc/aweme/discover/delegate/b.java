package com.ss.android.ugc.aweme.discover.delegate;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.common.adapter.a;
import com.ss.android.ugc.aweme.discover.adpater.CategoryAdViewHolder;
import com.ss.android.ugc.aweme.discover.model.CategoryListAdInfo;
import com.ss.android.ugc.aweme.discover.model.CategoryOrAd;
import com.ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.ss.android.ugc.aweme.discover.widget.CategoryAdView;
import java.util.List;

public final class b extends a<List<DiscoverItemData>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42269a;

    @NonNull
    public final RecyclerView.ViewHolder a(@NonNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, this, f42269a, false, 36185, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return new CategoryAdViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.sj, viewGroup2, false), (RecyclerView) viewGroup2);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f42269a, false, 36185, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
    }

    public final /* synthetic */ boolean a(@NonNull Object obj, int i) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f42269a, false, 36184, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f42269a, false, 36184, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        DiscoverItemData discoverItemData = (DiscoverItemData) list.get(i);
        if (discoverItemData.getType() == 5) {
            return discoverItemData.getCategoryOrAd().isAd();
        }
        return false;
    }

    public final /* synthetic */ void a(@NonNull Object obj, int i, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull List list) {
        int i2 = i;
        List list2 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f42269a, false, 36186, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            Object[] objArr = {list2, Integer.valueOf(i), viewHolder, list};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f42269a, false, 36186, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        CategoryOrAd categoryOrAd = ((DiscoverItemData) list2.get(i2)).getCategoryOrAd();
        CategoryAdViewHolder categoryAdViewHolder = (CategoryAdViewHolder) viewHolder;
        CategoryListAdInfo categoryListAdInfo = categoryOrAd.ad;
        if (PatchProxy.isSupport(new Object[]{categoryListAdInfo, Integer.valueOf(i)}, categoryAdViewHolder, CategoryAdViewHolder.f42003b, false, 35962, new Class[]{CategoryListAdInfo.class, Integer.TYPE}, Void.TYPE)) {
            CategoryAdViewHolder categoryAdViewHolder2 = categoryAdViewHolder;
            PatchProxy.accessDispatch(new Object[]{categoryListAdInfo, Integer.valueOf(i)}, categoryAdViewHolder2, CategoryAdViewHolder.f42003b, false, 35962, new Class[]{CategoryListAdInfo.class, Integer.TYPE}, Void.TYPE);
        } else {
            ((CategoryAdView) categoryAdViewHolder.itemView).setAd(categoryListAdInfo);
            ((CategoryAdView) categoryAdViewHolder.itemView).setPos(i2);
            categoryAdViewHolder.a(i2);
        }
        if (categoryOrAd.ad != null) {
            int b2 = c.b(list2);
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(b2)}, categoryAdViewHolder, CategoryAdViewHolder.f42003b, false, 35964, new Class[]{Integer.TYPE}, Void.TYPE)) {
                CategoryAdViewHolder categoryAdViewHolder3 = categoryAdViewHolder;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(b2)}, categoryAdViewHolder3, CategoryAdViewHolder.f42003b, false, 35964, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            categoryAdViewHolder.f42004c = b2;
            ((CategoryAdView) categoryAdViewHolder.itemView).setCategoryOrAdStartPos(b2);
        }
    }
}
