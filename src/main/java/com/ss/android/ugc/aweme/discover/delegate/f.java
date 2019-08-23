package com.ss.android.ugc.aweme.discover.delegate;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.l;
import com.ss.android.ugc.aweme.common.adapter.a;
import com.ss.android.ugc.aweme.discover.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.discover.adapter.HotSearchImageViewHolder;
import com.ss.android.ugc.aweme.discover.helper.b;
import com.ss.android.ugc.aweme.discover.hotspot.HotSpotDetailActivity;
import com.ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.ui.ak;
import java.util.List;

public final class f extends a<List<DiscoverItemData>> implements ak.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42275a;

    /* renamed from: b  reason: collision with root package name */
    private Context f42276b;

    /* renamed from: c  reason: collision with root package name */
    private LifecycleOwner f42277c;

    public f(LifecycleOwner lifecycleOwner) {
        this.f42277c = lifecycleOwner;
    }

    @NonNull
    public final RecyclerView.ViewHolder a(@NonNull ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f42275a, false, 36204, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f42275a, false, 36204, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        this.f42276b = viewGroup.getContext();
        return HotSearchImageViewHolder.a(viewGroup, "hot_search_section_discovery", this, this.f42277c);
    }

    public final /* synthetic */ boolean a(@NonNull Object obj, int i) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f42275a, false, 36203, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f42275a, false, 36203, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (((DiscoverItemData) list.get(i)).getType() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public final void a(HotSearchItem hotSearchItem, int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{hotSearchItem, Integer.valueOf(i), str2}, this, f42275a, false, 36206, new Class[]{HotSearchItem.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hotSearchItem, Integer.valueOf(i), str2}, this, f42275a, false, 36206, new Class[]{HotSearchItem.class, Integer.TYPE, String.class}, Void.TYPE);
        } else if (this.f42276b != null && !TextUtils.isEmpty(hotSearchItem.getWord())) {
            SearchResultParam openNewSearchContainer = new SearchResultParam().setKeyword(hotSearchItem.getWord()).setRealSearchWord(hotSearchItem.getRealSearchWord()).setSearchFrom(2).setEnterFrom(str2).setAd(hotSearchItem.isAd()).setSource("hot_search_section").setOpenNewSearchContainer(!com.ss.android.g.a.a());
            if (b.e()) {
                HotSpotDetailActivity.a(this.f42276b, openNewSearchContainer);
            } else {
                SearchResultActivity.a(this.f42276b, openNewSearchContainer);
            }
        }
    }

    public final /* synthetic */ void a(@NonNull Object obj, int i, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull List list) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List list2 = list;
        List list3 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list3, Integer.valueOf(i), viewHolder2, list2}, this, f42275a, false, 36205, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, Integer.valueOf(i), viewHolder2, list2}, this, f42275a, false, 36205, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        List list4 = ((DiscoverItemData) list3.get(i)).getHotSearchResponse().getData().getList();
        if (viewHolder2 instanceof HotSearchImageViewHolder) {
            if (list.size() <= 0 || !(list2.get(0) instanceof l)) {
                ((HotSearchImageViewHolder) viewHolder2).a(list4);
            } else {
                ((HotSearchImageViewHolder) viewHolder2).c();
            }
        }
    }
}
