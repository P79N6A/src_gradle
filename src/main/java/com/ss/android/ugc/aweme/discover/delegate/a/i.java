package com.ss.android.ugc.aweme.discover.delegate.a;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter;
import com.ss.android.ugc.aweme.discover.adapter.SearchSuggestFirstItemHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0017B\u0011\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\rH\u0014J4\u0010\u000e\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0014R\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchSuggestFirstDelegate;", "Lcom/ss/android/ugc/aweme/common/adapter/AdapterDelegate;", "", "", "adapter", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;", "(Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;)V", "getAdapter", "()Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;", "isForViewType", "", "items", "position", "", "onBindViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "payloads", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "SuggestFirst", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i extends com.ss.android.ugc.aweme.common.adapter.a<List<? extends Object>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42265a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final SearchSquareAdapter<?> f42266b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchSuggestFirstDelegate$SuggestFirst;", "", "(Ljava/lang/String;I)V", "TYPE_LIST", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public enum a {
        TYPE_LIST;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public i(@NotNull SearchSquareAdapter<?> searchSquareAdapter) {
        Intrinsics.checkParameterIsNotNull(searchSquareAdapter, "adapter");
        this.f42266b = searchSquareAdapter;
    }

    @NotNull
    public final RecyclerView.ViewHolder a(@NotNull ViewGroup viewGroup) {
        SearchSuggestFirstItemHolder searchSuggestFirstItemHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f42265a, false, 36263, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f42265a, false, 36263, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        SearchSuggestFirstItemHolder.a aVar = SearchSuggestFirstItemHolder.f41898c;
        SearchSquareAdapter<?> searchSquareAdapter = this.f42266b;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, searchSquareAdapter}, aVar, SearchSuggestFirstItemHolder.a.f41901a, false, 35915, new Class[]{ViewGroup.class, SearchSquareAdapter.class}, SearchSuggestFirstItemHolder.class)) {
            SearchSuggestFirstItemHolder.a aVar2 = aVar;
            searchSuggestFirstItemHolder = (SearchSuggestFirstItemHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, searchSquareAdapter}, aVar2, SearchSuggestFirstItemHolder.a.f41901a, false, 35915, new Class[]{ViewGroup.class, SearchSquareAdapter.class}, SearchSuggestFirstItemHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            Intrinsics.checkParameterIsNotNull(searchSquareAdapter, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a0e, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
            searchSuggestFirstItemHolder = new SearchSuggestFirstItemHolder(inflate, searchSquareAdapter);
        }
        return searchSuggestFirstItemHolder;
    }

    public final /* synthetic */ boolean a(Object obj, int i) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f42265a, false, 36262, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f42265a, false, 36262, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(list, "items");
        return list.get(i) instanceof a;
    }

    public final /* synthetic */ void a(Object obj, int i, RecyclerView.ViewHolder viewHolder, List list) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List list2 = list;
        List list3 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list3, Integer.valueOf(i), viewHolder2, list2}, this, f42265a, false, 36264, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, Integer.valueOf(i), viewHolder2, list2}, this, f42265a, false, 36264, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list3, "items");
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        Intrinsics.checkParameterIsNotNull(list2, "payloads");
        ((SearchSuggestFirstItemHolder) viewHolder2).a();
    }
}
