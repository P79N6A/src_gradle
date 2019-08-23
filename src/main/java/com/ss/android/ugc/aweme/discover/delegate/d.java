package com.ss.android.ugc.aweme.discover.delegate;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.a;
import com.ss.android.ugc.aweme.discover.adapter.CategoryNewViewHolder;
import com.ss.android.ugc.aweme.discover.mob.a.c;
import com.ss.android.ugc.aweme.discover.model.CategoryOrAd;
import com.ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import java.util.List;

public final class d extends a<List<DiscoverItemData>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42272a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f42273b = true;

    @NonNull
    public final RecyclerView.ViewHolder a(@NonNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, this, f42272a, false, 36195, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return new CategoryNewViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.tk, viewGroup2, false), (RecyclerView) viewGroup2);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f42272a, false, 36195, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
    }

    public final void b(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f42272a, false, 36193, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f42272a, false, 36193, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.b(viewHolder);
        CategoryNewViewHolder categoryNewViewHolder = (CategoryNewViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[0], categoryNewViewHolder, CategoryNewViewHolder.f41561b, false, 35518, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], categoryNewViewHolder, CategoryNewViewHolder.f41561b, false, 35518, new Class[0], Void.TYPE);
            return;
        }
        categoryNewViewHolder.f41562c.setAttached(false);
        categoryNewViewHolder.f41562c.setUserVisibleHint(false);
        categoryNewViewHolder.f41562c.c();
    }

    public final void a(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f42272a, false, 36192, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f42272a, false, 36192, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.a(viewHolder);
        if (this.f42273b) {
            CategoryNewViewHolder categoryNewViewHolder = (CategoryNewViewHolder) viewHolder;
            if (PatchProxy.isSupport(new Object[0], categoryNewViewHolder, CategoryNewViewHolder.f41561b, false, 35517, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], categoryNewViewHolder, CategoryNewViewHolder.f41561b, false, 35517, new Class[0], Void.TYPE);
                return;
            }
            categoryNewViewHolder.f41562c.setAttached(true);
            categoryNewViewHolder.f41562c.setUserVisibleHint(true);
            Word word = categoryNewViewHolder.f41564e.getWord();
            if (PatchProxy.isSupport(new Object[]{word}, categoryNewViewHolder, CategoryNewViewHolder.f41561b, false, 35520, new Class[]{Word.class}, Void.TYPE)) {
                CategoryNewViewHolder categoryNewViewHolder2 = categoryNewViewHolder;
                PatchProxy.accessDispatch(new Object[]{word}, categoryNewViewHolder2, CategoryNewViewHolder.f41561b, false, 35520, new Class[]{Word.class}, Void.TYPE);
            } else if (word != null && !word.isShowed()) {
                word.setShowed(true);
                new c().a(word).e();
            }
        }
    }

    public final /* synthetic */ boolean a(@NonNull Object obj, int i) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f42272a, false, 36194, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f42272a, false, 36194, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        DiscoverItemData discoverItemData = (DiscoverItemData) list.get(i);
        if (discoverItemData.getType() == 5) {
            return discoverItemData.getCategoryOrAd().isCategory();
        }
        return false;
    }

    public final /* synthetic */ void a(@NonNull Object obj, int i, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull List list) {
        int i2 = i;
        List list2 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f42272a, false, 36196, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            Object[] objArr = {list2, Integer.valueOf(i), viewHolder, list};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f42272a, false, 36196, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        CategoryOrAd categoryOrAd = ((DiscoverItemData) list2.get(i2)).getCategoryOrAd();
        CategoryNewViewHolder categoryNewViewHolder = (CategoryNewViewHolder) viewHolder;
        categoryNewViewHolder.a(categoryOrAd.category, i2);
        if (categoryOrAd.category != null && categoryOrAd.category.isAd()) {
            categoryNewViewHolder.f41565f = com.ss.android.ugc.aweme.commercialize.utils.c.b(list2);
        }
    }
}
