package com.ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.e;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.a;
import com.bytedance.jedi.arch.ext.list.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a \u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0002\u001a\u001a\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a$\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\r0\b\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004\u001a\u0001\u0010\u0012\u001a\u00020\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0014*\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00182\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u0013\u0018\u00010\u001a2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u0013\u0018\u00010\u001a2!\b\u0002\u0010\u001c\u001a\u001b\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d¢\u0006\u0002\b\u001f¨\u0006 "}, d2 = {"listInsert", "", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchJediViewModel;", "position", "", "data", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeed;", "listInsertMultiple", "", "listLoadMore", "listModify", "listModifyMultiple", "pairs", "Lkotlin/Pair;", "listRefresh", "listRemove", "listRemoveMultiple", "count", "listSubscribe", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "subscriber", "Lcom/bytedance/jedi/arch/ISubscriber;", "adapter", "Lcom/bytedance/jedi/arch/ext/list/DiffableAdapter;", "refreshListener", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "loadMoreListener", "onHasMore", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "main_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42530a;

    public static final void a(@NotNull SearchJediViewModel searchJediViewModel) {
        SearchJediViewModel searchJediViewModel2 = searchJediViewModel;
        if (PatchProxy.isSupport(new Object[]{searchJediViewModel2}, null, f42530a, true, 36748, new Class[]{SearchJediViewModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchJediViewModel2}, null, f42530a, true, 36748, new Class[]{SearchJediViewModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(searchJediViewModel2, "$this$listLoadMore");
        searchJediViewModel2.f42525e.loadMore();
    }

    public static final void b(@NotNull SearchJediViewModel searchJediViewModel) {
        SearchJediViewModel searchJediViewModel2 = searchJediViewModel;
        if (PatchProxy.isSupport(new Object[]{searchJediViewModel2}, null, f42530a, true, 36751, new Class[]{SearchJediViewModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchJediViewModel2}, null, f42530a, true, 36751, new Class[]{SearchJediViewModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(searchJediViewModel2, "$this$listRefresh");
        searchJediViewModel2.f42525e.refresh();
    }

    public static final <RECEIVER extends d> void a(@NotNull SearchJediViewModel searchJediViewModel, @NotNull e<? extends RECEIVER> eVar, @NotNull a<com.ss.android.ugc.aweme.discover.mixfeed.a> aVar, @Nullable c<com.ss.android.ugc.aweme.discover.mixfeed.a, RECEIVER> cVar, @Nullable c<com.ss.android.ugc.aweme.discover.mixfeed.a, RECEIVER> cVar2, @Nullable Function2<? super RECEIVER, ? super Boolean, Unit> function2) {
        SearchJediViewModel searchJediViewModel2 = searchJediViewModel;
        e<? extends RECEIVER> eVar2 = eVar;
        a<com.ss.android.ugc.aweme.discover.mixfeed.a> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{searchJediViewModel2, eVar2, aVar2, cVar, cVar2, function2}, null, f42530a, true, 36754, new Class[]{SearchJediViewModel.class, e.class, a.class, c.class, c.class, Function2.class}, Void.TYPE)) {
            Object[] objArr = {searchJediViewModel2, eVar2, aVar2, cVar, cVar2, function2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f42530a, true, 36754, new Class[]{SearchJediViewModel.class, e.class, a.class, c.class, c.class, Function2.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(searchJediViewModel2, "$this$listSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar2, "subscriber");
        Intrinsics.checkParameterIsNotNull(aVar2, "adapter");
        ListMiddleware.a(searchJediViewModel2.f42525e, eVar, aVar, false, eVar.c(), cVar, cVar2, function2, null, SearchJediMixFeedAdapter.f42517f);
    }
}
