package com.ss.android.ugc.aweme.discover.delegate.a;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.a;
import com.ss.android.ugc.aweme.discover.adapter.viewholder.SearchHistoryMvpViewHolder;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.ui.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0014J4\u0010\f\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchHistoryMvpDelegate;", "Lcom/ss/android/ugc/aweme/common/adapter/AdapterDelegate;", "", "", "()V", "mHandler", "Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$ISearchHistoryHandler;", "isForViewType", "", "items", "position", "", "onBindViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "payloads", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "setSearchHistoryHandler", "handler", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f extends a<List<? extends Object>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42255a;

    /* renamed from: b  reason: collision with root package name */
    public ak.c f42256b;

    @NotNull
    public final RecyclerView.ViewHolder a(@NotNull ViewGroup viewGroup) {
        SearchHistoryMvpViewHolder searchHistoryMvpViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f42255a, false, 36253, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f42255a, false, 36253, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        SearchHistoryMvpViewHolder.a aVar = SearchHistoryMvpViewHolder.f41982e;
        ak.c cVar = this.f42256b;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, cVar}, aVar, SearchHistoryMvpViewHolder.a.f41986a, false, 35958, new Class[]{ViewGroup.class, ak.c.class}, SearchHistoryMvpViewHolder.class)) {
            SearchHistoryMvpViewHolder.a aVar2 = aVar;
            searchHistoryMvpViewHolder = (SearchHistoryMvpViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, cVar}, aVar2, SearchHistoryMvpViewHolder.a.f41986a, false, 35958, new Class[]{ViewGroup.class, ak.c.class}, SearchHistoryMvpViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a05, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "inflate");
            searchHistoryMvpViewHolder = new SearchHistoryMvpViewHolder(inflate, cVar);
        }
        return searchHistoryMvpViewHolder;
    }

    public final /* synthetic */ boolean a(Object obj, int i) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f42255a, false, 36252, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f42255a, false, 36252, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(list, "items");
        Object obj2 = list.get(i);
        if (!(obj2 instanceof List) || !(CollectionsKt.firstOrNull((List) obj2) instanceof SearchHistory)) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void a(Object obj, int i, RecyclerView.ViewHolder viewHolder, List list) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List list2 = list;
        List list3 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list3, Integer.valueOf(i), viewHolder2, list2}, this, f42255a, false, 36254, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, Integer.valueOf(i), viewHolder2, list2}, this, f42255a, false, 36254, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list3, "items");
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        Intrinsics.checkParameterIsNotNull(list2, "payloads");
        Object obj2 = list3.get(i);
        SearchHistoryMvpViewHolder searchHistoryMvpViewHolder = (SearchHistoryMvpViewHolder) viewHolder2;
        if (obj2 != null) {
            List list4 = (List) obj2;
            if (PatchProxy.isSupport(new Object[]{list4}, searchHistoryMvpViewHolder, SearchHistoryMvpViewHolder.f41981a, false, 35957, new Class[]{List.class}, Void.TYPE)) {
                SearchHistoryMvpViewHolder searchHistoryMvpViewHolder2 = searchHistoryMvpViewHolder;
                PatchProxy.accessDispatch(new Object[]{list4}, searchHistoryMvpViewHolder2, SearchHistoryMvpViewHolder.f41981a, false, 35957, new Class[]{List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(list4, "histories");
            searchHistoryMvpViewHolder.f41984c.setAdapter(new SearchHistoryMvpViewHolder.b(searchHistoryMvpViewHolder, list4, list4));
            searchHistoryMvpViewHolder.f41983b.setOnClickListener(new SearchHistoryMvpViewHolder.c(searchHistoryMvpViewHolder));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.discover.model.SearchHistory>");
    }
}
