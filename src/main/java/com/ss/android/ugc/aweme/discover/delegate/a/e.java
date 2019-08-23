package com.ss.android.ugc.aweme.discover.delegate.a;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.adapter.SearchHistoryLastItemHolder;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.ui.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\"#B\u0005¢\u0006\u0002\u0010\u0004J6\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00022\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\n0\fj\b\u0012\u0004\u0012\u00020\n`\r2\u0006\u0010\u000e\u001a\u00020\bJ6\u0010\u000f\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\n0\fj\b\u0012\u0004\u0012\u00020\n`\r2\u0006\u0010\u000e\u001a\u00020\bH\u0002J6\u0010\u0010\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\n0\fj\b\u0012\u0004\u0012\u00020\n`\r2\u0006\u0010\u000e\u001a\u00020\bH\u0002J6\u0010\u0011\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\n0\fj\b\u0012\u0004\u0012\u00020\n`\r2\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u001e\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J4\u0010\u0017\u001a\u00020\u00182\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u000e\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchHistoryLastDelegate;", "Lcom/ss/android/ugc/aweme/common/adapter/AdapterDelegate;", "", "", "()V", "mHandler", "Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$ISearchHistoryHandler;", "filterSearchHistoryAndLast", "Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchHistoryLastDelegate$HistoryLast;", "rawList", "Lcom/ss/android/ugc/aweme/discover/model/SearchHistory;", "resultList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "defLast", "getSearchHistoryDouYin", "getSearchHistoryMTNewStyle", "getSearchHistoryMTNormal", "isForViewType", "", "items", "position", "", "onBindViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "payloads", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "setSearchHistoryHandler", "handler", "Companion", "HistoryLast", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends com.ss.android.ugc.aweme.common.adapter.a<List<? extends Object>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42252a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f42253c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public ak.c f42254b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchHistoryLastDelegate$Companion;", "", "()V", "DOUYIN_HIDE_HISTORY_COUNT", "", "MT_NEW_STYLE_HIDE_HISTORY_COUNT", "MT_NORMAL_CLEAR_HISTORY_COUNT", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchHistoryLastDelegate$HistoryLast;", "", "(Ljava/lang/String;I)V", "TYPE_NONE", "TYPE_SHOW_MORE", "TYPE_CLEAR_ALL", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public enum b {
        TYPE_NONE,
        TYPE_SHOW_MORE,
        TYPE_CLEAR_ALL;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    @NotNull
    public final RecyclerView.ViewHolder a(@NotNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f42252a, false, 36247, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f42252a, false, 36247, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        SearchHistoryLastItemHolder a2 = SearchHistoryLastItemHolder.a(viewGroup2, this.f42254b);
        Intrinsics.checkExpressionValueIsNotNull(a2, "SearchHistoryLastItemHol….create(parent, mHandler)");
        return a2;
    }

    public final /* synthetic */ boolean a(Object obj, int i) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f42252a, false, 36246, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f42252a, false, 36246, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(list, "items");
        return list.get(i) instanceof b;
    }

    private final b c(List<? extends SearchHistory> list, ArrayList<SearchHistory> arrayList, b bVar) {
        ArrayList<SearchHistory> arrayList2 = arrayList;
        if (PatchProxy.isSupport(new Object[]{list, arrayList2, bVar}, this, f42252a, false, 36243, new Class[]{List.class, ArrayList.class, b.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{list, arrayList2, bVar}, this, f42252a, false, 36243, new Class[]{List.class, ArrayList.class, b.class}, b.class);
        }
        arrayList2.addAll(list);
        if (list.size() <= 2) {
            return b.TYPE_NONE;
        }
        return b.TYPE_CLEAR_ALL;
    }

    private final b b(List<? extends SearchHistory> list, ArrayList<SearchHistory> arrayList, b bVar) {
        List<? extends SearchHistory> list2 = list;
        ArrayList<SearchHistory> arrayList2 = arrayList;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{list2, arrayList2, bVar2}, this, f42252a, false, 36242, new Class[]{List.class, ArrayList.class, b.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{list2, arrayList2, bVar2}, this, f42252a, false, 36242, new Class[]{List.class, ArrayList.class, b.class}, b.class);
        } else if (list.size() <= 2) {
            arrayList2.addAll(list2);
            return b.TYPE_NONE;
        } else if (bVar2 == b.TYPE_NONE || bVar2 == b.TYPE_SHOW_MORE) {
            arrayList2.addAll(list2.subList(0, 2));
            return b.TYPE_SHOW_MORE;
        } else {
            arrayList2.addAll(list2);
            return b.TYPE_CLEAR_ALL;
        }
    }

    private final b d(List<? extends SearchHistory> list, ArrayList<SearchHistory> arrayList, b bVar) {
        List<? extends SearchHistory> list2 = list;
        ArrayList<SearchHistory> arrayList2 = arrayList;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{list2, arrayList2, bVar2}, this, f42252a, false, 36244, new Class[]{List.class, ArrayList.class, b.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{list2, arrayList2, bVar2}, this, f42252a, false, 36244, new Class[]{List.class, ArrayList.class, b.class}, b.class);
        } else if (list.size() <= 3) {
            arrayList2.addAll(list2);
            return b.TYPE_CLEAR_ALL;
        } else if (bVar2 == b.TYPE_NONE || bVar2 == b.TYPE_SHOW_MORE) {
            arrayList2.addAll(list2.subList(0, 3));
            return b.TYPE_SHOW_MORE;
        } else {
            arrayList2.addAll(list2);
            return b.TYPE_CLEAR_ALL;
        }
    }

    @NotNull
    public final b a(@Nullable List<? extends SearchHistory> list, @NotNull ArrayList<SearchHistory> arrayList, @NotNull b bVar) {
        ArrayList<SearchHistory> arrayList2 = arrayList;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{list, arrayList2, bVar2}, this, f42252a, false, 36241, new Class[]{List.class, ArrayList.class, b.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{list, arrayList2, bVar2}, this, f42252a, false, 36241, new Class[]{List.class, ArrayList.class, b.class}, b.class);
        }
        Intrinsics.checkParameterIsNotNull(arrayList2, "resultList");
        Intrinsics.checkParameterIsNotNull(bVar2, "defLast");
        if (CollectionUtils.isEmpty(list)) {
            return b.TYPE_NONE;
        }
        if (!com.ss.android.g.a.a()) {
            if (list == null) {
                Intrinsics.throwNpe();
            }
            return b(list, arrayList, bVar);
        } else if (com.ss.android.ugc.aweme.discover.helper.b.c()) {
            if (list == null) {
                Intrinsics.throwNpe();
            }
            return d(list, arrayList, bVar);
        } else {
            if (list == null) {
                Intrinsics.throwNpe();
            }
            return c(list, arrayList, bVar);
        }
    }

    public final /* synthetic */ void a(Object obj, int i, RecyclerView.ViewHolder viewHolder, List list) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List list2 = list;
        List list3 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list3, Integer.valueOf(i), viewHolder2, list2}, this, f42252a, false, 36248, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, Integer.valueOf(i), viewHolder2, list2}, this, f42252a, false, 36248, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list3, "items");
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        Intrinsics.checkParameterIsNotNull(list2, "payloads");
        Object obj2 = list3.get(i);
        if (obj2 != null) {
            ((SearchHistoryLastItemHolder) viewHolder2).a((b) obj2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.delegate.intermedaite.SearchHistoryLastDelegate.HistoryLast");
    }
}
