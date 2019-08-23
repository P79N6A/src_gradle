package com.ss.android.ugc.aweme.discover.delegate.a;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.adapter.a;
import com.ss.android.ugc.aweme.discover.adapter.SearchHistoryItemViewHolder;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.ui.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0014J4\u0010\f\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchHistoryDelegate;", "Lcom/ss/android/ugc/aweme/common/adapter/AdapterDelegate;", "", "", "()V", "mHandler", "Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$ISearchHistoryHandler;", "isForViewType", "", "items", "position", "", "onBindViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "payloads", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "setSearchHistoryHandler", "handler", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends a<List<? extends Object>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42250a;

    /* renamed from: b  reason: collision with root package name */
    public ak.c f42251b;

    @NotNull
    public final RecyclerView.ViewHolder a(@NotNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f42250a, false, 36239, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f42250a, false, 36239, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        SearchHistoryItemViewHolder a2 = SearchHistoryItemViewHolder.a(viewGroup2, this.f42251b);
        Intrinsics.checkExpressionValueIsNotNull(a2, "SearchHistoryItemViewHol….create(parent, mHandler)");
        return a2;
    }

    public final /* synthetic */ boolean a(Object obj, int i) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f42250a, false, 36238, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f42250a, false, 36238, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(list, "items");
        return list.get(i) instanceof SearchHistory;
    }

    public final /* synthetic */ void a(Object obj, int i, RecyclerView.ViewHolder viewHolder, List list) {
        int i2 = i;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List list2 = list;
        List list3 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list3, Integer.valueOf(i), viewHolder2, list2}, this, f42250a, false, 36240, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            Object[] objArr = {list3, Integer.valueOf(i), viewHolder2, list2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f42250a, false, 36240, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list3, "items");
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        Intrinsics.checkParameterIsNotNull(list2, "payloads");
        Object obj2 = list3.get(i2);
        if (obj2 != null) {
            ((SearchHistoryItemViewHolder) viewHolder2).a((SearchHistory) obj2, i2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.SearchHistory");
    }
}
